
import java.util.Date;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roland
 */
public class Autó {
    
    private String rendszám;
    private int MotorTeljesítmény;
    private Date gyártásDátuma;

    public Autó(String rendszám, int MotorTeljesítmény) {
        this.rendszám = rendszám;
        this.MotorTeljesítmény = MotorTeljesítmény;
        this.gyártásDátuma = new Date();
    }

    public String getRendszám() {
        return rendszám;
    }

    public int getMotorTeljesítmény() {
        return MotorTeljesítmény;
    }

    public Date getGyártásDátuma() {
        return gyártásDátuma;
    }

    public void setRendszám(String rendszám) {
        this.rendszám = rendszám;
    }

    @Override
    public String toString() {
        return "Rendszám: "+this.rendszám+" Teljesítmény: "+this.MotorTeljesítmény+" Gyártási dátum: "+this.gyártásDátuma;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.rendszám);
        return hash;
    }

    
    public boolean equals(Autó obj) {
        
        if((this.MotorTeljesítmény == obj.MotorTeljesítmény) && (this.rendszám==obj.rendszám))
        {
            return true;
        }
        else
            return false;
    }

    

    
    
    
    
    
}
