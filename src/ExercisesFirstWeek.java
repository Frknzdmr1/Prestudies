public class ExercisesFirstWeek {
    public static void main(String[] args) {

        // 1. Text input and output
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter your name: ");
//        String name = scanner.next();
//        System.out.println("Hello " + name + ", Welcome to the training!");

        // 2. Formatting text output
//    .-.-.   .-.-.   .-.-.   .-.-.   .-.-.   .-.-.   .-.-.   .-.-.
// / / \ \ / / \ \ / / \ \ / / \ \ / / \ \ / / \ \ / / \ \ / / \
//`-'   `-`-'   `-`-'   `-`-'   `-`-'   `-`-'   `-`-'   `-`-'
//
//        System.out.println("  .-.-.   .-.-.   .-.-.   .-.-.   .-.-.   .-.-.   .-.-.   .-.-.");
//        System.out.println(" / / \\ \\ / / \\ \\ / / \\ \\ / / \\ \\ / / \\ \\ / / \\ \\ / / \\ \\ / / \\");
//        System.out.println("`-'   `-`-'   `-`-'   `-`-'   `-`-'   `-`-'   `-`-'   `-`-'");

        // 3. Geometry
        // Rectangle
        // Area: a x b
        // Perimeter=2(a+b)

        // Right Triangle
        // Area = 1/2 x a x b
        // Perimeter = a + b + hypotenuse

//        double a = 5;
//        double b = 4;
//
//        // Rectangle calculations
//        double rectangleArea = a * b;
//        double rectanglePerimeter = 2 * (a + b);
//
//        // Right triangle calculations
//        double triangleArea = 0.5 * a * b;
//        double hypotenuse = Math.sqrt(a * a + b * b);
//        double trianglePerimeter = a + b + hypotenuse;
//
//        System.out.println("Rectangle:");
//        System.out.println("Area: " + rectangleArea);
//        System.out.println("Perimeter: " + rectanglePerimeter);
//
//        System.out.println("\nRight Triangle:");
//        System.out.println("Area: " + triangleArea);
//        System.out.println("Perimeter: " + trianglePerimeter);

        // Data Types & Variables
        // Data Types

//     1. Your initials
//        char firstInitial = 'F';
//        char secondInitial = 'O';
//        System.out.println(firstInitial + " " + secondInitial);
//
//     2. Population in Germany
//        int GermanyPopulation = 83000000;
//        System.out.println("Germany's population is:" + GermanyPopulation);
//
//     3. Population on earth
//        long earthPopulation = 7800000000L;
//        System.out.println("Population on Earth: " + earthPopulation);
//
//     4. Is currently daytime?
//        boolean isDayTime = true;
//        System.out.println("Is currently daytime? " + isDayTime);
//
//     5. Goal strike quote (goals per game) of Mario Gomez at Bayern München
//        double goalStrike = 0.66;
//        System.out.println("Mario Gomez's goal strike quote at Bayern München: " + goalStrike);
//    6. Length of the java program in weeks
//        int programLengthInWeeks = 12;
//        System.out.println("Length of the Java program in weeks: " + programLengthInWeeks);
//
//    7. The mathematical number PI
//        double pi = 3.14159;
//        System.out.println("The mathematical number PI: " + pi);


        // Operators
        // 1. Time units
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number of seconds: ");
//        long totalSeconds = scanner.nextLong();
//
//        long years = totalSeconds / (365 * 24 * 60 * 60);
//        long days = totalSeconds % ((365 * 24 * 60 * 60)) / (24 * 60 * 60);
//        long hours = (totalSeconds % (24 * 60 * 60)) / (60 * 60);
//        long minutes = (totalSeconds % (60 * 60)) / 60;
//        long seconds = totalSeconds % 60;
//
//        System.out.println(years + " years and " + days + " days and " + hours + " hours and " + minutes + " minutes and " + seconds + " seconds");

        // 2. Cylinder
//        --------

        // 3. One line of code
//        double x = 15.5;
//        double a = Math.sqrt(3.5 + x);
//        double b = a * 5;
//        double c = b / 3;
//        double d = x + 10;
//        double e = x - 4.1;
//        double f = d * e;
//        double g = c - f;
//        System.out.println(g);

//        System.out.println((Math.sqrt(3.5 + 15.5) * 5 / 3) - ((15.5 + 10) * (15.5 - 4.1)));

        // Loops
//        1.Guessing Numbers
//
//        Scanner scanner = new Scanner(System.in);
//
//        double randomNumber = Math.random();
//        int number = (int) (randomNumber * 100) + 1;
//
//        System.out.println("Guess a number between 1 and 100: ");
//
//        while (true) {
//            int guessedNumber = scanner.nextInt();
//
//            if (guessedNumber == number) {
//                System.out.println("Congrats! You guessed the right number.");
//                break;
//            } else if (guessedNumber > number) {
//                System.out.println("Your guess is too high");
//            } else {
//                System.out.println("Your guess is too low");
//            }
//        }
//        scanner.close();

        // 2. Triangles
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("How large should the triangles be? ");
//        int triangleSize = scanner.nextInt();
//
//        System.out.print("How many triangles would you like? ");
//        int numTriangles = scanner.nextInt();
//
//        for (int t = 0; t < numTriangles; t++) {
//            for (int i = 1; i <= triangleSize; i++) {
//                for (int j = 1; j <= i; j++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }
//
//        scanner.close();

        // Data Types Part 2- Strings

        // 1.)String Manipulation

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the size of the tree: ");
//        int treeSize = scanner.nextInt();
//
//        for (int i = 1; i <= treeSize; i++) {
//            // Print spaces
//            for (int j = treeSize - i; j > 0; j--) {
//                System.out.print(" ");
//            }
//            // Print stars
//            for (int k = 1; k <= 2 * i - 1; k++) {
//                System.out.print("*");
//            }
//            // Move to the next line after finishing each row
//            System.out.println();
//        }
//        for (int i = 0; i < treeSize - 1; i++) {
//            System.out.print(" ");
//        }
//        System.out.println("|");

        // 2. String Manipulation

//        String str = "Everybody said, it can’t be done. Then came one who did not know that and just made it.";
        //1.) System.out.println(" " + str.charAt(0) + str.charAt(34));

        //2.)
//        String myName = "Furkan";
//        int compare = str.compareTo(myName);
//        System.out.println(compare);

        //3.
//        String firstName = "Furkan";
//        String lastName = "Ozdemir";
//        System.out.println(firstName + " " + lastName);
//        System.out.println(firstName.concat(" " + lastName));

        //4.
//          System.out.println(str.contains("Java"));
//          System.out.println(str.contains("made"));

        //5.
//          String word1 = "Hello";
//          String word2 = "World";
//          boolean isEqual = word1.equals(word2);
//          if (isEqual) {
//              System.out.println("equal");
//          }
//          else {
//              System.out.println("not equal");
//          }
        //6.
//        System.out.println(str.indexOf("d"));
//        //7.
//        System.out.println(str.isEmpty());
        //8.
//        if (str == null) {
//            System.out.println("The string is null.");
//        } else {
//            System.out.println("The string is not null.");
//        }
        //9.
//        System.out.println(str.length());
//      //10.
//        System.out.println(str.substring(str.indexOf("said")));
//        System.out.println(str.substring(str.indexOf("made")));


//      //2. Comparing Strings
//
//        String str1 = "Comparison";
//        String str2 = "Comparison";
//
//        boolean isEqualMethod = str1.equals(str2);
//        boolean isEqualOperator = (str1 == str2);
//
//        System.out.println("Using equals method: " +isEqualMethod);
//        System.out.println("Using equals operator: " +isEqualOperator);

        // Arrays
        // Basic Sum
//        int[] numbers = new int[] {12, -22, 300, 43, 0};
//        int sum = 0;
//
//        for (int i = 0; i < numbers.length; i++){
//            sum += numbers[i];
//        }
//        System.out.println("The output of the sum is: " + sum);


//      Minimum and Maximum

//        int[] numbers = new int[] {12, -22, 300, 43, 0};
//        int max = numbers[0]; // Assume first element as maximum
//        int min = numbers[0]; // Assume first element as minimum
//
//        // Iterate through the array to find max and min values
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] > max) {
//                max = numbers[i]; // Update max if current element is greater
//            }
//            if (numbers[i] < min) {
//                min = numbers[i]; // Update min if current element is smaller
//
//                // Output the max and min values
//                System.out.println("Maximum value: " + max);
//                System.out.println("Minimum value: " + min);
//            }
//        }


//      3.Using Methods
//        int[] number = new int[] {2, 2, 10, 11, 10};
//        int multiplier = 2;
//        printMultipliedArray(number, multiplier);
//
//    }
//    public static void printMultipliedArray(int[] numbers, int multiplier) {
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] *= multiplier;
//
//            System.out.println("Numbers array after multiplication:");
//            for (int num : numbers) {
//                System.out.print(num + " ");
//            }
//            System.out.println();
//
//            System.out.println("Multiplier: " + multiplier);}
//    }

//  1,Calculator
//  public class Calculator {
//    private int result;
//
//    public Calculator() {
//        this.result = 0;
//    }
//
//    public int getResult() {
//        return result;
//    }
//
//    public void plus(int num) {
//        result += num;
//    }
//
//    public void minus(int num) {
//        result -= num;
//    }
//
//    public void multiply(int num) {
//        result *= num;
//    }
//
//    public void divide(int num) {
//        if (num != 0) {
//            result /= num;
//        } else {
//            System.out.println("Error: Division by zero.");
//        }
//    }
//}
//      public class CalculatorTest {
//          public static void main(String[] args) {
//           Calculator myCalculator = new Calculator();
//
//        myCalculator.plus(8);
//        myCalculator.multiply(2);
//        myCalculator.divide(4);
//
//        System.out.println("Result: " + myCalculator.getResult());
//    }
//}
    }
}





























