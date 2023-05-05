package Estados;

import javax.swing.JOptionPane;

import Main.Sistema;

public class EstadoAlunoCadastrado extends EstadoMatricula{
    
    @Override
    public void MenuInformacoes(Sistema sistema) {
        Object [] aluno_prof = {"ALUNO","DADOS GERAIS"};
        Object op_aluno_prof = JOptionPane.showInputDialog(null,"Escolha uma opção:","Opções", JOptionPane.INFORMATION_MESSAGE, null, aluno_prof, aluno_prof[0]);
        if (op_aluno_prof == "ALUNO"){ 
            sistema.getInfoAlunos();
        }else if(op_aluno_prof == "DADOS GERAIS"){
            sistema.MostrarInfo();
        }
    }

    @Override
    public void MenuRemocaoPessoa(Sistema sistema) {
        Object [] alunoprof = {"ALUNO"};
        Object opalunoprof = JOptionPane.showInputDialog(null,"Escolha uma opção:","Opções", JOptionPane.INFORMATION_MESSAGE, null, alunoprof, alunoprof[0]);

        if(opalunoprof=="ALUNO"){
            sistema.ExcluirAluno();  
        }
    }

    @Override
    public void MenuAlteracaoDados(Sistema sistema) {
        Object [] aluno_prof = {"ALUNO"};
        Object op_aluno_prof = JOptionPane.showInputDialog(null,"Escolha uma opção:","Opções", JOptionPane.INFORMATION_MESSAGE, null, aluno_prof, aluno_prof[0]);

        if(op_aluno_prof=="ALUNO"){
            sistema.AlterarDadosAluno(); 
        }
    }
}
