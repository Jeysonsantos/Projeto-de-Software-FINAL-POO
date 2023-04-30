package Menu;

import Main.Sistema;

public class AdicionarDisci extends OpcaoMenu {
    private Sistema sistema;

    public AdicionarDisci(Sistema sistema) {
        super("Adicionar Disciplina");
        this.sistema = sistema;
    }

    @Override
    public void executar() {
        sistema.adicionarDici();
    }
}
