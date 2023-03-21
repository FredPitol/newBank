public class ReferenceTest {
    public static void main(String[] args) {
        ClientAccount firstAccount = new ClientAccount();
        firstAccount.balance = 300;

        System.out.println("First account balance: " 
        + firstAccount.balance);
        
        ClientAccount secondAccount = firstAccount;
        
        System.out.println("Second account balance: " + secondAccount.balance);
        
        secondAccount.balance += 100;
        
        System.out.println("Second account balance: " + secondAccount.balance);
        
        System.out.println("First account balance: " 
        + firstAccount.balance);
        
    }
}
