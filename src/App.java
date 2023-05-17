import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        String FONTFILEPATH = "/C:/Users/buddy/Desktop/font-game(1)/src/fonts.txt";

        ArrayList<String> fonts = FileReader.getStringData(FONTFILEPATH);

        FontGame.playGame(fonts);
    }
}
