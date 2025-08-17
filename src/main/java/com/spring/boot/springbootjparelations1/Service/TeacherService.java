package com.spring.boot.springbootjparelations1.Service;

import com.spring.boot.springbootjparelations1.Model.Teacher;
import com.spring.boot.springbootjparelations1.Repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherService {
    private final TeacherRepository teacherRepository;

    public List<Teacher> getAllTeachers(){
        return teacherRepository.findAll();
    }

    public void addNewTeacher(Teacher teacher){
        teacherRepository.save(teacher);
    }
}
