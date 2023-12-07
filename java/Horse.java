import java.util.ArrayList;
import java.util.Scanner;

public class Horse extends PackAnimals{
    public Horse(String name, int age, int id, String status, Type type) {
        super(name, age, id, status, Type.Horse);}


    static ArrayList<String> animalHorseComands = new ArrayList<>();
    public static void comandsHorse(){
        animalHorseComands.add("Галоп");
        animalHorseComands.add("Ко мне");
        System.out.println("Список команд лошадей " + "\n" +
                "---------------");
        for (int i = 0; i < animalHorseComands.size(); i++) {
            System.out.println(animalHorseComands.get(i));
        }
    }

    public static void comandsAddHorse() {
        comandsHorse();
        System.out.print("Введите значение элемента: ");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println("Введите название команды животного: ");
            String nameComands = sc.next();

            animalHorseComands.add(nameComands);
        }
        for (int i = 0; i < animalHorseComands.size(); i++) {
            System.out.println(animalHorseComands.get(i));
        }
    }

}
