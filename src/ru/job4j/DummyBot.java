
package ru.job4j.condition;

public class DummyBot {

    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            /* заменить ... на правильный ответ rsl = "ответ по заданию". Если пришла фраза "Привет, Бот.", бот отвечает: "Привет, умник."*/
            rsl = "Привет, умник.";

        } else if ("До скорой встречи.".equals(question)) { /* заменить ... на проверку, известен ли боту этот вопрос и он знает как на него ответить. Если пришла фраза "Пока.", бот отвечает: "До скорой встречи."*/
            /* заменить ... на правильный ответ rsl = "ответ по заданию". Если пришла любая другая фраза,  бот отвечает: "Это ставит меня в тупик. Задайте другой вопрос."*/
        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl = DummyBot.answer("Привет, Бот.");
        System.out.println(rsl);
        rsl = DummyBot.answer("Пока.");
        System.out.println(rsl);

    }
}





