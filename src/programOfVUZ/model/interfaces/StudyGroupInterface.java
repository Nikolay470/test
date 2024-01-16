package programOfVUZ.model.interfaces;

import programOfVUZ.model.classes.Student;
import programOfVUZ.model.classes.Teacher;

public interface StudyGroupInterface {
    void addStudentInGroup(Student student);
    void removeStudentFromGroup(Student student);
    void changedTutor(Teacher teacher);
}
