import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

class breaker{
    int Arrayfill(String s){
    Matcher m1 = Pattern.compile("\\d").matcher(s);
    m1.find();
    return Integer.valueOf(m1.group());
    }

    String delGroup(String s){
        String newString = s.substring(s.indexOf((":")));
        return newString;
    }

}

public class Day2{
    /**
     * @param args
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException{
        breaker  Break = new breaker();
        
        BufferedReader b1 = new BufferedReader(new FileReader("C:\\Users\\erwin\\OneDrive\\Documents\\GitHub\\Advent-of-code-2023-\\Day 2\\testCase2.txt"));
        ArrayList<String> test = new ArrayList<>();
        ArrayList<Integer> devidedTest = new ArrayList<>();

        StringTokenizer t1;

        int[][][] testCases = new int[100000][][];

        for(int i = 0; i < 100 ; i++){
            test.add(Break.delGroup(b1.readLine()));
           // System.out.println(test.get(i));
       }
      int k = 0;
       for(int i = 0; i < 100; i++){
        t1 = new StringTokenizer(test.get(i), ";");
        devidedTest.add((Break.Arrayfill((t1.nextToken(".")))));
        //for(int j = 0; j < t1.countTokens(); j++){
         //  while(t1.hasMoreTokens()){
        //    testCases[i][j][k] = devidedTest
        //   }
        }
        for(int i = 0; i < 100 ; i++){
      System.out.println(i + " " + devidedTest.get(10));
       }
        

    }
        

    }

