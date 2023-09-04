import java.util.List;

public class Main2 {
    public static void main(String[] args){
        List<String> names = List.of("chip","dale","pluto");
        List<String> sortedResult = names.stream().sorted().toList();
        System.out.println(sortedResult);

        List<String> result = names.stream().filter(name -> name.contains("c")).toList();
        System.out.println(result);

        List<String> result2 = names.stream().map(String::toUpperCase).toList();
        System.out.println(result2);

    }
}
