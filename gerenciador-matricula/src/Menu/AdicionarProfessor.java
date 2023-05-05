package Menu;


import Estados.EstadoSistema;
import Main.Sistema;

public class AdicionarProfessor extends OpcaoMenu {
    private Sistema sistema;
    private EstadoSistema estado;
    
    public AdicionarProfessor(Sistema sistema, EstadoSistema estado){
        super("Adicionar Professor");
        this.sistema = sistema;
        this.estado = estado;

    }

    @Override
    public void executar() {
        estado.MenuAdicaoProfessor(sistema);
    }
}
