package Modelo.DTO.IVA;

public class IvaDTO {
    //Nota: en DAO tendremos que controlar que no se viole la integridad,
    //y que sea un autonumeral.
    private int id_iva; //PK, AUTONUMERAL
    private float porcentaje_iva;
    private boolean status_iva; //true - en vigor, false - no en vigor

    public IvaDTO(){
        
    }
    
    public IvaDTO(int id_iva, float porcentaje_iva){
        this.id_iva=id_iva;
        this.porcentaje_iva=porcentaje_iva;
        status_iva=true;
    }
    
    public IvaDTO(int id_iva, float porcentaje_iva, boolean status_iva){
        this.id_iva=id_iva;
        this.porcentaje_iva=porcentaje_iva;
        this.status_iva=status_iva;
    }    

    public int getId_iva() {
        return id_iva;
    }

    public float getPorcentaje_iva() {
        return porcentaje_iva;
    }

    public void setPorcentaje_iva(float porcentaje_iva) {
        this.porcentaje_iva = porcentaje_iva;
    }

    public boolean isStatus_iva() {
        return status_iva;
    }

    public void setStatus_iva(boolean status_iva) {
        this.status_iva = status_iva;
    }
    
    
}
