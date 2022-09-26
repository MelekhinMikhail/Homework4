public class Task2 {
    public static void main(String[] args) {
        int age = 6;
        if (age < 7 && age > 0) {
            System.out.println("Ты еще не ходишь в школу.");
        }
        if (age >= 7 && age < 18) {
            System.out.println("Ты ходидишь в школу :)");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Ты уже закончил школу и можешь отправляться в университет.");
        }
        if (age >=24) {
            System.out.println("Ты уже окончил университет, пора искать работу.");
        }
    }
}
