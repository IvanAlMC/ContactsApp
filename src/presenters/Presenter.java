package presenters;

import models.ContactsList;
import views.View;

public class Presenter {
	private ContactsList contactsList;
	private View view;
	
	public Presenter() {
		contactsList = new ContactsList();
		view = new View();
		addContact("Juan", Long.parseLong("3145678909"), "juan@gmail.com");
		addContact("Andrea", Long.parseLong("3175678968"), "andrea@gmail.com");
		addContact("Pablo", Long.parseLong("3115678959"), "pablo@gmail.com");
		addContact("Laura", Long.parseLong("3215678988"), "laura@gmail.com");
		addContact("Adolfo", Long.parseLong("3105678945"), "adolfo@gmail.com");
		addContact("Daniela", Long.parseLong("3144568909"), "daniela@gmail.com");
		addContact("Daniel", Long.parseLong("3145244655"), "daniel@gmail.com");
		addContact("Paola", Long.parseLong("3215678909"), "paola@gmail.com");
		addContact("Jorge", Long.parseLong("3205678909"), "");
		addContact("Maria", 0, "maria@gmail.com");
		addContact("Fernando", 0, "");
		init();
	}
	
	public static void main(String[] args) {
		new Presenter();
	}
	
	public void init() {
		showMenu();
		menu(getOption());
		init();
	}
	
	public void menu(int option) {
		switch (option) {
		case 1:
			addContact(getName(), getNumber(), getEmail());
			break;
		case 2: 
			showInformationContact(getName());
			break;
		case 3:
			deleteContact(getName());
			break;
		case 4:
			showContacts();
			break;
		case 5:
			showExtraInfo();
			break;
		case 6:
			showFinishMessage();
			System.exit(0);
			break;
		default:
			showMessageNotImplemented();
			break;
		}
	}
	
	private int getOption() {
		return view.getOption();
	}
	
	private void showMenu() {
		view.showMenu();
	}
	
	private void showMessageNotImplemented() {
		view.showNoImplemented();
	}
	
	private void showFinishMessage() {
		view.showMessageFinish();
	}
	
	private String getName() {
		return view.getName();
	}
	
	private long getNumber(){
		return view.getNumber();
	}
	
	private String getEmail() {
		return view.getEmail();
	}
	
	private void addContact(String name, long number, String email) {
		contactsList.addContact(name, number, email);
	}
	
	private void showInformationContact(String name) {
		try {
			view.showInformationContact(contactsList.getContactData(name));
		}catch (java.lang.NullPointerException e) {
			view.showNoExist();
		}
	}
	
	private void showExtraInfo() {
		view.showFirst(contactsList.getFirstContact());
		view.showLast(contactsList.getLastContact());
		view.showQuantity(contactsList.getnumberContacts());
	}
	
	private void deleteContact(String name) {
		try {
			contactsList.deleteContact(name);
		}catch (java.lang.NullPointerException e) {
			view.showNoExist();
		}
		
	}
	
	private void showContacts() {
		view.showContacts(contactsList.showContacts());
	}
	
}
