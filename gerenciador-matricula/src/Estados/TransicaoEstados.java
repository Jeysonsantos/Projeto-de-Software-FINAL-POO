package Estados;

import Main.Sistema;

public class TransicaoEstados{
    private EstadoSistema estadoAtual;
    private final Sistema sistema;
    
    public TransicaoEstados(Sistema sistema) {
        this.sistema = sistema;
        this.estadoAtual = new EstadoMatricula(sistema);
    }
    public EstadoSistema getEstadoAtual() {
        return estadoAtual;
    }
    public void AlunoCadastrado() {
        EstadoAlunoCadastrado estado = new EstadoAlunoCadastrado(sistema);
        this.estadoAtual = estado;
    }
}

