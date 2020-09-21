package co.com.poli.matriculas.services;

import co.com.poli.matriculas.domain.Student;
import co.com.poli.matriculas.repository.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServicesImpl implements StudentServices {

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> getStudents() {
        return studentDao.getStudents();
    }

    @Override
    public Student addStudent(Student student) {
        return studentDao.addStudent(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentDao.getStudentById(id);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentDao.updateStudent(student);
    }

    @Override
    public Student deleteStudent(Long id) {
        return studentDao.deleteStudent(id);
    }
}
