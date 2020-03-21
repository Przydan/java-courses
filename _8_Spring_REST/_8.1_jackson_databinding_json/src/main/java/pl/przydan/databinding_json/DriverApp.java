package pl.przydan.databinding_json;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.przydan.databinding_json.model.Student;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.logging.Logger;

public class DriverApp {

    private static final Logger LOG = Logger.getLogger(DriverApp.class.getName());

    public static void main(String[] args) {

        try {
            // create object mapper
            ObjectMapper mapper = new ObjectMapper();

            // read JSON file and map/convert to Java POJO:
            // data/sample-lite.json
            Path path = Paths.get("C:\\$SDA\\IntelllyJ_projects\\#MyProjects\\Nowy folder\\spring_demo_one\\_8_Spring_REST\\_8.1_jackson_databinding_json\\data\\sample-full.json");

            Student student =
                    mapper.readValue(path.toFile(), Student.class);

            // print first name and last name
            LOG.info("==--> First name: " + student.getFirstName());
            LOG.info("==--> Last name: " + student.getLastName());
            LOG.info("==--> Address: " + student.getAddress());
            LOG.info("==--> Languages: " + Arrays.toString(student.getLanguages()));

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
