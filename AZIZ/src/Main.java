class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }
}

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Bob", 30);

        p1.introduce();
        p2.introduce();


        System.out.println("\nCounting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        
        int number = 10;
        if (number % 2 == 0) {
            System.out.println("\n" + number + " is even.");
        } else {
            System.out.println("\n" + number + " is odd.");
        }
    }
}

