class Power {
    public static void main(String[] str) {
        {
            System.out.println(2^^3^^2);
            System.out.println((2^^3)^^2);
            System.out.println(2^^(3^^2));
            System.out.println(4^^-1);
            System.out.println(4^^--1);
            System.out.println(new A().run());
        }
    }
}

class A {
    public int run() {
        System.out.println(2^^3^^2);
        System.out.println((2^^3)^^2);
        System.out.println(2^^(3^^2));
        return 0;
    }
}