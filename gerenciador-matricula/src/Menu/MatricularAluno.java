package Menu;

import Estados.EstadoSistema;
import Main.Sistema;

public class MatricularAluno extends OpcaoMenu {

    private Sistema sistema;
    private EstadoSistema estado;

    public MatricularAluno(Sistema sistema, EstadoSistema estado) {
        super("Matricular Aluno");
        this.sistema = sistema;
        this.estado = estado;
    }

    @Override
    public void executar() {
        estado.MenuMatricula(sistema);
    }
}
