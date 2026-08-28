package todolist.mluiz18.models;

import java.util.Scanner;
import todolist.mluiz18.models.task;

public class functions {
    public static byte menu() {
        Scanner scn = new Scanner(System.in);
        System.out.println("-=-=-=-=-=-= Menu -=-=-=-=-=-=");
        System.out.println("1. adicionar");
        System.out.println("2. listar");
        System.out.println("3. concluir");
        System.out.println("4. remover");
        System.out.println("5. sair");
        System.out.print("Escolha: ");
        byte choice = scn.nextByte();

        if (choice < 1 || choice > 5) {
            System.out.println("Escolha Inválida! Tente Novamente.");
            menu();
        }
        return choice;
    }

    public static void addTask(String name) {
        task t = new task(name);
    }
}

