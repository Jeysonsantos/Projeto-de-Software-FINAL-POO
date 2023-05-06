package Menu;

import Estados.EstadoSistema;
import Main.Sistema;

public class MatricularAluno extends OpcaoMenu {

    private EstadoSistema estado;

    public MatricularAluno(Sistema sistema, EstadoSistema estado) {
        super("Matricular Aluno");
        this.estado = estado;
    }

    @Override
    public void executar() {
        estado.MenuMatricula();
    }
}
