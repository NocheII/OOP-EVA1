/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_formato_apa;

/**
 *
 * @author Moren
 */
public class EVA1_6_FORMATO_APA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        refBiblio[] Libro = new refBiblio[3];
        Libro[0] = new refBiblio();
        Libro[0].setAutor("J. K. Rowling");
        Libro[0].setTitulo("Harry Potter y la piedra filosofal");
        Libro[0].setEditorial("Salamandra");
        Libro[0].setYear(1998);
        Libro[0].setMes("Septiembre");
        Libro[0].setDia(1);
        Libro[0].imprimirDatos();
        Libro[1] = new refBiblio();
        Libro[1].setAutor("John Green");
        Libro[1].setTitulo("Bajo la misma estrella");
        Libro[1].setEditorial("Nube de tinta");
        Libro[1].setYear(2012);
        Libro[1].setMes("Enero");
        Libro[1].setDia(10);
        Libro[1].imprimirDatos();
        Libro[2] = new refBiblio();
        Libro[2].setAutor("Suzanne Collins");
        Libro[2].setTitulo("Los juegos del hambre ");
        Libro[2].setEditorial("Scholastic");
        Libro[2].setYear(2008);
        Libro[2].setMes("Septiembre");
        Libro[2].setDia(14);
        Libro[2].imprimirDatos();
        // TODO code application logic here
    }
    
}
