package com.spring.batch.springbatchjson.config;

import org.springframework.batch.item.ItemProcessor;

import com.spring.batch.springbatchjson.entity.Student;

public class StudentItemProcessor implements ItemProcessor<Student, Student> {

    @Override
    public Student process(Student student) throws Exception {
        return student;
    }
}