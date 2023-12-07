
import java.io.*;
import java.util.ArrayList;

public class counter {

    public static void reading() throws IOException {
        File file = new File(
                "C:\\Users\\комп\\Desktop\\итоговая контрольная работа\\java\\file.txt");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String line;
        while ((line = br.readLine()) != null) {
            addAnim.animalnewAnim.add(Animal.parse(line));
        }
        br.close();
    }

    public static void findAnimal() {
        int age;
        for (Animal animal : getRegister()) {
            if (animal.age != 0)
                continue;
            String line = animal.toString().replace(";", " ");
            System.out.println(line);
        }
    }

    public static ArrayList<Animal> getRegister() {

        return addAnim.animalnewAnim;
    }


    public static void add(){
        Integer all = 0, pet = 0, pack = 0,
                cat = 0, camel = 0, dog = 0,
                horse = 0, donkey = 0, hamster = 0;
        for (Animal animal : getRegister()) {
            all += 1;
            if (animal instanceof Pet)
                pet += 1;
            if (animal instanceof PackAnimals)
                pack += 1;
            if (animal instanceof Cat)
                cat += 1;
            if (animal instanceof Camel)
                camel += 1;
            if (animal instanceof Dog)
                dog += 1;
            if (animal instanceof Donkey)
                donkey += 1;
            if (animal instanceof Hamster)
                hamster += 1;
            if (animal instanceof Horse)
                horse += 1;

        }
        System.out.println("Всего: " + all);
        System.out.println("Домашних: " + pet);
        System.out.println("Вьючных: " + pack);
        System.out.println("Кошек: " + cat);
        System.out.println("Собак: " + dog);
        System.out.println("Хомяков: " + hamster);
        System.out.println("Лошадей: " + horse);
        System.out.println("Ослов: " + donkey);
        System.out.println("Верблюдов: " + camel);
    }
}
