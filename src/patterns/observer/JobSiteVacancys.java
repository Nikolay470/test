package patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class JobSiteVacancys implements SiteVacancys{
    private List<String> vacancys = new ArrayList<>();
    private List<Observed> listObserves = new ArrayList<>();
    @Override
    public void addVacancy(String vacancy) {
        vacancys.add(vacancy);
        notifyObservers();
    }

    @Override
    public void removeVacancy(int index) {
        vacancys.remove(index);
    }

    @Override
    public void addObserver(Observed observer) {
        listObserves.add(observer);
    }

    @Override
    public void removeObserver(Observed observer) {
        listObserves.remove(observer);
    }

    public void notifyObservers() {
        for (Observed observer : listObserves) {
            observer.handleEvent(vacancys);
        }
    }
}
