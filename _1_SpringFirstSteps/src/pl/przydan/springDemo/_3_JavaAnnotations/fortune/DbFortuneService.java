package pl.przydan.springDemo._3_JavaAnnotations.fortune;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class DbFortuneService implements FortuneService {

    private final List<String> LIST = listOfReadiedFortunesFromFile();

    @Override
    public String getFortune() {
        return LIST.get(new Random().nextInt(LIST.size()));
    }

    private List<String> listOfReadiedFortunesFromFile() {
        System.out.println(">> LOG ");
        var fortunes = new ArrayList<String>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(getFileName()))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                fortunes.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fortunes;
    }

    private static String getFileName() {
        return "C:\\$SDA\\IntelllyJ_projects\\#MyProjects\\spring_demo_one\\src\\pl\\przydan\\springDemo\\_3_JavaAnnotations\\fortune\\fortunes.txt";
    }

}
