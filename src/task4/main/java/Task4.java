import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        String temp;

        try {
            FileReader fileReader = new FileReader
                    ("src/task4/main/resources/task4.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((temp = bufferedReader.readLine()) != null) {
                strings.add(temp);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        StringBuffer text = new StringBuffer();
        for (int i = 0; i < strings.size(); i++) {
            text.append(strings.get(i) + " ");
        }

        List<String> directOration = new ArrayList<>();
        Pattern pattern = Pattern.compile("[\"][^\"]+[\"]");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            directOration.add(matcher.group());
        }
        for (int i = 0; i < directOration.size(); i++) {
            System.out.println((i + 1) + ") " + directOration.get(i));
        }

    }
}
