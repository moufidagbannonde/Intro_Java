// import java.util.* ;
// public class exo4 {

//     public static void main(String[] args){
//     int a = 10;
//     int b = 11;
//     int c = 12;
//     int d = 13;
//     int e = 14;
//           int[] tab = {
//             a, b, c, d, e
//         };
//         for(int i = 0; i <= tab.length; i++){
//             int result = Integer.MAX_VALUE;

//             int result = Math.max(tab[i]);
//             System.out.println(result);
//             System.out.println(tab[i]);
//         }
//     }  
// }

import java.util.*;
public class exo4
{
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=Sc.nextInt();
		System.out.println("Enter the value of Array: ");
		int a[]=new int[n];
		int i;
		for(i=0;i<n;i++){
		    a[i]=Sc.nextInt();
		}
		int max=a[0];
		for(i=1;i<n;i++){
		    if(a[i]>max)
		    max=a[i];
		}
		System.out.println(max);
	}
}