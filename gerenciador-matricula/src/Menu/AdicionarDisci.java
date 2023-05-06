package Menu;

import Estados.EstadoSistema;
import Main.Sistema;

public class AdicionarDisci extends OpcaoMenu {
    private EstadoSistema estado;

    public AdicionarDisci(Sistema sistema, EstadoSistema estado) {
        super("Adicionar Disciplina");
        this.estado = estado;
    }

    @Override
    public void executar() {
        estado.MenuAdicaoDisciplina();
    }
}
