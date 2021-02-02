package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    private String titulo;
    private ArrayList<OpcaoMenu> opcoes = new ArrayList<OpcaoMenu>();

    public Menu(String titulo) {
        this.titulo = titulo;
    }



    public void adicionaOpcao(String atalho, String descricao) {
        OpcaoMenu opcaoMenu = new OpcaoMenu(atalho, descricao);
        opcoes.add(opcaoMenu);
    }

    public void apresentaOpcoes() {
        System.out.println(this.titulo);
        System.out.println("=====================");
        for (OpcaoMenu opcaoMenu : opcoes) {
            System.out.printf("[%1s] - %s%n", opcaoMenu.getAtalho(), opcaoMenu.getDescricao());
        }
    }

    public int opcaoEscolhida() {
        System.out.println("=====================");
        System.out.print("Opção: ");
        int opcao = (int) scanner.nextInt();
        return opcao;
    }
}
