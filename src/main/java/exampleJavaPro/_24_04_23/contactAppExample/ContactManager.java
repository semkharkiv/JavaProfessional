package exampleJavaPro._24_04_23.contactAppExample;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class ContactManager {
    private HashSet<Contact> myContacts = new HashSet<>();

    public void addContact(Contact contact){
        if (myContacts.contains(contact)){
            myContacts.add(contact);
            System.out.println("Contact name: " + contact.getName() + " added");
        }else{
            System.out.println("Contact name: "+ contact.getName()+ " is already exist");
        }
    }

    public void deleteContact(Contact contact){
        if (myContacts.contains(contact)){
            myContacts.remove(contact);
            System.out.println(contact.getName() + " deleted");
        }
        System.out.println("Contact name: "+ contact.getName()+ " is already exist");
    }

    public void getAllContacts(){
        Comparator<Contact> comparator = (Comparator<exampleJavaPro._24_04_23.contactAppExample.Contact>) (o1, o2) -> o1.getName().compareTo(o2.getName());
        TreeSet<Contact> contactTreeSet = new TreeSet<>(comparator);
        contactTreeSet.addAll(myContacts);
        System.out.println(contactTreeSet);
    }

    public Contact getContactByName(String name){
        for (Contact contact : myContacts){
            if (contact.getName().equals(myContacts)){
                return contact;
            }
        }
        return null;
    }
    public Contact getContactByNumber(String phoneNumber){
        for (Contact contact : myContacts){
            if (contact.getPhoneNumber().equals(phoneNumber)){
                return contact;
            }
        }
        return null;
    }
}
