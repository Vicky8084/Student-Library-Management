package com.Library.StudentLibraryManagementDatabaseSystem.service;

import com.Library.StudentLibraryManagementDatabaseSystem.converter.StudentConverter;
import com.Library.StudentLibraryManagementDatabaseSystem.enums.CardStatus;
import com.Library.StudentLibraryManagementDatabaseSystem.model.Card;
import com.Library.StudentLibraryManagementDatabaseSystem.model.Student;
import com.Library.StudentLibraryManagementDatabaseSystem.repository.StudentRepository;
import com.Library.StudentLibraryManagementDatabaseSystem.requestDto.StudentRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public String saveStudent(StudentRequestDto studentRequestDto){
        Student student= StudentConverter.convertStudentRequestDtoIntoStudent(studentRequestDto);
        studentRepository.save(student);
        Card card =new Card();
        card.setCardStatus(CardStatus.ACTIVE);
        card.setStudent(student);
        student.setCard(card);
        studentRepository.save(student);
        return "Student and Card Saved SuccessFully..!!";
    }

    public Student findStudentById(int id){
        Optional<Student> studentOptional=studentRepository.findById(id);
        if(studentOptional.isPresent()){
            return studentOptional.get();
        }
        return null;
    }

    public List<Student> findAllStudent(){
        List<Student> studentList=studentRepository.findAll();
        return studentList;
    }

    public String deleteStudentById(int id){
        studentRepository.deleteById(id);
        return "Student deleted Successfully..!!";
    }

    public String updateStudent(int id, StudentRequestDto studentRequestDto){
        Student student=findStudentById(id);
        if(student!=null){
            student.setName(studentRequestDto.getName());
            student.setEmail(studentRequestDto.getEmail());
            student.setAddress(studentRequestDto.getAddress());
            student.setMobileNumer(studentRequestDto.getMobileNumer());
            student.setDepartment(studentRequestDto.getDepartment());
            studentRepository.save(student);
            return "Student updated Successfully";
        }
        else{
            return "Student Not Fund, So can't Updated..!!!";
        }
    }

    public List<Student> getAllStudentByPage(int pageNumber,int pageSize){
        List<Student> studentList=studentRepository.findAll(PageRequest.of(pageNumber,pageSize, Sort.by("name").ascending())).getContent();
        return studentList;
    }


}
