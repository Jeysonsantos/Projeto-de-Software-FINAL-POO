package Menu;

import Estados.EstadoSistema;
import Main.Sistema;

public class AdicionarDisci extends OpcaoMenu {
    private Sistema sistema;
    private EstadoSistema estado;

    public AdicionarDisci(Sistema sistema, EstadoSistema estado) {
        super("Adicionar Disciplina");
        this.sistema = sistema;
        this.estado = estado;
    }

    @Override
    public void executar() {
        estado.MenuAdicaoDisciplina(sistema);
    }
}
