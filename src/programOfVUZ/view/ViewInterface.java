package programOfVUZ.view;

import java.util.ArrayList;
import programOfVUZ.model.classes.*;
import programOfVUZ.model.abstractClasses.Human;

public interface ViewInterface {
    int getCategory();
    int choiceMoveOfTeachers();
    int choiceMoveOfStudents();
    int choiceMoveOfGroups();
    String printList(ArrayList<? extends Human> list);
    String printListGroups(ArrayList<StudyGroup> groups);
    void addStudent();
    void addTeacher();
    void addGroup();
    Student removeStudent(Student student);
    Teacher removeTeacher(Teacher teacher);
    void moveGroupInArchive(StudyGroup group);
    String surnameStudent();
    String surnameTeacher();
}
