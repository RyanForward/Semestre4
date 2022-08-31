import Models.Game;
import Models.Platform;
import utils.Csvutils;
import Services.GameService;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {

        List<Game> allGamesList = Csvutils.readGameCsv(Path.get(first "vendas-games.csv"));

        GameService.getListByPlatform(allGamesList, Platform);

        System.out.println(allGamesList.size());


    }

}
