public class Task5 {
    public static void main(String[] args) {
        int age = 19;
        if (age < 7 && age >= 0) {
            System.out.println("Ты еще не ходишь в школу.");
        } else if (age >= 7 && age < 18) {
            System.out.println("Ты ходидишь в школу :)");
        } else if (age >= 18 && age < 24) {
            System.out.println("Ты уже закончил школу и можешь отправляться в университет.");
        } else if (age >= 24) {
            System.out.println("Ты уже окончил университет, пора искать работу.");
        } else {
            System.out.println("Ошибка!!");
        }
    }
}
