package com.company;

/**
 * se importar el paquete de listas
 */

import java.util.List;


/**
 *definición de Clase fruit
 * "
 * @autor Angela Julieth Ossa Cuellar
 */

public class Fruit {
    public String name;
    private float averageWeight;
    public List<String> color= null;
    public List<String> flavors= null;

    /**
     * metodo get para el arreglo color
     * @return color
     */

    public List<String> getList() {
        return color;

    }

    /**
     * metodo set para el arreeglo color
     * @param color
     */
    public void setList(List<String> color) {

        this.color = color;
    }
}

