package Main;
import javax.swing.JOptionPane;

public class Pessoa extends Padrao{
    public String nome;
    public int cpf;
    public String email;
    private int num_alunos;
    private int num_professores;


    public String getNome(){return this.nome;}
    public int getCpf(){return this.cpf;}
    public String getEmail(){return this.email;}
    public int getnum_Alunos(){return this.num_alunos;}
    public int getnum_Professores(){return this.num_professores;}


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
    
    public void setNumProf(){this.num_professores=this.num_professores+1;}
    public void setNumAlunos(){this.num_alunos=this.num_alunos+1;}

    public void delNumProf(){this.num_professores=this.num_professores-1;}
    public void delNumAlunos(){this.num_alunos=this.num_alunos-1;}

    
    public void MostrarInfo()
    {
        int tamanho_prof = getnum_Professores();
        int tamanho_alunos = getnum_Alunos();

        JOptionPane.showMessageDialog(null,"Número de Professores Cadastrados: " + tamanho_prof + 
                "\nNúmero de Alunos Cadastrados: " + tamanho_alunos);
    }
    
    
}
