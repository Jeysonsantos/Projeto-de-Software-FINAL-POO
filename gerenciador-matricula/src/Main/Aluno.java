package Main;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Aluno extends Pessoa{

    private int matricula;
    public ArrayList<Disciplina> disciplinas;
    private String curso;


    public int getMatricula(){return this.matricula;}
    public String getCurso(){return this.curso;}
    
    public String getEmail(){return this.email;}
    public ArrayList<Disciplina> getDici(){return this.disciplinas;}
    
    @Override
    public String toString(){
        return getNome();
    }
    
    public void setMatricula(Integer matricula){this.matricula = matricula;}
    
    public void resetMatricula(){
        Integer numero = null;
        while (numero == null) {
            String input = JOptionPane.showInputDialog("Numero de matricula do aluno",getMatricula());
            if (input == null) {
                this.matricula = getMatricula();
                break;
            }
            try {
                numero = Integer.parseInt(input);
                this.matricula = numero;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um número inteiro válido.");
            }
        }
    }

    public void setCurso(String curso){this.curso = curso;}
    public void resetCurso(){this.curso = JOptionPane.showInputDialog(null,"Curso",getCurso());}

    
    public void setDici(ArrayList<Professor> Professores){

        Object[] options = {1,2,3,4,5,6,7,8,9};
        Object op = JOptionPane.showInputDialog(null,"Escolha quantas disciplinas deseja cadastrar:","Opções",JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        if(op==null){return;}
        else{
            int opint = op.hashCode();
            if(this.disciplinas != null){
                for(int i=0;i<opint;i++)
                {
                    Disciplina disciplina= new Disciplina();
                    disciplina.setNomeDisciplina();
                    disciplina.setNota();
                    disciplina.setProfessor(Professores);
                    this.disciplinas.add(disciplina);
                    if(this.disciplinas.size() >= 9)
                    {
                        JOptionPane.showMessageDialog(null,"O número máximo de disciplinas já foi alcançado !");
                        break;
                    }
                }
            }
            else{
                ArrayList<Disciplina> discip = new ArrayList<Disciplina>();
                for(int i=0;i<opint;i++)
                {
                    Disciplina disciplina= new Disciplina();
                    disciplina.setNomeDisciplina();
                    disciplina.setNota();
                    disciplina.setProfessor(Professores);
                    discip.add(disciplina);
                }
                this.disciplinas = discip;
            }
        }
    }
    Object ListagemDici(ArrayList<Disciplina> listDici)
    {
        if(listDici!=null){
            if(listDici.size()==0){
                JOptionPane.showMessageDialog(null, "Ainda não existe Disciplinas Cadastrados, acesse a opção ADICIONAR DISCIPLINA para Cadastrar");
                return null;
            }
            Object[] d = new String[9];
            for(int i = 0; i < listDici.size(); i++)
            {
            d[i]  = listDici.get(i).getNomeDisciplina(); 
            } 
            Object opt_dici = JOptionPane.showInputDialog(null, "Escolha uma das disciplinas abaixo", "Disciplinas", JOptionPane.INFORMATION_MESSAGE, null, d, d[0]);
            return opt_dici;
        }else{
            JOptionPane.showMessageDialog(null, "Ainda não existe Disciplinas Vinculadas a este aluno");
            return 0;
        }
    }

    public void MostrarInfo()
    {
        JOptionPane.showMessageDialog(null,"Nome: " + this.nome + 
                "\nCPF: " + this.cpf +
                "\nMatricula: " + this.matricula +
                "\nEmail: " + this.email +
                "\nCurso: " + this.curso);
        
        if(this.disciplinas == null)
        {
            JOptionPane.showMessageDialog(null,"Sem disciplinas matriculadas !\nEscolha a opção 'Adicionar disciplinas' para cadastrar");
            return ;
        }
        else{
            for(int i=0;i<this.disciplinas.size();i++){
                int aux=i+1;
                JOptionPane.showMessageDialog(null,"Disciplina "+aux+": "+this.disciplinas.get(i).getNomeDisciplina() +
                "\nNome do Professor: " + this.disciplinas.get(i).getNomeprofessor() +
                "\nNota: " + this.disciplinas.get(i).getNota());
        }
    }
    }
}



