import java.io.*;
import java.util.Scanner;

public class Pokemon{
    private int hp;
    private int atk;
    private int def;
    private int speed;
    private int level = 0;
    private int exp = 0;
    private String name;
    private Scanner sc = new Scanner(System.in);

    public Pokemon(){  
        hp = 68;
        atk = 75;
        def = 70;
        speed = 66;
        exp = 0;
    }

    public String setName(){
        System.out.println("What your name ? ");
        name = sc.nextLine();
        return "" ;
    }  

    //Show status charecter
    public String showStatus(){
        System.out.println("MY STATUS POINT");
        System.out.println("Your name is : "+name );
        
       
        return "";
    }

}