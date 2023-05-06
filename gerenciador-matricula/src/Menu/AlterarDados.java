package Menu;

import Estados.EstadoSistema;
import Main.Sistema;

public class AlterarDados extends OpcaoMenu{
    private EstadoSistema estado;

    public AlterarDados(Sistema sistema, EstadoSistema estado){
        super("Alterar Dados");
        this.estado = estado;
    }

    @Override
    public void executar() {
        estado.MenuAlteracaoDados();
    }
}   
