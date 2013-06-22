/**
 *
 * @author Ashish Namdev 
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Diff_by_K {
    
    int n,k,diff;
    String in[];

    public Diff_by_K()
    {
        this.n=0;
        this.k=0;
        this.diff=0;
        this.in=null;
    }

    public Diff_by_K(int n, int k, int diff, String[] in) {
        this.n = n;
        this.k = k;
        this.diff = diff;
        this.in = in;
    }
    public void setN(int n)
    {
        this.n=n;
    }
    public void setK(int k)
    {
        this.k=k;
    }
    
    public void setIn(String[] in)
    {
        this.in=in;
    }
    
    public int findSetOfDiff()
    {
        for(int i=0;i<in.length;i++)
        {
            for(int j=i+1;j<in.length;j++)
            {
                if(Math.abs(Integer.parseInt(in[i])-Integer.parseInt(in[j]))==k)
                    this.diff++;
            }
        }
        return diff;
    }  
    

    
    public static void main(String[] args) {
        /*String str = null;      
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        */
        String str=null;
        Diff_by_K dfk=new Diff_by_K();
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        try
        {
            str=br.readLine();
        }
        catch(IOException ex)
        {
            System.out.println("IO Exception" +ex.getMessage());
        }
        
        String tmp[]=str.split(" ");
        dfk.setIn(tmp);    
        dfk.setN(Integer.parseInt(tmp[0]));
        dfk.setK(Integer.parseInt(tmp[1]));
        System.out.println(dfk.findSetOfDiff());    
        
        /*
        try {
            str=br.readLine();
        } catch (IOException ex) {
            System.out.println("IO Exception :"+ex.getMessage());
        }
        String in []=str.split(" ");
        n=Integer.parseInt(in[0]);
        k=Integer.parseInt(in[1]);
        
        System.out.println("n is :"+n);
        System.out.println("k is :"+k);
        
        /*
        for (int i = 0; i < n; i++) {
            System.out.print(set[i]);
        }
        
        for(int i=2;i<in.length;i++)
        {
            for(int j=i+1;j<in.length;j++)
            {
               if(Math.abs(Integer.parseInt(in[i])-Integer.parseInt(in[j]))==k)                 
                    diff++;
            }
        }
        System.out.println("set of diff by "+k+ " is :" +diff);
        */
    }
}
