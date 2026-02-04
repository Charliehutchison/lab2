public class Person{
    String name;
    int age;
    boolean isOld;

    public Person(int age, String name){
        this.age = age;
        this.name = name;
        this.isOld = age>50;
    }

    public int birthday(){
        age ++;
        return age;
    }
}