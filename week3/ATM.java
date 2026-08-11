package week3;

public class ATM {
    private BankAccount account;

    public ATM(BankAccount account){
        this.account = account;
    }

    public void checkBalance() {
        System.out.println("ยอดเงินเหลือ: " + account.getBalance() + " บาท");
    }

    public void depositMoney(double amount){
        account.deposit(amount);
    }

    public void withdrawMoney(double amount){
        account.withdraw(amount);
    }

    public void showAccountInfo(){
        account.showInfo();
    }
    public boolean checkAccount(String accountNo, int pin){
        return account.AuthAccount(accountNo, pin);
    }
}