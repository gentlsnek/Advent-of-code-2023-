import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
   

    class Matchertry {
        int result;
    int hopeThisWorks(String s) throws IOException, NumberFormatException{
    Matcher m1 = Pattern.compile("\\d").matcher(s);
    m1.find();
    return Integer.valueOf(m1.group());
    }
    
    String ConvertShit(String s){
        String toReturn;
          toReturn = s.replace("one","o1e").replace("two","t2o")
                                .replace("three","thr3e").replace("four","fo4r")
                                .replace("five","fi5e").replace("six","s6x")
                                .replace("seven","se7en").replace("eight","eig8t")
                                .replace("nine","ni9e");
            return toReturn;
    }
}

public class fileIO {
   
    public static void main(String[] args) throws IOException, NumberFormatException{
    Matchertry mA = new Matchertry();
    StringBuilder b1 = new StringBuilder();
     int[] Array1 = new int[1000];
     int[] Array2 = new int[1000];
     String[] bruhShit = new String[1000];
     int[] Array3 = new int[1000];

    
    BufferedReader r1 = new BufferedReader(new FileReader("testCase.txt"));
    ArrayList <String> testCase = new ArrayList <String>();
    //ArrayList<String> reversedTestCase = new ArrayList<String>();
    
    for(int i = 0; i < 1000 ; i++)
    {
    
      testCase.add(mA.ConvertShit(r1.readLine()));
      //System.out.println(testCase.get(i));
    }
    for(int i = 0; i < 1000 ; i++){
       //System.out.println(i);
     Array1[i] = mA.hopeThisWorks(testCase.get(i));
     //System.out.println(Array1[i]);
   }
    for(int i = 0; i < 1000; i++){
        b1.append(testCase.get(i));
        b1.reverse();
        Array2[i] = mA.hopeThisWorks(b1.toString());
       b1.setLength(0);
    
    }

    for(int i  = 0; i < 1000; i++){
       bruhShit[i] = Array1[i] + "" + Array2[i];
    Array3[i] = Integer.parseInt(bruhShit[i]);
        
  }

    int sum = 0;

   for(int i = 0; i < 1000 ; i++){
     //System.out.println(i + " " +Array3[i]);
      sum = sum  + Array3[i];
    }

    System.out.println(sum);
    r1.close();
    
    }
  }
