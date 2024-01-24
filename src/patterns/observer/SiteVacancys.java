package patterns.observer;

public interface SiteVacancys {
    void addVacancy(String vacancy);
    void removeVacancy(int index);
    void addObserver(Observed observer);
    void removeObserver(Observed observer);
}
