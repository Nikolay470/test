package seminar_5.model;

import java.time.Year;

public class Teacher extends User {
    private final String objectTeaching;
    private int experience;

    public Teacher(
            String name, String surname, int age, String objectTeaching, int experience
    )
    {
        super(name, surname, age);
        this.objectTeaching = objectTeaching;
        this.experience = experience;
    }


    public String getObjectTeaching() {
        return objectTeaching;
    }

    public boolean setExperience(int experience) {
        if (experience >= 1 && experience <= 60) {
            this.experience = experience;
            return true;
        } return false;
    }

    @Override
    public boolean equals(Object obj) {

    }

    @Override
    public String toString() {

    }

    @Override
    public int hashCode() {

    }
}














