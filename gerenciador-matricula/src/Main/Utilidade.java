package Main;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Utilidade {

    public static Object aluno_prof(Object [] opcoes){
        Object op_aluno_prof = JOptionPane.showInputDialog(null,"Escolha uma opção:","Opções", JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
        return op_aluno_prof;
    }

    public Object listagem(ArrayList<?> listaObjetos, String titulo, String mensagem) {
        Object[] objetos = new String[listaObjetos.size()];
        for (int i = 0; i < listaObjetos.size(); i++) {
            objetos[i] = listaObjetos.get(i).toString();
        }
        Object objetoSelecionado = JOptionPane.showInputDialog(null, mensagem, titulo, JOptionPane.INFORMATION_MESSAGE, null, objetos, objetos[0]);
        
        return objetoSelecionado;
    }
    
}
