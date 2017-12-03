import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        String temp;
        try {
            FileReader fileReader =
                    new FileReader("src/task5/main/resources/task5.txt");
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            while ( (temp = bufferedReader.readLine()) != null ) {
                strings.add(temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        StringBuffer text = new StringBuffer();
        for (int i = 0; i < strings.size(); i++) {
            text.append(strings.get(i) + " ");
        }

        Pattern pattern = Pattern.compile("\\+\\d{3}\\(\\d{2}\\)\\d{3}\\-\\d{2}\\-\\d{2}");

        Matcher matcher = pattern.matcher(text);
        List<String> phoneNumbers = new ArrayList<>();
        while ( matcher.find() ) {
            phoneNumbers.add(matcher.group());
        }
        System.out.println("Не сортированные: " + phoneNumbers);
        phoneNumbers.sort(String::compareTo);
        System.out.println("Сортированные: " + phoneNumbers);
    }
}
