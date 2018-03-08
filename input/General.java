class General {
    public static void main(String[] a) {
        System.out.println(0);
    }
}

class A {
}

class B extends A {
    int[] a;
    public boolean b() {
        return true;
    }
    public boolean c(int d) {
        return false;
    }
    public boolean e(int f, int g) {
        return true && false;
    }
}

class C {
    int a;
    B b;
    public int c(int[] d) {
        int[] e;
        System.out.println(0);
        return 0;
    }
    public int[] f(int[] g, int[] h) {
        int e;
        int[] i;
        boolean j;
        System.out.println(0);
        {
            System.out.println(0);
        }
        j = true;
        if (true) System.out.println(0);
        else System.out.println(0);
        if (true) {
            System.out.println(0);
        }
        else {
            System.out.println(0);
        }
        while (j) System.out.println(0);
        i = new int[1];
        e = 0;
        j = j && j;
        j = 0 < 0;
        e = 0 + 0;
        e = 0 - 0;
        e = 0 * 0;
        i[0] = 0;
        e = i.length;
        j = b.b();
        j = b.c(0);
        j = b.e(0, 0);
        j = true;
        j = false;
        e = i[0];
        e = this.c(i);
        b = new B();
        j = !j;
        e = (e);
        j = j || j;
        e = 0 / 1;
        e = -e;
        e = e ^^ e;
        for (int ii = 0; ii < 2; ii = ii + 1) e = 0;
        for (int ii = 0, jj = 0; jj < 10; ii = ii + 1, ii = ii + 1) jj = ii;
        for (e = 0; e < 2; e = e + 1) e = e;
        for (e = 0, e = 1; e < 2; e = e + 1) e = e;
        for (int ii = 0; ii < 2; ii = ii + 1) {
            e = 0;
            e = 0;
        }
        return i;
    }
}