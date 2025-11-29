package padroesestruturais.composite;

public class Empresa {

    private ComponenteOrganizacional estruturaOrganizacional;

    public void setEstruturaOrganizacional(ComponenteOrganizacional estruturaOrganizacional) {
        this.estruturaOrganizacional = estruturaOrganizacional;
    }

    public String getEstruturaOrganizacional() {
        if (this.estruturaOrganizacional == null) {
            throw new NullPointerException("Empresa sem estrutura organizacional definida.");
        }
        return this.estruturaOrganizacional.getEstrutura();
    }
}