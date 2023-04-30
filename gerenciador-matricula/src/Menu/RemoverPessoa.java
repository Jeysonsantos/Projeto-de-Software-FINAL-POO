package Menu;

import javax.swing.JOptionPane;

import Main.Sistema;

public class RemoverPessoa extends OpcaoMenu{
    private Sistema sistema;

    public RemoverPessoa(Sistema sistema) {
        super("Remover Pessoa");
        this.sistema = sistema;

    }
    @Override
    public void executar() {
        Object [] alunoprof = {"ALUNO", "PROFESSOR"};
        Object opalunoprof = JOptionPane.showInputDialog(null,"Escolha uma opção:","Opções", JOptionPane.INFORMATION_MESSAGE, null, alunoprof, alunoprof[0]);

        if(opalunoprof=="ALUNO"){
            sistema.escolherAluno();  
        }else if(opalunoprof=="PROFESSOR"){
            sistema.escolherProf();
        }
        
    }
}
