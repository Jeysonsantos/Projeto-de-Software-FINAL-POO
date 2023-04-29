import javax.swing.JOptionPane;

public class RemoverPessoa extends OpcaoMenu{
    @Override
    public void executar() {
        Object [] alunoprof = {"ALUNO", "PROFESSOR"};
        Object opalunoprof = JOptionPane.showInputDialog(null,"Escolha uma opção:","Opções", JOptionPane.INFORMATION_MESSAGE, null, alunoprof, alunoprof[0]);

        if(opalunoprof=="ALUNO"){
            Object opt_alunos = mat.ListagemAlunos(Alunos);
            for(int i = 0; i < Alunos.size(); i++)
            {

                if(opt_alunos == null) {break;}
                else if(opt_alunos == Alunos.get(i).getNome())
                {
                    Alunos = deleteAluno(Alunos,i);
                    JOptionPane.showMessageDialog(null, "Aluno Excluído com sucesso.");
                    pes.delNumAlunos();
                    break;
                }
            }    
    }
}
}
