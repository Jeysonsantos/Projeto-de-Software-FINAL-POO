package Estados;

import javax.swing.JOptionPane;

import Main.Aluno;
import Main.Professor;
import Main.Sistema;

public class EstadoMatricula implements EstadoSistema{
    private Sistema sistema;

    public EstadoMatricula(Sistema sistema){

        this.sistema = sistema;
    }
    
    @Override
    public void MenuMatricula() {
        Aluno novoAluno = new Aluno();
        novoAluno.setNome();
        novoAluno.setCPF();
        novoAluno.setMatricula();
        novoAluno.setEmail();
        novoAluno.setCurso();
        sistema.setNumAlunos();
        sistema.AddAluno(novoAluno);
        JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso.");
    }

    @Override
    public void MenuRemocaoPessoa() {
        JOptionPane.showMessageDialog(null, "Necessário realizar cadastro de um aluno ou professor.");
    }

    @Override
    public void MenuAlteracaoDados() {
        JOptionPane.showMessageDialog(null, "Necessário realizar cadastro de um aluno ou professor.");
    }

    @Override
    public void MenuInformacoes() {
        Object [] opcoes = {"DADOS GERAIS"};
        Object op = JOptionPane.showInputDialog(null,"Escolha uma opção:","Opções", JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
        if(op == "DADOS GERAIS"){
            sistema.MostrarInfo();
        }
    }

    @Override
    public void MenuAdicaoProfessor() {
        Professor novoProfessor = new Professor();
        novoProfessor.setNome();
        novoProfessor.setCPF();
        novoProfessor.setEmail();
        novoProfessor.setSalario();
        novoProfessor.setFormacaoAcademica();
        sistema.setNumProf();
        sistema.adicionarProfessor(novoProfessor);
        JOptionPane.showMessageDialog(null, "Professor cadastrado com sucesso.");
    }

    @Override
    public void MenuAdicaoDisciplina() {
        JOptionPane.showMessageDialog(null, "Necessário realizar cadastro de um aluno ou professor.");
    }
    @Override
    public void MenuRemocaoDisciplina() {
        JOptionPane.showMessageDialog(null, "Necessário realizar cadastro de disciplinas.");
    }
}
