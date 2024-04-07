public class Person {

    // Поле
    String name;
    int age;
    String gender;

    // Конструктор

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        if (age >= 18) {
            DogPerson dogPerson = new DogPerson("Ветерок", "Черный", 2);
            System.out.println("У " + name + " есть собака " + dogPerson.name);
        } else {
            System.out.println("Рано еще собаку.");
        }
    }


}
