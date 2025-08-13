// public class basic{ //class name should be same as file name
//     public static void main(String args[]){
//         // System.out.print("Hello World!\n"); //  \n is also used for next line
        // System.out.println("Hello World!");
        // System.out.println("Hello World!");  // ln used for next line
        // System.out.print("Hello World!");



        // int a=10;
        // int b =5;
        // System.out.print(a);
        // String name="kamlesh";
        // System.out.print(name);
        // byte c =8;
        // System.out.print(c);
        // float price=1.5f;
        // System.out.print(price );
        // char k ='k';
        // System.out.print(k);



        //Sum of a and b...
//         int a=5;
//         int b=30;
//         int sum=a+b;
//         System.out.print(sum);

//     }
// }




//User input java..

import java.util.*; // package

// public class basic{
//     public static void main(String args[]){
//         Scanner s= new Scanner(System.in);
//         // String input= s.next();
//         // System.out.println(input);

//         String name= s.nextLine();
//         System.out.println(name);

//     }
// }

//Sum of two number...

// public class basic{
//     public static void main(String args[]){
//         Scanner s = new Scanner(System.in);
//         int a= s.nextInt();
//         int b =s.nextInt();
//         int sum= a+b;
//         int prd=a*b;
//         System.out.println(sum);
//         System.out.println(prd);
//     }
// }



//Type conversion...

// public class basic{
//     public static void main(String args[]){
//         // int a=5;
//         // int b=a;

//         long d=8;
//         int l=d;
//         System.out.println(l);
//     }
// }



// Type casting... or Narrowing conversion or explicit conversion
// public class basic{
//     public static void main(String args[]){
//         Scanner s= new Scanner(System.in);
//         float a=25.999999f;
//         int b =(int) a;
//         System.out.println(b);
//     }
// }



// public class basic{
//     public static void main(String args[]){
//         char ch='a'; // every char has a unique number..
//         char ch2='b';
//         int number=ch;
//         int number2=ch2;
//         System.out.println(number);
//         System.out.print(number2);
//     }
// }




// public class basic{
//     public static void main(String args[]){
//         char a='a';
//         char b='b';
//         System.out.println((int)(b));
//         System.out.println((int)(a));
//         System.out.println(b-a); // Type promotion.
//     }
// }




// public class basic{
//     public static void main(String args[]){
//         short a=5;
//         byte b= 25;
//         char c='c';
//         byte bt=(byte)(a+b+c);
//         System.out.print(bt);
//     }
// }



// public class basic{
//     public static void main(String args[]){
//         byte b=5;
//         byte a=(byte)(b*2); // type casting
//         System.out.println(a);
//     }
// }



//Assign opr..
// public class basic{
//         public static void main(String args[]){
//                 int b=5;
//                 b += 5;
//                 System.out.println(b);
//         }
// }




//Print the largest of 2...
// public class basic{
//         public static void main(String args[]){
//                 Scanner s= new Scanner(System.in);
//                 int a = s.nextInt();
//                 int b = s.nextInt();
//                 if(a>=b){
//                         System.out.println(a);
//                 }else{
//                       System.out.println(b);
//                        }       
//         }
// }




//Print if a number is odd or even..
// public class basic{
//         public static void main(String args[]){
//                Scanner s= new Scanner(System.in);
//                int n = s.nextInt();
//                if(n%2==0){
//                 System.out.print("even");
//                }
//                else{
//                 System.out.print("odd");
//                }
//         }
// }





//Calculator program..
// public class basic{
//         public static void main(String args[]){
//                 Scanner s =new Scanner(System.in);
//                 System.out.println("enter a:");
//                 int a = s.nextInt();
//                 System.out.println("enter b:");
//                 int b = s.nextInt();
//                 System.out.println("enter opr:");
//                 char operator = s.next().charAt(0);

//                 switch (operator){
//                         case'+':System.out.println(a+b);
//                                    break;
//                         case'-': System.out.println(a-b);
//                                    break;
//                         case'*':System.out.println(a*b);
//                                    break;
//                         case'/': System.out.println(a/b);
//                                    break;
//                         case'%':System.out.println(a%b);
//                                    break;        
//                       default :System.out.println("wrong opr..");

//         }
// }
// }



//While loop

// public class basic{
//         public static void main(String args[]){
//                 int c =0;
//                 while(c <10){
//                         System.out.println("kamlesh yadav");
//                         c+=2;
//                 }
//         }
// }



//Print a sum of N natural number using while loop:-
// public class basic{
//         public static void main(String args[]){
//                 Scanner s = new Scanner(System.in);
//                 int n = s.nextInt();
//                 int sum=0;
//                 int i =1;
//                 while(i<=n){
//                         sum = sum+i;
//                         i++;
                        
                        
//                 }
//                 System.out.println(sum);
//         }
// }





// for loop..
// public class basic{
//       public static void main(String args[]){
//         Scanner s = new Scanner(System.in);
//              int n = s.nextInt();
//              int sum=0;
//              for(int i=1; i<=n;i++){
//                 sum=sum+i;
//                 System.out.println(sum);

//              }
//       } 
// }





