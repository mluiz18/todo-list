package todolist.mluiz18;

import todolist.mluiz18.models.functions;
import todolist.mluiz18.models.task;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        List<task> taskList = new ArrayList<>();

        while (true) {
            byte c = functions.menu();
            if (c == 4) {
                System.out.println("Até Mais");
                break;
            } else if (c == 1) {
                System.out.print("Nome da Tarefa: ");
                String name = scn.next();
                System.out.print("Descrição da tarefa: ");
                String desc = scn.next();
                System.out.print("Prazo Final: ");
                String Pf = scn.next();

                taskList.add(functions.addTask(name, desc, "today", Pf));
            } else if (c == 2) {
                if (taskList.isEmpty()) {
                    System.out.println("Sem tarefas pendentes!");
                } else {
                    functions.listTasks(taskList);
                }
            } else if (c == 3) {
                if (!taskList.isEmpty()) {
                    System.out.print("Digite o indice da tarefa que quer remover: ");
                    byte i = scn.nextByte();
                    functions.removeTask(taskList, i);
                    System.out.println("Tarefa " + i + " removida com sucesso!");
                } else {
                    System.out.println("Não existem tarefas para excluir!");
                }
            }
        }
    }
}
