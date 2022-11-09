package controller;

import dao.CRUD_StudentDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import servive.StudentService;

import java.io.IOException;

@WebServlet(urlPatterns = "/search")
public class SearchStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String name = req.getParameter("search");
//        StudentService.finid(name);
        req.setAttribute("students", CRUD_StudentDao.findIdStudent(name));
        RequestDispatcher dispatcher = req.getRequestDispatcher("/showStudent.jsp");
        dispatcher.forward(req,resp);
    }
}
