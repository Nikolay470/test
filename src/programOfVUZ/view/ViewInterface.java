package programOfVUZ.view;

import java.util.ArrayList;

public interface ViewInterface {
    int getCaregory();
    String getInfoOfVUZ();
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
