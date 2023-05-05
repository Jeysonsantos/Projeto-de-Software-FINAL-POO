package Estados;

public class EstadoAtual{
    private EstadoSistema estadoAtual;
    
    public EstadoAtual(EstadoSistema estadoAtual) {
        this.estadoAtual = estadoAtual;
    }
    public EstadoSistema getEstadoAtual() {
        return estadoAtual;
    }
    public void AlunoCadastrado() {
        EstadoAlunoCadastrado estado = new EstadoAlunoCadastrado();
        this.estadoAtual = estado;
    }
}

