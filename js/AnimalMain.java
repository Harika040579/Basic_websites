abstract class Animal {
    public abstract void sound();
}

class Lion extends Animal {
    @Override
    public void sound() {
        System.out.println("Rabbit runs");
    }
}

class Tiger extends Animal {
    @Override
    public void sound() {
        System.out.println("Zebra zigzags");
    }
}

public class AnimalMain {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal tiger = new Tiger();

        lion.sound();  
        tiger.sound(); 

        System.out.println("saranya");
        System.out.println("24345");
    }
}
