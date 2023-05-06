package Main;
import javax.swing.JOptionPane;

import java.util.ArrayList;

public class Disciplina {
    private String nomedisciplina;
    private Professor profe;
    private String nota;


    public String getNomeDisciplina(){return this.nomedisciplina;}
    public String getNota(){return this.nota;}
    public String getNomeprofessor(){return this.profe.getNome();}

    public void setNomeDisciplina(){
        this.nomedisciplina = JOptionPane.showInputDialog("Nome da disciplina:");
    }
    public void resetNomeDisciplina(){
        this.nomedisciplina = JOptionPane.showInputDialog("Nome da disciplina:",getNomeDisciplina());
    }

    public void setNota(){
        this.nota = JOptionPane.showInputDialog("Digite a nota da disciplina:");
    }
    public void resetNota(){
        this.nota = JOptionPane.showInputDialog("Digite a nota da disciplina:",getNota());
    }

    public void setProfessor(ArrayList<Professor> Professores){
        Utilidade utilidade = new Utilidade();
        Object opt_professor = utilidade.listagem(Professores, "Professores", "Escolha um professor");
        for(int i = 0; i < Professores.size(); i++)
        {
            if(opt_professor == null){break;}
            else if(opt_professor == Professores.get(i).getNome())
            {
                this.profe=Professores.get(i);
                break;
            }
        }
}
}