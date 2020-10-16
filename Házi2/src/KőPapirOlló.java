/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roland
 */
public class KőPapirOlló {
    private Player player1;
    private Player player2;
    
    public boolean checkTheTool(String tool)
    {
        if(tool.equals("ko") || tool.equals("papir") || tool.equals("ollo"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void KiNyert(Player player1, Player player2)
    {
        if(player1.getTool().equals(player2.getTool()))
        {
            System.out.println("DRAW");
        }
        else if(player1.getTool().equals("ko") && player2.getTool().equals("ollo"))
        {
            System.out.println("WIN");
        }
        else if (player1.getTool().equals("papir") && player2.getTool().equals("ko")) 
        {
            System.out.println("WIN");
        }
        else if (player1.getTool().equals("ollo") && player2.getTool().equals("papir")) 
        {
            System.out.println("WIN");
        }
        else
        {
            System.out.println("LOSE");
        }
    }
    
    public void Game()
    {
        KőPapirOlló game1= new KőPapirOlló();
        player1 = new Player();
        player2 = new Player();
        
        do
        {
            System.out.println("Válasszon az alábbiak közül: Ko -- Papir -- Ollo -- Vége!");
            player1.setTool(player1.Player());
            if(player1.checkTheTool(player1.getTool()))
            {
                player2.setTool(player2.Enemy());
                System.out.println("Player: "+player1.getTool()+ "\t Enemy:"+player2.getTool());
                KiNyert(player1, player2);
                
            }
            else
            {
                if(!(player1.getTool().equals("vege")))
                {
                    System.out.println("Ez nem volt a felsoroltak között...");
                    continue;
                }
                
            }
            
        }while(!(player1.getTool().equals("vege")));
        System.out.println("Vége a játéknak!");
        
        
        
    }
    public static void main(String[] args) {
        KőPapirOlló játék = new KőPapirOlló();
        játék.Game();
        
    }
}
