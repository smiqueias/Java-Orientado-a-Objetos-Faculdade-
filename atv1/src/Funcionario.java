public class Funcionario extends Pessoa{
    private String code;
    private double salary;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Funcionario(String name, String cpf, String address, String code, double salary) {
        super(name, cpf, address);
        this.code = code;
        this.salary = salary;
    }
}
