package seminar_5.service;

import seminar_5.model.Student;
import seminar_5.model.Teacher;
import seminar_5.model.User;

import java.util.ArrayList;

public class DataService {
    private ArrayList<Student> listStudent = new ArrayList<>();
    private ArrayList<Teacher> listTeacher = new ArrayList<>();

    public boolean createStudent(
            String name, String surname, int age,
            String group, String faculty
    )
    {
        try {
            listStudent.add(new Student(
                    name, surname, age, group, faculty
            ));
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    public boolean createTeacher(
            String name, String surname, int age,
            String objectTeaching, int experience
            )
    {
        try {
            listTeacher.add(new Teacher(
               name, surname, age, objectTeaching, experience
            ));
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    public void printUser(User user) {
        System.out.println(user);
    }
}
