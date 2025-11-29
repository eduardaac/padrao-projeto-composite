package padroesestruturais.composite;

public class Funcionario extends ComponenteOrganizacional {

    private String cargo;

    public Funcionario(String nome, String cargo) {
        super(nome);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String getEstrutura() {
        return "Funcionário: " + this.getNome() + " - Cargo: " + this.cargo + "\n";
    }

}