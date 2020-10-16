
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roland
 */
public class GeometricShape {
    
    private String color;
    private boolean filled;
    private Date dateCreated;

    public GeometricShape() {
        this.color = "white";
        this.filled=false;
        this.dateCreated= new Date();
    }

    public GeometricShape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public boolean isFilled(boolean filled)
    {
        if(this.filled==true)
        {
            return true;
        }
        else
            return false;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return " created on "+this.getDateCreated()+"\n"+"color:"+this.color+" and filled:"+this.isFilled(filled);
    }
    
    

    
    
    
    
}
