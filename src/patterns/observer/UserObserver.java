package patterns.observer;

import java.util.List;

public class UserObserver implements Observed{
    private String name;

    public UserObserver(String name) {
        this.name = name;
    }
    @Override
    public void handleEvent(List<String> vacancys) {
        System.out.printf(
                "%s, мы обновили список вакансий\n"
                        + "Появилась новая вакансия %s\n",
                this.name, vacancys.get(vacancys.size() - 1)
                );
        System.out.println("==================================\n");
    }
}
