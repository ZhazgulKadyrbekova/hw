/*
Ата-эне жана студент жөнүңдө маалыматтарды камтыган эки классты түзгүлө. Ата-эне классын базалык, ал эми студент классын туунду класс катары мурастагыла.
*/

using System;

class Family {
    public string surname;
    public void info() {
        Console.WriteLine("Surname\t{0}", surname);
    }
}
class Student : Family {
    public string name;
    public void info() {
        Console.WriteLine("Name\t{0}", name);
        Console.WriteLine("Surname\t{0}", surname);
    }
}

class HW {
    public static void Main(string[] args) {
        Family fam = new Family();
        fam.surname = "Doe";
        fam.info();
        Console.WriteLine();

        Student stud = new Student();
        stud.name = "John";
        stud.surname = "Doe";
        stud.info();
    }
}
