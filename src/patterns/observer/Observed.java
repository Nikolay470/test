package patterns.observer;

import java.util.LinkedList;
import java.util.List;

public interface Observed {
    void handleEvent(List<String> vacancys);
}
