class Person {
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }
}

public class Encaptulation{
    public static void main(String[] args){
        Person person = new Person();
        person.setName("Joxyle");
        System.out.println(person.getName());
    }
}


