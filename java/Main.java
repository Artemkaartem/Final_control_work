import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      try {
            counter.reading();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Выберете пункт меню: " + "\n" +
                "1 Показать всех животных в реестре " + "\n" +
                "2 Показать животных по группам " + "\n" +
                "3 Добавить новое животное " + "\n" +
                "4 Показать количество новых животных " + "\n" +
                "5 Список команд животных " + "\n" +
                "6 Обучение новым командам ");

        Scanner sc = new Scanner(System.in);
        int nummenu = sc.nextInt();
        switch (nummenu){
            case 1: addAnim.printallfarm();
            break;
            case 2: Menu.menu();
            break;
            case 3: Menu.menuAdd();
                break;
            case 4:counter.add();
                break;
            case 5: Menu.menuComands();
                break;
            case 6: Menu.menuAddComands();
                break;
        }
    }

}
