public class Multilevel_inheritance {
    public static void main(String[] args) {
        Derived2 ob = new Derived2(10, 20, 30);
        ob.sum();
    }
}

class Base1 {
    int a;

    Base1(int A) {
        a = A;
    }

}

class DeriVed1 extends Base1 {
    int b;

    DeriVed1(int A, int B) {
        super(A);
        b = B;
    }
}

class Derived2 extends DeriVed1 {
    int c;

    Derived2(int A, int B, int C) {
        super(A, B);
        c = C;
    }

    void sum() {
        System.out.println("The sum of three numbers is:" + (a + b + c));
    }
}