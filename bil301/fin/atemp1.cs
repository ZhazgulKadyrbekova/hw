using System;
class Class_1
{   int a, b;
    string style;
    public Class_1() { a = 0; b = 0; }
    public Class_1(string s, int x, int y)     { a = x; b = y; style = s; }
    public virtual void Ayant()	    { Console.WriteLine("Фигура :"+style+". Аянт="+a*b); }
}
class Class_2 : Class_1
{
    int a, b;
    string style;
    public Class_2() { a = 0; b = 0; }
    public Class_2(string s, int x, int y)     { a = x; b = y; style = s; }
    public override void Ayant()    { Console.WriteLine("Фигура :"+style+". Аянт="+a*b/2); }
}
class Class_3 : Class_2
{   int r;
    string style;
    public Class_3(string s, int radius)     { r = radius; style = s; }
    public override void Ayant()    { Console.WriteLine("Фигура :"+style+". Аянт="+3.14*r*r); } 
}
class Program
{   static void Main()
    {   Class_1  Ob_1 = new Class_1("Төрт бурчтук",3,4);
        Class_2  Ob_2 = new Class_2("Үч бурчтук",3,4);
        Class_3  Ob_3 = new Class_3("Айлана",3);
        Class_1 Ob1Ref; 	// базалык класска шилтеме.
        Ob1Ref = Ob_1;
        Ob1Ref.Ayant();
        Ob1Ref = Ob_2;
        Ob1Ref.Ayant();
        Ob1Ref = Ob_3;
        Ob1Ref.Ayant();
    } 
}