package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Student;
import servive.StudentService;

import java.io.IOException;
import java.sql.Date;

@WebServlet(urlPatterns = "/edit")
public class EditStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        for (Student p: StudentService.students) {
            if (p.getId()==id){
                req.setAttribute("ed",p);
            }
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/editStudent.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        Date birth = Date.valueOf(req.getParameter("birth"));
        String adress = req.getParameter("adress");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");
        int class_id = Integer.parseInt(req.getParameter("class_id"));

        StudentService.edit(new Student(id,name,birth,adress,phone,email,class_id));

        resp.sendRedirect("/students");
    }
}
