package Menu;


import Estados.EstadoSistema;
import Estados.TransicaoEstados;
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

    @Override
    public void mudarEstado(TransicaoEstados transicaoEstados){};
}
