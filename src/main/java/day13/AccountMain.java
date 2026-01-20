package day13;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountNumber(10101);
        account.setAmount(123153.123);
        account.setName("John");
        System.out.println(account.getAccountNumber());
        System.out.println(account.getName());
        System.out.println(account.getAmount());
    }
}
