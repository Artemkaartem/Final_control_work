public class Pet extends Animal{
    public Pet(String name, int age, int id, String status, Type type) {
        super(name, age, id, status, type);
    }

    @Override
    public String toString() {
        return String.format(this.type + " | " + "  id: " + this.id +  " | " + " Имя: " +  this.name +  " | " + " Возраст: " +  this.age + " | " +  " Статус " + this.status + " | " );
    }


}
