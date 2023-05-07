class Over {
    public Over(int a, int b) {
        System.out.println("Here both data are integer");
    }

    public Over(int a, float b) {
        System.out.println("Here one data is integer and another is float");
    }

    public Over(int a, double b) {
        System.out.println("Here one data is integer and another is double");
    }
}

public class ConstructorOverload {
    public static void main(String[] args) {
        Over ob1 = new Over(10, 12);
        Over ob2 = new Over(10, 12.0f);
        Over ob3 = new Over(10, 12.00);
    }
}