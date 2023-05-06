package Main;
import javax.swing.JOptionPane;

public class Professor extends Pessoa{
    
    private Double salario;
    private String formacaoAcademica;


    public Double getSalario(){return this.salario;}
    public String getFormacaoAcademica(){return this.formacaoAcademica;}


    @Override
    public String toString(){
        return getNome();
    }
    
    public void setSalario(){
        Float numero = null;
        while (numero == null) {
            String input = JOptionPane.showInputDialog("Digite o salário deste professor:");
            if (input == null) {
                this.salario = 0.0;
                break;
            }
             else {
                try {
                    Double salario = Double.parseDouble(input);
                    this.salario = salario;
                    break; // sair do loop
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira um salário válido.");
                }
            }
    }
    }
    public void resetSalario(){
        Float numero = null;
    while (numero == null) {
        String input = JOptionPane.showInputDialog("Digite o salário deste professor:",getSalario());
        if (input == null) {
            this.salario = getSalario();
            break;
        }
         else {
            try {
                Double salario = Double.parseDouble(input);
                this.salario = salario;
                break; // sair do loop
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um salário válido.");
            }
        }
}
}

    public void setFormacaoAcademica(){this.formacaoAcademica = JOptionPane.showInputDialog("Formaçao academica deste professor");}
    public void resetFormacaoAcademica(){this.formacaoAcademica = JOptionPane.showInputDialog("Formaçao academica deste professor",getFormacaoAcademica());}
 
    public void MostrarInfo()
    {
        JOptionPane.showMessageDialog(null,"Nome: " + this.nome + 
                "\nCPF: " + this.cpf +
                "\nEmail: " + this.email +
                "\nSalário: " + this.salario +
                "\nFormação Acadêmica: " + this.formacaoAcademica);
    }
}
