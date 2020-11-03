/*
Мисал string тибинде колдонуучудан 2 маани алат, аларды int тибине которуп, суммасын string тибине которуп жана char тибине которуп экранга чыгарып берет.

int тибиндеги маанини string тибине которгондо, сан текст болуп чыгарылатю
int тибиндеги маанини char тибине которгондо, санга туура келген ascii таблицадан символ чыгарылат.
*/

using System;
class Misal
{ static void Main()
    { string s1, s2;
        int  san1, san2, toplam;
        Console .WriteLine ("1-сапты киргиз");
        s1=Console.ReadLine ();                                     //60 - киргизилсе
        Console .WriteLine ("2-сапты киргиз");
        s2 = Console.ReadLine();                                    //5 - киргизилсе
        san1=Convert.ToInt32 (s1);
        san2=Convert.ToInt32 (s2);

        toplam =san1+san2;
        Console.WriteLine("Сумма= " + toplam.ToString() );
        Console.WriteLine("Символ= " + Convert.ToChar(toplam) );
    }
}

