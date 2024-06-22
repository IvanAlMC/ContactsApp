package tests;

import models.ContactsList;

public class test {
	
	public static void main(String[] args) {
		ContactsList list = new ContactsList();
		list.addContact("Juan", Long.parseLong("3122224998"), "juan@gmail.com");
		list.addContact("Andres", Long.parseLong("3172524098"), "andres@gmail.com");
		list.addContact("Andrea", Long.parseLong("3112224948"), "andrea@gmail.com");
		list.addContact("Laura", Long.parseLong("3132224992"), "laura@gmail.com");
		list.addContact("Camilo", Long.parseLong("3221224998"), "camilo@gmail.com");
		list.addContact("Felipe", Long.parseLong("3102224998"), "felipe@gmail.com");
		list.addContact("Carlos", 0, "");
		list.addContact("Jose", Long.parseLong("3214895655"), "");
		list.addContact("luis", 0, "luis@gmail.com");
		
		System.out.println(list.showContacts());
		System.out.println(list.getContactData("Andres"));
		System.out.println(list.getContactData("Felipe"));
		System.out.println("Borrar Andrea");
		list.deleteContact("Andrea");
		System.out.println(list.showContacts());
		System.out.println(list.getFirstContact());
		
	}
}
