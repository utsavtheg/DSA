import java.util.Scanner;
public class Demo {
  public static void main(String args[]) {
    //hii i am single line comment
    /*I am multi line comment 
    in Java */


    // variable 
    // int age = 20;
    // String name = "Raj";
    // System.out.println("Hello World!");
    //Scanner
  // Scanner sc = new Scanner(System.in);
  
  // System.out.print("Enter your name:");
  // String name = sc.nextLine();
  // System.out.print("Enter your age:");
  // int age = sc.nextInt();
  // System.out.println("My name is "+ name +" and " + "age is " + age);

  //swap
  // int a = 10;
  // int b = 20;
  // int temp;
  // temp = a;
  // a = b;
  // b = temp;
  // System.out.println(a);
  // System.out.println(b);


  
  // int a = 10;
  // int b = 20;
  // a = a+b;
  // b = a-b;
  // a = a-b;
  // System.out.println(a);
  // System.out.println(b);
  

   //Scanner
  Scanner sc = new Scanner(System.in);
  
  // System.out.print("Enter your number1: " );
  // int a = sc.nextInt();

  // System.out.print("Enter your number2: ");
  // int b = sc.nextInt();
 
  // System.out.print("Enter your number3: ");
  // int c = sc.nextInt();
  // int avg = (a + b + c)/3;
  // System.out.println("Avg of your numbers is : "+ avg);



  // System.out.print("Enter the length of the rectangle:");
  // int a = sc.nextInt();

  // System.out.print("Enter the breadth of the rectangle:");
  // int b = sc.nextInt();

  // int area = a * b;
  // System.out.println("Area of the rectangle is: "+ area);
  


  // System.out.print("Enter the price of pencil: ");
  // float a = sc.nextFloat();
  // System.out.print("Enter the price of your pen: ");
  // float b = sc.nextFloat();

  // System.out.print("Enter the price of your eraser: ");
  // float c = sc.nextFloat();

  // float total = a+b+c;
  // float gst = total*0.18f;
  // float totalPrice = total+gst;
  // System.out.println("Amount of your bill: "+totalPrice);

//   byte b = 4;
//   char c = 'a';
//   short s = 512;
//   int i = 1000;
//   float f = 3.14f;
//   double d = 99.9954;

//  double result = (f*b)+(i%c) - (d*s);
//  System.out.println(result);


// int x = 2, y = 5;
// int exp1 = (x * y/x);
// int exp2 = (x*(y/x));
// System.out.println(exp1);
// System.out.println(exp2);

// int x = 200,y = 50, z = 100;
// if(x > y && y > z){
//   System.out.println("hello");
// }
// if(z > y && z < x){
//   System.out.println("Java");
// }
// if((y+200) < x && (y+150) < z){
//   System.out.println("Hello Java");
// }

// int x , y , z;
// x = y = z = 2;
// x += y;
// y -= z;
// z /= (x+y);
// System.out.println(x+" "+ y + " "+z+" ");


// int x = 9, y = 12; 
// int a = 2, b = 4, c = 6; 
 
 
// int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y); 
 
 
// System.out.println(exp); 

// int x = 10, y = 5; 
 
// int exp1 = (y * (x / y + x / y)); 
// int exp2 = (y * x / y + y * x / y); 
 
// System.out.println(exp1); 
// System.out.println(exp2); 


// System.out.print("Enter Your number:");
// int a = sc.nextInt();

// if(a >= 0){
//   System.out.println(a + "is a positive number");
// }else{
//   System.out.println(a + "is a negative  number");
// }\

// System.out.print("Enter the temperature: ");
// double temp = sc.nextDouble();

// if(temp > 100){
//   System.out.println("I have a fever!");
// }else{
//   System.out.println("okay I am fine!");
// }

// System.out.print("Enter the day number(0-6): ");
// int day = sc.nextInt();

// switch (day) {
//   case 0:
//     System.out.println("Sunday!");
//     break;
//   case 1:
//     System.out.println("Monday!");
//    break;
//   case 2:
//     System.out.println("Tuesday!");
//   break;
//   case 3:
//     System.out.println("Wednesday!");
//   break;
//    case 4:
//     System.out.println("Thursday");
//    break;
//   case 5:
//     System.out.println("Friday!");
//   break;
//   case 6:
//     System.out.println("Saturday!");
//   break;
//   default:
//     System.out.println("Enter a valid number!");

// }
// int a = 63, b = 36; 
// boolean x = (a < b ) ? true : false; 
// int y = (a > b ) ? a : b; 

// System.out.print(x);
// System.out.print(y);

System.out.print("Enter the year: ");
int year = sc.nextInt();
if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
  System.out.println("Your year is a leap year!");
}else{
  System.out.println("your year is not a leap year!");
}

  }

 

 
}