package programOfVUZ.model.classes;

import java.util.ArrayList;
import java.util.Objects;

public class Archive {
    ArrayList<StudyGroup> list = new ArrayList<>(100);

    public void addArchive(StudyGroup group) {
        list.add(group);
    }

    public StudyGroup removeFromArchive(Faculty faculty, int number) {
        StudyGroup resGroup;
        for (StudyGroup group : list) {
            if (
                    Objects.equals(group.getFaculty(), faculty)
                    && group.getNumber() == number
            )
            {
                resGroup = group;
                list.remove(group);
                return resGroup;
            }
        }
        return null;
    }

    public StudyGroup searchGroup(Faculty faculty, int number) {
        // написать логику
        return null;
    }
}
