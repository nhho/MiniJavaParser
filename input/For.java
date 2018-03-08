class For {
    public static void main(String[] str) {
        {
            for (int i = 0; i < 5; i = i + 1)
                System.out.println(i);
            for (int[] i = new int[5]; i[0] < 5; i[0] = i[0] + 1)
                System.out.println(i[0]);
            for (int i = 0, j = 0; j < 5; i = i + 1, j = j + 1)
                System.out.println(j);
            for (int i = 0; i < 5; i = i + 1)
                for (int j = 0; j < i; j = j + 1)
                    System.out.println(100 + j);
            for (int i = 0; i < 5; i = i + 1)
                i = new A().run(i);
        }
    }
}

class A {
    public int run(int a) {
        for (int i = 0; i < a; i = i + 1)
            System.out.println(10000 + i);
        return a;
    }
}