package Estados;

import Main.Sistema;
import Main.Utilidade;

public class EstadoProfeCadastrado extends EstadoMatricula{
    private Sistema sistema;

    public EstadoProfeCadastrado(Sistema sistema){
        super(sistema);
        this.sistema = sistema;
    }


    @Override
    public void MenuInformacoes() {
        Object [] opcoes = {"PROFESSOR","DADOS GERAIS"};
        Object op_aluno_prof = Utilidade.aluno_prof(opcoes);
        if (op_aluno_prof == "PROFESSOR"){ 
            sistema.getInfoProfessores();
        }else if(op_aluno_prof == "DADOS GERAIS"){
            sistema.MostrarInfo();
        }
    }

    @Override
    public void MenuRemocaoPessoa() {
        Object [] opcoes = {"PROFESSOR"};
        Object opalunoprof = Utilidade.aluno_prof(opcoes);

        if(opalunoprof=="PROFESSOR"){
            sistema.ExcluirProf();
        }
    }

    @Override
    public void MenuAlteracaoDados() {
        Object [] opcoes = {"PROFESSOR"};
        Object op_aluno_prof = Utilidade.aluno_prof(opcoes);

        if(op_aluno_prof=="PROFESSOR"){
            sistema.AlterarDadosProfessor();
        }
    }
}
