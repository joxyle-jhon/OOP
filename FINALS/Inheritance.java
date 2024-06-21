public class Inheritance {
    public static void main(String[] args){
        babyDog d = new babyDog();
        d.eat();
        d.bark();
        d.woff();
    }

}
class Animal{
    void eat(){
        System.out.println("Yummmm");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Barkkk");
    }
}

class babyDog extends Dog{
    void woff(){
        System.out.println("Wofff");
    }
}