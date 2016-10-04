// This program shows how to define and invoke several methods

import java.util.Scanner;

class MethodExmpl{

   // A method to produce a square of an input parameter of type double
   static double doSquare(double num) {
      return num * num;
   }//end of method doSquare

   // A method to produce mod 2 of an input parameter
   static double modTwo(double inputVar) {
      return inputVar % 2;
   }
  
   // A method to produce x+y
   static int sum(int x, int y){
      return x+y;
   }
  
   // A method to produce x/100 and print s
   static double calcPcnt(double x, String s){
      System.out.println(s);
      return x/100;  
   }
  
   // A void method to print x+y
   static void printSum(int x, int y){
    System.out.println("print sum method: "+ (x+y));
   }

   public static void main(String args[]) { //main method
       //ask user to enter a double
      Scanner in = new Scanner(System.in);
      int count = 0;
      int s = 0;
      while (true){
          System.out.print("Please enter a double: ");
 
	      // variable to store value entered from keyboard
          double var = in.nextDouble();
          if (var == -1) break;
          else if (var == 0) {
        	  System.out.println("Zero");
          }
          else {
        	  System.out.println((var>0)?"Positive":"Negative");
//        	  System.out.println((var%2==0)?"Positive":"Negative");
          }
	          // Invoke a method to return a square
	          double result = doSquare(var);
	          System.out.println("The result of squaring the number " + var + " is: " + result);
	          
	          s += result;
//	          count = (var == -1)?(int)var:count++;
      }
      //invoke method modTwo
//      System.out.println("The result of number " + var + " % 2 is: " + modTwo(var));

      //calling sum
      System.out.println("The result of sum is " + s);
  
      //calling calcPcnt
//      System.out.println(calcPcnt(5, "call calcpcnt "));
     
      //call printsum
//      printSum(10, 20);  //method is void so it cannot be used in an expression or method call
      
    }//end of main method
}