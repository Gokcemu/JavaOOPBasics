import bankaccount.BankAccount;
import com.sun.management.OperatingSystemMXBean;
import contacts.Contact;
import contacts.PhoneNumber;
import events.AccountTransferEvent;
import events.Event;
import events.MissedPaymentEvent;
import events.PasswordChangeEvent;
import filereader.DigitsOnlyFileReader;
import list.ConditionArrayList;
import list.ModArrayList;
import tree.Tree;
import tree.TreeType;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Predicate;
import java.util.zip.DeflaterInputStream;

public class Main {

    public static void main(String[] args)  {

        PasswordChangeEvent eventOne = new PasswordChangeEvent("321928399");
        AccountTransferEvent eventTwo = new AccountTransferEvent("1936428194");
        MissedPaymentEvent eventThree = new MissedPaymentEvent("93827451");

        Event[] events = {eventOne,eventTwo,eventThree};

        for (Event e : events){
            System.out.println(e.getTimeStamp());
            e.process();
            System.out.println();
        }


       /* DigitsOnlyFileReader digitsOnlyFileReader = new DigitsOnlyFileReader("C:/JavaOOPBasics/src/main/java/filereader/message.txt");

        System.out.println(digitsOnlyFileReader.readFile());
        System.out.println(digitsOnlyFileReader.getPath());

       /* Contact contactOne = new Contact("Sally",
                new PhoneNumber("2637263737"));

        Contact contactTwo = new Contact("Maggie Smith",
                new PhoneNumber(41, "9384713401"));

        Contact contactThree = new Contact("Roger Williams",
                new PhoneNumber("448474734929"));

        Contact contactFour = new Contact("David Jones",
                "david_jones@bluewire.com");

        Contact contactFive = new Contact("Sarah Brown", new PhoneNumber("2029384982"),
                "sarahb@tech.com");

        System.out.println(contactOne);
        System.out.println(contactTwo);
        System.out.println(contactThree);
        System.out.println(contactFour);
        System.out.println(contactFive);

   /* public static void addRandomNumber(ArrayList<Integer> list) {
        int originalSize = list.size();
        Random random = new Random();
        int n = random.nextInt(1000);

        if (list instanceof ConditionArrayList) {
            ConditionArrayList conditionList = (ConditionArrayList) list;
            while (!conditionList.isEligible(n)) {
                n = random.nextInt(1000);
            }
        }

        list.add(n);
    }

    public static void main(String[] args) {

        Predicate<Integer> isDivisibleByThree = n -> Math.abs(n) % 3 == 0;
        ConditionArrayList divisibleByThreeList =
                new ConditionArrayList(isDivisibleByThree);

        ConditionArrayList dvisibleByThreeList2 =
                new ConditionArrayList(isDivisibleByThree, 1, 3, 5, 6, 9);

        ArrayList<Integer> numsList = new ArrayList<>();
        numsList.add(1);
        numsList.add(4);
        numsList.add(3);
        numsList.add(6);
        numsList.add(13);

        ConditionArrayList divisibleByThreeList3 =
                new ConditionArrayList(isDivisibleByThree, numsList);

        Predicate<Integer> isDivisibleByTen = n-> Math.abs(n) % 10 == 0;
        ConditionArrayList divisibleByTenList =
                new ConditionArrayList(isDivisibleByTen, numsList);

        /*ConditionArrayList oddList = new ConditionArrayList(
                n -> Math.abs(n) % 2 == 1);
        oddList.add(1);
        oddList.add(2);
        addRandomNumber(oddList);
        System.out.println(oddList);

        ConditionArrayList evenList = new ConditionArrayList(
                n -> Math.abs(n) % 2 == 0);
        evenList.add(1);
        evenList.add(2);
        addRandomNumber(evenList);
        System.out.println(evenList);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        addRandomNumber(list);
        System.out.println(list);
    }


        ModArrayList list = new ModArrayList();
        list.add(0);
        list.add(10);
        list.add(20);
        list.add(30);

        list.getUsingMod(1);
        list.getUsingMod(2);
        list.getUsingMod(40);

        BankAccount bankAccountJohn = new BankAccount("John", 10.000 );

        bankAccountJohn.deposit(1000);
        bankAccountJohn.withDraw(250);
        bankAccountJohn.withDraw(1000);

        System.out.println("John's bank account balance is " + bankAccountJohn.getBalance());


        Tree myFavoriteMapleTree = new Tree(90, 30, TreeType.OAK);

        System.out.println(myFavoriteMapleTree.getHeightFt());
        System.out.println(myFavoriteMapleTree.getTrunkDiameterInches());
        System.out.println(myFavoriteMapleTree.getTreeType());


        /*employee.Employee employeeJohn = new employee.Employee("John", 30, 30.000, employee.Title.QA, employee.Location.ISTANBUL);
        employee.Employee employeeKatie = new employee.Employee("Katie", 32, 35.000, employee.Title.QA, employee.Location.ISTANBUL);

        System.out.println("John's Salary is " + employeeJohn.salary);
        System.out.println("Katie's Salary is " + employeeKatie.salary);


        employeeJohn.raiseSalary();
        employeeKatie.raiseSalary();*/
    }
}

