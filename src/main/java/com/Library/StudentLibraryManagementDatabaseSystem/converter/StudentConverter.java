package com.Library.StudentLibraryManagementDatabaseSystem.converter;

import com.Library.StudentLibraryManagementDatabaseSystem.model.Student;
import com.Library.StudentLibraryManagementDatabaseSystem.requestDto.StudentRequestDto;

public class StudentConverter {
    public static Student convertStudentRequestDtoIntoStudent(StudentRequestDto studentRequestDto){
        Student student=new Student();
        student.setName(studentRequestDto.getName());
        student.setEmail(studentRequestDto.getEmail());
        student.setMobileNumer(studentRequestDto.getMobileNumer());
        student.setDepartment(studentRequestDto.getDepartment());
        student.setAddress(studentRequestDto.getAddress());
        return student;

    }
}
