import java.util.*;
import java.io.*;

class file
{
    public static void main(String args[])
    {
            try
            {
                    Scanner s1 = new Scanner(System.in);
                    
                    System.out.println("\nPRESS ENTER TO CREATE THE FILE\n");
                    s1.nextLine();
                    // Creating a File
                    File myob = new File("java.txt");
                    if(myob.createNewFile())
                    {
                            System.out.println("File successfully created");
                    }
                    else
                    {
                            System.out.println("File already exist");
                    }
                    
                    
                    System.out.println("\n\nPRESS ENTER TO WRITE THE FILE\n");
                    s1.nextLine();
                    // Writing to the created file
                    FileWriter myob1 = new FileWriter("java.txt");
                    myob1.write("AJNAS >>> USMAAN");
                    myob1.close();
                    System.out.println("Succesfully wrote to file java");
                    
                    System.out.println("\n\nPRESS ENTER TO READ FROM FILE\n");
                    s1.nextLine();
                    //Reading From a File
                    Scanner s = new Scanner(myob);
                    while(s.hasNextLine())
                    {
                            System.out.println(s.nextLine());
                    }
                    s.close();
                    
                    System.out.println("\n\nPRESS ENTER TO WRITE THE CONTENT TO  A NEW FILE\n");
                    s1.nextLine();
                    //Writing to another File
                    File myob2 = new File("java1.txt");
                    if(myob2.createNewFile())
                    {
                            System.out.println("File successfully created");
                    }
                    else
                    {
                            System.out.println("File already exist");
                    }
                    FileWriter myob3 = new FileWriter("java1.txt");
                    Scanner s2 = new Scanner(myob);
                    do
                    {
                            String Data1 = s2.nextLine();
                            System.out.println(Data1);
                            myob3.write(Data1);
                    }while(s2.hasNextLine());
                    s2.close();
                    myob3.close();
                    
                    System.out.println("Successfully wrote to file");
                    
                    System.out.println("\n\nPRESS ENTER TO DELETE BOTH THE CREATED FILE\n");
                    s1.nextLine();
                    //Deleting both the created file
                    if(myob.delete())
                    {
                            System.out.println("Successfully Deleted the file" + myob.getName());
                    }
                    else
                    {
                            System.out.println("Failed to delete the java");
                    }
                    if(myob2.delete())
                    {
                            System.out.println("Successfully Deleted the file" + myob2.getName());
                    }
                    else
                    {
                            System.out.println("Failed to delete the java1");
                    }
            }
            catch(IOException e)
            {
                    System.out.println("An error occured : " + e);
            }
    }
}

