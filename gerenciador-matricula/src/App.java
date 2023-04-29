
import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args){
        OpcaoMenu[] opcoesMenu = {
            new MatricularAluno(),
            new RemoverPessoa(),
            // e assim por diante para cada opção do menu
        };
        
        Object opcaoSelecionada = JOptionPane.showInputDialog(null, "Escolha uma opção:", "Opções", JOptionPane.INFORMATION_MESSAGE, null, opcoesMenu, opcoesMenu[0]);
        ((OpcaoMenu) opcaoSelecionada).executar();
        
    }
}
 