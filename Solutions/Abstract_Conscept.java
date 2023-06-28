
abstract class Bike { // Abstract class Bike
    abstract void engine(); // every bike's have it's own engine

    abstract void wheel(); // every bike's have it's own wheels
}

class Royal extends Bike { // Royal Enfield is Bike Company that's for it extends the Bike class
    void engine() { // It's have a different separate engine
        System.out.println("Royal Enfield's engine is very strong");
    }

    void wheel() { // also it's have different wheels
        System.out.println("Also it's wheels are safely");
    }
}

public class Abstract_Conscept {
    public static void main(String[] args) {
        Bike ob = new Royal(); // Royal class's object is created
        ob.engine();// call engine method
        ob.wheel();// call wheel method
    }
}