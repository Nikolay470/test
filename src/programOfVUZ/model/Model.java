package programOfVUZ.model;

import programOfVUZ.model.interfaces.ModelInterface;
import programOfVUZ.model.classes.*;

import java.util.ArrayList;

public class Model implements ModelInterface {
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<Teacher> teachers = new ArrayList<Teacher>();
    private ArrayList<StudyGroup> groups = new ArrayList<StudyGroup>();
    private ArrayList<Faculty> faculties = new ArrayList<Faculty>();

    public Model() {
        faculties.add(new Faculty("frontend - developer"));
        faculties.add(new Faculty("backend - developer"));
        faculties.add(new Faculty("Java - developer"));
        faculties.add(new Faculty("Python - developer"));
    }

    @Override
    public void addStudent(String name, String surname, Faculty faculty, StudyGroup group) {
        Student newStudent = new Student(name, surname, faculty);
        newStudent.setGroup(group);
        students.add(newStudent);
    }

    @Override
    public void addTeacher(String name, String surname, String discipline) {
        teachers.add(new Teacher(name, surname, discipline));
    }

    public void createGroup(Teacher tutor, Faculty faculty, int number) {
        getListGroups().add(new StudyGroup(tutor, faculty, number));
    }

    public void createGroup(Teacher tutor,
                            ArrayList<Student> students,
                            Faculty faculty, int number)
    {
        getListGroups().add(new StudyGroup(tutor, students, faculty, number));
    }

    @Override
    public ArrayList<Student> getListStudents() {
        return students;
    }

    @Override
    public ArrayList<Teacher> getListTeacher() {
        return teachers;
    }

    @Override
    public ArrayList<Faculty> getListFaculty() {
        return faculties;
    }

    @Override
    public ArrayList<StudyGroup> getListGroups() {
        return groups;
    }
}
