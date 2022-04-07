/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week7;

/**
 *
 * @author Berl
 */
import java.util.*;

class atm {
public static void main( String args[] ) {
//declare and initialize balance, withdraw, and deposit
int balance = 300;
int withdraw, deposit;
//create scanner class object to get choice of user
Scanner sc = new Scanner(System.in);
while(true)
{
System.out.println( "v======= Welcome! =======v " );
System.out.println( "Main Menu : " );
System.out.println( "1 - View my balance" );
System.out.println( "2 - Withdraw cash" );
System.out.println( "3 - Deposit funds" );
System.out.println( "4 - EXIT" );
System.out.print( "Enter a choice :  " );
//get the user selected option
int op = sc.nextInt( );
switch( op )
{
case 2: System.out.println( "Withdrawal Menu :" );
System.out.println( "1 - 20" );
System.out.println( "2 - 40" );
System.out.println( "3 - 60" );
System.out.println( "4 - 100" );
System.out.println( "5 - 200" );
System.out.println( "6 - CANCEL TRANSACTION" );
System.out.println( "Choose a withdrawal amount : " );
int wd = sc.nextInt( );
switch (wd){
    case 1: withdraw = sc.nextInt(); withdraw( balance, withdraw); break;
}
// accept the withdraw amount from the user
withdraw = sc.nextInt();
//check whether the balance is greater than or equal to the withdrawal amount
withdraw( balance, withdraw);
break;

case 3: System.out.print( "Please enter a deposited amount in CENTS (or 0 to cancel) :" );
//accept the deposit amount from the user
deposit = sc.nextInt();
// call the function and add the deposit amount to the total balance
deposit( balance, deposit );
break;

case 1: System.out.print( "Balance Information :" );
// printing the total balance of the user
printBalance( balance );
System.out.println(" ");
break;

case 4:
// exit from the menu
System.exit( 0 );
}
}
}
// function to print the current balance in an account
public static void printBalance(int balance)
{
System.out.println(" Avaible balance  : " + balance);
System.out.println(" Total balance  : " + balance);
System.out.println();
}
// The function to Withdraw an amount and update the balance
public static int withdraw(int balance, int withdrawAmount)
{
System.out.println( "Withdrawn Operation :" );
System.out.println("The withdrawing Amount is : " + withdrawAmount);
if (balance >= withdrawAmount) {
balance = balance - withdrawAmount;
System.out.println( "Please collect your money and remove the card" );
printBalance( balance );
}
else {
System.out.println( "Sorry! the balanace is insufficient." );
System.out.println( );
}
return balance;
}
// The function to deposit an amount and update the balance
public static int deposit(int balance, int depositAmount)
{
System.out.println( "Deposit Operation :" );
System.out.println(" The depositing amount is : " + depositAmount);
balance = balance + depositAmount;
System.out.println( "Your Money has been successfully deposited" );
printBalance(balance);
return balance;
}
}
