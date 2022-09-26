public class Task8 {
    public static void main(String[] args) {
        int childAge = 9;
        boolean isAdultWithChild = false;
        if (childAge >= 0 && childAge < 5) {
            System.out.println("Ты не можешь кататься на аттракционе :(");
        } else if (childAge >= 5 && childAge < 14 && isAdultWithChild) {
            System.out.println("Ты можешь кататься на аттракционе, но в сопровождении взрослого.");
        } else if (childAge >= 5 && childAge < 14 && !isAdultWithChild) {
            System.out.println("Ты не можешь кататься на аттракционе, т.к. ты без сопровождения взрослого.");
        } else if (childAge >= 14) {
            System.out.println("Ты можешь кататься на аттракционе без сопровождения взрослого.");
        } else {
            System.out.println("Ошибка!!");
        }
    }
}
