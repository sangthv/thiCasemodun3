package dao;

import model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CRUD_StudentDao {
    static Connection conn = null;
    static PreparedStatement ps = null;
    static ResultSet rs = null;

    public static List<Student> GetAllStudent() {
        List<Student> list = new ArrayList<>();
        String query = "SELECT * FROM hocvien ";

        try {
            conn = new Connect_MySQL().getConnect(); // mở kết nối với sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Student(rs.getInt(1),
                        rs.getString(2),
                        rs.getDate(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7)));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

//    them--------------------
public static void deleteStudent(int id) {
    String query = "delete from  hocvien where id = ?";
    try {
        conn = new  Connect_MySQL().getConnect(); // mở kết nối với sql
        ps = conn.prepareStatement(query);
        ps.setInt(1, id);
        ps.execute();
    } catch (SQLException throwables) {
        throwables.printStackTrace();
    }
}

    public static void addStudent(Student student) {
        String query = "INSERT INTO hocvien (name, birth, adress, phone, email, class_id) VALUES (?,?,?,?,?,?);";
        try {
            conn = new Connect_MySQL().getConnect(); // mở kết nối với sql
            ps = conn.prepareStatement(query);
            ps.setString(1, student.getName());
            ps.setDate(2, (Date) student.getBirth());
            ps.setString(3, student.getAdress());
            ps.setString(4, student.getPhone());
            ps.setString(5, student.getEmail());
            ps.setInt(6, student. getClass_id());
            ps.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void editStudent(Student student){
        String query = "UPDATE `quanlihocvien`.`hocvien` SET `name` = ?, `birth` =?, `adress` =?, `phone` = ?, `email` = ?, `class_id` = ?  WHERE (`id` = ?);";
        try {
            conn = new Connect_MySQL().getConnect(); // mở kết nối với sql
            ps = conn.prepareStatement(query);
            ps.setInt(7, student.getId());
            ps.setString(1, student.getName());
            ps.setDate(2, (Date) student.getBirth());
            ps.setString(3, student.getAdress());
            ps.setString(4, student.getPhone());
            ps.setString(5, student.getEmail());
            ps.setInt(6, student. getClass_id());
            ps.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public static List<Student> findIdStudent(String name) {
        List<Student> list= new ArrayList<>();
        String search = "%" + name + "%";
        String query = "select * from hocvien where name like ?";
        try {
            conn = new Connect_MySQL().getConnect(); // mở kết nối với sql
            ps = conn.prepareStatement(query);
            ps.setString(1, search);
            rs =ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name1 = rs.getString("name");
               Date birth= Date.valueOf(rs.getString("birth"));
               String adress = rs.getString("adress");
               String phone = rs.getString("phone");
               String email= rs.getString("email");
                int class_id = rs.getInt("class_id");
                list.add(new Student(id, name1, birth, adress, phone,email,class_id));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

}
