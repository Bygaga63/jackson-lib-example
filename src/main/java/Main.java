import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Student;
import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args){
        try {
            ObjectMapper mapper = new ObjectMapper();
            List<Student> theStudents = mapper.readValue(new File("data/sample-full.json"), new TypeReference <List<Student>>(){});
            Student theStudent = mapper.readValue(new File("data/sample-lite.json"), Student.class);
            System.out.println(theStudents);
            System.out.println(theStudent);
        }catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
