package Estados;

import javax.swing.JOptionPane;

import Main.Aluno;
import Main.Professor;
import Main.Sistema;

public class EstadoMatricula implements EstadoSistema{

    
    @Override
    public void MenuMatricula(Sistema sistema) {
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
    public void MenuRemocaoPessoa(Sistema sistema) {
        JOptionPane.showMessageDialog(null, "Necessário realizar cadastro de um aluno ou professor.");
    }

    @Override
    public void MenuAlteracaoDados(Sistema sistema) {
        JOptionPane.showMessageDialog(null, "Necessário realizar cadastro de um aluno ou professor.");
    }

    @Override
    public void MenuInformacoes(Sistema sistema) {
        Object [] opcoes = {"DADOS GERAIS"};
        Object op = JOptionPane.showInputDialog(null,"Escolha uma opção:","Opções", JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
        if(op == "DADOS GERAIS"){
            sistema.MostrarInfo();
        }
    }

    @Override
    public void MenuAdicaoProfessor(Sistema sistema) {
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
    public void MenuAdicaoDisciplina(Sistema sistema) {
        JOptionPane.showMessageDialog(null, "Necessário realizar cadastro de um aluno ou professor.");
    }
    @Override
    public void MenuRemocaoDisciplina(Sistema sistema) {
        JOptionPane.showMessageDialog(null, "Necessário realizar cadastro de disciplinas.");
    }
}
