package servive;

import dao.CRUD_StudentDao;
import model.Student;

import java.util.List;

public class StudentService {

    public static List<Student> students = CRUD_StudentDao.GetAllStudent();

    public static void add(Student student) {
        CRUD_StudentDao.addStudent(student);
        students = CRUD_StudentDao. GetAllStudent();
    }

    public static void edit(Student student) {
        CRUD_StudentDao.editStudent(student);
        students = CRUD_StudentDao. GetAllStudent();
    }

    public static void delete(int id) {
        CRUD_StudentDao.deleteStudent(id);
        students = CRUD_StudentDao.GetAllStudent();
    }
    public static void finid(String name) {
        students = CRUD_StudentDao.findIdStudent(name);
    }

}

