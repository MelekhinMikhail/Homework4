public class Task9 {
    public static void main(String[] args) {
        int one = 12, two = 10, three = 13;
        if (one >= two && one >= three) {
            System.out.println("Переменная one с значением " + one + " наибольшая.");
        } else if (two >= one && two >= three) {
            System.out.println("Переменная two с значением " + two + " наибольшая.");
        } else {
            System.out.println("Переменная three с значением " + three + " наибольшая.");
        }
    }
}
