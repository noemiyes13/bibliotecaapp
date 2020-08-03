
package modelo;

public class Biblioteca {
 
    private int idlibros;
    private String nombre;
    private String editorial;
    private String autor;
    private String pais_autor;

   public Biblioteca(){
        
    }
    
    public Biblioteca(int idlibros,String nombre, String editorial, String autor, String pais_autor){
       this.idlibros=idlibros;
        this.nombre = nombre;
        this.editorial = editorial;
        this.autor = autor;
        this.pais_autor = pais_autor;
    
    }
    public int getIdlibros() {
        return idlibros;
    }

    /**
     * @param idlibros the idlibros to set
     */
    public void setIdlibros(int idlibros) {
        this.idlibros = idlibros;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the editorial
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * @param editorial the editorial to set
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the pais_autor
     */
    public String getPais_autor() {
        return pais_autor;
    }

    /**
     * @param pais_autor the pais_autor to set
     */
    public void setPais_autor(String pais_autor) {
        this.pais_autor = pais_autor;
    }

    
      
}
