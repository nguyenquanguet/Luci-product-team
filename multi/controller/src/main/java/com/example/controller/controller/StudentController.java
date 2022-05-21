package com.example.controller.controller;

import com.example.dao.StuDao;
import com.example.dao.StuModel;
import com.example.ser.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Component
@Configuration
@Controller
public class StudentController {
    @Autowired
    private StuDao stuDao;

    public void wear() {
        System.out.println("hello");
    }

    public void add() {
        StuModel student2=new StuModel("aaa",12);
        System.out.println(student2);
        student2.setName("duy");
        student2.setAge(19);
        stuDao.savava();
    }

}
