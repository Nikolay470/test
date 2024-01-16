package programOfVUZ.model;

import programOfVUZ.model.interfaces.ModelInterface;

import java.util.ArrayList;

public class Model implements ModelInterface {
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<Teacher> teachers = new ArrayList<Teacher>();
    private ArrayList<StudyGroup> groups = new ArrayList<StudyGroup>();
    private ArrayList<Faculty> faculties = new ArrayList<Faculty>();

    @Override
    public void addStudent(String name, String surname, String facukty) {

    }

    @Override
    public void addTeacher(String name, String surname, String discipline) {

    }

    @Override
    public ArrayList<Student> getListStudents() {
        return null;
    }

    @Override
    public ArrayList<Teacher> getListTeacher() {
        return null;
    }

    @Override
    public ArrayList<Faculty> getListFaculty() {
        return null;
    }

    @Override
    public ArrayList<StudyGroup> getListGroups() {
        return null;
    }
}
