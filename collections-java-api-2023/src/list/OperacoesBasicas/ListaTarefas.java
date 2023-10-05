package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        /*
         * o comando if (t.getDescricao().equalsIgnoreCase(descricao)).
         * serve para fazer a comparação entre a descrição passada como parametro (string descricao)
         * com o valor armazenado na descrição do .equalsIgnoreCase(descricao)
         */
        List<Tarefa> tarefasAseremRemovidas = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasAseremRemovidas.add(t);
            }
        }
        tarefaList.removeAll(tarefasAseremRemovidas);
    }
    public int obterNumeroTotalDeTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefa(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println("O número total de tarefas na lista é: " + listaTarefas.obterNumeroTotalDeTarefas());
        listaTarefas.adicionarTarefa("Limpar a casa 1");
        listaTarefas.adicionarTarefa("Limpar a casa");
        listaTarefas.adicionarTarefa("Limpar a casa");
        listaTarefas.adicionarTarefa("Limpar a casa");
        System.out.println("O número total de tarefas na lista é: " + listaTarefas.obterNumeroTotalDeTarefas());
        listaTarefas.removerTarefa("Limpar a casa");
        System.out.println("O número total de tarefas na lista é: " + listaTarefas.obterNumeroTotalDeTarefas());
        listaTarefas.obterDescricoesTarefa();
    }
}

