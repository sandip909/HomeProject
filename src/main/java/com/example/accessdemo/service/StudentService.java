package com.example.accessdemo.service;

import com.example.accessdemo.model.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentService {
    List<Student> getListsServices() throws SQLException,ClassNotFoundException;
}
