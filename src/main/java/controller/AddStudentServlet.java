package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Student;
import servive.StudentService;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.sql.Date;

@WebServlet(urlPatterns = "/create")
public class AddStudentServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        Date birth = Date.valueOf(req.getParameter("birth"));
        String adress = req.getParameter("adress");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");
        int class_id = Integer.parseInt(req.getParameter("class"));


        StudentService.add(new Student(name,birth,adress, phone,email,class_id));
        resp.sendRedirect("/students");
    }
}
