public class Task7 {
    public static void main(String[] args) {
        int age = 23;
        if (age >= 0 && age < 2) {
            System.out.println("Вам никуда не надо ходить :)");
        } else if (age >= 2 && age < 7) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else if (age >= 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        } else if (age >= 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет.");
        } else if (age >= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу.");
        } else {
            System.out.println("Ошибка!!");
        }
    }
}
