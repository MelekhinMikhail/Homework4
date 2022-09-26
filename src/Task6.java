public class Task6 {
    public static void main(String[] args) {
        int totalSeats = 102;
        int sitDownSeats = 60;
        int standUpSeats = totalSeats - sitDownSeats;
        int numberOfPassengers = 79;
        if (numberOfPassengers >= 0 && numberOfPassengers <= sitDownSeats) {
            System.out.println("В вагоне сидячих мест: " + (sitDownSeats-numberOfPassengers) + "\nСтоячих мест: " + standUpSeats);
        } else if (numberOfPassengers > sitDownSeats && numberOfPassengers < totalSeats) {
            System.out.println("В вагоне есть только стоячие места в количестве: " + (totalSeats-numberOfPassengers));
        } else if (numberOfPassengers == totalSeats) {
            System.out.println("Извините, но вагон переполнен :(");
        } else {
            System.out.println("Ошибка!!");
        }
    }
}
