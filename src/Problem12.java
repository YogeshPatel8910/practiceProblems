import java.util.*;
import java.util.stream.IntStream;

/**
 *  Account object with name and money.
 */
class Account {
    String name;
    int money;         // The value stored in the node

    public Account(String name,int money) {
        this.name = name;
        this.money = money;
    }
}

/**
 * Operation perfom by the bank: creating account,withdrawal,deposit,checking balance.
 */
class Bank {

    private ArrayList<Account> record = new ArrayList<>();

    public void add(String name, int money) {
        int index = find(name);
        if(index==-1) {
            Account newAccount = new Account(name, money);
            record.add(newAccount);
            System.out.println("Your account has been created and your current balance is " + newAccount.money);
        }
        else {
            System.out.println("User already exists");
        }
    }

    public int find(String name){
        return IntStream.range(0, record.size())
                .filter(i -> record.get(i).name.equals(name))
                .findFirst()
                .orElse(-1);
    }

    public void checkBalance(String name){
        int index = find(name);
        if(index==-1)
            System.out.println("User does not exists");
        else
            System.out.println("Your current Balance is "+record.get(index).money);
    }

    public void withdraw(String name,int money){
        int index = find(name);
        if(index==-1)
            System.out.println("User does not exists");
        else{
            Account user = record.get(index);
            if(money> user.money)
                System.out.println("Insufficient Balance");
            else{
                user.money= user.money-money;
                record.set(index,user);
                System.out.println("Money has been withdrawn and your current balance is "+user.money);
            }
        }
    }

    public void deposit(String name,int money){
        int index = find(name);
        if(index==-1)
            System.out.println("User does not exists");
        else {
            Account user = record.get(find(name));
            user.money += money;
            record.set(index, user);
            System.out.println("Money has been deposited and your current balance is " + user.money);
        }
    }

}

/**
 * Problem 12 Write a program to implement a simple banking system with deposit, withdraw, and balance check features.
 */
public class Problem12 {
    public static void prob12() {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        boolean flag = true;
        while(flag){
            System.out.println("Choose From Below");
            System.out.println("Enter 1 for New User Registration");
            System.out.println("Enter 2 to Deposit");
            System.out.println("Enter 3 to Withdraw");
            System.out.println("Enter 4 for checking balance");
            System.out.print("Enter your choice : ");
            int input = sc.nextInt();
            switch (input){
                case 0:
                    flag=false;
                    break;
                case 1:
                    System.out.print("Enter your name :");
                    String name1 = sc.next();
                    System.out.print("Enter amount of money :");
                    int money1 = sc.nextInt();
                    bank.add(name1,money1);
                    break;
                case 2:
                    System.out.print("Enter your name :");
                    String name2 = sc.next();
                    System.out.print("Enter amount of money you wanted to Deposit :");
                    int money2 = sc.nextInt();
                    bank.deposit(name2,money2);
                    break;
                case 3:
                    System.out.print("Enter your name :");
                    String name3 = sc.next();
                    System.out.print("Enter amount of money you wanted to Withdraw :");
                    int monet3 = sc.nextInt();
                    bank.withdraw(name3,monet3);
                    break;
                case 4:
                    System.out.print("Enter your name :");
                    String name = sc.next();
                    bank.checkBalance(name);
                    break;
                default:
                    System.out.println("Enter correct option");
            }
        }
        bank.add("Tulip1",10);
        bank.add("Tulip2",100);
        bank.add("Tulip3",107);
        bank.add("Tulip4",180);
        bank.checkBalance("Tulip1");
        bank.withdraw("Tulip2",50);
        bank.checkBalance("Tulip2");
        bank.deposit("Tulip2",500);
        bank.checkBalance("Tulip2");

    }
}
