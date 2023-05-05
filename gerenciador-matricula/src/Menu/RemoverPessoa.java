package Menu;

import javax.swing.JOptionPane;

import Estados.EstadoSistema;
import Main.Sistema;

public class RemoverPessoa extends OpcaoMenu{
    private Sistema sistema;
    private EstadoSistema estado;


    public RemoverPessoa(Sistema sistema, EstadoSistema estado) {
        super("Remover Pessoa");
        this.sistema = sistema;
        this.estado = estado;

    }
    @Override
    public void executar() {
        estado.MenuRemocaoPessoa(sistema);
    }

    public void executar2() {
        
        Object [] alunoprof = {"ALUNO", "PROFESSOR"};
        Object opalunoprof = JOptionPane.showInputDialog(null,"Escolha uma opção:","Opções", JOptionPane.INFORMATION_MESSAGE, null, alunoprof, alunoprof[0]);

        if(opalunoprof=="ALUNO"){
            sistema.escolherAluno();  
        }else if(opalunoprof=="PROFESSOR"){
            sistema.escolherProf();
        }
        
    }
}
