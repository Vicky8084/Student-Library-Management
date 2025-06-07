package com.example.Student_Library_Management.converter;

import com.example.Student_Library_Management.model.Student;
import com.example.Student_Library_Management.requestDto.StudentRequestDto;

public class StudentConverter {
    public static Student convertStudentRequestDtoIntoStudent(StudentRequestDto studentRequestDto){
        Student student=new Student();
        student.setName(studentRequestDto.getName());
        student.setEmail(studentRequestDto.getEmail());
        student.setGender(studentRequestDto.getGender());
        student.setMobileNumber(studentRequestDto.getMobileNumber());
        student.setDepartment(studentRequestDto.getDepartment());
        student.setSemester(studentRequestDto.getSemester());
        student.setAddress(studentRequestDto.getAddress());
        return  student;
    }
}
