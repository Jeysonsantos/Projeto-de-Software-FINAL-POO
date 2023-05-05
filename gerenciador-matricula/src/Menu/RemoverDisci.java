package Menu;

import Estados.EstadoSistema;
import Main.Sistema;

public class RemoverDisci extends OpcaoMenu{
    private Sistema sistema;
    private EstadoSistema estado;
    
    public RemoverDisci(Sistema sistema, EstadoSistema estado) {
        super("Remover Disciplina");
        this.sistema = sistema;
        this.estado = estado;
    }

    @Override
    public void executar() {
        estado.MenuRemocaoDisciplina(sistema);
    }
}
