package com.company;
/**
 *definición de Clase CreditCard
 * "
 * @autor Angela Julieth Ossa Cuellar
 */
public class Book {

    public String BookTitle;
    private int typeBook;
    public String author;
    public String publishipHouse;

    /**
     * creación metodo get para el atributo titulo del libro definida como bookTile
     * @return bookTile
     */
    public String getBookTitle() {
        return BookTitle;
    }

    /**
     * Creación metodo set para el atributo titulo del libro definida como bookTile
     * @param bookTitle
     */
    public void setBookTitle(String bookTitle) {
        BookTitle = bookTitle;
    }
}
