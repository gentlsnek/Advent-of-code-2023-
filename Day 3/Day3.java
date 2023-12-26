import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ClearShit{
    
    void clear1(String s){
        ClearShit cl = new ClearShit();
        int l = 0;
       
        //char result = '.';
        for(int i = 0; i < s.length(); i++){
           
            if(s.charAt(i) != '.'){
                System.out.println("loop went here");
               /*  if(s.charAt(i) == ''|| s.charAt(i) == '@'||s.charAt(i) == '#'|| s.charAt(i) == '$'||
                 s.charAt(i) == '%'|| s.charAt(i) == '^'|| s.charAt(i) == '&'|| s.charAt(i) == '*'|| s.charAt(i) == '-' )
                {*/
                   if(s.charAt(i + 1) == 1|| s.charAt(i + 1) == 2|| s.charAt(i + 1) == 3|| 
                   s.charAt(i + 1) == 4|| s.charAt(i + 1) == 5|| s.charAt(i + 1) == 6|| s.charAt(i + 1) == 7||s.charAt(i + 1) == 8||s.charAt(i + 1) == 9){
                    System.out.println("loop is here now");
                     Matcher m1 = Pattern.compile("\\d++").matcher(s);
                      m1.find();
                      l = Integer.valueOf(m1.group());
                      System.out.println("l Is being printed " + l);                 
                     }
                }
           }
        }
        //return l;
    }
//}


public class Day3 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        ClearShit clear = new ClearShit();
        BufferedReader b1 = new BufferedReader(new FileReader("C:\\Users\\erwin\\OneDrive\\Documents\\GitHub\\Advent-of-code-2023-\\Day 3\\testcase3.txt"));
        ArrayList <String> newShit = new ArrayList<>();
        ArrayList<Integer> L1 = new ArrayList<>();
        //System.out.println(b1.readLine());
      //  String newShit = b1.toString();

      while(b1.ready()){
        newShit.add(b1.readLine());
      }

    for(int i = 0; i < newShit.size() + 1; i++){
        clear.clear1(newShit.get(i));
     // L1.add((clear.clear1(newShit.get(i))));
    }
     
    int sum = 0;
  //  for(int i = 0; i <  L1.size(); i++){
 //       System.out.println(L1.get(i));
   // }
    //System.out.println(sum);
    }
    
}
