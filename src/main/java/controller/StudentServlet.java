package controller;


import dao.CRUD_StudentDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Student;

import java.io.IOException;
import java.util.List;

@WebServlet (urlPatterns = "/students")
public class StudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CRUD_StudentDao productDao = new CRUD_StudentDao();
        List<Student> list = productDao.GetAllStudent();
        req.setAttribute("students", list );

        RequestDispatcher dispatcher = req.getRequestDispatcher("/showStudent.jsp");
        dispatcher.forward(req, resp);
    }
}
