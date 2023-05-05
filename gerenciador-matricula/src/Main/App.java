package Main;

import javax.swing.JOptionPane;

import Estados.EstadoMatricula;
import Estados.EstadoSistema;
import Menu.*;

public class App {
    
    public static void main(String[] args){
        Sistema sistema = new Sistema();
        EstadoSistema estadoInicial = new EstadoMatricula();
        OpcaoMenu[] opcoesMenu = {
            new MatricularAluno(sistema,estadoInicial),
            new RemoverPessoa(sistema,estadoInicial),
            new AlterarDados(sistema,estadoInicial),
            new MostrarInfo(sistema, estadoInicial),
            new AdicionarProfessor(sistema, estadoInicial),
            new AdicionarDisci(sistema, estadoInicial),
            new RemoverDisci(sistema, estadoInicial),
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
 