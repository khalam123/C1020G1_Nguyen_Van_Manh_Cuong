package bai5_access_modifier.thuc_hanh;

public class StaticProperty {
    public static class Car {

        private String name;
        private String engine;
        public static int numberOfCars;

        public Car(String name, String engine) {

            this.name = name;
            this.engine = engine;
            numberOfCars++;

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEngine() {
            return engine;
        }

        public void setEngine(String engine) {
            this.engine = engine;
        }

        public static int getNumberOfCars() {
            return numberOfCars;
        }


        public String toString() {
            return "name='" + name + '\'' + ", engine='" + engine + '\'';
        }

        public static void setNumberOfCars(int numberOfCars) {
            Car.numberOfCars = numberOfCars;
        }
    }

    public static void main(String[] args) {

        Car car1 = new Car("Mazda 3","Skyactiv 3");

        System.out.println(Car.numberOfCars);
        System.out.println("Car 1: "+car1.toString());

        Car car2 = new Car("Mazda 6","Skyactiv 6");

        System.out.println(Car.numberOfCars);
        System.out.println("Car 2: "+car2.toString());

    }
}