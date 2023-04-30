package Menu;

import javax.swing.JOptionPane;

import Main.Sistema;

public class MostrarInfo extends OpcaoMenu {
    private Sistema sistema;

    public MostrarInfo(Sistema sistema){
        super("Mostrar Informações");
        this.sistema = sistema;
    }

    @Override
    public void executar() {
        Object [] aluno_prof = {"ALUNO", "PROFESSOR","DADOS GERAIS"};
        Object op_aluno_prof = JOptionPane.showInputDialog(null,"Escolha uma opção:","Opções", JOptionPane.INFORMATION_MESSAGE, null, aluno_prof, aluno_prof[0]);
        if (op_aluno_prof == "ALUNO"){ 
            sistema.getInfoAlunos();
        }else if(op_aluno_prof == "PROFESSOR"){
            sistema.getInfoProfessores();
        }else if(op_aluno_prof == "DADOS GERAIS"){
            sistema.MostrarInfo();
        }
    }
    
}
