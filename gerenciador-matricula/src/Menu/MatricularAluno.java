package Menu;

import Estados.EstadoSistema;
import Estados.TransicaoEstados;
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

    @Override
    public void mudarEstado(TransicaoEstados transicaoEstados){
        transicaoEstados.AlunoCadastrado();
    };
}
