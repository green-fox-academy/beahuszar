public abstract class AirCraft {

  int maxAmmo;
  int baseDamage;
  int currentAmmo;

  public AirCraft(int maxAmmo, int baseDamage, int currentAmmo) {
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
    this.currentAmmo = currentAmmo;
  }

  public int fight() {
    int damage = this.baseDamage * this.currentAmmo;
    this.currentAmmo = 0;
    return damage;
  }

  public int reFill(int reFillQty) {
    int remainingAmmo = 0;

    if (reFillQty + this.currentAmmo > this.maxAmmo) {
      remainingAmmo = reFillQty - (this.maxAmmo - this.currentAmmo);

    }
  }

}
