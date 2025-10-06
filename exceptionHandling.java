
/*
  
  Errors - errors are our constant companions with practice we keep getting better at
  finding & correcting them.

  there are three types of errors:
  1. syntax errors
  2. logical errors
  3. runtime errors





  1. syntax errors

public class exceptionHandling {
    public static void main(String[] args) {
        int a = 5; // no errors
        System.out.println(a);
        int b = 6  // No semicolon, syntax errors!
        System.out.println(b);
    }
}


  2. logical errors

public class exceptionHandling {
    public static void main(String[] args) {
        // print all prime number between 1 to 10
        for (int i = 0; i < 5; i++) {
            System.out.print(2 * i + 1 + " "); // 1 3 5 7 9, 9 is not a prime number
        }
    }
}


  
  3. runtime errors


public class exceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is " + 1000 / k);  // kk = 0 , 1000/0 = exception handling
    }
}



     // Exception Handling (runtime errors)
     1. Try block
     2. Catch block
     3. Throw block
     4. Throws block
     5. Finally block



   // try-catch block

public class exceptionHandling {
    public static void main(String[] args) {
        int a = 1000;
        int b = 0;
        try {
            int c = a / b;
            System.out.println("The result is: " + c);
        } catch (Exception e) {
            System.out.println("We failled to divivde Reason:");
            System.out.println(e);
        }
    }
}



public class exceptionHandling {
    public static void main(String[] args) {
        int[] marks = { 10, 20, 30 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int index = sc.nextInt();

        System.out.println("Enter the number");
        int number = sc.nextInt();

        try {
            System.out.println("The value at array index entered is: " + marks[index]);
            System.out.println("The value of array-value/number is: " + marks[index] / number);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occured");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occured");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("some other exception occured");
            System.out.println(e);
        }
    }
}



// Nested Try-Catch block

public class exceptionHandling {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of index");
        int index = sc.nextInt();
        try {
            System.out.println("Welcome to video no 82");
            try {
                System.out.println(arr[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Sorry this index does not exist");
                System.out.println("Exception in level 2");
            }
        } catch (Exception e) {
            System.out.println("Exception in level 1");
            System.out.println(e);
        }
    }
}



//  write a java program that allows you to keep accessing an array 
//  until a valid index is given by the user

public class exceptionHandling {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a index of array");
        int index = sc.nextInt();
        try {
            System.out.println(arr[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Sorry this index does not exist");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("other exception");
            System.out.println(e);
        }
    }
}


*/

//  Throw and Throws block

class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        return "Radius cannot be negative!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative!";
    }
}

public class exceptionHandling {
    public static double area(int r) throws NegativeRadiusException {
        if (r < 0) {
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }

    public static int divide(int a, int b) throws ArithmeticException {
        // made by harry
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        // shivam - uses divide function created by harry
        try {
            // int c = divide(6, 0);
            // System.out.println(c);
            double ar = area(6);
            System.out.println(ar);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
