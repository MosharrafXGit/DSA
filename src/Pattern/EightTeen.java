package Pattern;

public class EightTeen {
	static void print(int n)
    {
        
        for(int i=0;i<n;i++)
        {
            for(char ch=(char)('E'-i); ch<='E';ch++)
            {
                System.out.print(ch);
            }
            
            System.out.println();
        }
       
    }
    
    public static void main(String[] args) {
        
    	EightTeen.print(5);
    	
    }

}
