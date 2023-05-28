package main.exampleJavaPro._24_04_23.contactAppExample;

public class ContactsStartProgram {
    public static void main(String[] args) {
        Contact contact1 = new Contact("John", "+4443573473457");
        Contact contact2 = new Contact("Thomas", "+49574572547245");
        Contact contact3 = new Contact("Ruslan", "+37165378568356");
        Contact contact4 = new Contact("Victor", "+380674673467");
        Contact contact5 = new Contact("Olga", "+36346756785367");

        ContactManager contactManager = new ContactManager();

        contactManager.addContact(contact1);
        contactManager.addContact(contact2);
        contactManager.addContact(contact3);
        contactManager.addContact(contact4);
        contactManager.addContact(contact5);

        contactManager.getAllContacts();
    }
}
