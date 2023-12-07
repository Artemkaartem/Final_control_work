import java.util.ArrayList;
import java.util.Scanner;

public class Dog extends Pet{

    public Dog(String name, int age, int id, String status, Type type) {

        super(name, age, id, status, Type.Dog);
    }

    static ArrayList<String> animalDogComands = new ArrayList<>();

    public static void comandsDog(){
        animalDogComands.add("Сидеть");
        animalDogComands.add("Лежать");
        animalDogComands.add("Ко мне");
        System.out.println("Список команд собак " + "\n" +
                "---------------");
        for (int i = 0; i < animalDogComands.size(); i++) {
            System.out.println(animalDogComands.get(i));
        }
    }

    public static void comandsAddDog() {
        comandsDog();
        System.out.print("Введите значение элемента: ");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println("Введите название команды животного: ");
            String nameComands = sc.next();

            animalDogComands.add(nameComands);
        }
        for (int i = 0; i < animalDogComands.size(); i++) {
            System.out.println(animalDogComands.get(i));
        }
    }
}
