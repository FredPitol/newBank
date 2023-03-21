public class CreateAccount {

    public static void main(String[] args) {
       ClientAccount firstAccount = new ClientAccount(); 
       firstAccount.balance = 200;
       System.out.println(firstAccount.balance);
        
       firstAccount.balance = firstAccount.balance + 100;
       System.out.println(firstAccount.balance); 

       ClientAccount secondAccount = new ClientAccount();
       secondAccount.balance = 50;
       
       System.out.println("The first account have " + firstAccount.balance );
       System.out.println("The second account have " + secondAccount.balance);
    }
}
