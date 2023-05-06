package Main;

import javax.swing.JOptionPane;

public class Utilidade {

    public static Object aluno_prof(Object [] opcoes){
        Object op_aluno_prof = JOptionPane.showInputDialog(null,"Escolha uma opção:","Opções", JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
        return op_aluno_prof;
    }
}
