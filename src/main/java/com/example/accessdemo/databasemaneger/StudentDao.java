package com.example.accessdemo.databasemaneger;

import com.example.accessdemo.model.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentDao {
    List<Student> getLists() throws SQLException,ClassNotFoundException;
}
