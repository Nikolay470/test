package programOfVUZ.model.classes;

import programOfVUZ.model.abstractClasses.Human;

import java.util.Objects;

public class Teacher extends Human {
    private final String discipline;
    public Teacher(String name, String surname, String discipline) {
        super(name, surname);
        this.discipline = discipline;
    }

    public String getDiscipline() {
        return this.discipline;
    }

    public String getInfo() {
        return String.format(
                "Учитель.\nИмя: %s\nФамилия: %s\nДисциплина: %s",
                this.getName(), this.getSurname(), discipline
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(discipline, teacher.discipline)
                && Objects.equals(this.getName(), teacher.getName())
                && Objects.equals(this.getSurname(), teacher.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(discipline, this.getName(), this.getSurname());
    }

    @Override
    public String toString() {
        return String.format(
                "%s %s",
                this.getSurname(), this.getName()
        );
    }
}
