package Menu;

import javax.swing.JOptionPane;

public class MostrarInfo extends OpcaoMenu {
    public MostrarInfo(){
        super("Mostrar Informações");
    }

    @Override
    public void executar() {
        Object [] aluno_prof = {"ALUNO", "PROFESSOR","DADOS GERAIS"};
        Object op_aluno_prof = JOptionPane.showInputDialog(null,"Escolha uma opção:","Opções", JOptionPane.INFORMATION_MESSAGE, null, aluno_prof, aluno_prof[0]);
        if (op_aluno_prof == "ALUNO"){ 
            Object opt_alunos = mat.ListagemAlunos(Alunos);
            for(int i = 0; i < Pessoas.size(); i++)
            {
                if(opt_alunos == null) {break;}
                else if(opt_alunos == Pessoas.get(i).getNome())
                {
                    Pessoas.get(i).MostrarInfo();
                    break;
                }
            }    
        }else if(op_aluno_prof == "PROFESSOR"){
            Object opt_professor = prof.ListagemProfessor(Professores);
            for(int i = 0; i < Pessoas.size(); i++)
            {
                if(opt_professor == null) {break;}
                else if(opt_professor == Pessoas.get(i).getNome())
                {
                    Pessoas.get(i).MostrarInfo();
                    break;
                }
            }    
        
        }else if(op_aluno_prof == "DADOS GERAIS"){
            pes.MostrarInfo();
        }
    }
    
}
