package Menu;

import javax.swing.JOptionPane;

import Main.Professor;
import Main.Sistema;

public class AdicionarProfessor extends OpcaoMenu {
    private Sistema sistema;
    public AdicionarProfessor(Sistema sistema){
        super("Adicionar Professor");
        this.sistema = sistema;
    }

    @Override
    public void executar() {
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
}
