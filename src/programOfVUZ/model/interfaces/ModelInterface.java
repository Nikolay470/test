package programOfVUZ.model.interfaces;

import programOfVUZ.model.classes.*;

import java.util.ArrayList;

public interface ModelInterface {
//    void createStudent(String name, String surname, String facukty);
//    void createTeacher(String name, String surname, String discipline);
    void addStudent(String name, String surname, Faculty faculty, StudyGroup group);
    void addTeacher(String name, String surname, String discipline);
    ArrayList<Student> getListStudents();
    ArrayList<Teacher> getListTeacher();
    ArrayList<Faculty> getListFaculty();
    ArrayList<StudyGroup> getListGroups();
}
