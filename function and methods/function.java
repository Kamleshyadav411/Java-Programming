import java.util.*; // pacakge
// public class function{
//     public static void printHello(){
//         System.out.println("hello");
//         System.out.println("hello");
//         System.out.println("hello");
//         return;  // it is not necessary in void.
//     }
//     public static void main(String args[]){
//         printHello();   //function calling
//     }
// }




//Add of two num..
// public class function{
//     public static int add(int a, int b){  //parameters or formal parameter
//         int sum= a+b;
//         return sum;
//     }
//     public static void main(String args[]){
//     Scanner s= new Scanner(System.in);
//     int a=s.nextInt();
//     int b =s.nextInt();
//     int sum = add(a,b); // arguments or actual parameter.
//     System.out.println(sum);
//     }
// }



//Swapping program
// public class function{
//     public static void swap(int a ,int b){   //pass by value  it means it is a copy of main function
//        int temp=a;
//                 a=b;
//                 b=temp;

//                 System.out.println("a=" +a);
//                 System.out.println("b="+b);
//     }

//     public static void main(String args[]){
//         int a=5;
//         int b =19;
//         swap(a,b);
 //   }
//}
//Java always calls by value



//Product of two number..
// public class function{
//     public static int prd(int a, int b){
//         int prod=a*b;
//         return prod;
//     }

//     public static void main(String args[]){
//         int a =2;
//         int b =4;
//         int pr=prd(a,b);
//         System.out.println(pr);
//     }
// }



// //Binomial coeff.... program
// public class function{
//     public static int fact(int n){
//         int f=1;

//         for(int i=1; i<=n;i++){
//             f=f*i;
//         }
//         return f; // factorial of n
//     }

//     public static int binCoeff(int n,int r){
//         int fact_n=fact(n);
//         int fact_r=fact(r);
//         int fact_nmr= fact(n-r);

//         int binCoeff= fact_n/(fact_r*fact_nmr);
//         return binCoeff;
//     }

//     public static void main(String args[]){
//         System.out.println(binCoeff(5,2));
//     }
// }




//Function Overloading  means multiple function with the same name but different parameters.
//Function overloading using  parameters

// public class function{
//     public static int sum(int a, int b){
//         return a+b;
//     }
//     public static int sum(int a,int b,int c){
//         return a+b+c;
//     }

//     public static void main(String args[]){
//         System.out.println(sum(2,3));
//         System.out.println(sum(2,3,5));
//     }
// }






//Check if a number is prime or not..
// public class function{
//     public static boolean prime(int n){
//         boolean prime=true;
//         for(int i=2;i<=n-1; i++){
//             if(n%i==0){
//                 prime=false;
//                 break;
//             }
//         }
//         return prime;
//     }

//     public static void main(String args[]){
//        System.out.println(prime(6));
// }
// }





// //Second method...
// public class function{
//     public static boolean prime(int n){

//         //corner case
//         if(n ==2){
//             return true;
//         }

//         for(int i=2;i<=n-1; i++){
//             if(n%i==0){
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String args[]){
//        System.out.println(prime(6));
// }
// }






//third method...and optimized
// public class function{
//     public static boolean prime(int n){

//         //corner case
//         if(n ==2){
//             return true;
//         }
        
//         for(int i=2;i<=Math.sqrt(n); i++){
//             if(n%i==0){
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String args[]){
//        System.out.println(prime(5));
// }







//Print all primes in a range..

// public class function{
//     public static boolean prime(int n){
//         if(n==2){
//             return true;
//         }
//         for(int i=2;i<=Math.sqrt(n);i++){
//             if(n%i==0){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void prange(int n){
//         for(int i=2;i<=n;i++){
//             if(prime(i)){
//                 System.out.println(i);
//             }
//         }
//         System.out.println();
//     }

//     public static void main(String args[]){
//         prange(100);
//     }
// }








// //Binary to decimal conversion...
// // Dec= dec+(lastdigit*2 ki power )..

// public class function{
//     public static void bintodec(int binN){
//         int mynum = binN;
//         int pow=0;
//         int decNum=0;
//         while(binN>0){
//             int lastdigit = binN % 10;
//             decNum = decNum + (lastdigit* (int)Math.pow(2,pow));

//             pow++;
//             binN= binN/10;
//         }
//         System.out.println("decimal of"+ mynum + "=" + decNum);
//     }

//     public static void main(String args[]){
//         bintodec(101);
//     }

// }








// //Convert Decimal to binary...
// //bin= bin+rem*10 ki power place value.

// public class function{
//     public static void dectobin(int decNum){
//         int bin =0;
//         int pow=0;
//         while(decNum>0){
//             int rem = decNum%2;  //rem
//             bin =bin+rem*(int)Math.pow(10,pow);
//             pow++;
//             decNum = decNum/2; //used for further calc...quotient
           
//         }
//         System.out.println(bin);
//     }

//     public static void main(String args[]){
//         dectobin(11);
//     }
// }




//Palindrome program..
// public class function {
//     public static void pd(int n) {
//         int original = n;
//         int reverse = 0;
//         while (n != 0) {
//             int remainder = n % 10;
//             reverse = reverse * 10 + remainder;
//             n = n / 10;
//         }
//         if (original == reverse) {
//             System.out.println("true");
//         } else {
//             System.out.println("false");
//         }
//     }

//     public static void main(String args[]) {
//         pd(121);  // should print true
//     }
// }






//sum of digits..
public class function{
    public static int sumN(int n){
        int sum=0;
        while(n>0){
            int ld= n%10;
            sum+=ld;
            n =n/10;
        }
        return sum;
    }


    public static void main(String args[]){
        System.out.println(sumN(123));
    }
}