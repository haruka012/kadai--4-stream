import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Map<String,String> disneyMap = new HashMap<>();
        disneyMap.put("Mickey","mouse");
        disneyMap.put("Minnie","mouse");
        disneyMap.put("Donald","duck");
        disneyMap.put("Daisy","duck");
        disneyMap.put("Goofy","dog");

        Stream<Map.Entry<String, String>> stream = disneyMap.entrySet().stream()
                .filter(entry -> entry.getValue().contentEquals("duck"));
        System.out.println(Arrays.toString(stream.toArray()));

    }
}