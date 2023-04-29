
import javax.swing.JOptionPane;
public class MatricularAluno extends OpcaoMenu{
    
    @Override
    public void executar() {
        Aluno novoAluno = new Aluno();
        novoAluno.setNome();
        novoAluno.setCPF();
        if(novoAluno.getCpf()==0){continue;}
        novoAluno.setMatricula();
        if(novoAluno.getMatricula()==0){continue;}
        novoAluno.setEmail();
        novoAluno.setCurso();
        pes.setNumAlunos();
        Alunos.add(novoAluno);
        Pessoas.add(novoAluno);
        JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso.");
    }
}
