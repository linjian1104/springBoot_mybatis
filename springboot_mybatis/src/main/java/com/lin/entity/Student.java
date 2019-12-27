package com.lin.entity;

import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private int age;
    private int classid;
    private char sex;
    private String address;
    private String idcar;
    private String telephone;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdcar() {
        return idcar;
    }

    public void setIdcar(String idcar) {
        this.idcar = idcar;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                age == student.age &&
                classid == student.classid &&
                sex == student.sex &&
                Objects.equals(name, student.name) &&
                Objects.equals(address, student.address) &&
                Objects.equals(idcar, student.idcar) &&
                Objects.equals(telephone, student.telephone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, classid, sex, address, idcar, telephone);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", classid=" + classid +
                ", sex=" + sex +
                ", address='" + address + '\'' +
                ", idcar='" + idcar + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
