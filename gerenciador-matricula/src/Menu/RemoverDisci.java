package Menu;

import Main.Sistema;

public class RemoverDisci extends OpcaoMenu{
    private Sistema sistema;
    
    public RemoverDisci(Sistema sistema) {
        super("Remover Disciplina");
        this.sistema = sistema;
    }

    @Override
    public void executar() {
        sistema.RemoverDisci();
    }
}
