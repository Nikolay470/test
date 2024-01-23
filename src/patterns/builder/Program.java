package patterns.builder;

public class Program {
    public static void main(String[] args) {
        Employe employe = new Employe.EmployeBuilder("nikolay", "atom")
                .setHasCar(true).setHasBike(false).build();

        System.out.printf("%s, %s\n", employe.getName(), employe.getCompany());
        System.out.println(employe.isHasCar());
        System.out.println(employe.isHasBike());
    }
}
