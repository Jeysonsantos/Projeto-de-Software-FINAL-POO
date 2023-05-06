package Menu;

import Estados.EstadoSistema;
import Estados.TransicaoEstados;
import Main.Sistema;

public class MostrarInfo extends OpcaoMenu {
    private EstadoSistema estado;

    public MostrarInfo(Sistema sistema, EstadoSistema estado){
        super("Mostrar Informações");
        this.estado = estado;
    }

    @Override
    public void executar() {
        estado.MenuInformacoes();
    }

    @Override
    public void mudarEstado(TransicaoEstados transicaoEstados){};
}
