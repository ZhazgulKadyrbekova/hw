/* NxM массиви берилген. Элементтер кайталанбайт. Максималдуу элемент менен минималдуу элемент жайгашкан мамычаларды орундары менен алмаштыргыла. Эгерде алар бир мамычада жайгашса, ал жөнүндө билдирүү жасагыла. Do-While циклды колдонгула.
*/

using System;

class HW {
    public static void Main() {
        Console.WriteLine("Enter size of two-dimensional array:");
        int n = Int32.Parse(Console.ReadLine()), m = Int32.Parse(Console.ReadLine());
        int[,] arr = new int[n,m];
        int max = -100, min = 100, jmax = 0, jmin = 0;

        Random random = new Random();
        int i = 0, j = 0;
        do {
            j = 0;
            do {
                arr[i,j] = random.Next(-100, 100);
                Console.Write("{0}\t", arr[i,j]);
                if (arr[i,j] > max) {
                    max = arr[i,j];
                    jmax = j;
                }
                if (arr[i,j] < min) {
                    min = arr[i,j];
                    jmin = j;
                }
                j++;
            } while (j < m);
            Console.WriteLine();
            i++;
        } while (i < n);

        if (jmax != jmin) {
            Console.WriteLine("Maximum element is {0} placed at column {1}\nMinimum element is {2} placed at column {3}", max, jmax, min, jmin);
            int[] temp = new int[n];
            i = 0;
            do {
                temp[i] = arr[i,jmax];
                arr[i,jmax] = arr[i,jmin];
                arr[i,jmin] = temp[i];
                i++;
            } while (i < n);

            i = 0; j = 0;
            do {
                j = 0;
                do {
                    Console.Write("{0}\t", arr[i,j]);
                    j++;
                } while (j < m);
                Console.WriteLine();
                i++;
            } while (i < n);
        } else {
            Console.WriteLine("Maximum element is {0} and minimum element is {1}. Both of them are placed at column {2}", max, min, jmin);
        }
    }
}