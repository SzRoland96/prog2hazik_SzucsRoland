/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Roland
 */
public class Jégkorong implements Comparable<Jégkorong> {
    private String nev;
    private int pont;
    private int gol;

    public Jégkorong(String nev, int pont, int gol) {
        this.nev = nev;
        this.pont = pont;
        this.gol = gol;
    }

    public Jégkorong(String nev) {
        this.nev = nev;
    }
    

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getPont() {
        return pont;
    }

    public void setPont(int pont) {
        this.pont = pont;
    }

    public int getGol() {
        return gol;
    }

    public void setGol(int gol) {
        this.gol = gol;
    }

    public void addPoint(int pont){
        this.pont=this.pont+pont;
    }
    
    public void addGol(int gol){
        this.gol=this.gol+gol;
    }
    
    @Override
    public String toString() {
        return this.nev+": "+this.pont+" points ("+this.gol+" scored goals)";
    }

    @Override
    public int compareTo(Jégkorong o) {
        if (this.pont == o.pont){
            if(this.gol == o.gol){
                return this.nev.compareTo(o.nev);
            }
            else{
                return -Integer.compare(this.gol, o.gol);
            }
        }else{
            return -Integer.compare(this.pont, o.pont);
        }
    }
    
    
}
