
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roland
 */

public class VízMain { 
    private static List<Vízgyűjtő> vz = new ArrayList(); 

    public static int db_vizgy(Vízgyűjtő v) {
        int sum = v.getBeleFolynak().size();
        for (String o : v.getBeleFolynak()) { 
            Vízgyűjtő tmp = new Vízgyűjtő(o); 
            sum += db_vizgy(vz.get(vz.indexOf(tmp))); 
        }
        return sum;

    }

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        while (sor.length() > 0) {

            String[] d = sor.split(";");
            if (d.length == 2) {
                Vízgyűjtő tmp = new Vízgyűjtő(d[1]);
                Vízgyűjtő tmp2 = new Vízgyűjtő(d[0]);
                if (vz.contains(tmp)) { 
                    vz.get(vz.indexOf(tmp)).getBeleFolynak().add(d[0]);

                } else  {
                    tmp.getBeleFolynak().add(d[0]);
                    vz.add(tmp);

                }
                  
                if (!vz.contains(tmp2)) {
                    vz.add(tmp2);
                }
            } else {// ha egy elems az input
                Vízgyűjtő tmp = new Vízgyűjtő(d[0]);
                if (!vz.contains(tmp)) {
                    vz.add(tmp);
                }

            }
            sor = sc.nextLine();
        }

        for (Vízgyűjtő i : vz) {
            System.out.println(i);
        }

        
        for (int i = 0; i < args.length; i++) { 
            for (int j = 0; j < vz.size(); j++) { 
                
                
                if (vz.get(j).getNév().equals(args[i])) { 
                    System.out.println(vz.get(j).getNév() + ": " + db_vizgy(vz.get(j))); 
                    break; 

                }
                
                if (j == vz.size() - 1) {

                    System.out.println(args[i] + ": " + 0);
                }
            }

        }

    }
    
    
    
}
