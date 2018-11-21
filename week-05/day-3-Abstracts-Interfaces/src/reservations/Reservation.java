package reservations;

public class Reservation implements Reservationy {

  @Override
  public String getDowBooking() {
    String[] dowBooking = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    int index = (int)(Math.random() * 6);
    return dowBooking[index];
  }

  @Override
  public String getCodeBooking() {
    StringBuilder code = new StringBuilder();

    for (int i = 0; i < 8; i++) {
      code.append(getRandChar());
    }

    return code.toString();
  }

  public char getRandChar() {
    String code = "0123456789abcdefghijklmnopqrstuvwxyz";
    int randChar = (int)(Math.random() * code.length());
    return code.charAt(randChar);
  }

  public String booking() {
    return "Booking# " + getCodeBooking() + " for " + getDowBooking() + ".";
  }
}
