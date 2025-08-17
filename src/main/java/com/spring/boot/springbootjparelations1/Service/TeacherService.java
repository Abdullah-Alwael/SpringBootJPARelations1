package com.spring.boot.springbootjparelations1.Service;

import com.spring.boot.springbootjparelations1.Repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TeacherService {
    private final TeacherRepository teacherRepository;

}
