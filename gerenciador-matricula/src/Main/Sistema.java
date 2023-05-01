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
    public void RemoverDisci(){
        Aluno mat = new Aluno();
        Object opt_alunos = mat.ListagemAlunos(alunos);
        for(int i = 0; i < alunos.size(); i++)//navegar pelos alunos
        {
            if(opt_alunos == null) {break;}
            else if(opt_alunos == alunos.get(i).getNome())
            {
                ArrayList<Disciplina> d  = alunos.get(i).getDici(); 
                Object opt_d = alunos.get(i).ListagemDici(d);
                if(d!=null){
                    for(int j = 0; j < d.size(); j++)//navegar pelas disciplinas
                    {
                        if(opt_d == null) {break;}
                        else if(opt_d == d.get(j).getNomeDisciplina())
                        {
                            d.remove(j);
                            JOptionPane.showMessageDialog(null, "Disciplina removida com sucesso.");

                            break;
                        }
                    }
                }else{continue;}
                break;
            }
        }
    }
    public void AlterarDados(){
        Object [] aluno_prof = {"ALUNO", "PROFESSOR"};
                Object op_aluno_prof = JOptionPane.showInputDialog(null,"Escolha uma opção:","Opções", JOptionPane.INFORMATION_MESSAGE, null, aluno_prof, aluno_prof[0]);
                if(op_aluno_prof == "ALUNO"){
                    Aluno mat = new Aluno();
                    Object opt_alunos = mat.ListagemAlunos(alunos);
                    for(int i = 0; i < alunos.size(); i++)
                    {
                        if(opt_alunos == null) {break;}
                        else if(opt_alunos == alunos.get(i).getNome())
                        {
                            Object[] dados_aluno = {"Nome","CPF","Email","Número de Matricula","Disciplinas", "Curso"};
                            Object dado_selecionado = JOptionPane.showInputDialog(null,"Escolha uma opção:","Opções", JOptionPane.INFORMATION_MESSAGE, null, dados_aluno,dados_aluno[0]);
                            if(dado_selecionado == "Nome"){alunos.get(i).resetNome();}
                            else if(dado_selecionado == "CPF"){alunos.get(i).resetCPF();}
                            else if(dado_selecionado == "Email"){alunos.get(i).resetEmail();}
                            else if(dado_selecionado == "Número de Matricula"){alunos.get(i).resetMatricula();}
                            else if(dado_selecionado == "Curso"){alunos.get(i).resetCurso();}
                            else if(dado_selecionado == "Disciplinas")
                            {
                                ArrayList<Disciplina> d  = alunos.get(i).getDici();
                                Object opt_d = alunos.get(i).ListagemDici(d);                                
                                for(int j = 0; j < d.size(); j++)//navegar pelas disciplinas
                                {
                                    if(opt_d == null) {break;}
                                    else if(opt_d == d.get(j).getNomeDisciplina())
                                    {
                                        Object[] opcoes = {"Nome da disciplina", "Professor responsável", "Nota"};
                                        Object opcaoSelecionada = JOptionPane.showInputDialog(null,"Escolha uma opção:","Opções", JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
                                        if(opcaoSelecionada == "Nome da disciplina"){d.get(j).resetNomeDisciplina();}
                                        else if(opcaoSelecionada == "Nota"){d.get(j).resetNota();}
                                        else if(opcaoSelecionada == "Professor responsável"){d.get(j).setProfessor(professores);}
                                        break;
                                    }
                                }   
                            }
                            JOptionPane.showMessageDialog(null, "Dados Atualizados com sucesso.");

                            break;
                        }
                    }  
                }
                else if(op_aluno_prof == "PROFESSOR"){
                    Professor prof = new Professor();
                    Object opt_prof = prof.ListagemProfessor(professores);
                    for(int i = 0; i < professores.size(); i++)
                    {
                        if(opt_prof == null) {break;}
                        else if(opt_prof == professores.get(i).getNome())
                        {
                            Object[] dados_prof = {"Nome","CPF","Email","Salário", "Formação acadêmica"};
                            Object dado_selecionado = JOptionPane.showInputDialog(null,"Escolha uma opção:","Opções", JOptionPane.INFORMATION_MESSAGE, null, dados_prof,dados_prof[0]);
                            if(dado_selecionado == "Nome"){professores.get(i).resetNome();}
                            else if(dado_selecionado == "CPF"){professores.get(i).resetCPF();}
                            else if(dado_selecionado == "Email"){professores.get(i).resetEmail();}
                            else if(dado_selecionado == "Salário"){professores.get(i).resetSalario();}
                            else if(dado_selecionado == "Formação acadêmica"){professores.get(i).resetFormacaoAcademica();}
                            break;
                        }
                    }
                }
    }
}
    
