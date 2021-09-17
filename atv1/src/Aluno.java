public class Aluno extends Pessoa {

    private String registration;

    public Aluno(String name, String cpf, String address, String registration) {
        super(name, cpf, address);
        this.registration = registration;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

}
