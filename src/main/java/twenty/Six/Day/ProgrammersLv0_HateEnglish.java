package twenty.Six.Day;

public class ProgrammersLv0_HateEnglish {
    public static void main(String[] args) {
        String numbers = "onetwothreefourfivesixseveneightnine";

        /*
         * 영어가 싫어요
         */

        numbers = numbers.replace("one", "1");
        numbers = numbers.replace("two", "2");
        numbers = numbers.replace("three", "3");
        numbers = numbers.replace("four", "4");
        numbers = numbers.replace("five", "5");
        numbers = numbers.replace("six", "6");
        numbers = numbers.replace("seven", "7");
        numbers = numbers.replace("eight", "8");
        numbers = numbers.replace("nine", "9");
        numbers = numbers.replace("zero", "0");

        long answer = Long.parseLong(numbers);

    }
}