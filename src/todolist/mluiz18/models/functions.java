package todolist.mluiz18.models;

import java.util.Scanner;

public class functions {
    public static void menu() {
        Scanner scn = new Scanner(System.in);
        System.out.println("-=-=-=-=-=-= Menu -=-=-=-=-=-=");
        System.out.println("1. adicionar");
        System.out.println("2. listar");
        System.out.println("3. concluir");
        System.out.println("4. remover");
        System.out.println("5. sair");
        Byte choice = scn.nextByte();

        if (choice < 1 || choice > 5) {
            System.out.println("Escolha Inválida! Tente Novamente.");
            menu();
        } else if (choice == 1) {
            System.out.println("building");
        } else if (choice == 2) {
            System.out.println("building");
        } else if (choice == 3) {
            System.out.println("building");
        } else if (choice == 4) {
            System.out.println("building");
        } else {
            System.out.println("building");
        }
    }
}

