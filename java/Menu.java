import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void menu(){


        System.out.println("Выберете тип животных: " + "\n" +
                "1 Домашние животные " + "\n" +
                "2 Вьючные животные");
                Scanner sc = new Scanner(System.in);
            int numType = sc.nextInt();
            switch (numType){

                case 1:
                    System.out.println("Выберете животных: " + "\n" +
                            "1 Кошки " + "\n" +
                            "2 Собаки " + "\n" +
                            "3 Хомяки");
                    int num = sc.nextInt();
                switch (num){
                    case 1: addAnim.printCat();
                        break;
                    case 2: addAnim.printDog();
                        break;
                    case 3: addAnim.printHamster();
                        break;
                }
                break;
                case 2:
                    System.out.println("Выберете животных: " + "\n" +
                            "1 Лошади " + "\n" +
                            "2 Верблюды " + "\n" +
                            "3 Ослы");
                    num = sc.nextInt();
                    switch (num){
                        case 1: addAnim.printHorse();
                            break;
                        case 2: addAnim.printCamel();
                            break;
                        case 3: addAnim.printDonkey();
                            break;
                    }
                    break;
        }
    }

        public static void menuAdd() {
            System.out.println("Выберете какое животное будете добавлять: " + "\n" +
                    "1 Кошки " + "\n" +
                     "2 Собаки " + "\n" +
                    "3 Хомяки" + "\n" +
                    "4 Лошади " + "\n" +
                    "5 Верблюды " + "\n" +
                    "6 Ослы");
            Scanner sc = new Scanner(System.in);
            int numType = sc.nextInt();
            switch (numType) {
                case 1: addAnim.catAdd();
                    break;
                case 2: addAnim.dogAdd();
                    break;
                case 3: addAnim.hamsterAdd();
                    break;
                case 4: addAnim.horseAdd();
                    break;
                case 5: addAnim.camelAdd();
                    break;
                case 6: addAnim.donkeyAdd();
                    break;
            }
        }
    public static void menuComands() {
        System.out.println("Выберете  у какого животного будете просматривать команды: " + "\n" +
                "1 Кошки " + "\n" +
                "2 Собаки " + "\n" +
                "3 Хомяки" + "\n" +
                "4 Лошади " + "\n" +
                "5 Верблюды " + "\n" +
                "6 Ослы");
        Scanner sc = new Scanner(System.in);
        int numType = sc.nextInt();
        switch (numType) {
            case 1: Cat.comandsCat();
                break;
            case 2: Dog.comandsDog();
                break;
            case 3: Hamster.comandsHamster();
                break;
            case 4:Horse.comandsHorse();
                break;
            case 5: Camel.comandsCamel();
                break;
            case 6: Donkey.comandsDonkey();
                break;
        }
    }

    public static void menuAddComands() {
        System.out.println("Выберете   какому животному будете добавлять команды команды: " + "\n" +
                "1 Кошки " + "\n" +
                "2 Собаки " + "\n" +
                "3 Хомяки" + "\n" +
                "4 Лошади " + "\n" +
                "5 Верблюды " + "\n" +
                "6 Ослы");
        Scanner sc = new Scanner(System.in);
        int numType = sc.nextInt();
        switch (numType) {
            case 1: Cat.comandsAddCat();
                break;
            case 2: Dog.comandsAddDog();
                break;
            case 3: Hamster.comandsAddHamster();
                break;
            case 4: Horse.comandsAddHorse();
                break;
            case 5: Camel.comandsAddCamel();
                break;
            case 6: Donkey.comandsAddDonkey();
                break;
        }
    }
}
