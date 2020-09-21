package co.com.poli.matriculas.data;

import co.com.poli.matriculas.domain.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class StudentData {
    private static List<Student> listStudents;

    static{
        listStudents = new ArrayList<Student>(){
            {
                add(new Student(10L,"Juan",Boolean.TRUE));
                add(new Student(20L,"David",Boolean.FALSE));
                add(new Student(30L,"Mario",Boolean.TRUE));
            }
        };
    }

    public static List<Student> getListStudents() {
        return listStudents;
    }


    public static void setListStudents(List<Student> listStudents) {
        StudentData.listStudents = listStudents;
    }
}

