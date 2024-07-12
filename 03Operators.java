class Operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        int x = 10;
        int y = 5;
        int z = x + y; // Addition
        int a = x - y; // Subtraction
        int b = x * y; // Multiplication
        int c = x / y; // Division
        int d = x % y; // Modulus

        System.out.println("x + y = " + z);
        System.out.println("x - y = " + a);
        System.out.println("x * y = " + b);
        System.out.println("x / y = " + c);
        System.out.println("x % y = " + d);

        // Assignment Operators
        int e = 10;
        e += 5;
        System.out.println("e += 5: " + e);
        e -= 3;
        System.out.println("e -= 3: " + e);
        e *= 2;
        System.out.println("e *= 2: " + e);
        e /= 4;
        System.out.println("e /= 4: " + e);
        e %= 7;
        System.out.println("e %= 7: " + e);

        // Relational Operators
        int f = 7, g = 11;
        System.out.println("f == g: " + (f == g));
        System.out.println("f != g: " + (f != g));
        System.out.println("f > g: " + (f > g));
        System.out.println("f < g: " + (f < g));
        System.out.println("f >= g: " + (f >= g));
        System.out.println("f <= g: " + (f <= g));

        // Logical Operators
        boolean h = true, i = false;
        System.out.println("h && i: " + (h && i));
        System.out.println("h || i: " + (h || i));
        System.out.println("!h: " + !h);
        System.out.println("!i: " + !i);

        // Unary Operators
        int j = 5;
        System.out.println("j: " + j);
        j++;
        System.out.println("j++: " + j);
        j--;
        System.out.println("j--: " + j);
        System.out.println("++j: " + (++j));
        System.out.println("--j: " + (--j));
        System.out.println("j: " + j);
        System.out.println("-j: " + (-j));
        System.out.println("+j: " + (+j));

        // Instanceof Operator
        String k = "Hello";
        System.out.println("k instanceof String: " + (k instanceof String));
        System.out.println("k instanceof Object: " + (k instanceof Object));

        // Ternary Operator
        int l = 10, m = 20;
        int n = (l > m) ? l : m;
        System.out.println("n: " + n);
    }
}
