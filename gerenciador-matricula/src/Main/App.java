package Main;

import javax.swing.JOptionPane;

import Menu.*;

public class App {
    public static void main(String[] args){
        Sistema sistema = new Sistema();
        OpcaoMenu[] opcoesMenu = {
            new MatricularAluno(sistema),
            new RemoverPessoa(sistema),
            new AlterarDados(sistema),
            new MostrarInfo(sistema),
            new AdicionarProfessor(sistema),
            new AdicionarDisci(sistema),
            new RemoverDisci(sistema),
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
 