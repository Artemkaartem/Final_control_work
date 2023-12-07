import java.util.ArrayList;
import java.util.Scanner;

public class Donkey extends PackAnimals {
    public Donkey(String name, int age, int id, String status, Type type) {

        super(name, age, id, status, Type.Donkey);
    }

    static ArrayList<String> animalDonkeyComands = new ArrayList<>();

    public static void comandsDonkey() {
        animalDonkeyComands.add("Лежать");
        System.out.println("Список команд ослов " + "\n" +
                "---------------");
        for (int i = 0; i < animalDonkeyComands.size(); i++) {
            System.out.println(animalDonkeyComands.get(i));
        }
    }

    public static void comandsAddDonkey() {
        comandsDonkey();
        System.out.print("Введите значение элемента: ");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println("Введите название команды животного: ");
            String nameComands = sc.next();

            animalDonkeyComands.add(nameComands);
        }
        for (int i = 0; i < animalDonkeyComands.size(); i++) {
            System.out.println(animalDonkeyComands.get(i));
        }
    }

}






