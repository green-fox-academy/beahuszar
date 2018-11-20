package aircraftCarrier;

public class Aircraft {

  protected int maxAmmo;
  private int baseDamage;
  protected int ammo;
  private String name;

  Aircraft (int baseDamage, int maxAmmo, String name) {
    this.baseDamage = baseDamage;
    this.ammo = 0;
    this.maxAmmo = maxAmmo;
    this.name = name;
  }

  public int fight() {
    return this.baseDamage * this.ammo;
  }

  public int refill(int reAmmo) {
    if (reAmmo >= this.maxAmmo) {
      ammo = this.maxAmmo;
      return reAmmo - this.maxAmmo;
    } else {
      ammo = ammo + reAmmo;
      return 0;
    }
  }

  public String getType() {
    return this.name;
  }

  public String getStatus() {
    return "Type " + this.getType() + ", Ammo: " + this.ammo + ", Base Damage: " + this.baseDamage + ", All damage: " + this.fight();
  }
}
