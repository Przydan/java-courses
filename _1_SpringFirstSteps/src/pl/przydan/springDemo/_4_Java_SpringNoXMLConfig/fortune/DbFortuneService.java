package pl.przydan.springDemo._4_Java_SpringNoXMLConfig.fortune;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class DbFortuneService implements FortuneService {

    private final List<String> readiedListOfFortunesFromFile = prepareListOfFortunesFromFile();

    private static String getFileName() {
        return "C:\\$SDA\\IntelllyJ_projects\\#MyProjects\\spring_demo_one\\src\\pl\\przydan\\springDemo\\_4_Java_SpringNoXMLConfig\\fortune\\fortunes.txt";
    }

    @Override
    public String getFortune() {
        System.out.println(">> method: random fortunes from file");
        return readiedListOfFortunesFromFile.get(new Random().nextInt(readiedListOfFortunesFromFile.size()));
    }

    private List<String> prepareListOfFortunesFromFile() {
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

}
