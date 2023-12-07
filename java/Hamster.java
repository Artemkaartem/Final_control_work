import java.util.ArrayList;
import java.util.Scanner;

public class Hamster extends Pet {
    public Hamster(String name, int age, int id, String status, Type type) {

        super(name, age, id, status, Type.Hamster);
    }

    static ArrayList<String> animalHamsterComands = new ArrayList<>();
    public static void comandsHamster(){
        animalHamsterComands.add("Играть");
        System.out.println("Список команд хомяков " + "\n" +
                "---------------");
        for (int i = 0; i < animalHamsterComands.size(); i++) {
            System.out.println(animalHamsterComands.get(i));
        }
    }

    public static void comandsAddHamster() {
        comandsHamster();
        System.out.print("Введите значение элемента: ");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println("Введите название команды животного: ");
            String nameComands = sc.next();

            animalHamsterComands.add(nameComands);
        }
        for (int i = 0; i < animalHamsterComands.size(); i++) {
            System.out.println(animalHamsterComands.get(i));
        }
    }

}
