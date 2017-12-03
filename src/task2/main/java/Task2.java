import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        String temp;

        try {
            FileReader fileReader = new FileReader
                    ("src/task2/main/resources/task2.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((temp = bufferedReader.readLine()) != null) {
                strings.add(temp);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("исходный: " + strings);
        Pattern pattern = Pattern.compile("\\b((([01]?[\\d]{1,2})|(2[0-4]\\d)|(25[0-5]))\\.){3}" +
                "(([01]?\\d\\d)|(2[0-4]\\d)|(25[0-5]))\\b");
        for (int i = 0; i < strings.size(); i++) {
            Matcher matcher = pattern.matcher(strings.get(i));
            System.out.println(matcher.replaceAll("[засекречено]"));

        }

    }
}
