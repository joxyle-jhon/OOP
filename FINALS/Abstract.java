package FINALS;

abstract class Animal{
    public void sound(){
        System.out.println("Brrrrrr");
    };
}


class Abstract extends Animal {
    public static void main(String[] args){
        Abstract obj = new Abstract();
        obj.sound();
    }
}

