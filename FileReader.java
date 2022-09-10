import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileReader {
    /**
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("./file.txt");
        Scanner scan = new Scanner(file); 

        while(scan.hasNextLine()) {        
            String str = scan.nextLine();
            Pattern p = Pattern.compile("-?\\d+");
            Matcher m = p.matcher(str);

            while (m.find()) {
                if (Integer.parseInt(m.group()) >= 10) {
                    System.out.println(str);
                }
              }
        }
    }
}