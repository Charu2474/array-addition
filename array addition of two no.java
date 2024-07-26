import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner u=new Scanner(System.in);
        int n=u.nextInt();
        int i=0,k=0;
        int x[]=new int[n];
        int y[]=new int[n];
        int z[]=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=u.nextInt();
        }
        for(i=0;i<n;i++)
        {
            y[i]=u.nextInt();
        }
        for(i=0;i<n;i++)
        {
            z[i]=x[i]+y[i];
        }
        for(k=0;k<n;k++)
        {
            System.out.print(z[k]+" ");
        }
        
    }
}
