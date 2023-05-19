import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        String FONTFILEPATH = "src/fonts.txt";

        ArrayList<String> fonts = FileReader.getStringData(FONTFILEPATH);

        FontGame.playGame(fonts);
    }
}
