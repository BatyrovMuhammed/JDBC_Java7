package org.example.dao;

import org.example.model.Student;

import java.util.List;

public interface StudentDao {

    void createTable();

    void saveStudent(Student student);

    void dropTable();

    Student findById(long id);

    void deleteById(long id);

    void cleanTable();

    List<Student> findAll();

    void updateStudent(long id, Student student);


}
