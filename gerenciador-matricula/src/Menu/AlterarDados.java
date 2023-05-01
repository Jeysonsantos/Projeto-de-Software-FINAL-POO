package Menu;

import Main.Sistema;

public class AlterarDados extends OpcaoMenu{
    private Sistema sistema;

    public AlterarDados(Sistema sistema){
        super("Alterar Dados");
        this.sistema = sistema;
    }

    @Override
    public void executar() {
        sistema.AlterarDados();
    }
}   
