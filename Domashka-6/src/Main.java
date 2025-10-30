public class Main {

    public static Car[] getCarByBrend(Car[] cars, String brend) {
        int count = 0;
        for (Car car : cars) {
            if (car.getMarka().equalsIgnoreCase(brend)) {
                count++;
            }
        }
        if (count == 0) return new Car[0];
        Car[] result = new Car[count];
        int index = 0;
        for (Car car : cars) {
            if (car.getMarka().equalsIgnoreCase(brend)) {
                result[index++] = car;
            }
        }
        return result;
    }

    public static Car[] getCarByBrendAndYearOperational(Car[] cars, String brend, int years) {
        int count = 0;
        int currentYear = java.time.Year.now().getValue();
        for (Car car : cars) {
            int age = currentYear - car.getYear();
            if (car.getMarka().equalsIgnoreCase(brend) && age > years) {
                count++;
            }
        }
        if (count == 0) return new Car[0];
        Car[] result = new Car[count];
        int index = 0;
        for (Car car : cars) {
            int age = currentYear - car.getYear();
            if (car.getMarka().equalsIgnoreCase(brend) && age > years) {
                result[index++] = car;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Car[] cars = {
                new Car(1, "Ferrari", "F8 Tributo", 2021, "Черный", 274000.0, "A777AA"),
                new Car(2, "Ferrari", "Roma", 2020, "Красный", 200000.0, "B123BB"),
                new Car(3, "Lamborghini", "Huracan", 2019, "Желтый", 250000.0, "C456CC"),
                new Car(4, "BMW", "X5", 2018, "Синий", 60000.0, "D789DD")
        };

        Car[] ferraris = getCarByBrend(cars, "Ferrari");
        System.out.println("Машины марки Ferrari:");
        for (Car car : ferraris) {
            System.out.println(car.getModel() + " " + car.getYear());
        }

        Car[] oldFerraris = getCarByBrendAndYearOperational(cars, "Ferrari", 1);
        System.out.println("\nFerrari старше 1 года:");
        for (Car car : oldFerraris) {
            System.out.println(car.getModel() + " " + car.getYear());
        }
    }
}

