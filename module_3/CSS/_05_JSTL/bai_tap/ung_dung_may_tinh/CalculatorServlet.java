package caculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/calculator")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String num1 = request.getParameter("input1");
        String num2 = request.getParameter("input2");
        int check = 0;
        String operator = request.getParameter("operator");
        double result = 0;
        try {
            result = Calculator.calculator(num1,operator,num2);
        } catch (Exception e) {
            e.printStackTrace();
            check =1;
        }
        request.setAttribute("num1",num1);
        request.setAttribute("num2",num2);
        request.setAttribute("operator",operator);
        request.setAttribute("result",result);
        request.setAttribute("check",check);
        request.getRequestDispatcher("result.jsp").forward(request,response);

    }
}
