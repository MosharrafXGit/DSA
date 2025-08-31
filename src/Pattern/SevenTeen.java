package Pattern;

public class SevenTeen {

	static void print(int n)
    {
        for(int i=0;i<n;i++)
        {
            //space
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            
            //print
            char ch='A';
            int bp = (2*i+1)/2;
            for(int j=1;j<=2*i+1;j++)
            {
                System.out.print(ch);
                if(j<=bp)
                {
                    ch++;
                }
                else
                {
                    ch--;
                }
                    
            }    
            //space
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        
        SevenTeen.print(5);

    }
}
