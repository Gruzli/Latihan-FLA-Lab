package main;

import java.util.Random;
import java.util.Scanner;

import iterator.Iterator;
import model.RegisterForm;
import model.RegisterFormList;

public class Main {

	private Scanner scan = new Scanner(System.in);
	private Random rand = new Random();
	private RegisterFormList forms = new RegisterFormList();
	
	public Main() {
		int choice = -1;
		do {
			System.out.println("1.Register Form");
			System.out.println("2. View Form");
			System.out.println("3. Exit");
			
			try {
				choice = scan.nextInt();
			} catch (Exception e) {
				System.out.println("Input must be number");
				choice = -1;
			}
			
			scan.nextLine();
			
			if (choice == 1) {
				registerForm();
			}else if(choice == 2){
				viewForm();
			}
			
		} while (choice < 3);
	}
	
	private void viewForm() {
		// TODO Auto-generated method stub
		Iterator it = forms.createIterator();
		
		while (it.hasNext()) {
			RegisterForm registerForm = it.getNext();
			
			System.out.println("Applicant Code: " + registerForm.getApplicantCode());
			System.out.println("Applicant Name: " + registerForm.getName());
			System.out.println("Job Experience: " + registerForm.getExperience());
			System.out.println("Job Preferences: " + registerForm.getPreferences());
			System.out.println("Current Phase: " + registerForm.getState().getName());
		}
		
		String choice;
		do {
			System.out.print("Input N for next phase | Q for quit: ");
			choice = scan.nextLine();
		} while (!choice.equals("N") && !choice.equals("Q"));
		
		if (choice.equals("N")) {
			while(it.hasNext()) {
				RegisterForm registerForm = it.getNext();
				registerForm.nextPhase();
			}
		}
	}

	private void registerForm() {
		// TODO Auto-generated method stub
		String name;
		int experience;
		String preferences;
		String applicantCode = "";
		
		do {
			System.out.print("Input name [cannot empty] :");
			name = scan.nextLine();
		} while (name.isEmpty());
		
		do {
			try {
				System.out.print("Input experience [>1] :");
				experience = scan.nextInt();
			} catch (Exception e) {
				System.out.println("Input must be number");
				experience = -1;
			}
			
			scan.nextLine();
		} while (experience < 1);
		
		do {
			System.out.print("Input preferences [BE | FE] case sensitive :");
			preferences = scan.nextLine();
		} while (!preferences.equals("BE") && !preferences.equals("FE"));
		
		String pattern = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int min = 0;
		int max = pattern.length() -1;
		
		for (int i = 0; i < 5; i++) {
			int index = rand.nextInt(max - min) + min;
			applicantCode += pattern.charAt(index);
		}
		
		RegisterForm registerform = new RegisterForm(name, experience, preferences, applicantCode);
		
		forms.getRegisterForms().add(registerform);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
