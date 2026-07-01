import java.util.*;

public class function {
  // public static void calculateSum(){
  // Scanner sc = new Scanner(System.in);
  // System.out.print("Enter you first number:");
  // int a = sc.nextInt();
  // System.out.print("Enter your Second number");
  // int b = sc.nextInt();
  // int sum = a + b;
  // System.out.println("Sum of numbers is:"+ sum);
  // }
  // public static void calculateSum(int num1,int num2){

  // int sum = num1 + num2;
  // System.out.println("Sum of numbers is:"+ sum);
  // }

  // public static int calculateSum(int num1,int num2){

  // int sum = num1 + num2;
  // return sum;
  // }

  // call by value
  // public static int multiply(int a , int b){
  // int multi = a * b;
  // return multi;
  // }
  // public static void swap(int a , int b){
  // int temp = a;
  // a = b;
  // b = temp;
  // System.out.println("value from fxn "+a);
  // System.out.println("value from fxn "+ b);

  // }
  // public static int factorial(int n) {
  //   int f = 1;
  //   for (int i = 1; i <= n; i++) {
  //     f = f * i;
  //   }
  //   return f;
  // }

  // public static int binomial(int n,int r){
  // int fact_n = factorial(n);
  // int fact_r = factorial(r);
  // int fact_nmr = factorial(n-r);
  // int bin = fact_n / (fact_r * fact_nmr);
  // return bin;
  // }

  // public static int reverse(int n) {
  //   int lastDigit;
  //   int rev = 0;
  //   while (n > 0) {
  //     lastDigit = n % 10;
  //     rev = rev * 10 + lastDigit;
  //     n = n / 10;

  //   }
  //   return rev;

  // }

  // public static void decimalToBinomial(int num) {
  //   int rem = 0;
  //   String b = "";
  //   while (num > 0) {
  //     rem = num % 2;
  //     num = num / 2;
  //     b = b + rem;
  //   }
  //   for(int i = b.length()-1;i >= 0;i--){
  //     System.out.print(b.charAt(i));
  //   }
   
  // }

  // public static void integersSum(int num[]){
  //   int even = 0;
  //   int odd = 0;
  //   for(int i = 0;i< num.length;i++){
  //     if(num[i] % 2 == 0){
  //       even = even  + num[i];
  //     }else{
  //       odd = odd + num[i];
        
  //     }
  //   }
  //   System.out.println("Even num Sum is: " + even);
  //   System.out.println("Odd num Sum is: " + odd);
  // }
  // public static void printTable(int num){
  //   int tab = 0;
  //   for(int i = 1;i<= 10;i++){
  //      tab = num * i;
  //      System.out.println(num +" * " + i +" = " + tab);
  //   }
  // }
  // public static void hollowRectangle(int row,int col){
  //   for(int i = 1;i<= row;i++){
  //     for(int j = 1;j<=col;j++){
  //       if(row == 1 || row == i || j == 1 || j == col){
  //         System.out.print("*");
  //       }
  //       System.err.println();
  //     }
  //   }
  // }
  // public static int avg(int num1,int num2,int num3){
  //   int avg = (num1+num2+num3)/3;
  //   return avg;
  // }
  // public static boolean Even(int num){
  //   if(num % 2 == 0){
  //     return true;
  //   }
  //   return false;
  // }
// public static boolean isPalindrome(int num){
//   int i = 1;
//    while(num > 0){
//     int lastDigit = num % 10;
//     if(lastDigit == i){
//       i++;
//       num = num / 10;
//       return true;
//     }
//    }
//    return false;
//   }
  // public static void sumInteger(int num){
  //   int sum = 0;
  //   while(num > 0){
  //     int lastDigit = num % 10;
  //     sum = sum + lastDigit;
  //     num = num/10;
  //   }
  //   System.out.println("Sum of digits: " + sum);
  // }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // System.out.print("Enter you first number:");
    // int a = sc.nextInt();
    // System.out.print("Enter your Second number:");
    // int b = sc.nextInt();
    // int sum = calculateSum(a, b);
    // System.out.println("Sum of the numbers:"+ sum);
    // int a = 10;
    // int b = 5;
    // int temp = a;
    // a = b;
    // b = temp;
    // System.out.println(a);
    // System.out.println(b);

    // int multi = multiply(5,10 );
    // System.out.println(multi);

    // call by value means copy we can see here!
    // int a = 10;//they are copy
    // int b = 5;
    // swap(10,5);
    // System.out.println("main fxn "+a);
    // System.out.println("main fxn "+ b);

    // System.out.println(factorial(7));
    // System.out.println(binomial(5, 2));

    // decimalToBinomial(8);
    // integersSum(new int[]{1,3,47,99,120,30});
    // System.out.println("Enter your number: ");
    // int  tab = sc.nextInt();
    // printTable(tab);



    // hollowRectangle(4, 5);
    // int avg = avg(20,30,40);
    // System.out.println("avg of your numbers is: "+avg);
    //  boolean eve = Even(13);
    // System.out.println(eve);
    // boolean pal = isPalindrome(23);
    // System.out.println(pal);
    // sumInteger(123410);
    
    
}
}
