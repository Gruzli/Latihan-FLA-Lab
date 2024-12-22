package model;

import java.util.Vector;

import iterator.FIFOIterator;
import iterator.IterableCollection;
import iterator.Iterator;

public class RegisterFormList implements IterableCollection{
	Vector<RegisterForm> registerForms;
	
	public RegisterFormList() {
		registerForms = new Vector<>();
	}

	public Vector<RegisterForm> getRegisterForms() {
		return registerForms;
	}

	public void setRegisterForms(Vector<RegisterForm> registerForms) {
		this.registerForms = registerForms;
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new FIFOIterator(this);
	}
	
}
