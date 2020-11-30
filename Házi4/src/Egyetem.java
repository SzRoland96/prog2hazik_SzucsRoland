/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Roland
 */
public class Egyetem {

    List<Személy> személyek;

    public Egyetem() {
        this.személyek = new ArrayList<>();
    }

    public List<Személy> getSzemélyek() {
        return személyek;
    }

    public void setSzemélyek(List<Személy> személyek) {
        this.személyek = személyek;
    }

    public void személyHozzáadása(Személy sz) {
        if (sz instanceof Hallgató || sz instanceof Oktató) {
            személyek.add(sz);
        }
    }

    public void személyEltávolítása(Személy sz) {
        if (sz instanceof Hallgató || sz instanceof Oktató) {
            személyek.remove(sz);
        }
    }

    public void legfiatalabbHallgatók() {
        List<Hallgató> h = new ArrayList<>();
        for (Személy sz : személyek) {
            if (sz instanceof Hallgató) {
                Hallgató hallgató = (Hallgató) sz;
                h.add(hallgató);
            }
        }

        // Collections.sort(autók);
        Collections.sort(h);
        if (h.size() < 3) {
            for (Hallgató i : h) {
                System.out.println(i);
            }
        } else {
            for (int i = 0; i < 3; i++) {
                System.out.println(h.get(i));
            }
            System.out.println();
        }
    }

    public void ITTanszekNoiOktatok(Collection<Személy> sz) {

        for (Személy i : sz) {
            if (i instanceof Oktató) {
                Oktató o = (Oktató) i;
                if (o.getTanszék().equals("IT") && !o.isFérfi()) {
                    o.setNév(o.getNév() + "!");
                }
            }
        }

    }

}
