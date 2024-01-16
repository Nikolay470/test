package programOfVUZ.model.classes;

import java.util.Objects;

public class Faculty {
    private String name;
    private final int quantStudents = 700;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculty faculty = (Faculty) o;
        return quantStudents == faculty.quantStudents && Objects.equals(name, faculty.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, quantStudents);
    }

    @Override
    public String toString() {
        return String.format("%s", name);
    }
}
