package Main;
import javax.swing.JOptionPane;

public class Pessoa{
    public String nome;
    public String cpf;
    public String email;

    public String getNome(){return this.nome;}
    public String getCpf(){return this.cpf;}
    public String getEmail(){return this.email;}

    public void setNome(String nome){this.nome = nome;}
    public void setEmail(String email){this.email = email;}
    public void setCPF(String cpf){this.cpf = cpf;}

    
    public void resetNome(){
        String nome = JOptionPane.showInputDialog("Nome",getNome());
        if(nome != null){setNome(nome);}
    }
    
    public void resetCPF(){
        
        String cpf = null;
        while (cpf == null) {
            String input = JOptionPane.showInputDialog("Digite o CPF do aluno:",getCpf());
            if (input == null) {
                break;
            }
            if (input.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")) {
                cpf = input;
                setCPF(cpf);
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, insira um CPF válido no formato xxx.xxx.xxx-xx.");
            }
        }
    }
    
    public void resetEmail(){this.email = JOptionPane.showInputDialog("Email",getEmail());}

}
