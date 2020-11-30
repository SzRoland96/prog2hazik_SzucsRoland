/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Roland
 */
public class Személy implements Comparable<Személy> {

    protected String név;
    protected int életkor;
    private boolean férfi;

    public Személy(String név, int életkor, boolean férfi) {
        this.név = név;
        this.életkor = életkor;
        this.férfi = férfi;
    }

    public String getNév() {
        return név;
    }

    public int getÉletkor() {
        return életkor;
    }

    public boolean isFérfi() {
        return férfi;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public void setÉletkor(int életkor) {
        this.életkor = életkor;
    }

    public void setFérfi(boolean férfi) {
        this.férfi = férfi;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append(this.név).append(" ");
        output.append(this.életkor).append(" ");
        output.append(this.férfi);
        return output.toString();
    }

    @Override
    public int compareTo(Személy t) {
        return Integer.compare(this.getÉletkor(), t.getÉletkor());
    }

}

class Main2 {

    public static double joKepesseguHallgatokAtlaga(Set<Személy> személyek) {
        double sum = 0.0;
        int counter = 0;
        for (Személy sz : személyek) {
            if (sz instanceof Hallgató) {
                Hallgató h = (Hallgató) sz;
                if (h.joKepessegu()) {
                    sum += h.getÁtlag();
                    counter++;
                }
            }

        }

        return sum / counter;
    }

    public static void main(String[] args) {
        Személy sz = new Személy("Mona Liza", 20, false);
        System.out.println(sz);
        Scanner sc = new Scanner(System.in);
        Hallgató h = new Hallgató("Kert Elek", 20, true, 4.3);
        Hallgató h2 = new Hallgató("Kert Ferenc", 22, true, 4.25);
        Hallgató h3 = new Hallgató("Kert Kristóf", 25, true, 4.2);
        Hallgató h4 = new Hallgató("Kert Mária", 24, false, 4.36);
       
        Hallgató.setJoKepessegu(4.25);
        
        Oktató o = new Oktató("Telek Ferenc", 37, true, "Matematikai Analízis");
        Oktató o2 = new Oktató("Telek Péter", 34, true, "IT");
        Oktató o3 = new Oktató("Telek Mónika", 34, false, "IT");
        Oktató o4 = new Oktató("Telek Petra", 33, false, "IT");
        Oktató o5 = new Oktató("Telek Blanka", 30, false, "IT");
        
        // Hallgatók és oktatók hozzáadása a halmazhoz!
        Set<Személy> emberek = new HashSet<>();
        emberek.add(h);
        emberek.add(h2);
        emberek.add(h3);
        emberek.add(h4);
        emberek.add(o);
        emberek.add(o2);
        emberek.add(o3);
        emberek.add(o4);
        emberek.add(o5);
        System.out.println("Jo kepessegu hallgatok atlaga: "+joKepesseguHallgatokAtlaga(emberek));

        Egyetem e = new Egyetem();
        // Hallgatók és oktatók hozzáadása az Egyetemhez kapcsolódó 
        e.személyHozzáadása(o);
        e.személyHozzáadása(o2);
        e.személyHozzáadása(o3);
        e.személyHozzáadása(h);
        e.személyHozzáadása(h4);
        e.személyHozzáadása(h3);
        e.személyEltávolítása(o3);
        e.ITTanszekNoiOktatok(emberek);

        System.out.println("IT tanszéken dolgozó női oktatók:");

        for (Személy f : emberek) {
            if (f instanceof Oktató) {
                System.out.println(f);
            }

        }

        //System.out.println(h);
        //System.out.println(o);
        final int n = 4;
        String sor = null;
        Személy[] személyek = new Személy[n];
        int hallgatókSzáma = 0;
        int i = 0;
        System.out.println("Adjon meg két hallgatót majd két oktatót (pontosan ebben a sorrendben)!");
        while (i < n) {
            sor = sc.nextLine();
            String token[] = sor.split(" ");
            if (Character.isLetter(token[3].charAt(0))) {
                Oktató okt = new Oktató(token[0], Integer.parseInt(token[1]), Boolean.parseBoolean(token[2]), token[3]);
                személyek[i] = okt;
                i++;
            } else if (Character.isDigit(token[3].charAt(0))) {
                Hallgató hallg = new Hallgató(token[0], Integer.parseInt(token[1]), Boolean.parseBoolean(token[2]), Double.parseDouble(token[3]));
                személyek[i] = hallg;
                i++;
            } else {
                System.out.println("Nem megfelelő bemenet!");
            }
        }
        
        for (int j = 0; j < személyek.length; j++) {
            System.out.println(személyek[j]);
        }
    }
}
