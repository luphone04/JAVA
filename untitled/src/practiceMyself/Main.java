package practiceMyself;


//public class Main {
//    public static void main(String[] args) {
//        // Test constructor and toString()
//        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
//        System.out.println(e1);  // toString();
//
//        // Test Setters and Getters
//        e1.setSalary(999);
//        System.out.println(e1);  // toString();
//        System.out.println("id is: " + e1.getID());
//        System.out.println("firstname is: " + e1.getFirstname());
//        System.out.println("lastname is: " + e1.getLastname());
//        System.out.println("salary is: " + e1.getSalary());
//
//        System.out.println("name is: " + e1.getName());
//        System.out.println("annual salary is: " + e1.getAnnualSalary()); // Test method
//
//        // Test raiseSalary()
//        System.out.println(e1.raiseSalary(10));
//        System.out.println(e1);
//    }
//}
//

//public class Main {
//    public static void main(String[] args) {
//        // Test constructor and toString()
//        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
//        System.out.println(inv1);  // toString();
//
//        // Test Setters and Getters
//        inv1.setQty(999);
//        inv1.setUnitPrice(0.99);
//        System.out.println(inv1);  // toString();
//        System.out.println("id is: " + inv1.getID());
//        System.out.println("desc is: " + inv1.getDesc());
//        System.out.println("qty is: " + inv1.getQty());
//        System.out.println("unitPrice is: " + inv1.getUnitPrice());
//
//        // Test getTotal()
//        System.out.println("The total is: " + inv1.getTotal());
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        // Test constructor and toString()
//        Account a1 = new Account("A101", "Tan Ah Teck", 88);
//        System.out.println(a1);  // toString();
//        Account a2 = new Account("A102", "Kumar"); // default balance
//        System.out.println(a2);
//
//        // Test Getters
//        System.out.println("ID: " + a1.getID());
//        System.out.println("Name: " + a1.getName());
//        System.out.println("Balance: " + a1.getBalance());
//
//        // Test credit() and debit()
//        a1.credit(100);
//        System.out.println(a1);
//        a1.debit(50);
//        System.out.println(a1);
//        a1.debit(500);  // debit() error
//        System.out.println(a1);
//
//        // Test transfer()
//        a1.TransferTo(a2, 100);  // toString()
//        System.out.println(a1);
//        System.out.println(a2);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        // Test constructor and toString()
//        Date d1 = new Date(1, 2, 2014);
//        System.out.println(d1);  // toString()
//
//        // Test Setters and Getters
//        d1.setMonth(12);
//        d1.setDay(9);
//        d1.setYear(2099);
//        System.out.println(d1);  // toString()
//        System.out.println("Month: " + d1.getMonth());
//        System.out.println("Day: " + d1.getDay());
//        System.out.println("Year: " + d1.getYear());
//
//        // Test setDate()
//        d1.setDate(3, 4, 2016);
//        System.out.println(d1);  // toString()
//    }
//}

public class TestMain {
    public static void main(String[] args) {
        // Test constructors and toString()
        Time t1 = new Time(1, 2, 3);
        System.out.println(t1);  // toString()

        // Test Setters and Getters
        t1.setHour(4);
        t1.setMinute(5);
        t1.setSecond(6);
        System.out.println(t1);  // toString()
        System.out.println("Hour: " + t1.getHour());
        System.out.println("Minute: " + t1.getMinute());
        System.out.println("Second: " + t1.getSecond());

        // Test setTime()
        t1.setTime(23, 59, 58);
        System.out.println(t1);  // toString()

        // Test nextSecond();
        System.out.println(t1.nextSecond());
        System.out.println(t1.nextSecond().nextSecond());

        // Test previousSecond()
        System.out.println(t1.previousSecond());
        System.out.println(t1.previousSecond().previousSecond());
    }
}