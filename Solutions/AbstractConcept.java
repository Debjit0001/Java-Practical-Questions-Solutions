
abstract class Bike { // Here Bike is an abstract class
    abstract void engine(); // every bike has it's own engine

    abstract void wheel(); // also, every bike has it's own wheels
}

class Royal extends Bike { // Royal Enfield is bike company that uses the abstract concept of a bike
    void engine() { // Every Royal Enfield bike has their own unique engine
        System.out.println("Royal Enfield's engine is very strong");
    }

    void wheel() { // also their unique individual wheels
        System.out.println("Also it's wheels are safely");
    }
}

public class AbstractConcept {
    public static void main(String[] args) {
        Bike ob = new Royal(); // Royal class's object is created
        ob.engine();// calling engine method
        ob.wheel();// calling wheel method
    }
}