
package controllers;

import builder.ComboBuilder;
import builder.ComboPersonalizado;
import factory.ComboFactory;
import models.Combo;

public class ComboController {
   private final ComboBuilder builder = new ComboBuilder();
   
   public void seleccionarBase (String tipo) {
       Combo comboBase = ComboFactory.crearCombo(tipo);
       builder.setBase(comboBase);
       
   }
   public void personalizar(String bebida, String acompanamiento, String extra) {
       builder.setBebida(bebida)
               .setAcompanamiento(acompanamiento)
               .setExtra(extra);  
   }
   public ComboPersonalizado obtenerComboFinal() {
       return builder.build();
       
   }
}
