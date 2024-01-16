package programOfVUZ.model.classes;

import programOfVUZ.model.interfaces.StudyGroupInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class StudyGroup implements StudyGroupInterface {
    private Teacher tutor;
    private ArrayList<Student> listStudents;
    private ArrayList<Student> defaultList = new ArrayList<>(50);
    private final Faculty faculty;
    private final int number;

    public StudyGroup(
            Teacher teacher,
            ArrayList<Student> list,
            Faculty faculty,
            int number
            )
    {
        this.tutor = teacher;
        this.listStudents = list;
        this.faculty = faculty;
        this.number = number;
    }

    public StudyGroup(Teacher teacher, Faculty faculty, int number) {
        this.tutor = teacher;
        this.listStudents = defaultList;
        this.faculty = faculty;
        this.number = number;
    }
    @Override
    public void addStudentInGroup(Student student) {
        student.setGroup(this);
        listStudents.add(student);
    }

    @Override
    public void removeStudentFromGroup(Student student) {
        student.setGroup(null);
        listStudents.remove(student);
    }

    @Override
    public void changedTutor(Teacher teacher) {
        this.tutor = teacher;
    }

    public int getQuantStudents() {
        return listStudents.size();
    }

    public LinkedList<Student> searchStudent(String surname) {
        LinkedList<Student> result = new LinkedList<>();
        for (Student student : listStudents) {
            if (student.getSurname().equals(surname)) {
                result.add(student);
            }
        }
        return result;
    }

    public Faculty getFaculty() {
        return this.faculty;
    }

    public int getNumber() {
        return this.number;
    }

    public String getInfo() {
        return String.format(
                "Студенческая группа\n"
                + "Тьютор: %s %s\n"
                + "Факультет: %s\n"
                + "Номер: %d\n"
                + "колличество студентов: %d",
                tutor.getSurname(), tutor.getName(),
                faculty, number, getQuantStudents()
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudyGroup that = (StudyGroup) o;
        return number == that.number && Objects.equals(tutor, that.tutor)
                && Objects.equals(listStudents, that.listStudents)
                && Objects.equals(defaultList, that.defaultList)
                && Objects.equals(faculty, that.faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tutor, listStudents, defaultList, faculty, number);
    }

    @Override
    public String toString() {
        return String.format(
                "Факультет: %s, Номер группы: %d",
                faculty, number
        );
    }
}




















