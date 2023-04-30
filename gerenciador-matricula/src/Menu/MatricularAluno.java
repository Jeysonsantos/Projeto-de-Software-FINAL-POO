package Menu;

import javax.swing.JOptionPane;

import Main.Aluno;
import Main.Sistema;

public class MatricularAluno extends OpcaoMenu {

    private Sistema sistema;

    public MatricularAluno(Sistema sistema) {
        super("Matricular Aluno");
        this.sistema = sistema;
    }

    @Override
    public void executar() {
        Aluno novoAluno = new Aluno();
        novoAluno.setNome();
        novoAluno.setCPF();
        novoAluno.setMatricula();
        novoAluno.setEmail();
        novoAluno.setCurso();
        sistema.setNumAlunos();
        sistema.adicionarAluno(novoAluno);
        JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso.");
    }
}
