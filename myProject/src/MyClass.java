
public class MyClass {
    public static void main(String[] args){

        PersonalAccount myAccount = new PersonalAccount(1234, "Kylychbek Parpiev");

        myAccount.deposit(10000);
        myAccount.getBalance();
        myAccount.withdraw(5000);
        myAccount.getBalance();
        myAccount.getAccountHolder();
        myAccount.getAccountNumber();
        myAccount.printTransactionHistory();
    }
}
