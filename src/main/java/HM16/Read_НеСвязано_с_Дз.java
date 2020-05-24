package HM16;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Map;

public class Read_НеСвязано_с_Дз {
    public static void main(String[] args) throws IOException {
//        Yaml yaml = new Yaml();
//        String yamlStr = ReadFromFile.readToString("src/main/java/Yaml/test.yaml");
//        System.out.println(yamlStr);
        Read_НеСвязано_с_Дз read = new Read_НеСвязано_с_Дз();
        read.yamlFileToMap();
    }
    public void yamlFileToMap() throws FileNotFoundException {
        Yaml yaml = new Yaml();
// Чтение файликов
        String path = "src/main/java/Yaml/test.yaml";
        Map<String, String> map = yaml.load(new FileInputStream(new File(path)));
        System.out.println("Name: "+map.get("name"));
        System.out.println(map);
    }
}