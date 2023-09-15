import java.time.LocalDate;

public class Disney{
    private String name;

    private LocalDate birthday;

    public Disney(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    public String getName(){ return name;}

    public LocalDate getBirthday() { return birthday;}
}
