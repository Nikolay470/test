package patterns.observer;

public class Program {
    public static void main(String[] args) {
        Observed userObserver1 = new UserObserver("nkolay");
        Observed userObserver2 = new UserObserver("tom");

        SiteVacancys jobSite = new JobSiteVacancys();
        jobSite.addVacancy("java - developer");
        jobSite.addVacancy("frontend - developer");
        jobSite.addVacancy("python - developer");

        jobSite.addObserver(userObserver1);
        jobSite.addObserver(userObserver2);

        jobSite.addVacancy("android - developer");
        jobSite.removeVacancy(2);

        jobSite.addVacancy("IOS - developer");
    }
}
