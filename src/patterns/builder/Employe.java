package patterns.builder;

public class Employe {
    private String name;
    private String company;
    private boolean hasCar;
    private boolean hasBike;

    private Employe(EmployeBuilder builder) {
        name = builder.name;
        company = builder.company;
        hasCar = builder.hasCar;
        hasBike = builder.hasBike;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public boolean isHasCar() {
        return hasCar;
    }

    public void setHasCar(boolean hasCar) {
        this.hasCar = hasCar;
    }

    public boolean isHasBike() {
        return hasBike;
    }

    public void setHasBike(boolean hasBike) {
        this.hasBike = hasBike;
    }

    public static class EmployeBuilder {
        private String name;
        private String company;
        private boolean hasCar;
        private boolean hasBike;

        public EmployeBuilder(String name, String company) {
            this.name = name;
            this.company = company;
        }


        public EmployeBuilder setHasCar(boolean hasCar) {
            this.hasCar = hasCar;
            return this;
        }

        public EmployeBuilder setHasBike(boolean hasBike) {
            this.hasBike = hasBike;
            return this;
        }

        public Employe build() {
            return new Employe(this);
        }
    }
}
