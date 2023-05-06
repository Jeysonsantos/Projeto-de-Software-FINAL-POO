package Menu;

import Estados.EstadoSistema;
import Estados.TransicaoEstados;
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

    @Override
    public void mudarEstado(TransicaoEstados transicaoEstados){
        transicaoEstados.DisciCadastrada();
    };
}
