/**
 * Problem statement :
 * Given N numbers , [N<=10^5] we need to count the total pairs of numbers that have a difference of K. [K>0 and K<1e9]

Input Format:
1st line contains N & K (integers).
2nd line contains N numbers of the set. All the N numbers are assured to be distinct.
Output Format:
One integer saying the no of pairs of numbers that have a diff K.

Sample Input #00:
5 2
1 5 3 4 2

Sample Output #00:
3
 *
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
    
    public void getDiff()
    {
        return diff;
    }
    public void findSetOfDiff()
    {
        for(int i=0;i<in.length;i++)
        {
            for(int j=i+1;j<in.length;j++)
            {
                if(Math.abs(Integer.parseInt(in[i])-Integer.parseInt(in[j]))==k)
                    this.diff++;
            }
        }
        
    }  
    

    
    public static void main(String[] args) 
    {
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
        dfk.findSetOfDiff();
        System.out.println(dfk.getDiff());    
        
    }
}
