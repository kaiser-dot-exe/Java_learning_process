# Fundamental Programming Structures in Java

## User Input

In Java, the `java.util.Scanner` class is commonly used to get input from the user. This class provides various methods to read inputs of different data types.

### How to Use?

  * **Import the `Scanner` class:** You need to add `import java.util.Scanner;` at the beginning of your code.
  * **Create a `Scanner` object:** A `Scanner` object is created like this: `Scanner input = new Scanner(System.in);`. `System.in` represents the standard input stream (keyboard).
  * **Read input:**
      * `nextInt()`: Reads an integer (`int`).
      * `nextDouble()`: Reads a double (`double`).
      * `next()`: Reads the next word (up to whitespace) as a `String`.
      * `nextLine()`: Reads the entire line of text up to the end of the line as a `String`.
      * `nextBoolean()`: Reads a boolean value.
  * **Close the `Scanner` object:** To prevent memory leaks, you should close the `Scanner` object by calling the `input.close();` method when you're done with it.

### Example:

```java
import java.util.Scanner;

public class GetInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");

        String name = input.nextLine(); // nextLine() is preferred for names with spaces

        System.out.print("Please enter your age: ");

        int age = input.nextInt();

        System.out.print("Please enter your height (in meters): ");

        double height = input.nextDouble();

        System.out.println("Hello, " + name + "! Your age: " + age + ", Your height: " + height);

        input.close(); // It's important to close the Scanner object

    }

}
```

### Tips and Best Practices:

  * **`nextLine()` Problem After `nextInt()` / `nextDouble()`:** Methods like `nextInt()` and `nextDouble()` only read the numerical value and leave the newline character (`\n`) in the input buffer. If you use `nextLine()` after these methods, `nextLine()` will immediately read this empty newline character and won't get the expected input from the user. To overcome this, you can make an extra `input.nextLine()` call after reading numerical input.

    ```java
    int age = input.nextInt();
    input.nextLine(); // Consume the newline character in the buffer
    String city = input.nextLine(); // Now we can read the city correctly
    ```

  * **Error Handling (Input Mismatch):** If the user provides input of a different data type than expected (e.g., "abc" instead of 123), you'll get an `InputMismatchException` error. Managing this with `try-catch` blocks is good practice.

  * **Resource Management:** Since `Scanner` uses a resource, remember to release it by calling the `close()` method when you're done. Otherwise, you might experience memory leaks or resource exhaustion issues.

-----

## If-Else Structure (Conditional Statements)

The `if-else` structure is used to execute different blocks of code depending on whether a certain condition is true.

### Syntax:

```java
if (condition) {
    // Code block to be executed if the condition is true
} else if (anotherCondition) {
    // Code block to be executed if the first condition is false and this condition is true
} else {
    // Code block to be executed if none of the conditions are true
}
```

### Example:

```java
public class IfElseStructure {

    public static void main(String[] args) {

        int grade = 75;

        if (grade >= 90) {
            System.out.println("Your grade: A");
        } else if (grade >= 80) {
            System.out.println("Your grade: B");
        } else if (grade >= 70) {
            System.out.println("Your grade: C");
        } else if (grade >= 60) {
            System.out.println("Your grade: D");
        } else {
            System.out.println("Your grade: F");
        }

        // Single-line if usage (Ternary Operator)
        String message = (grade >= 50) ? "You Passed!" : "You Failed.";
        System.out.println(message);

    }

}
```

### Tips and Best Practices:

  * **Simple Conditions:** Write conditions that are as simple and understandable as possible. Break down complex conditions into smaller parts or use boolean variables to improve readability.
  * **Block Usage:** Even for a single statement, always using curly braces `{}` for `if` and `else` blocks is good practice. This improves code readability and prevents errors when code is added in the future.
  * **`else if` Chain:** Using `else if` when checking multiple conditions improves performance because if one condition is true, the others are not checked.
  * **Ternary Operator:** For simple `if-else` situations, the ternary operator (`? :`) can be used. This makes the code shorter and sometimes more readable.

-----

## Loops

Loops are used to repeat a block of code as long as a certain condition is true or for a specific number of times.

### For Loop

Preferred when you need to repeat a specific number of times or iterate over arrays.

#### Syntax:

