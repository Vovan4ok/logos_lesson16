package com.example.lesson16;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    List<Student> students = new ArrayList<>();
    public String create(Student student) {
        this.students.add(student);
        return "Було додано: " + student;
    }
    public String delete(int id) {
        Student student = find(id);
        if(student == null) {
            return "Такого студента немає";
        } else {
            this.students.remove(student);
            return "Було видалено: " + student;
        }
    }
    public String update(int id, Student student) {
        Student foundStudent = find(id);
        if(foundStudent == null) {
            return "Такого студента немає";
        } else {
            foundStudent.setName(student.getName());
            foundStudent.setAge(student.getAge());
            return "Було змінено інформацію про студента з id=" + id;
        }
    }
    public List<Student> readAll() {
        return this.students;
    }
    public Student find(int id) {
        return this.students.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }

}
