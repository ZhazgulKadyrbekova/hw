using System;

class Student {
    public String id;
    public String name;
    public String surname;
    public int year; //entering year
    public int faculty;
    public int department;
    public int no;
}
class HW {
    static void Main() {
        Student zhazgul = new Student();
        zhazgul.name = "Zhazgul";
        zhazgul.surname = "Kadyrbekova";
        zhazgul.year = 2018;
        zhazgul.faculty = 4;
        zhazgul.department = 1;
        zhazgul.no = 26;
        zhazgul.id = (zhazgul.year%100).ToString("D2") + zhazgul.faculty.ToString("D2") + "." + 
                        zhazgul.department.ToString("D2") + zhazgul.no.ToString("D3");
        Console.WriteLine("Name: {0}", zhazgul.name);
        Console.WriteLine("Surname: {0}", zhazgul.surname);
        Console.WriteLine("Student id: {0}", zhazgul.id);
        Console.WriteLine();

        Student atyr = new Student();
        atyr.name = "Atyrgul";
        atyr.surname = "Nazarova";
        atyr.year = 2017;
        atyr.faculty = 4;
        atyr.department = 1;
        atyr.no = 43;
        atyr.id = (atyr.year%100).ToString("D2") + atyr.faculty.ToString("D2") + "." + 
                        atyr.department.ToString("D2") + atyr.no.ToString("D3");
        Console.WriteLine("Name: {0}", atyr.name);
        Console.WriteLine("Surname: {0}", atyr.surname);
        Console.WriteLine("Student id: {0}", atyr.id);
        Console.WriteLine();

        Student bagdash = new Student();
        bagdash.name = "Bakdoolot";
        bagdash.surname = "Keldibekova";
        bagdash.year = 2018;
        bagdash.faculty = 12;
        bagdash.department = 1;
        bagdash.no = 22;
        bagdash.id = (bagdash.year%100).ToString("D2") + bagdash.faculty.ToString("D2") + "." + 
                        bagdash.department.ToString("D2") + bagdash.no.ToString("D3");
        Console.WriteLine("Name: {0}", bagdash.name);
        Console.WriteLine("Surname: {0}", bagdash.surname);
        Console.WriteLine("Student id: {0}", bagdash.id);
    }
}