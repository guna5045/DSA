package DSA;

public class recurssionBasics {

    public static int count(int n) {

        if (n == 3) {
            return n;
        }

        System.out.println(n);

        return count(n + 1);
    }

    public static void printname(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println("Sony");
        printname(i + 1, n);
    }

    public static void printnumbers(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(i);
        printnumbers(i + 1, n);
    }

    public static void printnumbersreverse(int i, int n) {
        if (i < 1) {
            return;
        }
        System.out.println(i);
        printnumbersreverse(i - 1, n);
    }

    public static void printnumberusingbt(int i, int n) {
        if (i < 1) {
            return;
        }
        printnumberusingbt(i - 1, n);
        System.out.println(i);
    }

    public static void printnumberreverseusingbt(int i, int n) {
        if (i > n) {
            return;
        }
        printnumberreverseusingbt(i + 1, n);
        System.out.println(i);
    }

    public static void summation(int i, int sum) {
        if (i < 0) {
            System.out.println(sum);
            return;
        }
        summation(i - 1, sum + i);
    }

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void reversearray(int i, int a[], int n) {
        if (i >= n / 2) {
            return;
        }
        int temp = a[i];
        a[i] = a[n - i - 1];
        a[n - i - 1] = temp;

        reversearray(i + 1, a, n);
    }

    public static boolean checkstringpalindrome(int i, String str, int n) {

        if (i >= n / 2) {
            return true;
        }

        if (str.charAt(i) != str.charAt(n - i - 1)) {
            return false;
        }

        return checkstringpalindrome(i + 1, str, n);
    }

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
  count(1);

printname(1, 5);

printnumbers(1, 5);

printnumbersreverse(5, 5);

printnumberusingbt(5, 5);

printnumberreverseusingbt(1, 5);

summation(5, 0);

System.out.println(sum(5));

System.out.println(factorial(5));

int arr[] = {1, 2, 3, 4, 5};
reversearray(0, arr, arr.length);

String str = "madam";
System.out.println(checkstringpalindrome(0, str, str.length()));

System.out.println(fib(5));

        //Outputs
        // 1
        // 2
        // Sony
        // Sony
        // Sony
        // Sony
        // Sony
        // 1
        // 2
        // 3
        // 4
        // 5
        // 5
        // 4
        // 3
        // 2
        // 1
        // 1
        // 2
        // 3
        // 4
        // 5
        // 5
        // 4
        // 3
        // 2
        // 1
        // 15
        // 15
        // 120
        // true
        // 5

    }
}
