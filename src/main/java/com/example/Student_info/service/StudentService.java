package com.example.Student_info.service;

import com.example.Student_info.model.Student;
import com.example.Student_info.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepo;
    public Student addStudent(Student newStudent) {
        return studentRepo.save(newStudent);
    }
    public Student getStudentById(int id) {
        return studentRepo.findById(id).get();
    }

    public List<Student> getAllStudent(){
        return studentRepo.findAll();
    }
    public void updateStudentById(int id, Student newStudent) {
        Student stud = studentRepo.findById(id).get();
        stud.setStudent_Id(newStudent.getStudent_Id());
        stud.setName(newStudent.getName());
        stud.setAge(newStudent.getAge());
        stud.setBranch(newStudent.getBranch());
        stud.setDepartment(newStudent.getDepartment());
        stud.setPhoneNumber(newStudent.getPhoneNumber());
        stud.setAddress(newStudent.getAddress());

        studentRepo.save(stud);
    }
    public void deleteStudentById(int id) {
        studentRepo.deleteById(id);
    }
}
