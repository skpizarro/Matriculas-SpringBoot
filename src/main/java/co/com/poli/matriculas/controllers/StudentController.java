package co.com.poli.matriculas.controllers;

import co.com.poli.matriculas.domain.Student;
import co.com.poli.matriculas.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class StudentController {
    // Siempre se inyecta la capa anterior
    @Autowired
    private StudentServices studentServices;

    // Aquí en el controller se harían todas las validaciones antes de pasar al service


    @GetMapping(value="/students")
    public List<Student> getStudents(){
        return studentServices.getStudents();
    }

    @PostMapping(value="/students")
    //con el RequestBody se obtienen todos los campos del body en este caso en formato JSON y luego los convertimos al objeto Student que manejamos de java
    public Student addStudent(@RequestBody Student student){
        return studentServices.addStudent(student);
    }

    @GetMapping(value="/students/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentServices.getStudentById(id);
    }

    @PutMapping(value = "/students")
    public Student updateStudent(@RequestBody Student student){
        return studentServices.updateStudent(student);
    }

    @DeleteMapping(value="/students/{id}")
    public Student deleteStudent(@PathVariable Long id){
        return studentServices.deleteStudent(id);
    }
}
