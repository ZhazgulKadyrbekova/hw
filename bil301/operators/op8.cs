// true жана false операторлорду кайрадан жүктөө.
using System;
class Logik
{    int x, y; public Logik() { x = y = 0; }
    public Logik(int i, int j) { x = i; y = j; }

    public static bool operator true(Logik op)
    {   if ((op.x != 0) || (op.y != 0)) return true;
        else return false;     }

    public static bool operator false(Logik op)
    {   if ((op.x == 0) && (op.y == 0)) return true; 
        else return false;     }

    public static Logik operator --(Logik op)
    {    Logik result = new Logik();
        result.x = op.x - 1; 
        result.y = op.y - 1;
        return result;     }

    public void Show()
    {   Console.WriteLine(x + ", " + y); }  
}

class Programma
{    static void Main()
    {   Logik a = new Logik(3, 3);
        Console.Write("a: "); a.Show();
        do
        {    a.Show();
            a--;
        } while (a); 
    } 
} 