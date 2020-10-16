
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roland
 */
public class AutoMain {
    
    public void rendezMaxSzállítóTeherCsökkenőleg(Teherautó[] teher)
        {
            for (int i = 0; i < teher.length-1; i++) {
                for (int j = i+1; j < teher.length; j++) {
                    if(teher[i].getMaxSzállíthatóTeher() < teher[j].getMaxSzállíthatóTeher())
                    {
                        Teherautó tmp= teher[i];
                        teher[i]=teher[j];
                        teher[j]=tmp;
                    }
                    
                }
                
            }
            
            
        }
    
    
    public Autó keresMaxMotorTeljesítmény (Autó[] auto) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < auto.length; i++)
        {
            if (auto[i] instanceof Teherautó)
            {
                ++i;
            }
            else if(auto[i].getMotorTeljesítmény() > max) {
                max = auto[i].getMotorTeljesítmény();
                index = i;
                }
            }
        return auto[index];
    }
    
    public static void kiírás(Teherautó[]t)
    {
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i]);
        }
    }
    
    public static void main(String[] args) {
        
        
        
        Autó[] a= new Autó[]{
            
            new Autó("ABC-111",100),
            new Autó("ABC-112",125),
            new Autó("ABC-113",150),
            new Autó("ABC-114",175),
            new Autó("ABC-115",650),
            new Teherautó("ABC-201",300,1500),
            new Teherautó("ABC-202",600,3500),
            new Teherautó("ABC-203",350,4500),
            new Teherautó("ABC-204",284,5500),
            new Teherautó("ABC-205",400,2500)
        };
        
        Teherautó[] t= new Teherautó[]{
            
            new Teherautó("ABC-206",300,1500),
            new Teherautó("ABC-207",600,3500),
            new Teherautó("ABC-208",350,4500),
            new Teherautó("ABC-209",284,5500),
            new Teherautó("ABC-210",400,2500),
            new Teherautó("ABC-211",300,1800),
            new Teherautó("ABC-212",600,3900),
            new Teherautó("ABC-213",350,4300),
            new Teherautó("ABC-214",284,6200),
            new Teherautó("ABC-215",400,2700)
        };
        AutoMain k = new AutoMain();
        System.out.println("A legnagyobb teljesítményű autó: "+k.keresMaxMotorTeljesítmény(a));
        System.out.println("\n\n");
        k.rendezMaxSzállítóTeherCsökkenőleg(t);
        kiírás(t);
    }
    
}
