package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "HomeServlet", urlPatterns = {"", "/home"})
public class HomeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        loadList(request, response);
    }

    private void loadList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setAttribute("customerListFromServlet", customerService.findAll());
        request.getRequestDispatcher("home.jsp").forward(request, response);

    }
}
