public class Person {
    // Attribute
    public String name;
    public int age;
    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age= age;
    }
    // Copy Constructor
    public Preson(Preson person){
        this.name = person.name;
        this.age = person.age;
    }
    // display method
    public void display(){
        System.out.println("Name: "+name+" Age: "+age);
    }
    // Main method 
    public static void main(String[] agrs){
        Person person1 = new Person("Rakesh", 23);
        System.out.println("The name of the person");
        person1.display();

        // Copy Constructor
        Person person3 = new Person(person1);
        System.out.println("\n Name of the person");
        person3.display();
    }
}
