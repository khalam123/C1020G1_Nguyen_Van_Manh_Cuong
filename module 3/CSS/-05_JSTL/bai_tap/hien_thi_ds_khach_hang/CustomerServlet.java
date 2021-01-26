package customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = {"/list"})
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("Nguyễn Thị A","11/11/2001","Hà Nội","https://sc02.alicdn.com/kf/Hbcac3a5228ce441788f0a83e6c4baaebD/222140216/Hbcac3a5228ce441788f0a83e6c4baaebD.jpg"));
        customerList.add(new Customer("Nguyễn Thị B","12/11/2001","Đà Nẵng","https://sc04.alicdn.com/kf/HTB131Q5ov5TBuNjSspmq6yDRVXa3.jpg"));
        customerList.add(new Customer("Nguyễn Thị C","13/11/2001","Sài Gòn","https://s19.pixxxels.cc/gtxpi7g5v/25023660_201239717105482_3919629120455049216_n.jpg"));
        customerList.add(new Customer("Nguyễn Thị D","14/11/2001","Quãng Nam","https://sc02.alicdn.com/kf/H626baea700644e8da6132772e1017a95V/222140216/H626baea700644e8da6132772e1017a95V.jpg"));

        request.setAttribute("CustomerFromServlet",customerList);
        request.getRequestDispatcher("list_customer.jsp").forward(request,response);
    }
}
