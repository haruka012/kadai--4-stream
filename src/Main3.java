import java.util.List;

public class Main3 {
    public static void main(String[] args){

        Disney pooh = new Disney("Pooh",1921-8-21);
        Disney piglet = new Disney("Piglet",1968-12-20);
        Disney tigger = new Disney("Tigger",1968-12-20);
        Disney eeyore = new Disney("Eeyore",1966-2-4);

        List<Disney> disneyList = List.of(pooh,piglet,tigger,eeyore);

        List<Disney> names = disneyList.stream().filter( disneyCharacter -> disneyCharacter.toString().contains("p")).toList();
        System.out.println(names);

    }
}
