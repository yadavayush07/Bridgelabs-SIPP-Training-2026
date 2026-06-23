class MathWizard {
    int x = 100; // instance variable

    boolean isPrime(int n) {
        for (int i = 2; i < n; i++) if (n % i == 0) return false;
        return n > 1;
    }

    long factorial(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }

    double factorial(double n) { // overloaded
        return factorial((int)n);
    }

    void fibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    int gcd(int a, int b) {
        while (b != 0) { int t = b; b = a % b; a = t; }
        return a;
    }

    int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    int power(int b, int e) {
        int p = 1;
        while (e-- > 0) p *= b;
        return p;
    }

    void scope() {
        int x = 50; // local variable
        System.out.println("Local=" + x + ", Instance=" + this.x);
    }

    public static void main(String[] args) {
        MathWizard m = new MathWizard();
        System.out.println(m.isPrime(7));
        System.out.println(m.factorial(5));
        System.out.println(m.factorial(5.0));
        m.fibonacci(6);
        System.out.println(m.gcd(12,18));
        System.out.println(m.lcm(12,18));
        System.out.println(m.power(2,5));
        m.scope();
    }
}