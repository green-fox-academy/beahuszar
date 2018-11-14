package petrolStation;

public class Main {
  public static void main(String[] args) {
    Station station = new Station();
    Car car = new Car();
    station.refill(car);
    System.out.println(
        "CarCapacit: " + car.capacity
         + " CarGasAmount: " + car.gasAmount
         + " StationGasamount " + station.gasAmount);
    station.refill(car);
    System.out.println(
        "CarCapacit: " + car.capacity
            + " CarGasAmount: " + car.gasAmount
            + " StationGasamount " + station.gasAmount);
  }
}
