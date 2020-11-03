/* int array[] = {7,5,6,4,9,8,2,1,3} массивин колдонуңуз. Колдонуучудан 1ден 9га чейинки бир санды киргизүүсүн өтүнүңүз, эгер колдонуучу башка бир нерсени киргизсе, анда ал көрсөтүлгөн диапазондон туура маани киргенге чейин, санды кайра киргизүүсүн сураныңыз. Колдонуучу 1ден 9га чейинки бир санды киргизери менен, массивди экранга басып чыгарыңыз. Андан кийин массивде колдонуучу киргизген санды таап, анын индексин басып чыгарыңыз.
*/

using System;
class HW {
    public static void Main() {
        int[] arr = new int[]{7,5,6,4,9,8,2,1,3};
        restart:
        Console.WriteLine("Enter number between 1 and 9:");
        int n = Int32.Parse(Console.ReadLine());
        if (n < 1 || n > 9) {
            Console.WriteLine("Entered data is not valid\nTry Again");
            goto restart;
        }

        int t = 0;
        for (int i = 0; i < 9; i++) {
            Console.Write("{0}  ", arr[i]);
            if(arr[i] == n) t = i;
        }
        Console.WriteLine();
        Console.WriteLine("{0} is located at {1} index", n, t);
    }
}