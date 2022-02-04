package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Metodo main o punto de entrada de la aplicación
 */


public class Main {

    public static void main(String[] args) {
/**
 * ejecucion de Getter (mostramos nombre) and setters (establecemos nombre) clase Person
 */
        Person myPerson = new Person();
        myPerson.setName("Angela");
        System.out.println(myPerson.getName());

        /**
         * ejecucion de Getter and setters clase Fruit
         */


        Fruit test = new Fruit();
        List<String> color = new ArrayList<String>();

        /**
         * adicion de elementos en el arreglo para atributo color
         */
        color.add("amarillo");
        color.add("naranja");
        color.add("verde");
        color.add("rojo");
        test.setList(color);

        /**
         * impresión del arreglo color
         */
        System.out.println(color);

    /**
     * ejecucion setters clase BankAccount
     */
         BankAccount myBankAccount = new BankAccount(true);
         myBankAccount.setActivated(true);

        /**
         * ejecucion de Getter (mostramos nombre) and setters (establecemos nombre) clase Person
         */

        Student myStudent = new Student();
        myStudent.setStudentName("Angela Ossa");
        System.out.println(myPerson.getName());
        /**
         * ejecucion de Getter (mostramos titulo) and setters (establecemos titulo) clase Book
         */

        Book myBook = new Book();
        myBook.setBookTitle("Los miserables");
        System.out.println(myBook.BookTitle);
        /**
         * ejecucion de Getter (mostramos codigo unico) and setters (establecemos codigo unico) clase Book
         * uCode: variable para definir codigo unico
         */
        CreditCard myCreditCard = new CreditCard();
        myCreditCard.setuCode(456);
        System.out.println(myCreditCard.getuCode());

    }



}
