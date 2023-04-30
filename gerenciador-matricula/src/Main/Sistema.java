package Main;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Sistema{
    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professores;
    private int num_alunos;
    private int num_professores;

    public Sistema() {
        this.alunos = new ArrayList<Aluno>();
        this.professores = new ArrayList<Professor>();
    }

    public int getnum_Alunos(){return this.num_alunos;}
    public void setNumAlunos(){this.num_alunos=this.num_alunos+1;}
    public void delNumAlunos(){this.num_alunos=this.num_alunos-1;}

    public int getnum_Professores(){return this.num_professores;}
    public void setNumProf(){this.num_professores=this.num_professores+1;}
    public void delNumProf(){this.num_professores=this.num_professores-1;}

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void adicionarProfessor(Professor professor) {
        this.professores.add(professor);
    }
    
    public void getInfoAlunos() {
        Aluno mat = new Aluno();
        Object opt_alunos = mat.ListagemAlunos(alunos);
            for(int i = 0; i < alunos.size(); i++)
            {
                if(opt_alunos == null) {break;}
                else if(opt_alunos == alunos.get(i).getNome())
                {
                    alunos.get(i).MostrarInfo();
                    break;
                }
            }    
    }

    public void getInfoProfessores() {
        Professor prof = new Professor();
        Object opt_professor = prof.ListagemProfessor(professores);
        for(int i = 0; i < professores.size(); i++)
        {
            if(opt_professor == null) {break;}
            else if(opt_professor == professores.get(i).getNome())
            {
                professores.get(i).MostrarInfo();
                break;
            }
        }   

    }

    public void MostrarInfo()
    {
        int tamanho_prof = getnum_Professores();
        int tamanho_alunos = getnum_Alunos();

        JOptionPane.showMessageDialog(null,"Número de Professores Cadastrados: " + tamanho_prof + 
                "\nNúmero de Alunos Cadastrados: " + tamanho_alunos);
    }

    public static ArrayList<Aluno> deleteAluno(ArrayList<Aluno> Alunos,int aluno_remover){
        Alunos.remove(aluno_remover);
        return Alunos;
    }

    public static ArrayList<Professor> deleteProfessor(ArrayList<Professor> Professores,int prof_remover){
        Professores.remove(prof_remover);
        return Professores;
    }

    public void escolherAluno() {
        Aluno mat = new Aluno();
        Object opt_alunos = mat.ListagemAlunos(alunos);
        for(int i = 0; i < alunos.size(); i++)
        {

            if(opt_alunos == null) {break;}
            else if(opt_alunos == alunos.get(i).getNome())
            {
                alunos = deleteAluno(alunos,i);
                JOptionPane.showMessageDialog(null, "Aluno Excluído com sucesso.");
                delNumAlunos();
                break;
            }
        }
    }
    public void escolherProf(){
        Professor prof = new Professor();
        Object opt_professor = prof.ListagemProfessor(professores);
        for(int i = 0; i < professores.size(); i++)
        {
            if(opt_professor == null) {break;}
            else if(opt_professor == professores.get(i).getNome())
            {
                professores = deleteProfessor(professores, i);
                JOptionPane.showMessageDialog(null, "Professor Excluído com sucesso.");
                delNumProf();
                break;
            }
        }    
    }

    public void adicionarDici(){
        Aluno mat = new Aluno();
        if(professores.size() != 0)
        {
            Object opt_alunos = mat.ListagemAlunos(alunos);
            for(int i = 0; i < alunos.size(); i++)
            {
                if(opt_alunos == null) {break;}
                else if(opt_alunos == alunos.get(i).getNome())
                {
                    alunos.get(i).setDici(professores);
                        JOptionPane.showMessageDialog(null, "Disciplina cadastrada com sucesso.");
                    
                    break;
                }
            }    
    }
    }
}
    
