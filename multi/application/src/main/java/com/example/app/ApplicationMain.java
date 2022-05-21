package com.example.app;

import com.example.controller.controller.StudentController;
import com.example.dao.MainDao;
import com.example.dao.StuModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.ArrayList;
import java.util.List;
@ComponentScan(basePackages = {"com.example.controller","com.example.dao"})
public class ApplicationMain {
    public static void main(String[] args) {
        StuModel stuModel=new StuModel();
        ApplicationContext context = SpringApplication.run(ApplicationMain.class, args);
      StudentController studentController=context.getBean(StudentController.class);
      stuModel.setName("aaa");
      stuModel.setAge(12);
      stuModel.setId(1);
      System.out.println(stuModel.toString());
      studentController.add();
/*      MainDao mainDao=applicationContext.getBean(MainDao.class);
      mainDao.sss();*/
      /*  context.getBean(StudentController.class).add(stuModel);*/

    }

}
