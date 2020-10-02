using System;

class YOD1 {
    public static void Main() {
        Console.WriteLine("Kancha sap maalymat kirgizuunu kaalaisyz?");

        int n = Int32.Parse(Console.ReadLine());
        String[] firma = new String[n];
        int[] prog = new int[n];
        long[] vol = new long[n];
        double[] ul = new double[n];

        for (int i = 0; i < n; i++) {
            Console.WriteLine("Maalymatty kirgiziniz:\nFirma:");
            firma[i] = Console.ReadLine();
            Console.WriteLine("Programdyk karajattyn sany:");
            prog[i] = Int32.Parse(Console.ReadLine());
            Console.WriteLine("Satuunun jyldyk kolomu:");
            vol[i] = Int64.Parse(Console.ReadLine());
            Console.WriteLine("Rynok ulushu:");
            ul[i] = Double.Parse(Console.ReadLine());
            Console.WriteLine();
        }


        Console.WriteLine("|-----------------------------------------------------|");
        Console.Write("| Ondurush firmalar".PadRight(54));
        Console.WriteLine("|");
        Console.WriteLine("|-----------------------------------------------------|");
        Console.WriteLine("|          |Programdyk     |Satuunun jyldyk |Rynok    |");
        Console.WriteLine("| Firma    |karajattyn sany|kolomu($)       |ulushu(%)|");
        Console.WriteLine("|-----------------------------------------------------|");

        
        for (int i = 0; i < n; i++) {
            Console.Write("|");
            Console.Write(firma[i].PadRight(10));
            
            Console.Write("|");
            Console.Write(prog[i].ToString().PadRight(15));
            //Console.WriteLine(value.ToString(specifier, culture));

            Console.Write("|");
            Console.Write(vol[i].ToString().PadRight(16));
            
            Console.Write("|");
            Console.Write(ul[i].ToString().PadRight(9));
            
            Console.Write("|\n");
        }


        Console.WriteLine("|-----------------------------------------------------|");
        Console.Write("| Eskertuu: Gartner Group maalymaty boiuncha (2009 j)".PadRight(54));
        Console.WriteLine("|");
        Console.WriteLine("|-----------------------------------------------------|");
    }
}