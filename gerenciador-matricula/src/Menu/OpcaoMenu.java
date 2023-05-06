package Menu;

public abstract class OpcaoMenu{
    private String descricao;
    public OpcaoMenu(String descricao) {
        this.descricao = descricao;
    }

    public abstract void executar();

    @Override
    public String toString() {
        return descricao;
    }
}
