package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculate")
public class SalaryServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double salary = Double.parseDouble(request.getParameter("salary"));
        double percentage = Double.parseDouble(request.getParameter("percentage"));

        double increase = salary * (percentage / 100);
        double newSalary = salary + increase;
        double discount = newSalary * 0.03;
        double finalSalary = newSalary - discount;

        request.setAttribute("salary", salary);
        request.setAttribute("percentage", percentage);
        request.setAttribute("increase", increase);
        request.setAttribute("newSalary", newSalary);
        request.setAttribute("discount", discount);
        request.setAttribute("finalSalary", finalSalary);

        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}
