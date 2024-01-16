package programOfVUZ.view;

import java.util.ArrayList;

public class View implements ViewInterface{

    @Override
    public int getCaregory() {
        return 0;
    }

    @Override
    public String getInfoOfVUZ() {
        return null;
    }

    @Override
    public int choiceMoveOfTeachers() {
        return 0;
    }

    @Override
    public int choiceMoveOfStudents() {
        return 0;
    }

    @Override
    public int choiceMoveOfGroups() {
        return 0;
    }

    @Override
    public String printList(ArrayList<? extends Human> list) {
        return null;
    }

    @Override
    public String printListGroups(ArrayList<StudyGroup> groups) {
        return null;
    }

    @Override
    public void addStudent() {

    }

    @Override
    public void addTeacher() {

    }

    @Override
    public void addGroup() {

    }

    @Override
    public Student removeStudent(Student student) {
        return null;
    }

    @Override
    public Teacher removeTeacher(Teacher teacher) {
        return null;
    }

    @Override
    public void moveGroupInArchive(StudyGroup group) {

    }

    @Override
    public String surnameStudent() {
        return null;
    }

    @Override
    public String surnameTeacher() {
        return null;
    }
}
