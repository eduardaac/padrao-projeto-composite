package padroesestruturais.composite;

public abstract class ComponenteOrganizacional {

    private String nome;

    public ComponenteOrganizacional(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract String getEstrutura();
}