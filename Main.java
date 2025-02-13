import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
//        1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
//        two numbers , takes two numbers as input
//        Test Data:
//        Input first number: 125
//        Input second number: 24
//        Expected Output :
//        125 + 24 = 149
//        125 - 24 = 101
//        125 x 24 = 3000
//        125 / 24 = 5
//        125 mod 24 = 5

        System.out.println("please enter first number:");
        int firstNum = data.nextInt();//ياخذ الرقم الاول من اليوزر
        System.out.println("please enter first number:");
        int secondNum = data.nextInt();// الرقم الثاني

        System.out.println(firstNum + secondNum);//جملة طباعة داخلها عملية جمع
        System.out.println(firstNum - secondNum);//طرح
        System.out.println(firstNum * secondNum);//ضرب
        System.out.println(firstNum / secondNum);//قسمه
        System.out.println(firstNum % secondNum);//باقي القسمه

//        2. Write a Java program that takes a number as input and prints its multiplication table up to
//        10.
//        Test Data:
//        Input a number: 8 Expected
//        Output :
//        8 x 1 = 8
//        8 x 2 = 16
//        8 x 3 = 24
//...
//        8 x 10 = 80

            System.out.print("please enter number: ");
            int number = data.nextInt();

            for (int i = 1; i <= 10; i++) {//لوب يبدا من 1 الى 10
                System.out.println(number + " x " + i + " = " + (number * i));//العدد المدخل من  اليوزر ضرب i
            }


//        3. Write a Java program to print the area and perimeter of a circle.
//        2
//        Test Data:
//        Radius = 7.5
//        Expected Output
//        Perimeter is = 47.12388980384689
//        Area is = 176.71458676442586

        double radius = 7.5;//قيمة نصف القطر
        double perimeter = 2 * Math.PI * radius;//قانون المحيط
        double area = Math.PI * radius * radius;//قانون المساحة

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);

//        4. Java program to find out the average of a set of integers
//        Enter the count of numbers:
//        5
//        Enter an integer:
//        3
//        Enter an integer:
//        8
//        Enter an integer:
//        6
//        Enter an integer:
//        7
//        Enter an integer:
//        2
//        The average is: 5.2

        System.out.print("Enter the count of numbers: ");
        int count1 = data.nextInt();
        int sum1 = 0;
        for (int i = 1; i <= count1; i++) {
            System.out.print("Enter an integer: ");
            int number1 = data.nextInt();
            sum1 += number1;//مجموع الاعداد
        }
        double average = (double) sum1 / count1;//المتوسط تقسيم المجموع على عدد الاعداد

        System.out.println("The average is: " + average);



//        5. Write a Java program that accepts three integers as input, adds the first two integers
//        together, and then determines whether the sum is equal to the third integer.
//        3
//        Sample Output:
//        Input the first number : 5
//        Input the second number: 10
//        Input the third number : 15
//        The result is: true
//                --------
//        Input the first number : 10
//        Input the second number: 20
//        Input the third number : 25
//        The result is: false

        System.out.print("enter first number: ");
        int firstNumber = data.nextInt();

        System.out.print("enter second number: ");
        int secondNumber = data.nextInt();

        System.out.print("enter third number: ");
        int thirdNumber = data.nextInt();


        boolean result = (firstNumber + secondNumber == thirdNumber);//اختبار اذا مجوع العددين الاولى = الثالث

        System.out.println("The result is: " + result);

//        6. Write a Java program to reverse a word.
//        Sample Output:
//        Input a word: dsaf
//        Reverse word: fasd

        System.out.print("Input a word: ");
        String word = data.nextLine();

        String reversedWord = "";
        int index = word.length() - 1;//اخر حرف من الكلمه

        while (index >= 0) {
            reversedWord += word.charAt(index);
            index--;
        }

        System.out.println("Reverse word: " + reversedWord);

//        7 - Java program to check whether the given number is even or odd
//        Enter a number:
//        33
//        The number is Odd
//        Enter a number:
//        24
//        The number is Even

        System.out.print("Enter a number: ");
        int number2 = data.nextInt();

        if (number2 % 2 == 0) {//باقي القسمه = 0 يعني زوجي
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }

//        8 - Java program to convert the temperature in Centigrade to Fahrenheit
//        4
//        Enter temperature in Centigrade:
//        43
//        Temperature in Fahrenheit is: 109.4

        System.out.print("Enter temperature in Celsius: ");
        double celsius = data.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;//تحويل من سيلسوز لفهرنهايت

        System.out.println("Temperature in Fahrenheit is: " + fahrenheit);

//        9.Write a Java program that takes a string and a number from the user,then prints the
//        character in the given index.
//                Test Data:
//        Input a string: Java Bootcamp
//        Input a number: 1
//        Expected Output:
//        a
        System.out.print("enter a string: ");
        String inputString = data.nextLine();//ياخذ النص

        System.out.print("enter a number: ");
        int index1 = data.nextInt();//رقم الحرف اللي يبغاه

        if (index1 >= 0 && index1 < inputString.length()) {//يمشي على الكلمة حرف حرف

            char characterAtIndex = inputString.charAt(index1);
            System.out.println( characterAtIndex);//]طبع الحرف الموجود في المكان المحدد
        } else {

            System.out.println("Not in field");

        }

