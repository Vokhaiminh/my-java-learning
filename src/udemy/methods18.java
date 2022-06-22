package src.udemy;

class Person18{
    int age;
    String name;

    void speak(){
        System.out.println("My name is " + name);
    }
}
public class methods18 {
    public static void main(String[] args){
        Person18 thangMinh = new Person18();
        thangMinh.name = "Minh";
        thangMinh.speak();
    }
}
