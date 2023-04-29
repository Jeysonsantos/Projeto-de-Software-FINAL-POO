package Menu;

import java.util.ArrayList;

import Main.Aluno;
import Main.Pessoa;
import Main.Professor;

public abstract class OpcaoMenu{
    private String descricao;

    Aluno mat = new Aluno();
    Professor prof = new Professor();
    Pessoa pes = new Pessoa();
    ArrayList<Aluno> Alunos = new ArrayList<Aluno>();
    ArrayList<Professor> Professores = new ArrayList<Professor>();
    ArrayList<Pessoa> Pessoas = new ArrayList<Pessoa>();
    

    public OpcaoMenu(String descricao) {
        this.descricao = descricao;
    }

    public abstract void executar();

    @Override
    public String toString() {
        return descricao;
    }
}
