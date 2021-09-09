import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main
{
    public static void main(String[] args) {
        ArrayList<String> Key = new ArrayList<String>();
        ArrayList<String> Count = new ArrayList<String>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/Input"))) {
            String s;
            while ((s = br.readLine()) != null) {
                String[] Values = s.split(" ");
                if (Values.length > 1) {
                    Key.add(Values[0]);
                    Count.add(Values[1]);
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        for (int i = 0; i < Key.size(); i++) {
            if (Integer.parseInt(Count.get(i)) == 1) {
                for (int j = i + 1; j < Key.size(); j++) {
                    if (Key.get(i).equals(Key.get(j))) {
                        if (Integer.parseInt(Count.get(j)) == 1) System.out.println("YES1");
                    }
                }
            }
        }
        for (int i = 0; i < Key.size(); i++) {
            if (Integer.parseInt(Count.get(i)) == -1) {
                for (int j = i + 1; j < Key.size(); j++) {
                    if (Key.get(i).equals(Key.get(j))) {
                        if (Integer.parseInt(Count.get(j)) == -1) System.out.println("YES");
                    }
                }
            }
        }
    }


}
