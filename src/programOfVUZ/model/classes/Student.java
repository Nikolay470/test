package programOfVUZ.model.classes;

import programOfVUZ.model.abstractClasses.Human;

import java.util.Objects;

public class Student extends Human {
    private final Faculty faculty;
    private StudyGroup group;
    public Student(String name, String surname, Faculty faculty) {
        super(name, surname);
        this.faculty = faculty;
    }

    public void setGroup(StudyGroup group) {
        this.group = group;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public StudyGroup getGroup() {
        return group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(faculty, student.faculty)
                && Objects.equals(group, student.group)
                && Objects.equals(this.getName(), student.getName())
                && Objects.equals(this.getSurname(), student.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(),this.getSurname(),faculty, group);
    }

    @Override
    public String toString() {
        return String.format(
                "%s %s",
                this.getName(), this.getSurname()
        );
    }
}
