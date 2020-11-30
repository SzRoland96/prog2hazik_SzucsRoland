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
public class JégkorongMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Jégkorong> list = new ArrayList<>();
        
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            if(line.equals("vege")){
                break;
            }
            String tok[];
            String tok1[];
            tok=line.split(":");
            tok1=tok[0].split("-");
            String cs1=tok1[0];
            String cs2=tok1[1];
            
            tok1=tok[1].split(",");
            int cs1g=0;
            int cs2g=0;
            for (int i = 0; i < tok1.length; i++) {
                String tmp[] = tok1[i].split("-");
                cs1g=cs1g+Integer.parseInt(tmp[0]);
                cs2g=cs2g+Integer.parseInt(tmp[1]);
            }
            int cs1p=0;
            int cs2p=0;
            if (tok1.length==3){
                if(cs1g>cs2g){
                    cs1p=3;
                    cs2p=0;
                }else{
                    cs1p=0;
                    cs2p=3;
                }
            }else{
                if(cs1g>cs2g){
                    cs1p=2;
                    cs2p=1;
                }else{
                    cs1p=1;
                    cs2p=2;
                }
            }
            
            int volt=0;
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).getNev().equals(cs1)){
                    list.get(i).addGol(cs1g);
                    list.get(i).addPoint(cs1p);
                    volt=1;
                    break;
                }
            }
            if(volt==0){
                list.add(new Jégkorong(cs1, cs1p, cs1g));
            }
            volt=0;
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).getNev().equals(cs2)){
                    list.get(i).addGol(cs2g);
                    list.get(i).addPoint(cs2p);
                    volt=1;
                    break;
                }
            }
            if(volt==0){
                list.add(new Jégkorong(cs2, cs2p, cs2g));
            }           
        }
        Collections.sort(list);
        for (Jégkorong object : list) {
            System.out.println(object.toString());
        }
    }
}
