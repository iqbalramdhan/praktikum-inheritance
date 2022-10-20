public class Account {
    private int balance;
    public Account (int balance){
      this.balance = balance;
       } 
    public int getBalance() {
      return balance;
    }
    public void deposit(int amount){
      System.out.println("Tambah Deposit : "+amount);
      balance += amount;
    }
    public void withdraw(int amount) {
      System.out.println(" Penarikan : " + amount);
      if (balance >= amount){
        balance -= amount;
        } else 
        System.out.println("Maaf saldo anda tidak mencukupi");
    }
  }