
import java.util.Scanner;
public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
      int count=0;
     aa:
       for(int i=0;i<n;i++)
       {
         bb: 
           for(int j=i+1;j<n;j++)
            {
                if((ar[i]==ar[j])&&(ar[i]!=-1)&&(ar[j]!=-1))
                {
                    count++;
                    ar[j]=-1;
                    break bb;
                }
            }
         
        }
        return count;

    }

    

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        

        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            
            ar[i]=s.nextInt();
        }

        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
