package Main;
import javax.swing.JOptionPane;

public class Pessoa{
    public String nome;
    public int cpf;
    public String email;

    public String getNome(){return this.nome;}
    public int getCpf(){return this.cpf;}
    public String getEmail(){return this.email;}

    public void setNome(){this.nome = JOptionPane.showInputDialog("Nome");}
    public void resetNome(){this.nome = JOptionPane.showInputDialog("Nome",getNome());}
    public void setCPF(){
        Integer numero = null;
        while (numero == null) {
            String input = JOptionPane.showInputDialog("CPF:");
            if (input == null) {
                this.cpf = 0;
                break;
            }
            try {
                numero = Integer.parseInt(input);
                this.cpf = numero;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um número inteiro válido.");
            }
        }
    }
    public void resetCPF(){
        
        Integer numero = null;
        while (numero == null) {
            String input = JOptionPane.showInputDialog("CPF",getCpf());
            if (input == null) {
                this.cpf = getCpf();
                break;
            }
            try {
                numero = Integer.parseInt(input);
                this.cpf = numero;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um número inteiro válido.");
            }
        }
    }
    public void setEmail(){this.email = JOptionPane.showInputDialog("Email");}
    public void resetEmail(){this.email = JOptionPane.showInputDialog("Email",getEmail());}

}
