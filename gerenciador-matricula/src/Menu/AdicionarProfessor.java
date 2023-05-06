package Menu;

import Estados.EstadoSistema;
import Main.Sistema;

public class AdicionarProfessor extends OpcaoMenu {
    private EstadoSistema estado;
    
    public AdicionarProfessor(Sistema sistema, EstadoSistema estado){
        super("Adicionar Professor");
        this.estado = estado;
    }

    @Override
    public void executar() {
        estado.MenuAdicaoProfessor();
    }
}
