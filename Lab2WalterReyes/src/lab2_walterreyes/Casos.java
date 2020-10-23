
package lab2_walterreyes;


public class Casos {
    private String lugar;
    private String descripcion;
    private String tipo;
    private int detective;
    private String estado;
    
    // constructores;
    
    public Casos(){
        
    }
    
    public Casos(String lugar,String descripcion,String tipo,int detective,String estado){
     this.lugar = lugar;
     this.descripcion  = descripcion;
     this.tipo = tipo;
     this.detective = detective;
     this.estado = estado;
    
    }
    // mutadores

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDetective() {
        return detective;
    }

    public void setDetective(int detective) {
        this.detective = detective;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    // ma
    
    @Override
    public String toString(){
     return "Lugar : "+lugar+" Descripción: "+descripcion+" Tipo: "+tipo+" Dectectivo a cargo: "+detective+
        " Estado:  "+estado+"\n";
    }
    
}
