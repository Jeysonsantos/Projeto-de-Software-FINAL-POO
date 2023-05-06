package Menu;

import Estados.TransicaoEstados;
import Main.Aluno;
import Main.Pessoa;
import Main.Professor;

public abstract class OpcaoMenu{
    private String descricao;

    Aluno mat = new Aluno();
    Professor prof = new Professor();
    Pessoa pes = new Pessoa();
    

    public OpcaoMenu(String descricao) {
        this.descricao = descricao;
    }

    public abstract void executar();
    public abstract void mudarEstado(TransicaoEstados transicaoEstados);

    @Override
    public String toString() {
        return descricao;
    }
}
