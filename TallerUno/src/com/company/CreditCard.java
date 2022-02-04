package com.company;
/**
 * se importa la libreria Date
 */
import java.util.Date;
/**
 *definición de Clase CreditCard
 * "
 * @autor Angela Julieth Ossa Cuellar
 */
public class CreditCard {
    private Long numberCard;
    private Date expirationDate;
    protected int uCode;
    public String nameCard;
    public String nameUserCard;

    /**
     * creacion de metodo get
     * @return uCode
     */
    public int getuCode() {
        return uCode;
    }

    /**
     * creacion metodo Set
     * @param uCode
     */
    public void setuCode(int uCode) {
        this.uCode = uCode;
    }
}
