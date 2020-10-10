using System;

class HW {
    public static void Main() {
        Console.WriteLine("Enter a number to find its factorial:");
        int n = Int32.Parse(Console.ReadLine());

        /********************** with for loop *******************/
        int result = 1, i = 1;
        for (; i <= n; i++) {
            result *= i;
        }
        Console.WriteLine("Factorial of {0} is {1} (done with for loop).", n, result);

        /********************** with while loop ********************/
        result = 1;
        i = 1;
        while (i <= n) {
            result *= i++;
        }
        Console.WriteLine("Factorial of {0} is {1} (done with while loop).", n, result);

        /**********************with do...while loop *************/
        result = 1;
        i = 1;
        do {
            result *= i++;
        } while (i < n);
        Console.WriteLine("Factorial of {0} is {1} (done with do...while loop).", n, result);
    }
}