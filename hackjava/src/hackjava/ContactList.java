
package hackjava;
import java.util.ArrayList; 
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;
public  class ContactList {
    
    
    static ArrayList<Contact> List = new ArrayList<>();
     
    
    public void addContact(Contact x)
    {
        List.add(x);
    }
    public void editContact(String editname,String editphone)
    {
        for(int i=0;i<List.size();i++)
        {
            if(List.get(i).getname().contains(editname))
            {
                List.get(i).setphoneNo(editphone);
            }
            
        }
    }
    public void displayContacts()
    {
        for(int k=0;k<List.size();k++)
        {
            System.out.println(List.get(k).getname()+" "+List.get(k).getphoneNo());
        }
        
    }
     public void loadContacts(Contact objCon)
    {
        try {
            File f = new File("contact");
            Scanner scan1=new Scanner(f);
            while(scan1.hasNextLine())
            {
                Scanner scan=new Scanner(f);
                objCon.setname(scan.next());
                objCon.setphoneNo(scan.next());
                addContact(objCon);
            }
            
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
    public void saveContacts()
    {
        try {
            FileWriter fw =new FileWriter("contact.txt");
            for(int k=0;k<List.size();k++)
            {
                fw.write(List.get(k).getname()+" "+List.get(k).getphoneNo()+"\n");
            }
            fw.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
    public void deleteContact(String deletename)
    {
        for(int j=0;j<List.size();j++)
        {
            if(List.get(j).getname().contains(deletename))
            {
                List.remove(j);
            }
    }

    
    
    
    
    
    
    
}
}