package Main;

import javax.swing.JOptionPane;

import Menu.*;

public class App {
    public static void main(String[] args){

        
        OpcaoMenu[] opcoesMenu = {
            new MatricularAluno(),
            new RemoverPessoa(),
            new AlterarDados(),
            new MostrarInfo(),
            new AdicionarProfessor(),
            new AdicionarDisci(),
            new RemoverDisci(),
        };
        

        while(true){
        Object opcaoSelecionada = JOptionPane.showInputDialog(null, "Escolha uma opção:", "Opções", JOptionPane.INFORMATION_MESSAGE, null, opcoesMenu, opcoesMenu[0]);
        try {
            ((OpcaoMenu) opcaoSelecionada).executar();
        } catch (Exception nullPointerException) {
            break;
        }
        
        }
        
    }
}
 