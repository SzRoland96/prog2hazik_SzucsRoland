/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roland
 */
import java.lang.Math;
public class Metódusok {
    
    /* Első feladat, növekvő sorrendbe rendezés!*/
    public static void növekvő(int a, int b, int c)
    {
        int max=0;
        int köz=0;
        int min=0;
        
        if (a >= b && a >= c)
        {
            max = a;
            if (b >= c)
            {
                min = c;
                köz = b;
            }
            else
            {
                min = b;
                köz = c;
            }
        }
        if (b >= a && b >= c)
        {
            max = b;
            if (a >= c)
            {
               min = c;
               köz = a;
            }
            else
            {
                min = a;
                köz = c;
            }
        }
        if (c >= a && c >= b)
        {
             max = c;
             if (a >= b)
             {
                 min = b;
                 köz = a;
             }
             else
             {
                 min = a;
                 köz = b;
             }
        }

        System.out.println(min);
        System.out.println(köz);
        System.out.println(max);
    }
    
    /*Második feladat: 3 valós szám minimuma és absz. értékeinek maximuma*/
    public static void min_absmax(double a, double b, double c)
    {
        double max = 0;
        double min = 0;
        if (a <= b && a <= c)
        {
            min=a;
        }
        if (b <= a && b <= c)
        {
            min=b;
        }
        if (c <= a && c <= b)
        {
             min=c;   
        }
        if (Math.abs(a) >= Math.abs(b) && Math.abs(b) >= Math.abs(c))
        {
            max=Math.abs(a);
        }
        if (Math.abs(b) >= Math.abs(a) && Math.abs(b) >= Math.abs(c))
        {
            max=Math.abs(b);
        }
        if (Math.abs(c) >= Math.abs(a) && Math.abs(c) >= Math.abs(b))
        {
             max=Math.abs(c);
        }
        
        System.out.println("Minimum: "+min);
        System.out.println("Abszolút értékeinek maximuma: "+max);
    }
    
    /*Harmadik feladat:paraméterként kap négy valós számot: a, b, c, d. Írjuk ki a
    négy számot az adott sorrendben majd, ha d  0, az a, c, b, d sorrendben,
    egyébként az a, b, d, c sorrendben!*/
    public static void sorrend(double a, double b, double c, double d)
    {
        System.out.println("Eredeti sorrend: "+a+"; "+b+"; "+c+"; "+d);
        if(d>=0)
        {
            System.out.println("Ha d>=0 : "+a+"; "+c+"; "+b+"; "+d);
        }
        else
            System.out.println("Ha d<0 : "+a+"; "+b+"; "+d+"; "+c);
    }
    
    /*4. feladat:Adott három szigorúan pozitív valós szám: a, b, c. Írjunk függvényt, amely
    paraméterként megkapja ezeket a számokat és eldönti, hogy képezhetik-e ezek a
    számok egy háromszög oldalait*/
    public static boolean háromszög(double a, double b, double c)
    {
       if((a<b+c) && (b<a+c) && (c<a+b))
           return true;
       else
           return false;
    }
    
    /*5. Írjunk függvényt, amely visszaadja, hogy hány szökőév volt/lesz két különböző
    évszám között!*/
    public static int szökőév(int a, int b)
    {
        int szökőévdb=0;
        for(int i =a; i<= b; i++)
        {
            if((i%4)==0 && (i%100)!=0 || (i%400)==0)
            {
                szökőévdb++;
            }
        }
        return szökőévdb;
    }
    
    /*6.feladat: Írjunk eljárást, amely paraméterként megkap egy dolgozatra adott jegyet, és kiírja
    a dolgozat szöveges értékelését az érdemjegy alapján*/
    public static void jegy(int a)
    {
        switch(a)
        {
            case 1: System.out.println("Elégtelen");break;
            case 2: System.out.println("Elégséges");break;
            case 3: System.out.println("Közepes");break;
            case 4: System.out.println("Jó");break;
            case 5: System.out.println("Jeles");break;
            default: System.out.println("Nincs ilyen érdemjegy.");break;
        }
    }
    
    /*7.feladat:Számítsuk ki két természetes szám egész hányadosát ismételt kivonásokkal!*/
    public static int Osztás(int a, int b)
    {
        int hányados=0;
        while(a>=b)
        {
            hányados++;
            a=a-b;
        }
        return hányados;
    }
    
