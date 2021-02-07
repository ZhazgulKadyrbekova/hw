/* NxM массиви берилген. Элементтер кайталанбайт. Максималдуу элемент менен минималдуу элемент жайгашкан саптарды орундары менен алмаштыргыла.  Эгерде алар бир сапта жайгашса, ал жөнүндө билдирүү жасагыла.For циклды колдонгула.
*/

using System;

class HW {
    public static void Main() {
        Console.WriteLine("Enter size of two-dimensional array:");
        int n = Int32.Parse(Console.ReadLine()), m = Int32.Parse(Console.ReadLine());
        int[,] arr = new int[n,m];
        int max = -100, min = 100, imax = 0, imin = 0;

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i,j] = random.Next(-100, 100);
                Console.Write("{0}\t", arr[i,j]);
                if (arr[i,j] > max) {
                    max = arr[i,j];
                    imax = i;
                }
                if (arr[i,j] < min) {
                    min = arr[i,j];
                    imin = i;
                }
            }
            Console.WriteLine();
        }
        if (imax != imin) {
            Console.WriteLine("Maximum element is {0} placed at line {1}\nMinimum element is {2} placed at line {3}", max, imax, min, imin);
            int[] temp = new int[m];
            for (int i = 0; i < m; i++) {
                temp[i] = arr[imax,i];
                arr[imax,i] = arr[imin,i];
                arr[imin,i] = temp[i];
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    Console.Write("{0}\t", arr[i,j]);
                }
                Console.WriteLine();
            }
        } else {
            Console.WriteLine("Maximum element is {0} and minimum element is {1}. Both of them are placed at line {2}", max, min, imin);
        }
    }
}