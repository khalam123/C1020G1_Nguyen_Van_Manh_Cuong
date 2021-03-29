package controller;

import bean.Customer;

import repository.CustomerRepository;
import service.CustomerService;
import service.impl.CustomerServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = {"/customer"})
public class CustomerServlet extends HttpServlet {
    private final CustomerService customerService = new CustomerServiceImpl();
    Customer customer;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String actionUser = request.getParameter("actionUser");
        if (actionUser == null) {
            actionUser = "";
        }
        try {
            switch (actionUser) {
                case "create":
                    insertUser(request, response);
                    break;
                case "update":
                    updateCustomer(request, response);
                    break;
                case "delete":
                    deleteUser(request,response);
                    break;

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String actionUser = request.getParameter("actionUser");

        if (actionUser == null) {
            actionUser = "";
        }

        switch (actionUser) {
//            case "update":
//                String id = request.getParameter("id");
//                Customer customer = customerService.findById(id);
//
//                request.setAttribute("customerInfo", customer);
//                request.getRequestDispatcher("update_customer.jsp").forward(request, response);
//                break;
            case "create":
                showNewForm(request, response);
                break;
            case "update":
                showEditForm(request,response);
                break;
            case "search":
                searchID(request,response);
                break;
//            case "delete":
//                try {
//                    deleteUser(request, response);
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//                break;
//            case "transaction":
//                String msg = this.customerService.callTransaction();
//                request.setAttribute("msgInfo", msg);
//                request.getRequestDispatcher("result_transaction.jsp").forward(request, response);
//                break;
            default:
                loadList(request, response);
        }
    }

    private void searchID(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
        String id = request.getParameter("id");
        if (id==null){
            id="";
        }
        List<Customer> customerList = customerService.search(id);
        if (customerList.isEmpty()){
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }else{
            request.setAttribute("customerListFromServlet",customerList);
            request.setAttribute("id",id);
            request.getRequestDispatcher("customer.jsp").forward(request,response);
        }
    }

    private void loadList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customerListFromServlet", customerService.findAll());
        request.getRequestDispatcher("customer.jsp").forward(request, response);

    }
    private void insertUser(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        String gender = request.getParameter("gender");
        String id_card = request.getParameter("id_card");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String type_customer = request.getParameter("type_customer");
        Customer newCustomer = new Customer(id,name,birthday,gender,id_card,phone,email,address,type_customer);
        customerService.save(newCustomer);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/create_customer.jsp");
        dispatcher.forward(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("create_customer.jsp");
        dispatcher.forward(request, response);
    }

    private void deleteUser(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        String id = (request.getParameter("delete_modal"));
        customerService.deleteCustomer(id);

        List<Customer> listCustomer = customerService.selectAllCustomer();
        request.setAttribute("customerListFromServlet", listCustomer);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer.jsp");
        dispatcher.forward(request, response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        Customer customer = this.customerService.findById(id);
        RequestDispatcher dispatcher;
        if(customer == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            request.setAttribute("customerListFromServlet", customer);
            dispatcher = request.getRequestDispatcher("edit_customer.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateCustomer (HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException{
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        String gender = request.getParameter("gender");
        String id_card = request.getParameter("id_card");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String customer_type = request.getParameter("customer_type");

        Customer customer = new Customer(id,name,birthday,gender,id_card,phone,email,address,customer_type);
        customerService.update(customer);
        request.setAttribute("customerListFromServlet",customerService.selectAllCustomer());
        request.setAttribute("message", "Customer information was updated");
        request.getRequestDispatcher("customer.jsp").forward(request,response);

        }
//        Customer customer = this.customerService.findById(id);
//        RequestDispatcher dispatcher;
//        if (customer == null){
//            dispatcher = request.getRequestDispatcher("error-404.jsp");
//        }else{
//            customer.setCustomer_id(id);
//            customer.setCustomer_name(name);
//            customer.setCustomer_birthday(birthday);
//            customer.setCustomer_gender(gender);
//            customer.setCustomer_id_card(id_card);
//            customer.setCustomer_phone(phone);
//            customer.setCustomer_email(email);
//            customer.setCustomer_address(address);
//            customer.setCustomer_type(customer_type);
//
//
//            this.customerService.update(id,customer);
//            request.setAttribute("customer", customer);
//            request.setAttribute("message", "Customer information was updated");
//            dispatcher = request.getRequestDispatcher("customer/edit.jsp");
//        }
//        try{
//            dispatcher.forward(request,response);
//        }catch (ServletException e) {
//            e.printStackTrace();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
}
