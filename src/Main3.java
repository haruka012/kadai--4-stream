import java.time.LocalDate;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {

        Disney pooh = new Disney("Pooh", LocalDate.of(1921,8,21));
        Disney piglet = new Disney("Piglet", LocalDate.of(1968,12,20));
        Disney tigger = new Disney("Tigger", LocalDate.of(1968,12,20));
        Disney eeyore = new Disney("Eeyore", LocalDate.of(1966,2,4));
        Disney rabbit = new Disney("Rabbit",LocalDate.of(1996,2,4));

        List<Disney> disneyList = List.of(pooh, piglet, tigger, eeyore,rabbit);

        List<Disney> filteredDisneyCharacter = disneyList.stream().filter(disneyCharacter -> disneyCharacter.getName().contains("P")).toList();
        System.out.println(filteredDisneyCharacter);

        for (Disney disneycharacter : filteredDisneyCharacter) {    //拡張for文　　→　　for (データ型　変数名：コレクション){}
            System.out.println(disneycharacter);                    //DisneyクラスのインスタンスであるdisneyCharacterを出力している。
        }

        for (Disney disneyCharacter : filteredDisneyCharacter) {
            System.out.println(disneyCharacter.getName() + "の");   //DisneyクラスのインスタンスdisneyCharacterの.getNameでnameを取得した結果を出力している。
            System.out.println("お誕生日は" + disneyCharacter.getBirthday() + "です。");
        }
    }
}
