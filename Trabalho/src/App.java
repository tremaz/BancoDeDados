import java.util.*;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Hashtable<Int, String> table = new Hashtable<>();

        BufferedReader br = new BufferedReader(new FileReader("words.txt"));

        while ((line = br.readLine()) != null) 
        {
            System.out.print(line);
        }
    }
}
