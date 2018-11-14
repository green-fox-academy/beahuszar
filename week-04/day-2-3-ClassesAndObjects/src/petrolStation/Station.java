package petrolStation;

public class Station {
  int gasAmount;

  public void refill (Car car) {
   gasAmount = gasAmount - car.capacity;
    car.gasAmount = car.gasAmount + car.capacity;
  }
}
