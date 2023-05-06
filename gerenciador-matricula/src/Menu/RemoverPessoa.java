package Menu;

import Estados.EstadoSistema;
import Main.Sistema;

public class RemoverPessoa extends OpcaoMenu{
    private EstadoSistema estado;

    public RemoverPessoa(Sistema sistema, EstadoSistema estado) {
        super("Remover Pessoa");
        this.estado = estado;
    }

    @Override
    public void executar() {
        estado.MenuRemocaoPessoa();
    }
}
