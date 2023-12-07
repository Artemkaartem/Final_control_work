import java.util.LinkedHashSet;
import java.util.Set;

public class Animal {

    public  String name;
    public static int age;
    public static int id;
    public static String status;

    public Type type;

    public Animal(String name, int age, int id,String status, Type type) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.status = status;
        this.type = type;
    }

    public String getname(){
        return name;
    }

    public int getid(){
        return id;
    }

    public int getage(){
        return age;
    }

    public String getstatus(){return status;}

    public Type type(){
        return type;
    }

    @Override
    public String toString() {
        return String.format(this.type + " | " + "  id: " + this.id +  " | " + " Имя: " +  this.name +  " | " + " Возраст: " +  this.age +  " | " +  " Статус " + this.status + " | " );
    }

    public static Animal parse(CharSequence input) throws RuntimeException {
        String[] split = input.toString().split(";");
        Set<String> commands = new LinkedHashSet<String>();

        if (split.length >= 4) {
            String[] splitCommands = split[3].split(", ");
            for (String command : splitCommands) {
                String commandTrim = command.trim().replaceAll("\\s+", " ");
                if (commandTrim != "")
                    commands.add(commandTrim);
            }
        }
        try {
            split[0] = split[0].trim().replaceAll("\\s+", " ");
            split[1] = split[1].trim().replaceAll("\\s+", " ");
            split[2] = split[2].trim().replaceAll("\\s+", " ");
            String cap = split[0].substring(0, 1).toUpperCase() + split[0].substring(1);
            Type type = Type.valueOf(cap);
            String name = split[1];


            switch (type) {
                case Dog:
                    return new Dog(name, age, id, status, type);
                case Cat:
                    return new Cat(name, id, age, status, type);
                case Hamster:
                    return new Hamster(name, id, age, status, type);
                case Horse:
                    return new Horse(name, id, age, status, type);
                case Camel:
                    return new Camel(name, id, age, status, type);
                case Donkey:
                    return new Donkey(name, id, age, status, type);
                default:
                    throw new RuntimeException();
            }

        } catch (Exception e) {
            throw new RuntimeException("Неправильный ввод", e);
        }
    }


}
