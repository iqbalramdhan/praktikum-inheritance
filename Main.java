public class Main extends Account{
    public static void main(String[] args) {
      Account account1 = new Account (5000000);
      
      System.out.println("Creating an account with "+account1.getBalance()+" balance");
      account1.withdraw(3250000);
      System.out.println(" Sisa saldo : "+account1.getBalance());
      account1.deposit(650000);
      System.out.println(" Sisa saldo : "+account1.getBalance());
      account1.withdraw(1450000);
      account1.withdraw(1325000);
      System.out.println(" Sisa saldo : "+account1.getBalance());
    }
  }