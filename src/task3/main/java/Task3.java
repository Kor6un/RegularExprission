import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        String temp;

        try {
            FileReader fileReader = new FileReader("src/task3/main/resources/task3.txt");
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

        StringBuffer sentences = new StringBuffer();
        for (int i = 0; i < strings.size(); i++) {
             sentences.append(strings.get(i));
        }

        Pattern pattern = Pattern.compile("[A-ZА-Я][^.?!]+[.?!]");
        Matcher matcher = pattern.matcher(sentences);

        StringBuffer stringBuffer = new StringBuffer();

        while (matcher.find()) {
            stringBuffer.append(matcher.group() + " ");
        }

        System.out.println(stringBuffer.reverse());
    }
}
