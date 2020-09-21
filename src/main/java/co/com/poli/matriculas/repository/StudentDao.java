package co.com.poli.matriculas.repository;

import co.com.poli.matriculas.domain.Student;

import java.util.List;

public interface StudentDao {
    List<Student> getStudents();
    Student addStudent(Student student);
    Student getStudentById(Long id);
    Student updateStudent(Student student);
    Student deleteStudent(Long id);
}
