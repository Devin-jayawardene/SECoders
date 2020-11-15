
package hackjava;
import java.util.Scanner;

public class Hackjava {

    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x;
        display();
        x=scan.nextInt();
        while(x!=7)
        {
            Scanner sc=new Scanner(System.in);
           
            if(x==2)
            {
                Contact objCon=new Contact();
            ContactList objList=new ContactList();
        
                System.out.println("Please enter name");
                objCon.setname(sc.nextLine());
      
                System.out.println("Please add phone number");
                objCon.setphoneNo(sc.nextLine());
                
                objList.addContact(objCon);
            }
            else if(x==4)
            {
                Contact objCon=new Contact();
                ContactList objList=new ContactList();
                System.out.println("Please enter name of the contact that you want to change");
                String editname=sc.nextLine();
                System.out.println("Please enter the new phone number");
                String editphone=sc.nextLine();
                objList.editContact(editname,editphone);
                
            }
            else if(x==3)
            {
                Contact objCon=new Contact();
                ContactList objList=new ContactList();
                System.out.println("Please enter name of the contact that you want to delete");
                String deletename=sc.nextLine();
                objList.deleteContact(deletename);
            }
            else if(x==1)
            {
                ContactList objList=new ContactList();
                objList.displayContacts();
                
            }
            else if(x==6)
            {
                ContactList objList=new ContactList();
                objList.saveContacts();
            }
            else if(x==5)
            {
                ContactList objList=new ContactList();
                Contact objCon=new Contact();
                objList.loadContacts(objCon);
            }
            
            display();
            x=scan.nextInt();
        }
        if(x==7)
        {
            System.exit(0);
        }
    
    
        
        
    }
    public static void display()
    {
          System.out.println("Enter 1 to display all contacts");
          System.out.println("Enter 2 to add contact");
          System.out.println("Enter 3 to remove contact");
          System.out.println("Enter 4 to edit a contact");
          System.out.println("Enter 5 to load contacts from a text file.");
          System.out.println("Enter 6 to save contacts to the text file.");
          System.out.println("Enter 7 to exit from the program");
    }
}
