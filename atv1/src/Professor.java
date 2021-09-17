public class Professor extends Funcionario{

    private String Department;

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public Professor(String name, String cpf, String address, String code, double salary, String department) {
        super(name, cpf, address, code, salary);
        Department = department;
    }

    @Override
    public double getSalary() {
        return super.getSalary() * (1+0.2);
    }
}
