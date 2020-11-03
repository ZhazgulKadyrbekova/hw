/* Кандайдыр бир бүтүн n саны берилген. 1 ден n ге чейинки интервалда жаткан жана n менен өз ара канча жөнөкөй сан бар экендигин аныктагыла. */

using System;
class HW {
    static int nod(int a, int b) {
        for (int i=b; i>1; i--) {
            if (a%i == 0 && b%i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static void Main() {
        Console.WriteLine("Enter a natural number");
        int n = Int32.Parse(Console.ReadLine()), cnt = 0;

        for (int i = 2; i < n; i++) {
            if (nod(n,i) == 1) {
                cnt++;
            }
        }
        Console.WriteLine("There are {0} coprime numbers with {1}", cnt, n);
    }
}