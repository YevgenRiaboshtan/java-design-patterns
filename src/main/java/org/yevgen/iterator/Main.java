package org.yevgen.iterator;

public class Main {

    /*
    Use the Iterator pattern:
    • To access an aggregate object’s contents without exposing its internal representation.
    • To support multiple traversals of aggregate objects.
    • To provide a uniform interface for traversing different aggregate structures (that is, to support polymorphic iteration).
     */
    public static void main(String[] args) {
        CarStorage carStorage = new CarStorage(5);
        carStorage.addCar(new Car("BMW", "740L"));
        carStorage.addCar(new Car("BMW", "M6"));
        carStorage.addCar(new Car("TOYOTA", "MARK II"));
        carStorage.addCar(new Car("NISSAN", "LAUREL"));
        carStorage.addCar(new Car("MB", "W116"));

        CarIterator iterator = new CarIterator(carStorage.getCars());

        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
        System.out.println("REMOVE");
        iterator = new CarIterator(carStorage.getCars());
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
            iterator.remove();
        }
    }
}
