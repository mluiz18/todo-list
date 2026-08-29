package todolist.mluiz18.models;

import java.util.List;
import java.util.Scanner;

import todolist.mluiz18.models.task;

public class functions {
    public static byte menu() {
        Scanner scn = new Scanner(System.in);
        System.out.println("-=-=-=-=-=-= Menu -=-=-=-=-=-=");
        System.out.println("1. adicionar");
        System.out.println("2. listar");
        System.out.println("3. remover");
        System.out.println("4. sair");
        System.out.print("Escolha: ");
        byte choice = scn.nextByte();

        if (choice < 1 || choice > 5) {
            System.out.println("Escolha Inválida! Tente Novamente.");
            menu();
        }
        return choice;
    }

    public static task addTask(String name, String Desc, String ID, String FD) {
        task t = new task(name);
        t.setDescription(Desc);
        t.setInitialDate(ID);
        t.setFinalDate(FD);
        return t;
    }

    public static void listTasks(List<task> Tasks){
        int v = 0;
        for (task t : Tasks) {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Tarefa " + v);
            System.out.println("Nome: " + t.getTitle());
            System.out.println("Descrição: " + t.getDescription());
            System.out.println("Data Inicial: " + t.getInitialDate());
            System.out.println("Data Final: " + t.getFinalDate());
            v += 1;
        }
    }

}

