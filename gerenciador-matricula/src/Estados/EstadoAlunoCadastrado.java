package Estados;

import javax.swing.JOptionPane;

import Main.Sistema;

public class EstadoAlunoCadastrado extends EstadoMatricula{
    private Sistema sistema;

    public EstadoAlunoCadastrado(Sistema sistema){
        super(sistema);
        this.sistema = sistema;
    }


    @Override
    public void MenuInformacoes() {
        Object [] aluno_prof = {"ALUNO","DADOS GERAIS"};
        Object op_aluno_prof = JOptionPane.showInputDialog(null,"Escolha uma opção:","Opções", JOptionPane.INFORMATION_MESSAGE, null, aluno_prof, aluno_prof[0]);
        if (op_aluno_prof == "ALUNO"){ 
            sistema.getInfoAlunos();
        }else if(op_aluno_prof == "DADOS GERAIS"){
            sistema.MostrarInfo();
        }
    }

    @Override
    public void MenuRemocaoPessoa() {
        Object [] alunoprof = {"ALUNO"};
        Object opalunoprof = JOptionPane.showInputDialog(null,"Escolha uma opção:","Opções", JOptionPane.INFORMATION_MESSAGE, null, alunoprof, alunoprof[0]);

        if(opalunoprof=="ALUNO"){
            sistema.ExcluirAluno();  
        }
    }

    @Override
    public void MenuAlteracaoDados() {
        Object [] aluno_prof = {"ALUNO"};
        Object op_aluno_prof = JOptionPane.showInputDialog(null,"Escolha uma opção:","Opções", JOptionPane.INFORMATION_MESSAGE, null, aluno_prof, aluno_prof[0]);

        if(op_aluno_prof=="ALUNO"){
            sistema.AlterarDadosAluno(); 
        }
    }
}
