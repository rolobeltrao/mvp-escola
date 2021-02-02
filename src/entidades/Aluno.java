package entidades;

import java.util.ArrayList;

public class Aluno {
    private static int ultimoID = 0;
    private int id;
    private String nome;
    private Escola escola;
    private ArrayList<Double> notas;

    //=============================================================
    //                   C O N S T R U T O R E S
    //=============================================================

    public Aluno(String nome, Escola escola) {
        this.nome    = nome;
        this.escola  = escola;
        ultimoID    += 1;
        this.id      = ultimoID;
        this.notas   = new ArrayList<Double>();
        this.escola.matriculaAluno(this);
    }




    //=============================================================
    //              G E T T E R S   &   S E T T E R S
    //=============================================================

    public static int getUltimoID() {
        return ultimoID;
    }

    public static void setUltimoID(int ultimoID) {
        Aluno.ultimoID = ultimoID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }




    //=============================================================

    public void adicionaNota(Double nota) {
        this.notas.add(nota);
    }

    public Double getMediaNotas() {
        int i    = 0;
        Double soma = 0.0;
        for (Double nota : notas) {
            soma += nota;
            i++;
        }
        if (i == 0) {
            return (0.0);
        }
        else {
            return (soma / i);
        }

    }

    public String mediaFormatada() {
        Double mediaNotas = this.getMediaNotas();
        return String.format("%.2f", mediaNotas);
    }

    public void resumoAluno() {
        System.out.println("ID        : " + this.id);
        System.out.println("Nome      : " + this.nome);
        System.out.println("Escola    : " + this.getEscola().getNome());
        System.out.print("Notas     : ");
        for (Double nota : notas) {
            System.out.printf("%.2f   ", nota);
        }
        System.out.println();
        System.out.println("Média     : " + this.mediaFormatada());
    }
}
