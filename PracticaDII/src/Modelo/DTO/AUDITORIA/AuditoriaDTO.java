
package Modelo.DTO.AUDITORIA;

import java.util.GregorianCalendar;

public class AuditoriaDTO {

    private int id;//PK, autonumeral, asignado en DTO
    private String descripcion; //Holaquetal
    private String fecha; //Sacado de un Gregorian Calendar. Formato dd/mm/aa
    private String hora; //Sacado de un Gregorian Calendar. Formato hh:mm
    private String usuario_usua; //Referencia del usuario_usua en usuarios.
    
    public AuditoriaDTO(){
        
    }
    
    public AuditoriaDTO(int id, String descripcion, String usuario_usua){
        this.id=id;
        this.descripcion=descripcion;
        this.usuario_usua=usuario_usua;
        GregorianCalendar ahora= new GregorianCalendar();
        this.fecha= formatearFecha(ahora);
        this.hora= formatearHora(ahora);
    }
    
    public AuditoriaDTO(int id, String descripcion, String usuario_usua, GregorianCalendar momento){
         this.id=id;
        this.descripcion=descripcion;
        this.usuario_usua=usuario_usua;
        this.fecha= formatearFecha(momento);
        this.hora= formatearHora(momento);
    }
    
    private String formatearFecha(GregorianCalendar fecha){
        String res ="";
        
        int valor;
        
        valor=fecha.get(GregorianCalendar.DAY_OF_MONTH);
        if(valor<10)
            res += "0"+valor;
        else
            res += valor;
        
        res += "/";
        
        valor=fecha.get(GregorianCalendar.MONTH)+1;
        if(valor<10)
            res += "0"+valor;
        else
            res += valor;
        
        res+="/";
        
        valor=fecha.get(GregorianCalendar.YEAR);
        res+=valor%100;
        
        return res;
    }
    
    private String formatearHora(GregorianCalendar hora){
        String res="";
        
        int valor;
        
        valor=hora.get(GregorianCalendar.HOUR_OF_DAY);

        if(valor<10)
            res += "0"+valor;
        else
            res += valor;
        
        res+=":";
        
        valor=hora.get(GregorianCalendar.MINUTE);

        if(valor<10)
            res += "0"+valor;
        else
            res += valor;
        
        return res;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id){
        this.id=id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getUsuario_usua() {
        return usuario_usua;
    }

    public void setUsuario_usua(String usuario_usua) {
        this.usuario_usua = usuario_usua;
    }
}
