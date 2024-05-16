// Parent class
class Fruit {
    public void display() {
        System.out.println("This is a fruit.");
    }
}

class Apple extends Fruit {
    public void display() {
        System.out.println("This is an apple.");
    }
}


class Orange extends Fruit {
    public void display() {
        System.out.println("This is an orange.");
    }
}


class Mango extends Fruit {
    public void display() {
        System.out.println("This is a mango.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects of each subclass
        Fruit apple = new Apple();
        Fruit orange = new Orange();
        Fruit mango = new Mango();

        // Calling the display method of each object
        apple.display();
        orange.display();
        mango.display();
    }
}
