package aplicacao;

import entidades.Menu;

public class Main {
    public static void main(String[] args) {
        int opcao = 0;
        do {
            Menu menuPrincipal = new Menu("Principal");
            menuPrincipal.adicionaOpcao("1", "Escolas");
            menuPrincipal.adicionaOpcao("2", "Alunos");
            menuPrincipal.adicionaOpcao("3", "Relatórios");
            menuPrincipal.adicionaOpcao("0", "Sair");
            menuPrincipal.apresentaOpcoes();
            opcao = menuPrincipal.opcaoEscolhida();
            System.out.printf("%n%n%n%n%n%n%n%n%n");
            if (opcao == 1) {
                cadastroEscolas();
            }
            else if (opcao == 2) {
                cadastroAlunos();
            }
            else if (opcao == 3) {
                relatorios();
            }
        } while (opcao != 0);
    }

    public static void cadastroEscolas() {
        int opcao = 0;
        do {
            Menu menuEscolas = new Menu("Cadastro de ESCOLAS");
            menuEscolas.adicionaOpcao("1", "Nova Escola");
            menuEscolas.adicionaOpcao("2", "Alterar ");
            menuEscolas.adicionaOpcao("3", "Excluir");
            menuEscolas.adicionaOpcao("0", "Sair");
            menuEscolas.apresentaOpcoes();
            opcao = menuEscolas.opcaoEscolhida();
        } while (opcao != 0);
        System.out.printf("%n%n%n%n%n%n%n%n%n");
    }

    public static void cadastroAlunos() {
        int opcao = 0;
        do {
            Menu menuAlunos = new Menu("Cadastro de ALUNOS");
            menuAlunos.adicionaOpcao("1", "Incluir");
            menuAlunos.adicionaOpcao("2", "Alterar");
            menuAlunos.adicionaOpcao("3", "Excluir");
            menuAlunos.adicionaOpcao("0", "Sair");
            menuAlunos.apresentaOpcoes();
            opcao = menuAlunos.opcaoEscolhida();
        } while (opcao != 0);
        System.out.printf("%n%n%n%n%n%n%n%n%n");
    }

    public static void relatorios() {
        System.out.println("");
    }

}
