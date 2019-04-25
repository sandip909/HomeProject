package com.example.accessdemo.databasemaneger.databasemanegerimpl;

import com.example.accessdemo.databasemaneger.StudentDao;
import com.example.accessdemo.model.Student;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

    @Override
    public List<Student> getLists() throws SQLException,ClassNotFoundException{
        Connection connection=null;
        PreparedStatement preparedStatement;
        List<Student> studList=new ArrayList<>();
        try
        {
            Class.forName("org.postgresql.Driver");
            System.out.println("connections is successfully");
            connection=DriverManager.getConnection("jdbc:postgresql://xlntplus.cwgxwpx9kan5.us-east-2.rds.amazonaws.com:5432/Demo","xlntplus","xlntplus");
            preparedStatement=connection.prepareStatement("select * from student");
            ResultSet resultSet=preparedStatement.executeQuery();
            while(resultSet.next())
            {
                Student s=new Student();
                s.setSno(resultSet.getInt("sno"));
                s.setSname(resultSet.getString("sname"));
                s.setAge(resultSet.getInt("age"));
                studList.add(s);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally {
            connection.close();
        }

        return studList;
    }
}
