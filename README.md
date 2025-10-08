#  Exception Handling in Java

This repository demonstrates various types of **errors** and **exception handling techniques** in Java.  
It covers **syntax errors**, **logical errors**, **runtime errors**, and how to manage them effectively using **try-catch**, **throw**, **throws**, and **custom exceptions**.

---

## 🧩 Topics Covered

### 1. Types of Errors
1. **Syntax Errors** – Mistakes in code structure or grammar that prevent compilation.  
   Example: Missing semicolon (`;`) or incorrect keyword usage.

2. **Logical Errors** – The program runs but gives incorrect output due to logic flaws.  
   Example: Incorrect loop or condition resulting in wrong results.

3. **Runtime Errors** – Errors that occur during program execution, often due to invalid input or operations.  
   Example: Dividing by zero or accessing an invalid array index.

---

### 2. Exception Handling in Java

Java provides mechanisms to handle runtime errors gracefully using the following keywords:

| Keyword | Description |
|----------|-------------|
| `try` | Contains code that might throw an exception. |
| `catch` | Used to handle the exception if one occurs. |
| `throw` | Used to explicitly throw an exception. |
| `throws` | Declares exceptions that a method might throw. |
| `finally` | Block that executes whether an exception occurs or not. |

---

## 🧠 Example Programs

### 🔹 1. Try-Catch Example
```java
int a = 1000;
int b = 0;

try {
    int c = a / b;
    System.out.println("The result is: " + c);
} catch (Exception e) {
    System.out.println("We failed to divide. Reason:");
    System.out.println(e);
}
```
## 2. Handling Multiple Exceptions
```
try {
    System.out.println("Value: " + marks[index] / number);
} catch (ArithmeticException e) {
    System.out.println("Arithmetic Exception occurred: " + e);
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Invalid index: " + e);
} catch (Exception e) {
    System.out.println("Some other exception occurred: " + e);
}

```
 ## 3. Nested Try-Catch Example
```
try {
    try {
        System.out.println(arr[index]);
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Invalid index at level 2");
    }
} catch (Exception e) {
    System.out.println("Exception at level 1");
}

```

## 4. Custom Exception (Throw & Throws)

```
class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        return "Radius cannot be negative!";
    }
}

public static double area(int r) throws NegativeRadiusException {
    if (r < 0) {
        throw new NegativeRadiusException();
    }
    return Math.PI * r * r;
}

```
---

## 🧰 Concepts Demonstrated
- Syntax, Logical, and Runtime Errors
- try, catch, finally usage
- Nested try-catch blocks
- Custom Exception class (NegativeRadiusException)
- throw and throws keywords
- Safe user input handling using Scanner

---

## 💡 Learning Outcome

- Understand how different errors occur in Java.
- Learn to prevent program crashes using proper exception handling.
- Gain confidence in writing robust and fault-tolerant code.




