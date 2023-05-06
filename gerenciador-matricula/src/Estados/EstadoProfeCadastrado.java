package Estados;

import javax.swing.JOptionPane;

import Main.Sistema;

public class EstadoProfeCadastrado extends EstadoMatricula{
    private Sistema sistema;

    public EstadoProfeCadastrado(Sistema sistema){
        super(sistema);
        this.sistema = sistema;
    }


    @Override
    public void MenuInformacoes() {
        Object [] aluno_prof = {"PROFESSOR","DADOS GERAIS"};
        Object op_aluno_prof = JOptionPane.showInputDialog(null,"Escolha uma opção:","Opções", JOptionPane.INFORMATION_MESSAGE, null, aluno_prof, aluno_prof[0]);
        if (op_aluno_prof == "PROFESSOR"){ 
            sistema.getInfoProfessores();
        }else if(op_aluno_prof == "DADOS GERAIS"){
            sistema.MostrarInfo();
        }
    }

    @Override
    public void MenuRemocaoPessoa() {
        Object [] alunoprof = {"PROFESSOR"};
        Object opalunoprof = JOptionPane.showInputDialog(null,"Escolha uma opção:","Opções", JOptionPane.INFORMATION_MESSAGE, null, alunoprof, alunoprof[0]);

        if(opalunoprof=="PROFESSOR"){
            sistema.ExcluirProf();
        }
    }

    @Override
    public void MenuAlteracaoDados() {
        Object [] aluno_prof = {"PROFESSOR"};
        Object op_aluno_prof = JOptionPane.showInputDialog(null,"Escolha uma opção:","Opções", JOptionPane.INFORMATION_MESSAGE, null, aluno_prof, aluno_prof[0]);

        if(op_aluno_prof=="PROFESSOR"){
            sistema.AlterarDadosProfessor();
        }
    }
}
