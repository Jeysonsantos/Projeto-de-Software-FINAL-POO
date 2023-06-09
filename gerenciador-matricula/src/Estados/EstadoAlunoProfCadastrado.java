package Estados;

import javax.swing.JOptionPane;

import Main.Aluno;
import Main.Professor;
import Main.Sistema;
import Main.Utilidade;

public class EstadoAlunoProfCadastrado implements EstadoSistema{
    private Sistema sistema;

    public EstadoAlunoProfCadastrado(Sistema sistema){

        this.sistema = sistema;
    }
    
    @Override
    public void MenuMatricula() {
        Aluno novoAluno = new Aluno();
        
        String nome = JOptionPane.showInputDialog("Digite o NOME do aluno:");
        novoAluno.setNome(nome);
        
        String cpf = null;
        while (cpf == null) {
            String input = JOptionPane.showInputDialog("Digite o CPF do aluno:");
            if (input == null) {
                break;
            }
            if (input.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")) {
                cpf = input;
                novoAluno.setCPF(cpf);
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, insira um CPF válido no formato xxx.xxx.xxx-xx.");
            }
        }

        int matricula = 0;
        while (matricula == 0) {
            String input = JOptionPane.showInputDialog("Digite a matrícula do aluno:");
            if (input == null) {
                break;
            }
            try {
                int value = Integer.parseInt(input);
                if (value >= 0 && value <= 99999) {
                    matricula = value;
                    novoAluno.setMatricula(matricula);
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, insira um número de matrícula válido de até 5 dígitos.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um número inteiro válido.");
            }
        }
        
        String email = null;
        while (email == null) {
            String input = JOptionPane.showInputDialog("Digite o e-mail do aluno:");
            if (input == null) {
                break;
            }
            if (input.matches("[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+")) {
                email = input;
                novoAluno.setEmail(email);
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, insira um e-mail válido.");
            }
        }

        String curso = JOptionPane.showInputDialog("Digite o curso do aluno:");
        novoAluno.setCurso(curso);
        
        sistema.setNumAlunos();
        sistema.AddAluno(novoAluno);
        
        JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso.");
    }

    @Override
    public void MenuRemocaoPessoa() {
        Object [] opcoes = {"ALUNO", "PROFESSOR"};
        Object opalunoprof = Utilidade.aluno_prof(opcoes);

        if(opalunoprof=="PROFESSOR"){
            sistema.ExcluirProf();
        }else if(opalunoprof=="ALUNO"){
            sistema.ExcluirAluno();
        }else{
            return;
        }
    }

    @Override
    public void MenuAlteracaoDados() {
        Object [] opcoes = {"ALUNO", "PROFESSOR"};
        Object op_aluno_prof = Utilidade.aluno_prof(opcoes);
        if (op_aluno_prof == "ALUNO"){ 
            sistema.AlterarDadosAluno();
        }else if(op_aluno_prof == "PROFESSOR"){
            sistema.AlterarDadosProfessor();
        }else{
            return;
        }
    }

    @Override
    public void MenuInformacoes() {
        Object [] opcoes = {"ALUNO", "PROFESSOR","DADOS GERAIS"};
        Object op_aluno_prof = Utilidade.aluno_prof(opcoes);
        if (op_aluno_prof == "ALUNO"){ 
            sistema.getInfoAlunos();
        }else if(op_aluno_prof == "PROFESSOR"){
            sistema.getInfoProfessores();
        }else if(op_aluno_prof == "DADOS GERAIS"){
            sistema.MostrarInfo();
        }else{
            return;
        }
    }

    @Override
    public void MenuAdicaoProfessor() {
        Professor novoProfessor = new Professor();
        String nome = JOptionPane.showInputDialog("Digite o NOME do Professor:");
        novoProfessor.setNome(nome);
        
        String cpf = null;
        while (cpf == null) {
            String input = JOptionPane.showInputDialog("Digite o CPF do Professor:");
            if (input == null) {
                break;
            }
            if (input.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")) {
                cpf = input;
                novoProfessor.setCPF(cpf);
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, insira um CPF válido no formato xxx.xxx.xxx-xx.");
            }
        }

        String email = null;
        while (email == null) {
            String input = JOptionPane.showInputDialog("Digite o e-mail do Professor:");
            if (input == null) {
                break;
            }
            if (input.matches("[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+")) {
                email = input;
                novoProfessor.setEmail(email);
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, insira um e-mail válido.");
            }
        }

        novoProfessor.setSalario();
        novoProfessor.setFormacaoAcademica();
        sistema.setNumProf();
        sistema.adicionarProfessor(novoProfessor);
        JOptionPane.showMessageDialog(null, "Professor cadastrado com sucesso.");
    }

    @Override
    public void MenuAdicaoDisciplina() {
        sistema.adicionarDici();
    }

    @Override
    public void MenuRemocaoDisciplina() { // Nao consigo nesse estado
        JOptionPane.showMessageDialog(null, "Necessário realizar cadastro de disciplinas.");
    }
}
