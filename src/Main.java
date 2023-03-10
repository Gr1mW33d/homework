import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true){
            printMenu();
            int i = scanner.nextInt();

            if(i == 1) {
                System.out.println("Выполняется команда 1!");
            } else if(i == 2) {
                System.out.println("Выполняется команда 2!");
            } else if(i == 3) {
                System.out.println("Выполняется команда 3!");
            } else if(i == 4) {
                System.out.println("Всего доброго!");
                break;
            } else {
                System.out.println("Такой команды нет");
            }
        }
    }

    static void printMenu(){
        System.out.println("Что вы хотите сделать?");
        System.out.println("Ввести количество шагов за определённый день - 1");
        System.out.println("Изменить цель по количеству шагов в день - 2");
        System.out.println("Напечатать статистику за определённый месяц - 3");
        System.out.println("Выйти из приложения - 4");
    }
}