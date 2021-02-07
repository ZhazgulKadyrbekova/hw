/* int array[] = { 7, 5, 6, 4, 9, 8, 2, 1, 3 } массивин колдонуңуз. Колдонуучудан 1ден 9га чейинки бир санды киргизүүсүн өтүнүңүз, эгер колдонуучу башка бир нерсени киргизсе, анда ал көрсөтүлгөн диапазондон туура маани киргенге чейин, санды кайра киргизүүсүн сураныңыз. Колдонуучу 1ден 9га чейинки бир санды киргизери менен, массивди экранга басып чыгарыңыз. Андан кийин массивде колдонуучу киргизген санды таап, анын индексин басып чыгарыңыз.
*/

using System;
class HW {
    public static void Main() {
        int[] arr = new int[]{7,5,6,4,9,8,2,1,3};
        Console.WriteLine("Enter number between 1 and 9:");
        int n = Int32.Parse(Console.ReadLine());
        while (n < 1 || n > 9) {
            Console.WriteLine("Entered data is not valid\n Try Again\nEnter number between 1 and 9:");
            n = Int32.Parse(Console.ReadLine());
        }

        int t = 0, i = 0;
        while (i < 9) {
            Console.Write("{0}  ", arr[i]);
            if(arr[i] == n) t = i;
            i++;
        }
        Console.WriteLine();
        Console.WriteLine("{0} is located at {1} index", n, t);
    }
}