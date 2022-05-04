
import java.util.*;

public class WordScrambler 
{

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        WordScrambler wordScrambler = new WordScrambler();
        wordScrambler.scrambler(sentence);

    }
    public void scrambler(String sentence) 
    {
        String[] word = sentence.trim().split(" ");

        for(int x=0;x<word.length;x++)
        {
                String a=word[x];

                if((x%2==0) && (a.length()>3))
                {
                    char tempArray[] = a.toCharArray();
                    int n=tempArray.length;
                    String firstLetter= Character.toString(tempArray[0]);
                    String secondLetter=Character.toString(tempArray[n-1]);

                    // Sorting temp array using
                    Arrays.sort(tempArray,1,n-1);
                    // Returning new sorted string
                    String s=new String(tempArray);
                    String s2=s.substring(1,(s.length()-1));
                    char sub[] = s2.toCharArray();
                    String b=reverse(sub);
                    System.out.print(firstLetter+b+secondLetter+" ");
                    
                }
                else if((x%2==1) && (a.length()>3))
                {
                    char tempArray[] = a.toCharArray();
                    int n=tempArray.length;
                    // Sorting temp array using
                    Arrays.sort(tempArray,1,n-1);
 
                    // Returning new sorted string
                    System.out.print( new String(tempArray)+ " ");
                }  
                else{
                    System.out.print(a+" ");
                }         
        }

    }
    public String reverse(char[] a)
    {
        int i, n = a.length;
        char t;
        for (i = 0; i < n / 2; i++)
        {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
        return new String(a);
    }

}