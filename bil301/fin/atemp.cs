//Базалык класстын методунун функционалын  туунду класста өзгөртуугө мүмкүн болгон методдор.
using System;
class Class_1
{  public virtual void Misal()		 // Базалык класстагы виртуалдык метод.
    { Console.WriteLine("Misal() методу Class_1де"); }
}
class Class_2 : Class_1
{ public override void Misal()		// Туунду класста кайрадан аныкталды.
    { Console.WriteLine("Misal() методу Class_2де"); }
}
class Class_3 : Class_1
{public override void Misal() 		// Туунду класста кайрадан аныкталды.
    { Console.WriteLine("Misal() методу Class_3тө"); }
}
class Program
{    static void Main()
    {   Class_1 Ob_1 = new Class_1();
        Class_2 Ob_2 = new Class_2();
        Class_3 Ob_3 = new Class_3();
        // Class_1 Ob1Ref; 	// базалык класска шилтеме.
        //Ob1Ref = Ob_1;
        Ob_1.Misal();
        // Ob1Ref = Ob_2;
        Ob_2.Misal();
        // Ob1Ref = Ob_3;
        Ob_3.Misal();}
}