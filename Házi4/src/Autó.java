/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Roland
 */
public class Autó implements Comparable<Autó> {

    private String rendszám;
    private int teljesítmény;
    private boolean automata;
    public static int példányokSzáma;
    private List<String> extrák;

    public Autó(String rendszám, int teljesítmény, boolean automata) throws AutóException, NumberFormatException {
        if (this.szabalyosRendszam(rendszám)) {
            this.rendszám = rendszám;
        } else {
            throw new AutóException(0, "A rendszám nem szabályos!");
        }

        if (teljesítmény > 0) {
            this.teljesítmény = teljesítmény;
        } else {
            throw new AutóException(1, "A teljesítmény értéke csak pozitív értéket vehet fel!");

        }

        this.automata = automata;
        this.extrák = new ArrayList<>();
        példányokSzáma++;
    }

    public String getRendszám() {
        return rendszám;
    }

    public int getTeljesítmény() {
        return teljesítmény;
    }

    public boolean isAutomata() {
        return automata;
    }

    public static int getPéldányokSzáma() {
        return példányokSzáma;
    }

    public List<String> getExtrák() {
        return extrák;
    }

    @Override
    public String toString() {
        return "{Autó}: rendsz\u00e1m=" + this.getRendszám() + ", teljes\u00edtm\u00e9ny=" + this.getTeljesítmény() + ", automata=" + this.isAutomata() + ", extrák=" + extrák + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override

    /**
     * Egy Autó típusú objektum egyenlőnek tekinthető, ha Az Autó osztály
     * példánya és a rendszám tulajdonsága pontosan megegyezik. Ha valamely
     * feltétel nem teljesül, akkor a két objektum nem tekinthető egyenlőnek.
     */
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Autó) {
            if (this.rendszám.equals(((Autó) obj).getRendszám())) {
                return true;
            }
        }
        return false;

    }

    @Override

    /**
     * Autó objektumok összehasonlítása a teljesítményük alapján. Csökkenő
     * sorrend: A legnagyobb teljesítményű autók előre kerülnek. Növekvő
     * sorrend: A legkisebb teljesítményű autók előre kerülnek.
     */
    public int compareTo(Autó t) {
        return Integer.compare(t.getTeljesítmény(), this.getTeljesítmény());
    }

    /**
     * Annak eldöntése, hogy a megadott rendszám szabályos-e azaz pontosan 6
     * karakter hosszú és pontosan 3 betű után 3 szám áll a bemenetben. Ha a
     * rendszám nem 6 karakter hosszúságú, akkor HAMIS értéket ad vissza. Ha a
     * rendszám valamely karaktere nem felel meg az előírásoknak, HAMIS értéket
     * ad vissza. Ha az ellenőrzés során minden teljesül, IGAZ értéket ad
     * vissza.
     */
    public boolean szabalyosRendszam(String rendszám) {
        if (rendszám.length() == 6) {
            for (int i = 0; i < 3; i++) {
                if (!Character.isLetter(rendszám.charAt(i))) {
                    return false;
                }
            }
            for (int i = 3; i < rendszám.length(); i++) {
                if (!Character.isDigit(rendszám.charAt(i))) {
                    return false;
                }
            }
        } else {
            return false;
        }

        return true;

    }

}

class Tesztelés {

    /**
     * Bemenet: Autó típusú tömb Kimenet: Teherautó típusú lista Kiválasztjuk az
     * Autókat tartalmazó tömbből a teherautókat, majd azokat a teherautókat
     * gyűjtjük egy listába, amelynek teherbírás tulajdonsága meghaladja a
     * 20_000 kg-ot.
     */
    public static List<Teherautó> joTeherbirasuak(Autó[] autók) {
        List<Teherautó> teherautók = new ArrayList<>();
        for (int i = 0; i < autók.length; i++) {
            if (autók[i] instanceof Teherautó) {
                Teherautó tmp = (Teherautó) autók[i];
                if (tmp.getTeherbírás() > 20_000) {
                    teherautók.add(tmp);
                }
            }
        }

        return teherautók;
    }

