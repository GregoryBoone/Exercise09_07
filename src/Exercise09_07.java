public class Exercise09_07 {
    public static void main(String[] args){
         Account myObject = new Account();

         myObject.setId(1122);
         myObject.setBalance(20000);
         myObject.setAnnualInterestRate(.045);

         myObject.withdraw(2500);
         myObject.deposit(3000);

         System.out.println("The account balance is " + myObject.getBalance());
         System.out.println("The monthly interest is " + myObject.getMonthlyInterest());
         System.out.println("The date this account was created was " + myObject.getDateCreated());
    }
}
