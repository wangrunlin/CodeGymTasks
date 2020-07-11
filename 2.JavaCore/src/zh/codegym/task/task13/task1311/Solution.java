package zh.codegym.task.task13.task1311;

/* 
招一个翻译吧
*/

public class Solution {

    public static void main(String[] args) {
        RussianTranslator russianTranslator = new RussianTranslator();
        System.out.println(russianTranslator.translate());
    }

    public static abstract class Translator {
        public abstract String getLanguage();

        public String translate() {
            return "我翻译" + getLanguage();
        }
    }

    public static class RussianTranslator extends Translator {
        @Override
        public String getLanguage() {
            return "俄语";
        }

        @Override
        public String translate() {
            return "我翻译俄语";
        }
    }
}