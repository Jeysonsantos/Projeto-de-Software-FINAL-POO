package Menu;

import Estados.EstadoSistema;
import Main.Sistema;

public class AlterarDados extends OpcaoMenu{
    private Sistema sistema;
    private EstadoSistema estado;

    public AlterarDados(Sistema sistema, EstadoSistema estado){
        super("Alterar Dados");
        this.sistema = sistema;
        this.estado = estado;
    }

    @Override
    public void executar() {
        estado.MenuAlteracaoDados(sistema);
    }
}   
