package Main;

import javax.swing.JOptionPane;

import Estados.EstadoMatricula;
import Estados.EstadoSistema;
import Menu.*;

public class App {
    
    public static void main(String[] args){
        Sistema sistema = new Sistema();
        EstadoSistema estado = new EstadoMatricula();
        OpcaoMenu[] opcoesMenu = {
            new MatricularAluno(sistema,estado),
            new RemoverPessoa(sistema,estado),
            new AlterarDados(sistema),
            new MostrarInfo(sistema, estado),
            new AdicionarProfessor(sistema, estado),
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
 