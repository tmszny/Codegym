package pl.codegym.task.task14.task1414;

/* 
MovieFactory
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            Movie movie = null;
            String key = reader.readLine();
            movie = MovieFactory.getMovie(key);


            if (!key.equals("cartoon") && !key.equals("thriller") && !key.equals("soapOpera")) {
                break;
            }

            System.out.println(movie.getClass().getSimpleName());
        }

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            // Tworzy obiekt SoapOpera dla klucza "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }else if (key.equals("cartoon")){
                movie = new Cartoon();
            }else if (key.equals("thriller")){
                movie = new Thriller();
            }

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie{
    }

    static class Thriller extends Movie{
    }
}
