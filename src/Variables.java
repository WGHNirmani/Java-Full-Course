public class Variables {
    public static void main(String [] args){
        // variable = a reusable container for a value
        //            a variable behaves as if it was the value it contains

        // Primitive = simple value stored directly in memory (stack)
        // Reference = memory address (stack) that points to the (heap)

        // Primitive vs Reference
        // ---------    ---------
        // int          String
        // double       array
        // char         object
        // boolean

        // 2 steps to creating a variable
        //
        // 1.declaration
        // 2. assignment

        // int

        int age = 25;
        int year = 2025;
        int quantity = 1;

        System.out.println(age);
        System.out.println(year);
        System.out.println(quantity);

        System.out.println("The year is " + year);
        System.out.println("The year is " + "year");

        // double

        double price = 19999.99;
        double gpa = 3.5;
        double temperature = -12.5;

        System.out.println(price);
        System.out.println(gpa);
        System.out.println(temperature);

        System.out.println("$" + price);

        // char

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        System.out.println(grade);
        System.out.println(symbol);
        System.out.println(currency);

        // boolean

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        System.out.println(isStudent);
        System.out.println(forSale);
        System.out.println(isOnline);

        if(isStudent){
            System.out.println("You are a student!");
        }
        else{
            System.out.println("You are NOT a student!");
        }


        String name = "Hirunika Nirmani";
        System.out.println("Hello " + name);

        String food = "Pizza";
        System.out.println("Your favorite food is: " + food);

        String email ="example18@gmail.com";
        System.out.println("Your email is " + email);

        String car = "Mustang";
        System.out.println(car);

        String color = "red";
        System.out.println(color);

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is: " + gpa);
        System.out.println("Your average letter grade is: " + grade);
        System.out.println("Your choice is a " + color + " " + year + " " + car);
        System.out.println("The price is: " + currency + price);

        if(forSale){
            System.out.println("There is a " + car + " for sale");
        }
        else{
            System.out.println("The " + car + " is not for sale");
        }
    }
}
