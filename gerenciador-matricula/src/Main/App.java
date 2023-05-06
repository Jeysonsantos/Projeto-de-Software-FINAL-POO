package Main;

import javax.swing.JOptionPane;
import Estados.TransicaoEstados;
import Menu.*;

public class App {
    
    public static void main(String[] args){
        Sistema sistema = new Sistema();
        TransicaoEstados transicaoEstados = new TransicaoEstados(sistema);
        
        while(true){
            OpcaoMenu[] opcoesMenu = {
                new MatricularAluno(sistema, transicaoEstados.getEstadoAtual()),
                new RemoverPessoa(sistema, transicaoEstados.getEstadoAtual()),
                new AlterarDados(sistema, transicaoEstados.getEstadoAtual()),
                new MostrarInfo(sistema, transicaoEstados.getEstadoAtual()),
                new AdicionarProfessor(sistema, transicaoEstados.getEstadoAtual()),
                new AdicionarDisci(sistema, transicaoEstados.getEstadoAtual()),
                new RemoverDisci(sistema, transicaoEstados.getEstadoAtual()),
            };
            System.out.println("Estado atual: " + transicaoEstados.getEstadoAtual().getClass().getSimpleName());
            Object opcaoSelecionada = JOptionPane.showInputDialog(null, "Escolha uma opção:", "Opções", JOptionPane.INFORMATION_MESSAGE, null, opcoesMenu, opcoesMenu[0]);
            if(opcaoSelecionada == null) break;

            try {
                ((OpcaoMenu) opcaoSelecionada).executar();
                transicaoEstados.alterarEstado();
                
            } catch (Exception nullPointerException) {
                continue;
            }
            
 
        }
    }
}