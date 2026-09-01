package DSA;

import java.util.ArrayList;
import java.util.Collections;

public class basicmaths {
    // Extraction Of Digits
    public static void extractionOfNumbers(int n) {
        while (n > 0) {
            int Lastdigit = n % 10;
            System.out.println(Lastdigit);
            n = n / 10;
        }
    }

    // count Number Of Digits
    public static void countNumberOfDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        System.out.println(count);
    }

    // Reverse Of A Number
    public static void ReverseOfANumber(int n) {
        int rev = 0;
        while (n > 0) {
            int ls = n % 10;
            rev = (rev * 10) + ls;
            n = n / 10;
        }
        System.out.println(rev);
    }

    // Palindrome Check

    public static void PalindromeCheck(int n) {
        int rev = 0;
        int dup = n;
        while (n > 0) {
            int ls = n % 10;
            rev = (rev * 10) + ls;
            n = n / 10;
        }
        System.out.println(rev);
        if (dup == rev) {
            System.out.println("yes");
        }

    }

    // check Amstrong

    public static void checkAmstrong(int n) {
        int sum = 0;
        int dup = n;
        while (n > 0) {
            int ls = n % 10;
            sum = sum + (ls * ls * ls);
            n = n / 10;

        }
        if (sum == dup) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    // factors or divisors
    public static void factors(int n) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {

            if (n % i == 0) {

                list.add(i);

                if (i != n / i) {
                    list.add(n / i);
                }
            }
        }

        Collections.sort(list);

        System.out.println(list);
    }

    public static void primenumbers(int n) {
        int counter = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                counter++;
                if (n / i != i) {
                    counter++;
                }
            }
        }
        if (counter == 2) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public static void gcd(int n1, int n2) {
        for (int i = Math.min(n1, n2); i >= 1; i--) {
            int gcd = 1;
            if (n1 % i == 0 && n2 % i == 0) {
                System.out.println(i);
                break;
            }

        }
    }

    public static void euclid_gcd(int n1, int n2) {
        while (n1 > 0 && n2 > 0) {
            if (n1 > n2) {
                n1 = n1 % n2;
            } else {
                n2 = n2 % n1;
            }

        }
        if (n1 == 0) {
            System.out.println(n2);
        } else {
            System.out.println(n1);
        }

    }

    public static void main(String[] args) {
        // extractionOfNumbers(7789);
        // countNumberOfDigits(7789);
        // ReverseOfANumber(5400);
        // PalindromeCheck(121);
        // checkAmstrong(9877);
        // primenumbers(13);
        gcd(9, 12);
        euclid_gcd(52, 10);

    }
}
