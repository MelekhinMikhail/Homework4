public class Task4 {
    public static void main(String[] args) {
        int age = 19;
        if (age < 0) {
            System.out.println("Это невозможно.");
        } else if (age < 18) {
            System.out.println("Совершеннолетие еще не наступило.\nОсталось ждать лет: " + (18-age));
        } else {
            System.out.println("Поздравляем с совершеннолетием!!");
        }
    }
}
