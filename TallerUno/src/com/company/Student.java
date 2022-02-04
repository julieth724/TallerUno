package com.company;

/**
 *definición de Clase Student
 * "
 * @autor Angela Julieth Ossa Cuellar
 */

public class Student {
    public int code;
    public String StudentName;
    public int grade;
    private boolean approved;

    /**
     * creacion metodo get
     * @return StudentName
     */
    public String getStudentName() {
        return StudentName;
    }

    /**
     * Creacion metodo set
     * @param studentName
     */

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }
}
