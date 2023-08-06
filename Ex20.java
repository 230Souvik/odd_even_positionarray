
package ex20;

import java.util.*;


public class Ex20 {

  public void evenodd(int a[],int l){
//int l=a.length();
int e=0;
int o=0;
if(l%2==0){
     e=(l/2)-1;
    o=(l/2)-1;
}
else{
    e=(l/2);
     o=(l/2)-1;
}
int even[]=new int[e];
int odd[]=new int[o];
even[0]=a[0];
odd[0]=a[1];
for(int i=2;i<l;i++){
    if(i%2==0){
        for(int j=1;j<e;j++){
        even[j]=a[i];
        }
    }
    else{
        for(int j=1;j<o;j++){
        odd[j]=a[i];
        }
    }
}


System.out.println("even position element");
for(int j=0;j<e;j++){
    System.out.println(even[j]);
}


Arrays.sort(even);
Arrays.sort(odd);
Arrays.sort(a);
System.out.printf("even position element %s",Arrays.toString(even));
System.out.printf("odd position element %s",Arrays.toString(odd));
//System.out.println("even position element");
//for(int j=0;j<e;j++){
//    System.out.println(even[j]);
//}
//System.out.println("odd position element");
//for(int j=0;j<o;j++){
//    System.out.println(odd[j]);
//}
System.out.println("2nd largest element"+a[l-2]);
}
  
    public static void main(String[] args) {
        // TODO code application logic here
        Ex20 e=new Ex20();
        Scanner sc = new Scanner (System.in);
     
        System.out.println("size of array");
           int n = sc.nextInt ();
        int a[]= new int[n];
        System.out.println("element of array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        e.evenodd(a,n);
    }
    
}
