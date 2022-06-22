package src.udemy;

class Person19{
    int age;
    String name;

    int yearToRetirement(){
        int yearLeft = 65 - age;
        return yearLeft;
    }
}
public class getters19 {
    public static void main(String[] args){
        Person19 person = new Person19();
        person.name = "Minh";
        person.age = 20;
        int years = person.yearToRetirement();
        System.out.println(years);

    }
}
