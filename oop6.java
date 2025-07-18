public class oop6 {

    static class Person {
        protected String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    static class Employee extends Person {
        private double annualSalary;
        private int yearStarted;
        private String nationalInsuranceNumber;

        public Employee(String name, double annualSalary, int yearStarted, String nationalInsuranceNumber) {
            super(name);
            this.annualSalary = annualSalary;
            this.yearStarted = yearStarted;
            this.nationalInsuranceNumber = nationalInsuranceNumber;
        }

        public double getAnnualSalary() {
            return annualSalary;
        }

        public int getYearStarted() {
            return yearStarted;
        }

        public String getNationalInsuranceNumber() {
            return nationalInsuranceNumber;
        }

        public void setAnnualSalary(double annualSalary) {
            this.annualSalary = annualSalary;
        }

        public void setYearStarted(int yearStarted) {
            this.yearStarted = yearStarted;
        }

        public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
            this.nationalInsuranceNumber = nationalInsuranceNumber;
        }

        public String toString() {
            return "Name: " + name +
                   "\nAnnual Salary: " + annualSalary +
                   "\nYear Started: " + yearStarted +
                   "\nNational Insurance Number: " + nationalInsuranceNumber;
        }
    }

    public static void main(String[] args) {

        Employee emp = new Employee("Rohini Reddy", 900000.00, 2019, "NI7896543");

        System.out.println("Employee Details:");
        System.out.println(emp.toString());
        emp.setAnnualSalary(950000.00);
        emp.setYearStarted(2020);

        System.out.println("\nUpdated Employee Details:");
        System.out.println(emp.toString());
    }
}
