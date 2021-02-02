package aplicacao;

import entidades.Aluno;
import entidades.Escola;

public class Testes {
    public static void main(String[] args) {
        Escola escola1 = new Escola("Cilon Rosa", 1000);
        Aluno aluno1   = new Aluno("Eduardo", escola1);
        Aluno aluno2   = new Aluno("Maria", escola1);
        Aluno aluno3   = new Aluno("João", escola1);

        Escola escola2 = new Escola("Santa Maria", 1500);
        Aluno aluno4   = new Aluno("Melissa", escola2);
        aluno4.adicionaNota(9.0);

        aluno1.adicionaNota(6.0);

        aluno2.adicionaNota(7.0);
        aluno2.adicionaNota(9.0);

        aluno3.adicionaNota(0.0);
        aluno3.adicionaNota(0.0);

//        escola1.relacaoAlunos();


        aluno3.resumoAluno();
    }
}
