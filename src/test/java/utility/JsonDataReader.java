package utility;

import io.cucumber.core.internal.com.fasterxml.jackson.core.type.TypeReference;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class JsonDataReader {

    public static Map<String, String> readTestData(String filePath) {

        try {

            ObjectMapper objectMapper = new ObjectMapper();

            File file = new File(filePath);

            Map<String, String> testData = objectMapper.readValue(file, new TypeReference<Map<String, String>>() {});

            return testData;

        } catch (IOException e) {

            e.printStackTrace();

            return null;

        }

    }

}