```java
for (initialization; condition; increment/decrement) {
    // Code block to be repeated
}
```

#### Example:

```java
public class ForLoop {

    public static void main(String[] args) {

        // Print numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }

        // Iterate over elements in an array
        String[] fruits = {"Apple", "Pear", "Banana"};
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        // Enhanced For Loop (For-each)
        for (String fruit : fruits) {
            System.out.println("With For-each: " + fruit);
        }

    }

}
```

#### Tips and Best Practices:

  * **Avoid Infinite Loops:** Ensure that the condition in a `for` loop will eventually become false, otherwise you'll enter an infinite loop.
  * **Enhanced For (For-each):** When iterating over collections or arrays and you don't need the index of the elements, using a for-each loop makes the code cleaner and more readable.

### While Loop

Loops that continue to run as long as a condition is true. Used when the number of repetitions is not known beforehand.

#### Syntax:

```java
while (condition) {
    // Code block to be executed as long as the condition is true
}
```

#### Example:

```java
import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = 0;

        System.out.println("Enter 0 to exit.");
        while (number != 0) { // Will not run initially because number is 0
            System.out.print("Enter a number: ");
            number = input.nextInt();
            System.out.println("You entered: " + number);
        }

        System.out.println("Exited the loop.");
        input.close();

    }

}
```

#### Tips and Best Practices:

  * **Update Condition:** Within the `while` loop, make sure there's a statement that will eventually make the loop condition false. Otherwise, you'll enter an infinite loop.
  * **Exiting the Loop:** You can immediately terminate a loop with the `break` keyword, and skip the current iteration of the loop and move to the next with the `continue` keyword. However, use these keywords carefully, as they can make the code more complex.

### Do-While Loop

Similar to the `while` loop, but the code block is executed at least once before the condition is checked.

#### Syntax:

```java
do {
    // Code block to be executed at least once
} while (condition);
```

#### Example:

```java
import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;

        do {
            System.out.print("Enter a number between 1 and 10 (0 to exit): ");
            number = input.nextInt();
            if (number != 0) {
                System.out.println("You entered: " + number);
            }
        } while (number != 0); // Continue as long as the number is not 0

        System.out.println("Exited the loop.");
        input.close();

    }

}
```

#### Tips and Best Practices:

  * **Minimum One Execution:** Use `do-while` when you need to guarantee that the loop runs at least once (e.g., repeatedly getting correct input from the user).

-----

## Methods (Functions)

Methods are named blocks of code that perform a specific task. They increase code reusability and modularity.

### Syntax:

