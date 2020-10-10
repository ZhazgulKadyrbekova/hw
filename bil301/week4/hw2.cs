using System;

class HW {
    public static void Main() {
        Console.WriteLine("Enter date in format DD.MM.YYYY:");
        restart:
        String[] date = new String[3];
        date = Console.ReadLine().Split(".");

        /************************************* if...else ***********************************/
        int day = Int32.Parse(date[0]), month = Int32.Parse(date[1]), year = Int32.Parse(date[2]);
        if ((day < 1 || day > 31) || (month < 1 || month > 12)) {
            Console.WriteLine("Please, enter valid date in format DD.MM.YYYY:");
            goto restart;
        } else if ((year % 4 == 0 && month == 2 && day > 29) || (year % 4 != 0 && month == 2 && day > 28)) {
            Console.WriteLine("Please, enter valid date in format DD.MM.YYYY:");
            goto restart;
        }

        /*********************************** switch...case ******************************/
        int sum = ((year-1)/4 * 5 % 7) + (year-1)%4;
        switch (month - 1) {
            case 1: sum += 31; sum %= 7; break;
            case 2: sum += 59; sum %= 7; break;
            case 3: sum += 90; sum %= 7; break;
            case 4: sum += 120; sum %= 7; break;
            case 5: sum += 151; sum %= 7; break;
            case 6: sum += 181; sum %= 7; break;
            case 7: sum += 212; sum %= 7; break;
            case 8: sum += 243; sum %= 7; break;
            case 9: sum += 273; sum %= 7; break;
            case 10: sum += 304; sum %= 7; break;
            case 11: sum += 334; sum %= 7; break;
        }
        sum += day;
        sum %= 7;

        switch (sum) {
            case 1: Console.WriteLine("Monday"); break;
            case 2: Console.WriteLine("Tuesday"); break;
            case 3: Console.WriteLine("Wednesday"); break;
            case 4: Console.WriteLine("Thursday"); break;
            case 5: Console.WriteLine("Friday"); break;
            case 6: Console.WriteLine("Saturday"); break;
            case 0: Console.WriteLine("Sunday"); break;
        }
        //Console.WriteLine("{0}.{1}.{2}", day, month, year);
        
    }
}