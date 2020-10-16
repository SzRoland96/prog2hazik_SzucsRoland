
import java.util.Random;
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
public class Player extends KőPapirOlló {
    private String tool;

    public String getTool() {
        return tool;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }
    
    public String Player()
    {
        Scanner input= new Scanner(System.in);
        
        tool = input.nextLine();
        
        return tool;
        
    }
    public String Enemy()
    {
        
        Random rand = new Random();
        int b = 0;
        b=rand.nextInt(3);
        switch(b)
        {
            case 0: tool="ko";break;
            case 1: tool="papir";break;
            case 2: tool="ollo";break;
        }
        return tool;
    }
    
    
    
}
