import java.io.*;
import java.util.Scanner;
class Calculator{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a,b;
System.out.println("enter two numbers:");
a=sc.nextInt();
b=sc.nextInt();
System.out.println("choose one operator:");
System.out.println("1.+\n2.-\n3.*\n.4./\n5.%\n6.$(exit)\n");
String str=sc.next();
char c=str.charAt(0);
switch(c){
case '+':System.out.println("sum:"+(a+b));
         break;
case '-':System.out.println("sub:"+(a-b));
         break;
case '*':System.out.println("mul:"+(a*b));
         break;
case '/':System.out.println("div:"+(a/b));
         break;
case '%':System.out.println("modulo division"+(a%b));
         break;
case '$':System.exit(0);
         break;
default:System.out.println("invalid");
}
}
}
