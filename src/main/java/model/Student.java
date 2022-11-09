package model;

import java.util.Date;

public class Student {
    private int id;
    private String name;
    private Date birth;
    private String adress;
    private String phone;
    private String email;
    private int class_id;

    public Student() {
    }

    public Student(String name, Date birth, String adress, String email, int class_id) {
        this.name = name;
        this.birth = birth;
        this.adress = adress;
        this.email = email;
        this.class_id = class_id;
    }

    public Student(String name, Date birth, String adress, String phone, String email, int class_id) {
        this.name = name;
        this.birth = birth;
        this.adress = adress;
        this.phone = phone;
        this.email = email;
        this.class_id = class_id;
    }

    public Student(int id, String name, Date birth, String adress, String phone, String email, int class_id) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.adress = adress;
        this.phone = phone;
        this.email = email;
        this.class_id = class_id;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birth=" + birth +
                ", adress='" + adress + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", class_id=" + class_id +
                '}';
    }
}