//        10. Write a Java program to print the area and perimeter of a rectangle.
//                Test Data:
//        Width = 5.5 Height = 8.5
//        Expected Output
//        Area is 5.6 * 8.5 = 47.60
//        Perimeter is 2 * (5.6 + 8.5) = 28.20
//        5
        double width = 5.6;
        double height = 8.5;

        double area1 = width * height;//قانون مساحة المستطيل
        double perimeter1 = 2 * (width + height);//قانون محيط المستطيل

        System.out.println("Area is " + width + " * " + height + " = " + area1);
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + perimeter1);

//        11. Write a Java program to compare two numbers.
//        Input Data:
//        Input first integer: 25
//        Input second integer: 39
//        Expected Output
//        25 != 39
//        25 < 39
//        25 <= 39

        System.out.print("Input first integer: ");
        int num1 = data.nextInt();

        System.out.print("Input second integer: ");
        int num2 = data.nextInt();

        if (num1 == num2) {//مقارن اذا الرقم الاول يساوي الثاني
            System.out.printf("%d == %d%n", num1, num2);
        } else {
            System.out.printf("%d != %d%n", num1, num2);
            if (num1 < num2) {//اذا اصغر
                System.out.printf("%d < %d%n", num1, num2);
                System.out.printf("%d <= %d%n", num1, num2);
            } else {//او بيكون اكبر
                System.out.printf("%d > %d%n", num1, num2);
                System.out.printf("%d >= %d%n", num1, num2);
            }
        }


//        12. Write a Java program to convert seconds to hours, minutes and seconds.
//        Sample Output:
//        Input seconds: 86399
//        23:59:59

        System.out.print("enter seconds: ");
        int totalSeconds = data.nextInt();
        int hours = totalSeconds / 3600;//نقسم على عدد الثواني في الساعه
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        System.out.printf(hours+":" +minutes+":"+ seconds);


//        13. Write a Java program that accepts four integers from the user and prints equal if all
//        four are equal, and not equal otherwise.
//                Sample Output:
//        Input first number: 25
//        Input second number: 37
//        Input third number: 45
//        Input fourth number: 23
//        Numbers are not equal!
//                6
        System.out.print("enter first number: ");
        int firstNum1 = data.nextInt();

        System.out.print("enter second number: ");
        int secondNum2 = data.nextInt();

        System.out.print("enter third number: ");
        int thirdNum3 = data.nextInt();

        System.out.print("enter fourth number: ");
        int fourthNum4 = data.nextInt();

        if (firstNum1 == secondNum2 && secondNum2 == thirdNum3 && thirdNum3 == fourthNum4) {
            System.out.println("Numbers are equal.");
        } else {
            System.out.println("Numbers are not equal!");
        }


//        14. Write a Java program that reads an integer and check whether it is negative, zero, or
//        positive.
//                Test Data Input a number: 7 Expected Output :
//        Number is positive

        System.out.print("enter number: ");
        int n = data.nextInt();

        if (n > 0) {
            System.out.println("Number is positive");
        } else if (n < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }


//        15.Write a program to enter the numbers till the user wants and at the end it
//        should display the count of positive, negative and zeros entered (End loop use -1 ,
//                Don’t count -1).
//                Test data
//        1
//        3
//        0
//                -2
//                -4
//                -1
//        2 positives
//        1 zero
//        2 negatives

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        int nom;

        System.out.println("Enter numbers or -1 to exit):");

        while (true) {
            nom = data.nextInt();

            if (nom == -1) {
                break;
            }

            if (nom > 0) {
                positiveCount++;
            } else if (nom < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println(positiveCount + " positives");
        System.out.println(zeroCount + " zeros");
        System.out.println(negativeCount + " negatives");

//        16 - Write a program that prompts the user to input an integer and then outputs the
//        number with the digits reversed.
//                For example, if the input is 12345, the output should be 54321.
        System.out.print("Enter an integer: ");
        int j = data.nextInt();

        int reversedNumber = 0;

        while (j != 0) {
            int digit = j % 10;
            reversedNumber = reversedNumber * 10 + digit;
            j /= 10;
        }

        System.out.println(reversedNumber);


//        17 - Write a program to enter the numbers till the user wants and at the end the
//        program should display the largest and smallest numbers entered.
//                enter the number : 4
//        enter the number : 5
//        enter the number : -1
//        enter the number : 9
//        the large number : 9
//        the small number : -1

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        boolean enter = true;

        while (enter) {
            System.out.print("enter number or 0 to exit ");
            int nu = data.nextInt();

            if (nu == 0) {
                enter = false;
            } else {
                if (nu > largest) {
                    largest = nu;
                }
                if (nu < smallest) {
                    smallest = nu;
                }
            }
        }

        if (largest == Integer.MIN_VALUE && smallest == Integer.MAX_VALUE) {
            System.out.println("no number");
        } else {
            System.out.println("The largest number :" + largest);
            System.out.println("The smallest number: " + smallest);
        }

//        18 - Determine and print the number of times the character ‘a’ appears in the input
//        entered by the user.
//        Enter String:
//        Java bootcamp
//        Output: Number of a's: 3
        System.out.print("Enter String: ");
        String input = data.nextLine();

        int count2 = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == 'a' || ch == 'A') {
                count2++;
            }
        }

        System.out.println("Number of 'a's: " + count2);



    }
}