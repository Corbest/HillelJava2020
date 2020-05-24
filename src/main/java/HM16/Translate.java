package HM16;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Translate {
    public static void main(String[] args) throws IOException {
        toJson();
        toYaml();
    }

    public static void toJson() throws IOException {
        //создаем обьект и присваиваем ему значение мапы файла yaml
        Object json = new YAMLMapper().readValue(new FileReader("src\\main\\java\\Yaml\\test.yaml"), Object.class);

        //создаем обьект и присваиваем ему значение мапы файла yaml
        new JsonMapper().writerWithDefaultPrettyPrinter().writeValue(new File("src\\main\\java\\Yaml\\test.json"), json);
    }

    public static void toYaml() throws IOException {
        //создаем json node и присваиваем ей значение мапы файла yaml
        JsonNode jsNode = new JsonMapper().readTree(new FileReader("src\\main\\java\\Yaml\\test.json"));

        //текстовой переменной присваиваем значение мапы json node
        String yaml = new YAMLMapper().writeValueAsString(jsNode);

        //Записываем в файл полученое значение текстовой переменной
        FileWriter writer = new FileWriter("src\\main\\java\\Yaml\\test№2.yaml");
        writer.write((yaml).replaceAll("\"",""));
        writer.flush();
    }
}
//Мне помогали))

