package list.OperacoesBasicas;

public class Tarefa {

    //atrubito
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }
    public Tarefa(){

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
