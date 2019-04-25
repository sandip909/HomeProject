package com.example.accessdemo.service.ServiceImpl;

import com.example.accessdemo.databasemaneger.StudentDao;
import com.example.accessdemo.model.Student;
import com.example.accessdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private  StudentDao studentDao;

    @Override
    public List<Student> getListsServices() throws SQLException, ClassNotFoundException {
        return studentDao.getLists();
    }
}
