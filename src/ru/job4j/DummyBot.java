public class DummyBot {

    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Сколько будет 2 + 2?".equals(question)) {
            rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
          } else if ("До скорой встречи".equals(question)) {
            rsl = "Пока.";
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