    /**
     * Bemenet: Autó típusú lista Kimenet: Azon 3 vagy kevesebb Autó objektum
     * kiírása, amelyeknek legnagyobb a teljesítményük. Ha kevesebb, mint 3 autó
     * érkezett a bemeneten, akkor az összes Autó objektumot kiírja a
     * képernyőre. FONTOS, hogy a teherautókat nem soroljuk be a listába!
     */
    public static void legnagyobbTeljesítményűAutók(List<Autó> autók) {
        List<Autó> lautók = new ArrayList<>();
        for (Autó a : autók) {
            if (!(a instanceof Teherautó)) {
                lautók.add(a);
            }
        }

        Collections.sort(lautók);
        if (lautók.size() < 3) {
            for (Autó i : lautók) {
                System.out.println(i);
            }
        } else {
            for (int i = 0; i < 3; i++) {
                System.out.println(lautók.get(i));
            }
            System.out.println();
        }
    }

    /**
     * Főprogram az Autó és Teherautó típusú objektumok használatára.
     */
    public static void main(String[] args) throws AutóException, NumberFormatException {
        Scanner input = new Scanner(System.in);
        System.out.print("Adjon meg egy szabályos rendszámot: ");
        String rsz = input.nextLine();
        try {
            Autó a = new Autó(rsz, 100, true);
            a.getExtrák().add("Elektromos ablakemelő");
            a.getExtrák().add("Klíma");
            a.getExtrák().remove("Elektromos ablakemelő");
            System.out.println(a);
        } catch (AutóException ae) {
            System.out.println(ae);
        }

        int n = 4;
        if (n % 2 != 0) {
            n++;
        }
        String sor = null;
        Autó[] autók = new Autó[n];
        int autókSzáma = 0;
        int i = 0;
        System.out.println("Adjon meg " + n / 2 + " autót és " + n / 2 + " teherautót (pontosan ebben a sorrendben)!");
        while (i < n) {

            sor = input.nextLine();
            String[] token = sor.split(" ");
            if (token.length != 3 && token.length != 4) {
                System.out.println("Ebből se teherautót, se autót nem tudok létrehozni.");
            } else if (token.length == 3) {
                if (autókSzáma < n / 2) {
                    try {
                        Autó p = new Autó(token[0], Integer.parseInt(token[1]), Boolean.parseBoolean(token[2]));
                        autók[i] = p;
                        autókSzáma++;
                        System.out.println("Új " + p.getClass() + " hozzáadva.");
                        i++;

                    } catch (NumberFormatException nfe) {
                        System.out.println("Valamely érték típusa nem megfelelő.");
                    } catch (AutóException e) {
                        System.out.println(e);
                    }
                } else {
                    System.out.println("Már van elég autónk! Köszönjük!");
                }
            } else {
                if (token.length == 4) {
                    if (autókSzáma > n / 2 - 1) {
                        try {
                            //Object h = new Teherautó2(Integer.parseInt(token[0]),token[1], Integer.parseInt(token[2]),Boolean.parseBoolean(token[3]));
                            Teherautó h = new Teherautó(token[0], Integer.parseInt(token[1]), Boolean.parseBoolean(token[2]), Integer.parseInt(token[3]));
                            autók[i] = h;
                            System.out.println("Új " + h.getClass() + " teherautó hozzáadva.");
                            i++;

                        } catch (NumberFormatException nfe) {
                            System.out.println("Valamely érték típusa nem megfelelő.");
                        } catch (AutóException e) {
                            System.out.println(e);
                        }
                    } else {
                        System.out.println("Nincs elég autónk még! A teherautó hozzáadása nem sikerült! | Az autók száma jelenleg: " + autókSzáma + " db");
                    }
                }
            }

        }

        for (int j = 0; j < autók.length; j++) {
            System.out.println(autók[j]);
        }

        System.out.println("A 20 tonna feletti teherautók listája:");

        for (Teherautó t : joTeherbirasuak(autók)) {
            System.out.println(t);
        }

        System.out.println("A három legnagyobb teljesítményű autó:");

        List<Autó> szgépkocsik = new ArrayList<>();

        for (int j = 0; j < autók.length; j++) {
            szgépkocsik.add(autók[j]);
        }

        legnagyobbTeljesítményűAutók(szgépkocsik);
        System.out.println("Autó osztály példányainak száma: " + Autó.getPéldányokSzáma());

    }

}
