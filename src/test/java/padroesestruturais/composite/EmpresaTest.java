package padroesestruturais.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    @Test
    void deveRetornarEstruturaOrganizacionalCompleta() {
        // Departamento de Marketing
        Departamento marketing = new Departamento("Marketing");
        Funcionario func1 = new Funcionario("Maria", "Analista de Marketing");
        marketing.adicionarComponente(func1);

        // Departamento de Vendas
        Departamento vendas = new Departamento("Vendas");
        Funcionario func2 = new Funcionario("João", "Vendedor Sênior");
        Funcionario func3 = new Funcionario("Pedro", "Vendedor Pleno");
        vendas.adicionarComponente(func2);
        vendas.adicionarComponente(func3);

        // Departamento de Desenvolvimento (Composite que contém outro Composite)
        Departamento desenvolvimento = new Departamento("Desenvolvimento");
        Funcionario func4 = new Funcionario("Carlos", "Desenvolvedor Front-end");
        desenvolvimento.adicionarComponente(func4);

        // Sub-Departamento de QA
        Departamento qa = new Departamento("Garantia de Qualidade (QA)");
        Funcionario func5 = new Funcionario("Ana", "Tester");
        qa.adicionarComponente(func5);
        desenvolvimento.adicionarComponente(qa);

        // Estrutura Principal da Empresa
        Departamento matriz = new Departamento("Empresa Matriz");
        matriz.adicionarComponente(marketing);
        matriz.adicionarComponente(vendas);
        matriz.adicionarComponente(desenvolvimento);

        Empresa empresa = new Empresa();
        empresa.setEstruturaOrganizacional(matriz);

        assertEquals("Departamento: Empresa Matriz\n" +
                "Departamento: Marketing\n" +
                "Funcionário: Maria - Cargo: Analista de Marketing\n" +
                "Departamento: Vendas\n" +
                "Funcionário: João - Cargo: Vendedor Sênior\n" +
                "Funcionário: Pedro - Cargo: Vendedor Pleno\n" +
                "Departamento: Desenvolvimento\n" +
                "Funcionário: Carlos - Cargo: Desenvolvedor Front-end\n" +
                "Departamento: Garantia de Qualidade (QA)\n" +
                "Funcionário: Ana - Cargo: Tester\n", empresa.getEstruturaOrganizacional());
    }

    @Test
    void deveRetornarExecacaoEmpresaSemEstrutura() {
        try {
            Empresa empresa = new Empresa();
            empresa.getEstruturaOrganizacional();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Empresa sem estrutura organizacional definida.", e.getMessage());
        }
    }
}