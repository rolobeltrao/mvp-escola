package entidades;

import java.util.ArrayList;

public class Escola {
    private static int ultimoID = 0;
    private int id;
    private String nome;
    private int porte;
    private ArrayList<Aluno> alunos;


    //=============================================================
    //                   C O N S T R U T O R E S
    //=============================================================

    public Escola(String nome, int porte) {
        this.nome    = nome;
        this.porte   = porte;
        this.alunos  = new ArrayList<Aluno>();
        ultimoID    += 1;
        this.id      = ultimoID;
    }



    //=============================================================
    //              G E T T E R S   &   S E T T E R S
    //=============================================================

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

    public int getPorte() {
        return porte;
    }

    public void setPorte(int porte) {
        this.porte = porte;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }




    //=============================================================
    //=============================================================
    //=============================================================

    public void matriculaAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public int numeroAlunos() {
        return this.alunos.size();
    }

    public void relatorioEscola() {
        System.out.println("ID         : " + this.id);
        System.out.println("Escola     : " + this.porte);
        System.out.println("Matrículas : " + this.numeroAlunos());
    }

    public void relacaoAlunos() {
        int i       = 0;
        double soma = 0.0;
        for (Aluno aluno : this.alunos) {
            i++;
            soma += aluno.getMediaNotas();
            System.out.printf("%2d - %-15s - %5s%n", aluno.getId(), aluno.getNome(), aluno.mediaFormatada());
        }
        System.out.println("============================");
        System.out.printf("MÉDIA GERAL             %-5.2f", (i == 0) ? 0.0 : (soma / i));
    }

}
