import java.util.ArrayList;

public class SpecialCharacters {
    public static void main(String[] args) {
        String string = "#Jyoti  @prajapati, @ !";
        string= string.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(string);

    }


    }
//32–47 / 58–64 / 91–96 / 123–126