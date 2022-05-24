package service;

import java.util.List;

public interface IStudentService {
    List<Student> findAllStudent();
    String save(Student student);
    String deleteById(Integer id);
    Student findById(Integer id);
    String update(Student student,Integer id);

}
