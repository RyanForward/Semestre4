package utils;

import Models.Game;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.Reader;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Csvutils {

    public static List<Game> readGameCsv(Path csvFilePath){
        List<Game> gameList = new ArrayList<>();

        try{
            Reader reader = Files.newBufferedReader(csvFilePath);
            CsvToBean<Game> csvToBean = new CsvToBeanBuilder(reader);
                    .withType(Game.class)


        }
    }

}
