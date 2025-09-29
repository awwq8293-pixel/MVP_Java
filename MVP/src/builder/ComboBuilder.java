
package builder;
import models.Combo;


public class ComboBuilder {
    private Combo base;
    private String bebida;
    private String acompanamiento;
    private String extra;
    public ComboBuilder setBase(Combo base) {
        this.base = base;
        return this;
        
    }
    public ComboBuilder setBebida(String bebida){
        this.bebida = bebida;
        return this;
        
    }
    public ComboBuilder setAcompanamiento (String acompanamiento) {
        this.acompanamiento = acompanamiento;
        return this;
        
        
    }
    public ComboBuilder setExtra(String extra) {
       this.extra = extra;
       return this;
       
    }
    public ComboPersonalizado build() {
        return new ComboPersonalizado(base, bebida, acompanamiento, extra);       
    }
  
}
