//Print a hollow rectangle...

// public class Pattern{
//     public static void hollow_rec(int totalr, int totalc){
//         //outer loop
//         for(int i=1; i<=totalr; i++){
//             //inner loop
//             for(int j=1;j<=totalc;j++){
//                 // boundery conditions
//                 if( i== 1 || i == totalr || j == 1 ||j == totalc){
//                     System.out.print("*");
//                 } else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         hollow_rec(4,5);
//     }
// }











//Print inverted and rotated half pyramid..
// public class Pattern{
//     public static void IRP(int n){
//         for(int i=1;i<=n;i++){
//             //spaces
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             //stars
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String args[]){
//         IRP(4);
//     }
// }









//Print inverted half pyramid with numbers
// public class Pattern{
//     public static void IPN(int n){
//         for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i+1;j++){
//             System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         IPN(9);
//     }
// }









//Print floyd tringle..
// public class Pattern{
//     public static void floyd(int n){
//         int counter=1;
//         //outer loop
//         for(int i=1;i<=n;i++){
//             //inner loop how many times will counter be printed
//             for(int j=1;j<=i;j++){
//                 System.out.print(counter+" ");
//                 counter++;
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         floyd(5);
//     }
// }









//0-1 Triangle...
// public class Pattern{
//     public static void ZT(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1; j<=i; j++){
//                 if((i+j) %2 ==0){  // even
//                 System.out.print("1");
//                 }else{
//                     System.out.print("0");
//                 }
//             }System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         ZT(5);
//     }
// }












//Butterfly pattern
// public class Pattern{
//     public static void butterfly(int n){
//         //1st half
//         for(int i=1;i<=n;i++){
//             //stars  i
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             //spaces  2*(n-i)
//             for(int j=1;j<=2*(n-i);j++){
//                 System.out.print(" ");
//             }
//             //stars
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         //2nd half
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             //spaces  2*(n-i)
//             for(int j=1;j<=2*(n-i);j++){
//                 System.out.print(" ");
//             }
//             //stars
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         butterfly(4);
//     }
// }












//Solid Rhombus..
// public class Pattern{
//     public static void sr(int n){
//         for(int i=1;i<=n;i++){
//             //spaces
//             for(int j=1;j<=(n-i);j++){
//                 System.out.print(" ");
//             }
//             //stars
//             for(int j=1;j<=n;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         sr(7);
//     }
// }













//Hollow rhombus..
// public class Pattern{
//     public static void hr(int n){
//         for(int i=1;i<=n;i++){
//             //spaces
//             for(int j=1;j<=(n-i);j++){
//                 System.out.print(" ");
//             }
//             //Hollow
//             for(int j=1;j<=n;j++){
//                 if(i==1 || i==n ||j==1||j==n){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         hr(8);
//     }
    
// }










//Diamond Pattern
public class Pattern{
    public static void DP(int n){
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Second half
        for(int i=n; i>=1; i--){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        DP(4);
    }
}