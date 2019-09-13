
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Chapter12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rank = 0;
        String result = "";
        Map<String, Integer> boyNames = new HashMap<>();
        Map<String, Integer> girlNames = new HashMap<>();

        System.out.print("Enter year between 2001 and 2010: ");
        String year = input.nextLine().trim();
        if (Integer.parseInt(year)<2001 || Integer.parseInt(year) > 2010){
            throw new IllegalArgumentException("Year");
        }

        System.out.print("Enter gender (M or F): ");
        String gender = input.nextLine().trim().toUpperCase();
        if (gender.matches("M|F") == false){
            throw new IllegalArgumentException("Year");
        }

        System.out.print("Enter name: ");
        String name = input.nextLine().trim();

        String fileName = String.format("resources/babynamesranking%s.txt", year);

        try {
            File f = new File(fileName);
            BufferedReader b = new BufferedReader(new FileReader(f));

            while (b.readLine() != null) {
                String[] row = b.readLine().split("\t");

                String boyName = row[1];
                int boyRank = Integer.parseInt(row[0].trim().replaceAll(",", ""));
                boyNames.put(boyName, boyRank);

                String girlName = row[3].trim();
                int girlRank = Integer.parseInt(row[4].trim().replaceAll(",", ""));
                girlNames.put(girlName, girlRank );
            }

            if (gender.equals("M") & boyNames.containsKey(name) ){
                rank = boyNames.get(name);
                result = String.format("%1$s is ranked #%2$s in year %3$s", name, rank, year);

            } else if (girlNames.containsKey(name)){
                rank = girlNames.get(name);
                result = String.format("%1$s is ranked #%2$s in year %3$s", name, rank, year);

            } else{
                result = String.format("The name %1$s is not ranked in year %2$s", name, year);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(result);
    }
}