//Print square pattern..
// public class basic{
//       public static void main(String args[]){
//         for(int i=1; i<=4; i++){
//                 System.out.println("****");
//         }
//       }
// }





//Print reverse of a number..

// public class basic{
//         public static void main(String args[]){
//                 int n = 12345;
//                 while(n>0){
//                         int ld = n%10;
//                         System.out.print(ld);
//                         n = n/10;
//                 }
//         }       
// }






//Reverse the given number...
// public class basic{
//         public static void main(String args[]){
//                 Scanner s = new Scanner(System.in);
//                 int n = s.nextInt();
//                 int rev=0;
//                 while(n>0){
//                         int ld = n%10;
//                         rev=(rev*10)+ld;
//                         n=n/10;
                        
//                 }
//                 System.out.println(rev);
//         }
// }







// //print hello world using do while loop..
// public class basic{
//         public static void main(String args[]){
//                 int c=1;
//                 do{
//                         System.out.println("hello");
//                         c++;
                
//                 }while(c<=10);
//         }
// }





//Break...

// public class basic{
//         public static void main(String args[]){
//                 for(int i=1; i<=5; i++){
//                         if( i ==3){
//                              break;
//                         }
//                         System.out.println(i);
//                 }
//                System.out.println("out"); 
//         }
// }






//Check if a number is prime or not
// public class basic{
//         public static void main(String args[]){
//                 Scanner s= new Scanner(System.in);
//                 int n = s.nextInt();
//                 boolean isPrime = true;
//                 for(int i =2; i<=n-1;i++){
//                         if(n%i==0){
//                                 isPrime = false;
//                         }
//                 }
//                 if(isPrime){
//                         System.out.println("prime");
//                 }else{
//                         System.out.println("not prime");
//                 }
                


//         }
// }




// public class basic{
//         public static void main(String args[]){
//                 Scanner s= new Scanner(System.in);
//                 int n = s.nextInt();
//                 boolean isPrime = true;
//                 for(int i =2; i<=Math.sqrt(n);i++){ // very optimize way..
//                         if(n%i==0){
//                                 isPrime = false;
//                         }
//                 }
//                 if(isPrime){
//                         System.out.println("prime");
//                 }else{
//                         System.out.println("not prime");
//                 }
                


//         }
// }






//Write a program that reads a set of integers and then prints the sum of the even and odd int..
// public class basic{
//         public static void main(String args[]){
//                 int n;
//                 int choice;
//                 int even=0;
//                 int odd=0;
//                 do{
//                         System.out.print("enter your number");
//                         Scanner s= new Scanner(System.in);
//                         n = s.nextInt();
//                         if(n%2==0){
//                                 even+=n;
//                         }else{
//                                 odd+= n;
//                         }
//                         System.out.print("Do you want to continue? Press 1 for yes or 0 for no");
//                         choice= s.nextInt();
//                 }while(choice==1);
//                 System.out.println(even);
//                 System.out.println(odd);

               
//         }
                

// }






//Write a program to find the factorial of any number entered by user
// public class basic{
//         public static void main(String args[]){
//                 Scanner s = new Scanner(System.in);
//                 int n = s.nextInt();
//                 int fact=1;
//                 for(int f=1;f<=n;f++){
//                         fact*=f;
//                         System.out.println(fact);

//                 }
//         }
// }





//Write a program to print the multipilcation table of a number N, enterned by the user.
// public class basic{
//         public static void main(String args[]){
//                 Scanner s = new Scanner(System.in);
//                 int n = s.nextInt();
//                 int fact=1;
//                 for(int f=1;f<=10;f++){
//                         fact=f*n;
//                         System.out.println(fact);
//                 }
//         }
// }




//Pattern printing..

// public class basic{
//         public static void main(String args[]){
//                 for(int l =1; l<=5; l++){
//                         for( int s=1;s<=l;s++){
//                                 System.out.print("*");
//                         }
//                         System.out.println();
//                 }
//         }
// }



//Print inverted star..
// public class basic{
//         public static void main(String args[]){
//                 for(int i=1;i<=4;i++){
//                         for(int s=1;s<=(4-i+1);s++){
//                                 System.out.print("*");
//                         }
//                         System.out.println();
//                 }
//         }
// }




//Print half pyramid pattern..
// public class basic{
//         public static void main(String args[]){
//                 for(int i=1;i<=4;i++){
//                         for(int j=1;j<=i;j++){
//                                 System.out.print(j);
//                         }
//                         System.out.println();
//                 }
//         }
// }




//Print character ..
// public class basic{
//         public static void main(String args[]){
//                 int n = 4;
//                 char ch ='A';

//                 for(int line=1; line<=n;line++){
//                         for(int chars=1;chars<=line; chars++){
//                                 System.out.print(ch);
//                                 ch++;
//                         }
//                         System.out.println();
//                 }
//         }
// }


//Swapping program
public class basic{
        public static void main(String args[]){
                int a=5;
                int b =10;

                int temp=a;
                a=b;
                b=temp;

                System.out.println("a=" +a);
                System.out.println("b=" +b);
        }
}