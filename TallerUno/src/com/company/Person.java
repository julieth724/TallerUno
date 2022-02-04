package com.company;

/**
 * se importa la libreria Date
 */

import java.util.Date;

/**
 *definición de Clase Person
 * "
 * @autor Angela Julieth Ossa Cuellar
 */

public class Person {
  public int id;
   public String name;
   public String lastName;
   public int yearsOld;
   public Date dateBirth;
   public Float height;
   public Float weigth;

   /**
    * creacion de metodo get para el atributo name
    * @return retorna el nombre de la persona (name)
    */

   public String getName() {

      return name;
   }

   /**
    *creacion de metodo set para el atributo name
    * @param name
    */
   public void setName(String name) {
      this.name = name;
   }
}
