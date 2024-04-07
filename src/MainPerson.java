public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person("Дениська", 19, "M");
        DogPerson dogPerson2 = new DogPerson("Солнышко", "Черный", 2);

        System.out.println("Имя пользователя: " + person.name);
        System.out.println("Возраст: " + person.age);
        System.out.println("Пол: " + person.gender);

    }
}
