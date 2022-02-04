package com.company;
/**
 *definición de Clase person
 * "
 * @autor Angela Julieth Ossa Cuellar
 */
public class BankAccount {
    private int accountNumber;
    public long availableBalance;
    private String accountType;
    protected boolean activated;

    /**
     * creacion de constructor con dato booleano activate
      * @param activated
     */
    public BankAccount(boolean activated){

    }

    /**
     * creacion de metodo get
     * @return activated
     */

    public boolean isActivated() {
        return activated;
    }

    /**
     * creacion de set solicitando informacion de la cuenta activada o no
     * @param activated
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
        if (activated == true)
        {
            activated=true;
        }
        else{
            activated=false;
        }
    }
}