    /*8.feladat: Adva van egy nullától különböző természetes szám (n). Tervezzünk
    algoritmust, amely eldönti, hogy az adott szám prímszám-e vagy sem!*/
    /* (A) verzió*/
    public static boolean Prím1(int n)
    {
        int osztók_száma=0;
        for(int i=1;i<=n;i++)
        {
            if((n%i)==0)
            {
                osztók_száma++;
            }
            
        }
        if(osztók_száma==2)
        {
            return true;
        }
        else
            return false;
    }
    
    /*(B) verzió*/
    public static boolean Prím2(int n)
    {
        boolean l= true;
        for(int i=2; i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                l=false;
            }
        }
        return l;
    }
    
    /*9.feladat: Generáljuk és írjuk ki az első n Fibonacci-számot!*/
    /* (A) verzió*/
    public static void Fibonacci1(int n)
    {
        int a=0;
        int b=1;
        int c=0;
        int k=0;
        if(n==1)
        {
            System.out.println(a);;
        }
        else 
        if(n==2)
        {
            System.out.println(a);
            System.out.println(b);
                
        }
        else
        {
            c=a+b;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            k=3;
            while(k<n)
            {
                a=b;
                b=c;
                c=a+b;
                System.out.println(c);
                k++;
            }
        }
            
    }
    /*(B) verzió*/
    public static void Fibonacci2(int n)
    {
        int a=1;
        int b=0;
        for(int i=1;i<=n;i++)
        {
            System.out.println(b);
            b=a+b;
            a=b-a;
        }
    }
    /*10.feladat: Adott az n természetes szám, amelynek legfeljebb 9 számjegye van.
    Hozzuk létre és írjuk ki azt a számot, amely az eredeti szám számjegyeit
    fordított sorrendben tartalmazza.*/
    public static void Fordított_szám(int n)
    {
        int újszám=0;
        while(n!=0)
        {
            újszám=újszám*10+(n%10);
            n=(n/10);
        }
        System.out.println("A megadott szám fordítotja: "+újszám);
    }
    
    /*11.feladat: Írjunk függvényt, amely paraméterként kap egy 0 és 12 közötti egész számot és
    visszaadja annak faktoriálisát! */
    public static int Faktoriális(int n)
    {
        int fakt=1;
        for(int i=1;i<=n;i++)
        {
            fakt=fakt*i;
        }
        return fakt;
    }
    
    /*12.feladat: Írjunk eljárást, amely megtalálja és kiírja az összes k-val osztható számot, amelyek
    két adott szám (n1 és n2 …ezeket az eljárás paraméterei) között találhatók!*/
    public static void osztók(int n1, int n2,int k)
    {
        
        for(int i=n1;i<=n2;i++)
        {
            if(i%k==0)
            {
                System.out.println(i);
            }
        }
    }
    
    /*13.feladat: Írjunk függvényt, amely megkeresi azt a legkisebb Fibonacci-számot, amely
    nagyobb mint egy adott n szám (az n számot paraméterként adjuk át, az eredményt
    visszatérítési értékként)! */
    public static int Fibo(int n)
    {
        int a=1;
        int b=0;
        while(true)
        {
            b=a+b;
            a=b-a;
            if(b>n)
                break;
        }
        return b;
    }
    /*14.feladat: . Írjunk eljárást, amely megkeresi azokat az 1000-nél kisebb számokat, amelyek
    egyenlők számjegyeik köbének összegével! Ezeket írjuk a standard kimenetre.*/
    public static void számjegyköb()
    {
        int egy = 0;
        int tíz = 0;
        int száz = 0;
        int összeg = 0;
        for(int j= 0; j<1000; j++)
        {
            int i = j;
            egy = i%10;
            i = i/10;
            tíz = i%10;
            i = i/10;
            száz = i%10;
            i = i/10;
            összeg = (int)Math.pow(egy,3) + (int)Math.pow(tíz,3) + (int)Math.pow(száz,3);
            if(összeg == j)
            {
                    System.out.println("Szám: " +j+ " == " + "Köbök összege: "+ összeg);
            }
        }
    }
    public static void main(String[] args) {
        
        int a=1;
        int b=2;
        int c=3;
        növekvő(a,b,c);
        min_absmax(3.9,17.87,-15.14);
        sorrend(1,2,3,4);
        System.out.println(háromszög(41,13,25));
        System.out.println(szökőév(2000,2020));
        jegy(5);
        System.out.println(Osztás(54,8));
        System.out.println(Prím1(5));
        System.out.println(Prím2(5));
        Fibonacci1(11);
        Fibonacci2(11);
        Fordított_szám(743);
        System.out.println(Faktoriális(11));
        osztók(6,24,6);
        System.out.println(Fibo(30));
        számjegyköb();
    }
    
}
 