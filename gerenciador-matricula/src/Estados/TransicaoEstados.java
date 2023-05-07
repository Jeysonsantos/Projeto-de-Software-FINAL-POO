package Estados;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

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
    public Map<Predicate<Sistema>, EstadoSistema> possiveisEstados(){
        Map<Predicate<Sistema>, EstadoSistema> transicoes = new HashMap<>();
        transicoes.put(sistema -> sistema.getnum_Alunos() != 0 && sistema.getnum_Professores() != 0 && !sistema.verificarExisteDisci(), new EstadoAlunoProfCadastrado(sistema));
        transicoes.put(sistema -> sistema.getnum_Alunos() != 0 && sistema.getnum_Professores() != 0 && sistema.verificarExisteDisci(), new EstadoTotal(sistema));
        transicoes.put(sistema -> sistema.getnum_Alunos() != 0 && sistema.getnum_Professores() == 0 && !sistema.verificarExisteDisci(), new EstadoAlunoCadastrado(sistema));
        transicoes.put(sistema -> sistema.getnum_Alunos() == 0 && sistema.getnum_Professores() != 0 && !sistema.verificarExisteDisci(), new EstadoProfeCadastrado(sistema));
        transicoes.put(sistema -> sistema.getnum_Alunos() == 0 && sistema.getnum_Professores() == 0 && !sistema.verificarExisteDisci(), new EstadoMatricula(sistema));
        return transicoes;
    }
    public void alterarEstado() {
        Map<Predicate<Sistema>, EstadoSistema> transicoes = possiveisEstados();
        for (Map.Entry<Predicate<Sistema>, EstadoSistema> entry : transicoes.entrySet()) {
            if (entry.getKey().test(sistema)) {
                this.estadoAtual = entry.getValue();
                break;
            }
        }
    }
}

