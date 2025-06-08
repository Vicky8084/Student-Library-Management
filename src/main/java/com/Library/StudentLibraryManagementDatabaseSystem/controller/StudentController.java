package com.Library.StudentLibraryManagementDatabaseSystem.controller;

import com.Library.StudentLibraryManagementDatabaseSystem.model.Student;
import com.Library.StudentLibraryManagementDatabaseSystem.requestDto.StudentRequestDto;
import com.Library.StudentLibraryManagementDatabaseSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student/apis")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/save")
    public String saveStudent(@RequestBody StudentRequestDto studentRequestDto){
        String response=studentService.saveStudent(studentRequestDto);
        return response;
    }

    @GetMapping("/findById/{id}")
    public Student findStudentById(@PathVariable int id){
        Student student=studentService.findStudentById(id);
        return student;
    }

    @GetMapping("/findAll")
    public List<Student> findAllStudent(){
        List<Student> studentList=studentService.findAllStudent();
        return studentList;
    }

    @DeleteMapping("/deleteById/{id}")
    public String deleteStudentById(@PathVariable int id){
        String response=studentService.deleteStudentById(id);
        return response;
    }

    @PutMapping("update/{id}")
    public String updateStudent(@PathVariable int id,@RequestBody StudentRequestDto studentRequestDto){
        String response=studentService.updateStudent(id,studentRequestDto);
        return response;
    }

    @GetMapping("/findByPage")
    public List<Student> findStudentByPage(@RequestParam int pageNumber,@RequestParam int pageSize){
        List<Student> studentList=studentService.getAllStudentByPage(pageNumber,pageSize);
        return studentList;
    }

}
