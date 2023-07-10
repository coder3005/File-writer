/* Write on File */
import java.io.*;
class fileWriter
{
    public static void main(String[] args) {
        
        try
        {
            FileWriter f=new FileWriter("C:\\Users\\Abhi Gupta\\downloads\\AG.txt");
            try
            {
                f.write("Java Programming is the best Language..!");
            }
            finally
            {
                f.close();
            }
            System.out.println("Successfully data wrote in file");
        }
        catch(IOException i)
        {
            System.out.println(i);
        }
    }
}
