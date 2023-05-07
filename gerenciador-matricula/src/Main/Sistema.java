package Main;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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

    public void AddAluno(Aluno aluno) {this.alunos.add(aluno);}

    public void adicionarProfessor(Professor professor) {this.professores.add(professor);}
    
    public void getInfoAlunos() {
        Utilidade utilidade = new Utilidade();
        Object opt_alunos = utilidade.listagem(alunos, "Alunos", "Escolha um aluno");
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
    
    public boolean verificarExisteDisci(){
        try {
            for(int i=0;i<this.alunos.size();i++){
                if(this.alunos.get(i).disciplinas.size()!=0){
                    return true;
                }
            } 
        }catch (Exception e) {
            return false;
        }
        return false;
    }

    public void getInfoProfessores() {
        
        Utilidade utilidade = new Utilidade();
        Object opt_professor = utilidade.listagem(professores, "Professores", "Escolha um professor");
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

    public void ExcluirAluno() {
        Utilidade utilidade = new Utilidade();
        Object opt_alunos = utilidade.listagem(alunos, "Alunos", "Escolha um aluno");
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
    public void ExcluirProf(){
        Utilidade utilidade = new Utilidade();
        Object opt_professor = utilidade.listagem(professores, "Professores", "Escolha um professor");
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
        Utilidade utilidade = new Utilidade();
        Object opt_alunos = utilidade.listagem(alunos, "Alunos", "Escolha um aluno");
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

    public void RemoverDisci(){
        Utilidade utilidade = new Utilidade();
        Object opt_alunos = utilidade.listagem(alunos, "Alunos", "Escolha um aluno");
        for(int i = 0; i < alunos.size(); i++)//navegar pelos alunos
        {
            if(opt_alunos == null) {break;}
            else if(opt_alunos == alunos.get(i).getNome())
            {
                ArrayList<Disciplina> d  = alunos.get(i).getDici(); 
                Object opt_d = alunos.get(i).ListagemDici(d);
                if(d!=null){
                    for(int j = 0; j < d.size(); j++)
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
    public void AlterarDadosAluno(){
        Utilidade utilidade = new Utilidade();
        Object opt_alunos = utilidade.listagem(alunos, "Alunos", "Escolha um aluno");
        for (int i = 0; i < alunos.size(); i++) {
            if (opt_alunos == null) {
                break;
            } else if (opt_alunos == alunos.get(i).getNome()) {
                Object[] dados_aluno = {"Nome", "CPF", "Email", "Número de Matrícula", "Disciplinas", "Curso"};
                Object dado_selecionado = JOptionPane.showInputDialog(null, "Escolha uma opção:", "Opções", JOptionPane.INFORMATION_MESSAGE, null, dados_aluno, dados_aluno[0]);
                Map<String, Runnable> opcoes = new HashMap<>();
                final int index = i;
                opcoes.put("Nome", () -> alunos.get(index).resetNome());
                opcoes.put("CPF", () -> alunos.get(index).resetCPF());
                opcoes.put("Email", () -> alunos.get(index).resetEmail());
                opcoes.put("Número de Matrícula", () -> alunos.get(index).resetMatricula());
                opcoes.put("Curso", () -> alunos.get(index).resetCurso());
                opcoes.put("Disciplinas", () -> {
                    ArrayList<Disciplina> d = alunos.get(index).getDici();
                    Object opt_d = alunos.get(index).ListagemDici(d);
        
                    for (int j = 0; j < d.size(); j++) {
                        if (opt_d == null) {
                            break;
                        } else if (opt_d == d.get(j).getNomeDisciplina()) {
                            Object[] subOpcoes = {"Nome da disciplina", "Professor responsável", "Nota"};
                            Object subOpcaoSelecionada = JOptionPane.showInputDialog(null, "Escolha uma opção:", "Opções", JOptionPane.INFORMATION_MESSAGE, null, subOpcoes, subOpcoes[0]);
                            final int index2 = j;
                            
                            Map<String, Runnable> subOpcoesMap = new HashMap<>();
                            subOpcoesMap.put("Nome da disciplina", () -> d.get(index2).resetNomeDisciplina());
                            subOpcoesMap.put("Nota", () -> d.get(index2).resetNota());
                            subOpcoesMap.put("Professor responsável", () -> d.get(index2).setProfessor(professores));
        
                            if (subOpcoesMap.containsKey(subOpcaoSelecionada.toString())) {
                                subOpcoesMap.get(subOpcaoSelecionada.toString()).run();
                            }
                            break;
                        }
                    }
                });
        
                if (opcoes.containsKey(dado_selecionado.toString())) {
                    opcoes.get(dado_selecionado.toString()).run();
                }
        
                JOptionPane.showMessageDialog(null, "Dados Atualizados com sucesso.");
                break;
            }
        }
    }
    public void AlterarDadosProfessor() {
        Utilidade utilidade = new Utilidade();
        Object opt_prof = utilidade.listagem(professores, "Professores", "Escolha um professor");
    
        if (opt_prof != null) {
            for (int i = 0; i < professores.size(); i++) {
                if (opt_prof == professores.get(i).getNome()) {
                    final int index = i;
                    HashMap<String, Runnable> opcoesDados = new HashMap<>();
                    opcoesDados.put("Nome", () -> professores.get(index).resetNome());
                    opcoesDados.put("CPF", () -> professores.get(index).resetCPF());
                    opcoesDados.put("Email", () -> professores.get(index).resetEmail());
                    opcoesDados.put("Salário", () -> professores.get(index).resetSalario());
                    opcoesDados.put("Formação acadêmica", () -> professores.get(index).resetFormacaoAcademica());
    
                    Object[] dados_prof = opcoesDados.keySet().toArray();
                    Object dado_selecionado = JOptionPane.showInputDialog(null, "Escolha uma opção:", "Opções", JOptionPane.INFORMATION_MESSAGE, null, dados_prof, dados_prof[0]);
    
                    if (dado_selecionado != null) {
                        Runnable acao = opcoesDados.get(dado_selecionado);
                        acao.run();
                    }
                    break;
                }
            }
        }
    }    
    }
    
