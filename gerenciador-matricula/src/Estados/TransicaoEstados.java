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
        if(sistema.getnum_Professores()!=0){
            EstadoAlunoProfCadastrado estado = new EstadoAlunoProfCadastrado(sistema);
            this.estadoAtual = estado;
        }else{
            EstadoAlunoCadastrado estado = new EstadoAlunoCadastrado(sistema);
            this.estadoAtual = estado;
        }
    }

    public void ProfessorCadastrado() {
        if(sistema.getnum_Alunos()!=0){
            EstadoAlunoProfCadastrado estado = new EstadoAlunoProfCadastrado(sistema);
            this.estadoAtual = estado;
        }else{
            EstadoProfeCadastrado estado = new EstadoProfeCadastrado(sistema);
            this.estadoAtual = estado;
        }
    }

    public void AlunoProfRemovido() {
        if(sistema.getnum_Alunos()!=0 && sistema.getnum_Professores()!=0){
            EstadoAlunoProfCadastrado estado = new EstadoAlunoProfCadastrado(sistema);
            this.estadoAtual = estado;
        }else if(sistema.getnum_Alunos()!=0){
            EstadoAlunoCadastrado estado = new EstadoAlunoCadastrado(sistema);
            this.estadoAtual = estado;
        }else if(sistema.getnum_Professores()!=0){
            EstadoProfeCadastrado estado = new EstadoProfeCadastrado(sistema);
            this.estadoAtual = estado;}
    }

    public void DisciCadastrada(){
        if(sistema.verificarExisteDisci()){
            EstadoTotal estado = new EstadoTotal(sistema);
            this.estadoAtual = estado;
        }else{
            EstadoAlunoProfCadastrado estado = new EstadoAlunoProfCadastrado(sistema);
            this.estadoAtual = estado;
        }
    }

    public void DisciRemovida(){
        if(sistema.verificarExisteDisci()){
            EstadoTotal estado = new EstadoTotal(sistema);
            this.estadoAtual = estado;
        }else{
            EstadoAlunoProfCadastrado estado = new EstadoAlunoProfCadastrado(sistema);
            this.estadoAtual = estado;
        }
    }

}

