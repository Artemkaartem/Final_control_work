import java.util.ArrayList;
import java.util.Scanner;

public class Camel extends PackAnimals{
    public Camel(String name, int age, int id, String status, Type type) {

        super(name, age, id, status, Type.Camel);
    }

    static ArrayList<String> animalCamelComands = new ArrayList<>();
    public static void comandsCamel(){
        animalCamelComands.add("Ложись");
        System.out.println("Список команд верблюдов " + "\n" +
                "---------------");
        for (int i = 0; i < animalCamelComands.size(); i++) {
            System.out.println(animalCamelComands.get(i));
        }
    }

    public static void comandsAddCamel() {
        comandsCamel();
        System.out.print("Введите значение элемента: ");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println("Введите название команды животного: ");
            String nameComands = sc.next();

            animalCamelComands.add(nameComands);
        }
        for (int i = 0; i < animalCamelComands.size(); i++) {
            System.out.println(animalCamelComands.get(i));
        }
    }

}
