
package builder;
import models.Combo;

public class ComboPersonalizado {
  private final Combo base;
  private final String bebida;
  private final String acompanamiento;
  private final String extra;
  public ComboPersonalizado(Combo base, String bebida, String acompanamiento, String extra) {
      this.base = base;
      this.bebida = bebida;
      this.acompanamiento = acompanamiento;
      this.extra = extra;
      
  }
  public String getDetalle() {
      return base.getDescription() + "\nBebida: " + bebida + 
              "\nAcompañamiento: " + acompanamiento +
              "\nExtra: " + extra;
  }
}
