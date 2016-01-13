package smaating;

/**
 * Created by Roger on 16/11/2015.
 */
public class Summetest {
    public static void main(String[] args) {
        Summetest s = new Summetest();
        int n = 5;
        System.out.println("Test 1: " + s.test1(n));
        System.out.println("Test 2: " + s.test2(n));
        System.out.println("Test 3: " + s.test3(n));
        System.out.println("Test 4: " + s.test4(n));
        System.out.println("Test 5: " + s.test5(n));
    }
    public int test1(int n) {
        int sum = 1;
        for (int i=1; i < n; i++) sum +=i+1;
        return sum;
    }
    public int test2(int n) {
        if (n<=1) return 1;
        else return n + test2(n-1);
    }
    public int test3(int n) {
        if (n<=1) return 1;
        else {
            int sum = test3(n/2);
            for (int i=n/2+1; i<=n; i++) sum += i;
            return sum;
        }
    }
    public int test4(int n) {
        if ( n <= 1) return 1;
        else return test4(1, n);
    }
    private int test4(int a, int b) {
        if (a==b) return a;
        else return test4(a, (a+b)/2) + test4((a+b)/2+1,b);
    }
    public int test5(int n) {
        if (n <= 1) return 1;
        else return n*(n+1)/2;
    }
}