```java
[access modifier] [static/non-static] [return type] methodName([parameters]) {
    // Method body
    // return returnValue; (if return type is not void)
}
```

  * **Access Modifier:** `public`, `private`, `protected`, `default` (if not specified). Determines where the method can be accessed from.
  * **`static`:** Determines whether the method can be called directly using the class name without creating an object.
  * **Return Type:** The type of value the method will return (e.g., `int`, `String`, `void` - if it doesn't return a value).
  * **Method Name:** The name of the method.
  * **Parameters:** Values passed into the method from outside.
  * **`return`:** Causes the method to return a value and terminates method execution.

### Example:

```java
public class Methods {

    // Method that takes no parameters and returns no value (void)
    public static void sayHello() {
        System.out.println("Hello world!");
    }

    // Method that takes a parameter and returns no value
    public static void sayHelloWithName(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method that takes parameters and returns an int value
    public static int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    // Method that takes no parameters and returns a String value
    public String getSystemInfo() {
        return "Java Version: " + System.getProperty("java.version");
    }

    public static void main(String[] args) {
        sayHello(); // Call the method
        sayHelloWithName("Ayşe");

        int result = add(5, 3);
        System.out.println("Sum: " + result);

        // To call a non-static method, we must create an object
        Methods obj = new Methods();
        String info = obj.getSystemInfo();
        System.out.println(info);
    }

}
```

### Tips and Best Practices:

  * **Single Responsibility Principle (SRP):** Each method should perform a single task. This makes methods more manageable, testable, and reusable.
  * **Meaningful Names:** Method names should clearly indicate what the method does (e.g., `calculateAverage`, `saveData`).
  * **Number of Parameters:** Avoid methods with too many parameters. In such cases, you might consider grouping parameters using an object or data structure.
  * **Comments:** Write explanatory comments for complex methods, but well-named methods and variables often reduce the need for comments.
  * **`static` vs. Non-`static` Methods:** `static` methods are called directly via the class name and cannot access the class's state (object-specific data). Non-`static` methods are called via an object and can access that object's data.

-----

## Object-Oriented Programming (OOP)

OOP is a programming paradigm for software development by modeling real-world entities. Java is a completely object-oriented language. Its core concepts are:

  * **Class:** The blueprint or template for objects. It defines the characteristics (attributes/fields) and behaviors (methods) that objects will have.
  * **Object:** A concrete instance of a class. It has the properties and behaviors defined by the class.
  * **Encapsulation:** The principle of bundling data (fields) and the methods that operate on that data into a single unit, and restricting direct access from outside to protect the data. Typically, fields are hidden with `private` access modifiers, and access is provided through `public` getter and setter methods.
  * **Inheritance:** The mechanism by which one class (subclass/derived class) acquires the properties and behaviors of another class (superclass/base class). It reduces code duplication and establishes hierarchical relationships. Used with the `extends` keyword.
  * **Polymorphism:** The ability of different objects to respond to the same method in different ways. There are two main types:
      * **Method Overloading:** Defining multiple methods with the same name within the same class, but with different parameter lists (number, type, or order).
      * **Method Overriding:** A subclass redefining a method from its superclass according to its own needs. Indicated with the `@Override` annotation.
  * **Abstraction:** The principle of showing only essential and necessary information while hiding the details. Achieved through `abstract` classes and interfaces.

### Class and Object Example

```java
// Class Definition
class Car {
    // Attributes (Fields/Attributes) - private is used for encapsulation
    private String brand;
    private String model;
    private int year;
    private String color;

    // Constructor Method - Called when an object is created
    public Car(String brand, String model, int year, String color) {
        this.brand = brand; // 'this' keyword refers to the class's attribute
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // Getter Methods (Accessor Methods) - Provide safe access to attributes
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public String getColor() {
        return color;
    }

    // Setter Methods (Mutator Methods) - Safely update attributes
    public void setColor(String color) {
        if (color != null && !color.trim().isEmpty()) { // Input validation
            this.color = color;
        } else {
            System.out.println("Invalid color input.");
        }
    }

    // Behaviors (Methods)
    public void showInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year + ", Color: " + color);
    }

    public void start() {
        System.out.println(brand + " " + model + " is starting...");
    }
}

public class OOPIntroduction {
    public static void main(String[] args) {
        // Object Creation (Instantiation)
        Car myCar = new Car("Toyota", "Corolla", 2020, "White");
        Car secondCar = new Car("Honda", "Civic", 2022, "Black");

        // Calling Object Methods
        myCar.showInfo();
        myCar.start();

        secondCar.showInfo();
        secondCar.setColor("Red"); // Change color
        secondCar.showInfo();
    }
}
```

### Inheritance Example

```java
// Superclass
class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

// Subclass - Inherits from Animal class
class Cat extends Animal {
    public Cat(String name) {
        super(name); // Calls the superclass constructor
    }

    // Method Overriding
    @Override // Good practice: indicates overriding
    public void makeSound() {
        System.out.println(getName() + " says Meow.");
    }

    public void showClaws() {
        System.out.println(getName() + " shows its claws.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says Woof woof.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Leo");
        animal1.makeSound(); // Animal makes a sound.

        Cat cat1 = new Cat("Pamuk");
        cat1.makeSound(); // Pamuk says Meow.
        cat1.showClaws();

        Dog dog1 = new Dog("Karabaş");
        dog1.makeSound(); // Karabaş says Woof woof.

        // Polymorphism example: Superclass reference with subclass object
        Animal animal2 = new Cat("Tekir");
        animal2.makeSound(); // Tekir says Meow. (Runtime polymorphism)

        Animal animal3 = new Dog("Çomar");
        animal3.makeSound(); // Çomar says Woof woof.
    }
}
```

### Polymorphism Example

```java
class Shape {
    public void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square.");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        Shape shape2 = new Circle(); // Upcasting
        Shape shape3 = new Square();  // Upcasting

        shape1.draw(); // Drawing a shape.
        shape2.draw(); // Drawing a circle.
        shape3.draw(); // Drawing a square.

        // Method Overloading
        System.out.println(add(5, 10)); // int parameters
        System.out.println(add(5.5, 10.5)); // double parameters
        System.out.println(add(5, 10, 15)); // three int parameters
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

### Abstraction Example

```java
// Abstract Class
abstract class Employee {
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    // Abstract Method: Must be implemented by subclasses
    public abstract double calculateSalary();

    public void printInfo() {
        System.out.println("Name: " + firstName + ", Last Name: " + lastName);
    }
}

// Concrete Class
class Officer extends Employee {
    private double hourlyRate;
    private int workHours;

    public Officer(String firstName, String lastName, double hourlyRate, int workHours) {
        super(firstName, lastName);
        this.hourlyRate = hourlyRate;
        this.workHours = workHours;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * workHours;
    }
}

class Manager extends Employee {
    private double baseSalary;
    private double bonusRate;

    public Manager(String firstName, String lastName, double baseSalary, double bonusRate) {
        super(firstName, lastName);
        this.baseSalary = baseSalary;
        this.bonusRate = bonusRate;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (baseSalary * bonusRate);
    }
}

// Interface
interface CanMakeSound {
    void makeSound(); // All methods are public and abstract by default
}

class Robot implements CanMakeSound {
    @Override
    public void makeSound() {
        System.out.println("Beep bop!");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        // Employee employee1 = new Employee("Ahmet", "Yılmaz"); // Abstract class cannot be instantiated directly

        Officer officer1 = new Officer("Ayşe", "Demir", 50.0, 160);
        officer1.printInfo();
        System.out.println("Officer's Salary: " + officer1.calculateSalary());

        Manager manager1 = new Manager("Can", "Kara", 8000.0, 0.15);
        manager1.printInfo();
        System.out.println("Manager's Salary: " + manager1.calculateSalary());

        // Using abstract class reference with polymorphism
        Employee[] employees = new Employee[2];
        employees[0] = officer1;
        employees[1] = manager1;

        for (Employee employee : employees) {
            System.out.println(employee.getFirstName() + " " + employee.getLastName() + "'s salary: " + employee.calculateSalary());
        }

        // Interface usage
        Robot robot = new Robot();
        robot.makeSound();
    }
}
```

### OOP Tips and Best Practices

#### Class Design:

  * **Single Responsibility Principle (SRP):** Each class should have a single, well-defined responsibility. If a class has more than one reason to change, it should probably be split.
  * **Open/Closed Principle (OCP):** Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification. New behaviors should be added via inheritance and polymorphism, not by changing existing code.
  * **Liskov Substitution Principle (LSP):** Subclasses should be substitutable for their superclasses. That is, anywhere a superclass type is expected, its subclass type should also be usable.

#### Encapsulation:

  * **Data Hiding:** Restrict external access to the internal state of a class (`private` fields).
  * **Using Getters/Setters:** Use `public` getter and setter methods for accessing and modifying fields. Ensure data consistency by performing input validation in setter methods.

#### Inheritance:

  * **"Is-A" Relationship:** Use inheritance only to express an "is-a" relationship (e.g., "A Cat is an Animal").
  * **Avoid Deep Inheritance Hierarchies:** Very deep inheritance trees can increase complexity. Consider preferring composition (a "has-a" relationship, where an object contains another object) over inheritance.

#### Polymorphism:

  * **Abstraction and Flexibility:** Polymorphism makes your code more flexible and extensible. You can add new subclasses and your existing code will still work without modification.
  * **Interfaces:** Since Java does not support multiple inheritance, a class can implement multiple interfaces. Interfaces ensure that a class adheres to a specific "behavioral contract."

#### Abstraction:

  * **Avoid Unnecessary Details:** Show only the information that users or other developers need to know.
  * **Abstract Classes vs. Interfaces:**
      * **Abstract Classes:** For sharing common code (can contain both abstract and concrete methods), generally used for "is-a" relationships. There is a single inheritance restriction.
      * **Interfaces:** For defining behavioral contracts; all methods are abstract by default (except for `default` and `static` methods in Java 8+). Multiple implementation is possible.

