/**
 * This program makes little pictures using stars. These methods
 * are so much fun to write.
 *
 * (Look in the StarInstructions.txt file to see what each method
 *  should draw.)
 *
 * @author  Sean Donlin
 * @version 1/22/18
 */


class StarPatterns 
{
    public static void starGrid(int h, int w)
    {           
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {               
                System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }
    
    public static void starBox(int h, int w)
    {
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {   
                if (i==0 || i==h-1 || j==0 || j==w-1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }   
    }

    public static void starX(int h)
    {
        int w = h;

        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {
                if (i==j || i+j==h-1)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }   
    }
    
    public static void starZ(int h)
    {
        int w = h;
        
        for (int i=0;i<h; i++)
        {
            for (int j=0; j<w; j++)
            {
                if(i==0 || i==w-1 || i==w-j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            }
    }
    
    public static void starXBox(int h)
    {
        int w = h;
        
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {
                if (i==j || i+j==h-1 ||i==0 || i==h-1 || j==0 || j==w-1)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }   
    }
    
    public static void twoStarBoxes(int w,int h)
    {
        int x = w * 2;//j
        int y = h * 2;//i
        
        for (int i=0; i<y; i++)
        {
            for (int j=0; j<x; j++)
            {
                if ((j < h && i < w)||(j < y && i < x))
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }   
    }
    
    public static void main(String[] args) 
    {
        starGrid(5, 5);
        System.out.println();

        starBox(7, 9);
        System.out.println();
        
        starX(7);
        System.out.println();
        
        starZ(7);
        System.out.println();
        
        starXBox(7);
        System.out.println();
        
        twoStarBoxes(4,6);
        System.out.println();
    }
     
}