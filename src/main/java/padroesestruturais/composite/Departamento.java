package padroesestruturais.composite;

import java.util.ArrayList;
import java.util.List;

public class Departamento extends ComponenteOrganizacional {

    private List<ComponenteOrganizacional> componentes;

    public Departamento(String nome) {
        super(nome);
        this.componentes = new ArrayList<ComponenteOrganizacional>();
    }

    public void adicionarComponente(ComponenteOrganizacional componente) {
        this.componentes.add(componente);
    }

    @Override
    public String getEstrutura() {
        String saida = "";
        saida = "Departamento: " + this.getNome() + "\n";
        for (ComponenteOrganizacional componente : componentes) {
            saida += componente.getEstrutura();
        }
        return saida;
    }
}