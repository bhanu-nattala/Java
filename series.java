/*We use the integers a,b , and n  to create the following series:
(a+Math.pow(2,n-1)*b)
series=S0,S1,.....Sn-1 */

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
        int s=0;
        s=s+a;
        for(int j=0;j<n;j++){
           s+=(Math.pow(2,j))*b;
           System.out.print(s+" ");
          
        } 
       System.out.println("");
    }  
        in.close();
    }
}
