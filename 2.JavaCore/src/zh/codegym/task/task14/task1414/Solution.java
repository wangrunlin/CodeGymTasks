package zh.codegym.task.task14.task1414;

/* 
电影工厂
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {
        // 从控制台读取几个键（字符串）。项目 7
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        /*
            8.在 Movie 类中创建变量 movie，并针对每个输入的字符串（键）:
            8.1.使用 MovieFactory.getMovie 获取对象并将其赋给变量 movie。
            8.2.显示调用 movie.getClass().getSimpleName() 的结果。
        */

        while (true) {
//            String str = reader.readLine();
//            if (str.isEmpty())
//                break;
//            Movie movie = MovieFactory.getMovie(str);
            Movie movie = MovieFactory.getMovie(reader.readLine());
            if (movie == null)
                break;
            System.out.println(movie.getClass().getSimpleName());
        }

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            // 为键“soapOpera”创建 SoapOpera 对象
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }

            if ("cartoon".equals(key))
                movie = new Cartoon();

            if ("thriller".equals(key))
                movie = new Thriller();

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {

    }

    static class Thriller extends Movie {}
}
