package co.com.poli.matriculas.repository;

import co.com.poli.matriculas.data.StudentData;
import co.com.poli.matriculas.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImplList implements StudentDao {

    @Override
    public List<Student> getStudents() {
        return StudentData.getListStudents();
    }

    @Override
    public Student addStudent(Student student) {
        List<Student> listStudents = StudentData.getListStudents();
        // solo queda local en el metodo
        listStudents.add(student);
        //Usamos el metodo set para que se adicione correctamente
        StudentData.setListStudents(listStudents);
        return student;
    }

    @Override
    public Student getStudentById(Long id) {
        //Student student = listStudents.stream().filter(s -> s.getId());
        Student student = null;
        List <Student> listStudents = StudentData.getListStudents();
        /*
        listStudents.forEach(s -> {
            if (id.equals(s.getId())){
                System.out.println("Lo encontré");
            };
        });
        */
            for(Student s:listStudents){
                if(id.equals(s.getId())){
                    System.out.println("Lo encontre");
                    student = s;
                    break;
                }
            }
        return student;
    }

    @Override
    public Student updateStudent(Student student) {

        List <Student> listStudents = StudentData.getListStudents();
        int indexS = -1;
        for(Student s:listStudents){
            if(student.getId().equals(s.getId())){
                System.out.println("Actualizar estudiante");
                indexS = listStudents.indexOf(s);
                System.out.println("Indice : "+indexS);
                break;
            }
        }
        if(indexS > -1){
            //Lo encontró
            System.out.println("Index : "+ indexS);
            listStudents.set(indexS,student);
            StudentData.setListStudents(listStudents);
            return student;
        }else{
            System.out.println("No lo encontro");
            return null;
        }
    }

    @Override
    public Student deleteStudent(Long id) {
        List <Student> listStudents = StudentData.getListStudents();
        Student student = getStudentById(id);

        if(listStudents.removeIf(s -> s.getId().equals(id))){
            StudentData.setListStudents(listStudents);
            System.out.println("Elimindo");
            return student;
        }else{
            return null;
        }


    }
}

