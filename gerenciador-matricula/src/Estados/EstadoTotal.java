package Estados;

import Main.Sistema;

public class EstadoTotal extends EstadoAlunoProfCadastrado{
    private Sistema sistema;

    public EstadoTotal(Sistema sistema){
        super(sistema);
        this.sistema = sistema;
    }

    @Override
    public void MenuRemocaoDisciplina() { 
        sistema.RemoverDisci();
    }

}
