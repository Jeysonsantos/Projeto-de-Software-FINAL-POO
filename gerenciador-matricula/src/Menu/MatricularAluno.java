package Menu;

import javax.swing.JOptionPane;

import Main.Aluno;

public class MatricularAluno extends OpcaoMenu{


    public MatricularAluno() {
        super("Matricular Aluno");
    }
    
    @Override
    public void executar() {
        Aluno novoAluno = new Aluno();
        novoAluno.setNome();
        novoAluno.setCPF();
        novoAluno.setMatricula();
        novoAluno.setEmail();
        novoAluno.setCurso();
        pes.setNumAlunos();
        Alunos.add(novoAluno);
        JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso.");
        
    }
}
