/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_6_formato_apa;

/**
 *
 * @author Moren
 */
public class refBiblio {
    private String autor;
    private String titulo;
    private String editorial;
    private int year;
    private String mes;
    private int dia;
    private int paginas;
    
    public String getAutor(){
        return autor;
    }
    
    public void setAutor(String valor){
        autor = valor;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String valor){
        titulo = valor;
    }
    
    public String getEditorial(){
        return editorial;
    }
    
    public void setEditorial(String valor){
        editorial = valor;
    }
    
    public int getYear(){
        return year;
    }
    
    public void setYear(int valor){
        year = valor;
    }
    
    public String getMes(){
        return mes;
    }
    
    public void setMes(String valor){
        mes = valor;
    }
    
    public int getDia(){
        return dia;
    }
    
    public void setDia(int valor){
        dia = valor;
    }
    
    public int getPaginas(){
        return paginas;
    }
    
    public void setPaginas(int valor){
        paginas = valor;
    }
    
    public void imprimirDatos(){
        System.out.println("------------------------");
        System.out.print(autor);
        System.out.print("(" + dia + " de " +  mes + " del " + year + ")");
        System.out.println(titulo);
        System.out.println("------------------------");
    }
}
