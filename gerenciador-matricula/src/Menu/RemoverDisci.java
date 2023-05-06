package Menu;

import Estados.EstadoSistema;
import Estados.TransicaoEstados;
import Main.Sistema;

public class RemoverDisci extends OpcaoMenu{
    private EstadoSistema estado;
    
    public RemoverDisci(Sistema sistema, EstadoSistema estado) {
        super("Remover Disciplina");
        this.estado = estado;
    }

    @Override
    public void executar() {
        estado.MenuRemocaoDisciplina();
    }

    @Override
    public void mudarEstado(TransicaoEstados transicaoEstados){};
    

}
