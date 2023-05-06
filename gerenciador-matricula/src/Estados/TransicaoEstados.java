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
    public void alterarEstado() {
        if(sistema.getnum_Alunos()!=0 && sistema.getnum_Professores()!=0 && !sistema.verificarExisteDisci()){
            EstadoAlunoProfCadastrado estado = new EstadoAlunoProfCadastrado(sistema);
            this.estadoAtual = estado;
        }else if(sistema.getnum_Alunos()!=0 && sistema.getnum_Professores()!=0 && sistema.verificarExisteDisci()){
            EstadoTotal estado = new EstadoTotal(sistema);
            this.estadoAtual = estado;
        }else if(sistema.getnum_Alunos()!=0 && sistema.getnum_Professores()==0 && !sistema.verificarExisteDisci()){
            EstadoAlunoCadastrado estado = new EstadoAlunoCadastrado(sistema);
            this.estadoAtual = estado;
        }else if(sistema.getnum_Alunos()==0 && sistema.getnum_Professores()!=0 && !sistema.verificarExisteDisci()){
            EstadoProfeCadastrado estado = new EstadoProfeCadastrado(sistema);
            this.estadoAtual = estado;
        }else if(sistema.getnum_Alunos()==0 && sistema.getnum_Professores()==0 && !sistema.verificarExisteDisci()){
            EstadoMatricula estado = new EstadoMatricula(sistema);
            this.estadoAtual = estado;
        }
    }
}

