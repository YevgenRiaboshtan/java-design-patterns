package org.yevgen.decorator;

public class Main {

    /*
    Use the Decorator pattern in the following cases:
    • To add responsibilities to individual objects dynamically and transparently, that is, without affecting other objects.
    • For responsibilities that can be withdrawn.
    • When extension by sub-classing is impractical. Sometimes a large number of independent extensions are possible and would
    produce an explosion of subclasses to support every combination. Or a class definition may be hidden or otherwise unavailable
    for sub-classing.
     */
    public static void main(String[] args) {
        Car car = new Toyota();

        car = new AdditionalSecurity(car);
        System.out.println(car.getDescription());
        System.out.println("Price: " + car.getPrice());

        car = new Nissan();
        car = new ParkingCamera(car);
        car = new GpsNavigation(car);

        System.out.println(car.getDescription());
        System.out.println("Price: " + car.getPrice());
    }
}
