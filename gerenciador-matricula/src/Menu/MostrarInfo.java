package Menu;

import Estados.EstadoSistema;
import Main.Sistema;

public class MostrarInfo extends OpcaoMenu {
    private Sistema sistema;
    private EstadoSistema estado;

    public MostrarInfo(Sistema sistema, EstadoSistema estado){
        super("Mostrar Informações");
        this.sistema = sistema;
        this.estado = estado;
    }

    @Override
    public void executar() {
        estado.MenuInformacoes(sistema);
    }
}
