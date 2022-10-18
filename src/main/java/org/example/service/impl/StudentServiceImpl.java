package org.example.service.impl;

import org.example.dao.StudentDao;
import org.example.dao.impl.StudentDaoImpl;
import org.example.model.Student;
import org.example.service.StudentService;

import java.sql.SQLException;
import java.util.List;

public class StudentServiceImpl implements StudentService {

     StudentDao studentDao = new StudentDaoImpl();

    public StudentServiceImpl() throws SQLException {
    }

    @Override
    public void createTable() {
    studentDao.createTable();
    }

    @Override
    public void saveStudent(Student student) {
    studentDao.saveStudent(student);
    }

    @Override
    public void dropTable() {
    studentDao.dropTable();
    }

    @Override
    public Student findById(long id) {
    return studentDao.findById(id);
    }

    @Override
    public void deleteById(long id) {
    studentDao.deleteById(id);
    }

    @Override
    public void cleanTable() {
        studentDao.cleanTable();
    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public void updateStudent(long id, Student student) {
        studentDao.updateStudent(id, student);
    }
}
