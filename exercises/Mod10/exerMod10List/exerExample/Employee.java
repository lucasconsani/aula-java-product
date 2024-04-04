public class Employee {

    private Integer idEmployee;
    private String nameEmployee;
    private Double salaryEmployee;


    public Employee() {

    }

    public Employee(int idEmployee, String nameEmployee, double salaryEmployee) {
        this.idEmployee = idEmployee;
        this.nameEmployee = nameEmployee;
        this.salaryEmployee = salaryEmployee;
    }

    public Integer getIdEmployee() {
        return idEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public Double getSalaryEmployee() {
        return salaryEmployee;
    }

    public void increaseSalary(double percent) {
        this.salaryEmployee += (this.salaryEmployee * (percent / 100));
    }

    public String toString() {
        return idEmployee
                + ", "
                + nameEmployee
                + ", $"
                + String.format("%.2f", salaryEmployee);
    }
}
