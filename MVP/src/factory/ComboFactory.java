
package factory;

import models.Combo;
import models.ComboHamburguesa;
import models.ComboPollo;
import models.ComboVegetariano;

public class ComboFactory {
    public static Combo crearCombo(String tipo) {
        switch (tipo.toLowerCase()) {
            case "hamburguesa";
              return new ComboHamburguesa();
            case "pollo";
              return new ComboPollo();
            case "vegetariano";
              return new ComboVegetariano();
            default:
                throw new IllegalArgumentException("Tipo de combo no válido");
                
        }
    }
    
}
