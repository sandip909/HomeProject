package com.example.accessdemo.controler;

import com.example.accessdemo.model.Student;
import com.example.accessdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("student")
public class Studentcontroler {
    @Autowired
    private StudentService studentService;

            @GetMapping
            List<Student> getListCtrl() throws SQLException,ClassNotFoundException//@RequestHeader("access-token") String token,HttpServletRequest request)
            {
                //User user=getUser()
                return studentService.getListsServices();
            }
}
