package todolist.mluiz18;

import todolist.mluiz18.models.functions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while (true) {
            byte c = functions.menu();
            if (c == 5) {
                System.out.println("Até Mais");
                break;
            } else if (c == 1) {
                System.out.print("Nome da Tarefa: ");
                String name = scn.next();
                functions.addTask(name);

            }
        }
    }
}
