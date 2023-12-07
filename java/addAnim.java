

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class addAnim {

    static ArrayList<Animal> animalFarm = new ArrayList<>();
    static ArrayList<Animal> animalcat = new ArrayList<>();
    static ArrayList<Animal> animaldog = new ArrayList<>();
    static ArrayList<Animal> animalhamster = new ArrayList<>();
    static ArrayList<Animal> animalhorse = new ArrayList<>();
    static ArrayList<Animal> animalcamel = new ArrayList<>();
    static ArrayList<Animal> animaldonkey = new ArrayList<>();

            public static void addanimal() {
                animaldog.add(new Dog("Кеша", 1, 1,"old", Type.Dog));
                animaldog.add(new Dog("Рекс", 5, 2, "old", Type.Dog));
                animaldog.add(new Dog("Бобик", 7, 3, "old", Type.Dog));
                animaldonkey.add(new Donkey("Иа", 1, 1, "old", Type.Donkey));
                animaldonkey.add(new Donkey("Пух", 6, 2, "old", Type.Donkey));
                animaldonkey.add(new Donkey("Ослик", 3, 3, "old", Type.Donkey));
                animalhorse.add(new Horse("Пегас", 2, 1, "old",Type.Horse));
                animalhorse.add(new Horse("Гром", 3, 2, "old", Type.Horse));
                animalhorse.add(new Horse("Аква", 5, 3, "old", Type.Horse));
                animalcamel.add((new Camel("Вася", 2, 1, "old", Type.Camel)));
                animalcamel.add((new Camel("Фунтик", 3, 2, "old", Type.Camel)));
                animalcamel.add((new Camel("Василь", 4, 3, "old", Type.Camel)));
                animalcat.add(new Cat("филя", 4, 1, "old", Type.Cat));
                animalcat.add(new Cat("Барсик", 1, 2, "old", Type.Cat));
                animalcat.add(new Cat("Пушистик", 4, 3, "old", Type.Cat));
                animalhamster.add(new Hamster("Хома", 1, 1, "old",Type.Hamster));
                animalhamster.add(new Hamster("Хомик", 1, 2, "old", Type.Hamster));
                animalhamster.add(new Hamster("Хомяк", 1, 3, "old", Type.Hamster));

                animalFarm.addAll(animaldog);
                animalFarm.addAll(animaldonkey);
                animalFarm.addAll(animalcat);
                animalFarm.addAll(animalcamel);
                animalFarm.addAll(animalhorse);
                animalFarm.addAll(animalhamster);

            }
                public static void printallfarm(){
                addanimal();
                    for (int i = 0; i < animalFarm.size(); i++) {
                        System.out.println(animalFarm.get(i));
                    }
                    System.out.println("Всего животных: " + animalFarm.size());
                }
               public static void printCat(){
                addanimal();
                System.out.println(" Кошки " + "\n" +
                        "---------------");
                for (int i = 0; i < animalcat.size(); i++) {
                    System.out.println(animalcat.get(i));
                    }
                }
                public static void printDog() {
                addanimal();
                System.out.println(" Собаки " + "\n" +
                "---------------");
                for (int i = 0; i < animaldog.size(); i++) {
                    System.out.println(animaldog.get(i));
                    }
                 }
                public static void printHorse() {
                addanimal();
                    System.out.println(" Лошади " + "\n" +
                            "---------------");
                    for (int i = 0; i < animalhorse.size(); i++) {
                        System.out.println(animalhorse.get(i));
                    }
                }
                public static void printHamster() {
                addanimal();
                    System.out.println(" Хомяки " + "\n" +
                            "---------------");
                    for (int i = 0; i < animalhamster.size(); i++) {
                        System.out.println(animalhamster.get(i));
                    }
                }
                public static void printCamel() {
                addanimal();
                    System.out.println(" Верблюды " + "\n" +
                            "---------------");
                    for (int i = 0; i < animalcamel.size(); i++) {
                        System.out.println(animalcamel.get(i));
                    }
                }
                public static void printDonkey() {
                addanimal();
                    System.out.println(" Ослы " + "\n" +
                            "---------------");
                    for (int i = 0; i < animaldonkey.size(); i++) {
                        System.out.println(animaldonkey.get(i));
                    }
                }

    static ArrayList<Animal> animalnewAnim = new ArrayList<>();
    public static void catAdd() {
        printCat();
        System.out.println("Количество животных: " + animalcat.size());
        System.out.print("Введите значение количества животных:");
        Scanner sc = new Scanner(System.in);
        int id = animalnewAnim.size();
        int count = sc.nextInt();
        for (int i = 0; i <= count; i++) {
            System.out.println("Введите имя животного: ");
            String nameNewCat = sc.next();
            System.out.println("Введите возраст животного: ");
            int age = sc.nextInt();
           while (count >= 0) {
                id = animalnewAnim.size() + 1;
                count--;
                break;
            }

            animalnewAnim.add(new Cat(nameNewCat, age, id, "new", Type.Cat));

            FileWriter writer = null;
            try {
                writer = new FileWriter(
                        "C:\\Users\\комп\\Desktop\\итоговая контрольная работа\\java\\file.txt",
                        false);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            for (Animal animal : animalnewAnim) {
                try {
                    writer.append(animal.toString().replace("|",";") + "\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            try {
                writer.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

            System.out.println(animalnewAnim.get(animalnewAnim.size()-1));


    }



    public static void camelAdd() {
        printCamel();
        System.out.println("Количество животных: " + animalcamel.size());
        System.out.print("Введите значение количества животных: ");
        Scanner sc = new Scanner(System.in);
        int id = animalnewAnim.size();
        int count = sc.nextInt();
        for (int i = 0; i <= count; i++) {
            System.out.println("Введите имя животного: ");
            String nameNewCamel = sc.next();
            System.out.println("Введите возраст животного: ");
            int age = sc.nextInt();
            String status = null;
            while (count >= 0){
                id = animalnewAnim.size() + 1;
                status = "new";
                count--;
                break;
            }
            animalnewAnim.add(new Camel(nameNewCamel, age, id, status,Type.Camel));

            FileWriter writer = null;
            try {
                writer = new FileWriter(
                        "C:\\Users\\комп\\Desktop\\итоговая контрольная работа\\java\\file.txt",
                        false);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            for (Animal animal : animalnewAnim) {
                try {
                    writer.append(animal.toString().replace("|",";") + "\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            try {
                writer.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(animalnewAnim.get(animalnewAnim.size()-1));
    }
    public static void dogAdd() {
        printDog();
        System.out.println("Количество животных: " + animaldog.size());
        System.out.print("Введите значение количества животных: ");
        Scanner sc = new Scanner(System.in);
        int id = animalnewAnim.size();
        int count = sc.nextInt();
        for (int i = 0; i <= count; i++) {
            System.out.println("Введите имя животного: ");
            String nameNewDog = sc.next();
            System.out.println("Введите возраст животного: ");
            int age = sc.nextInt();
            String status = null;
            while (count >= 0){
                id = animalnewAnim.size() + 1;
                status = "new";
                count--;
                break;
            }
            animalnewAnim.add(new Dog(nameNewDog, age, id, status,Type.Dog));
            FileWriter writer = null;
            try {
                writer = new FileWriter(
                        "C:\\Users\\комп\\Desktop\\итоговая контрольная работа\\java\\file.txt",
                        false);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            for (Animal animal : animalnewAnim) {
                try {
                    writer.append(animal.toString().replace("|",";") + "\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            try {
                writer.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        System.out.println(animalnewAnim.get(animalnewAnim.size()-1));
    }

    public static void donkeyAdd() {
        printDonkey();
        System.out.println("Количество животных: " + animaldonkey.size());
        System.out.print("Введите значение количества животных: ");
        Scanner sc = new Scanner(System.in);
        int id = animalnewAnim.size();
        int count = sc.nextInt();
        for (int i = 0; i <= count; i++) {
            System.out.println("Введите имя животного: ");
            String nameNewCat = sc.next();
            System.out.println("Введите возраст животного: ");
            int age = sc.nextInt();
            String status = null;
            while (count >= 0){
                id = animalnewAnim.size() + 1;
                status = "new";
                count--;
                break;
            }
            animalnewAnim.add(new Donkey(nameNewCat, age, id, status,Type.Donkey));

            FileWriter writer = null;
            try {
                writer = new FileWriter(
                        "C:\\Users\\комп\\Desktop\\итоговая контрольная работа\\java\\file.txt",
                        false);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            for (Animal animal : animalnewAnim) {
                try {
                    writer.append(animal.toString().replace("|",";") + "\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            try {
                writer.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(animalnewAnim.get(animalnewAnim.size()-1));
    }
    public static void hamsterAdd() {
        printHamster();
        System.out.println("Количество животных: " + animalhamster.size());
        System.out.print("Введите значение количества животных: ");
        Scanner sc = new Scanner(System.in);
        int id = animalnewAnim.size();
        int count = sc.nextInt();
        for (int i = 0; i <= count; i++) {
            System.out.println("Введите имя животного: ");
            String nameNewHamster = sc.next();
            System.out.println("Введите возраст животного: ");
            int age = sc.nextInt();
            String status = null;
            while (count >= 0){
                id = animalnewAnim.size() + 1;
                status = "new";
                count--;
                break;
            }
            animalnewAnim.add(new Hamster(nameNewHamster, age, id, status, Type.Hamster));

            FileWriter writer = null;
            try {
                writer = new FileWriter(
                        "C:\\Users\\комп\\Desktop\\итоговая контрольная работа\\java\\file.txt",
                        false);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            for (Animal animal : animalnewAnim) {
                try {
                    writer.append(animal.toString().replace("|",";") + "\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            try {
                writer.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        System.out.println(animalnewAnim.get(animalnewAnim.size()-1));
    }

    public static void horseAdd() {
        printHorse();
        System.out.println("Количество животных: " + animalhorse.size());
        System.out.print("Введите значение количества животных: ");
        Scanner sc = new Scanner(System.in);
        int id = animalnewAnim.size();
        int count = sc.nextInt();
        for (int i = 0; i <= count; i++) {
            System.out.println("Введите имя животного: ");
            String nameNewHorse = sc.next();
            System.out.println("Введите возраст животного: ");
            int age = sc.nextInt();
            String status = null;
            while (count >= 0){
                id = animalnewAnim.size() + 1;
                status = "new";
                count--;
                break;
            }
            animalnewAnim.add(new Horse(nameNewHorse, age, id, status, Type.Horse));

            FileWriter writer = null;
            try {
                writer = new FileWriter(
                        "C:\\Users\\комп\\Desktop\\итоговая контрольная работа\\java\\file.txt",
                        false);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            for (Animal animal : animalnewAnim) {
                try {
                    writer.append(animal.toString().replace("|",";") + "\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            try {
                writer.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(animalnewAnim.get(animalnewAnim.size()-1));
    }
}
