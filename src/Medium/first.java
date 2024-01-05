package Medium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class first {
        public static void main(String[] args) {
                List<String> inputList = List.of("car", "book", "string");

                String result = inputList.stream()
                        .map(String::toUpperCase)
                        .collect(Collectors.joining(", "));

                System.out.println(result);
        }
}

