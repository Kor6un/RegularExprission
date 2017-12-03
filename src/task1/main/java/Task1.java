import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        String temp;
        try {
            FileReader fileReader = new FileReader("src/task1/main/resources/task1.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((temp = bufferedReader.readLine()) != null) {
                strings.add(temp);
            }

            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Pattern pattern = Pattern.compile("\\d+");

        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < strings.size(); i++) {
            Matcher matcher = pattern.matcher(strings.get(i));
            while (matcher.find()) {
                nums.add(Integer.parseInt(matcher.group()));
            }
        }

        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }

        System.out.println("Сумма: " + sum);
    }
}
