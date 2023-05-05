package Estados;

import Main.Sistema;

public interface EstadoSistema {
    void MenuMatricula(Sistema sistema);
    void MenuRemocaoPessoa(Sistema sistema);
    void MenuAlteracaoDados(Sistema sistema);
    void MenuInformacoes(Sistema sistema);
    void MenuAdicaoProfessor(Sistema sistema);
    void MenuAdicaoDisciplina();
    void MenuRemocaoDisciplina();
}
