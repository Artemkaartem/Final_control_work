
import java.util.ArrayList;
import java.util.Scanner;

public class Cat extends Pet {
    public Cat(String name, int age, int id, String status, Type type) {
        super(name, age, id, status, Type.Cat);
    }

    static ArrayList<String> animalCatComands = new ArrayList<>();
    public static void comandsCat(){
        animalCatComands.add("Играть");
        System.out.println("Список команд кошек " + "\n" +
                "---------------");
        for (int i = 0; i < animalCatComands.size(); i++) {
            System.out.println(animalCatComands.get(i));
        }
    }

    public static void comandsAddCat() {
        comandsCat();
        System.out.print("Введите значение элемента: ");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println("Введите название команды животного: ");
            String nameComands = sc.next();

            animalCatComands.add(nameComands);
        }
        for (int i = 0; i < animalCatComands.size(); i++) {
            System.out.println(animalCatComands.get(i));
        }
    }
}