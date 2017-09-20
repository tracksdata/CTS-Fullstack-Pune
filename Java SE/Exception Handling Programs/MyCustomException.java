class InsufficientBalanceException extends Exception{
InsufficientBalanceException( String msg){
super(msg);
}
};

class Withdraw {
double balance=500;
public void withdraw( double amount){
try{
	if(balance<amount)
throw new InsufficientBalanceException( "Insufficient balance");
System.out.println(" Transaction Successful!!");
}
catch(InsufficientBalanceException e){
//System.out.println(e.getMessage());
e.printStackTrace();

}
}
};

class MyCustomException{ 
public static void main( String[] args){

Withdraw w= new Withdraw();
w.withdraw(700);
w.withdraw(300);
w.withdraw(600);
}
};

