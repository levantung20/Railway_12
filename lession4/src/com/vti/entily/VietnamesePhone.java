package com.vti.entily;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class VietnamesePhone<Contacts> extends Phone{
	@SuppressWarnings("unused")
	private Arrays contacts;
	public VietnamesePhone() {
		contacts = new ArrayList<Contact>();
		
		
	}
	@Override
	public void insertContact(String name, String phone) {
		Contact contact = new Contact(name, phone);
		Contacts.add(contact);
		
	}
	
	@Override
	public void removeContact(String name, String newPhone) {
		Contacts.removeIf(Contact  contact.getName().equals(name));
		
	}
	@Override
	public void updateContact(String name, String newPhone) {
		for (Contact contact : contacts) {
		if (contact.getName().equals(name)) {
		contact.setPhone(newPhone);
		
		
		
	}
	@Override
	public void searchContact(String name) {
		for (Contact contact : contacts) {
			if (contact.getName().equals(name)) {
			System.out.println(contact);
			}
			}
			}
			public void printContact() {
			for (Contact contact : contacts) {
			System.out.println(contact);
	}
	
}
