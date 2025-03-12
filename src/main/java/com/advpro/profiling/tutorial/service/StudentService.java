package com.advpro.profiling.tutorial.service;

import com.advpro.profiling.tutorial.model.Student;
import com.advpro.profiling.tutorial.model.StudentCourse;
import com.advpro.profiling.tutorial.repository.StudentCourseRepository;
import com.advpro.profiling.tutorial.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author muhammad.khadafi
 */
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentCourseRepository studentCourseRepository;

public List<StudentCourse> getAllStudentsWithCourses() {
    List<Student> students = studentRepository.findAll();
    List<StudentCourse> studentCourses = new ArrayList<>();
    Map<Long, Student> studentMap = students.stream()
            .collect(Collectors.toMap(Student::getId, student -> student));
    List<StudentCourse> allStudentCourses = studentCourseRepository.findAll();
    for (StudentCourse studentCourse : allStudentCourses) {
        Student student = studentMap.get(studentCourse.getStudent().getId());
        if (student != null) {
            StudentCourse newStudentCourse = new StudentCourse();
            newStudentCourse.setStudent(student);
            newStudentCourse.setCourse(studentCourse.getCourse());
            studentCourses.add(newStudentCourse);
        }
    }
    return studentCourses;
}

    public Optional<Student> findStudentWithHighestGpa() {
        return studentRepository.findAll().parallelStream()
                .max(Comparator.comparingDouble(Student::getGpa));
    }

    public String joinStudentNames() {
        List<Student> students = studentRepository.findAll();
        return students.stream()
                .map(Student::getName)
                .collect(Collectors.joining(", "));
    }
}

