package iterator;

import model.RegisterForm;
import model.RegisterFormList;

public class FIFOIterator implements Iterator{

	private RegisterFormList registerForms;
	private int currentPos;
	
	public FIFOIterator(RegisterFormList registerForms) {
		// TODO Auto-generated constructor stub
		this.registerForms = registerForms;
		this.currentPos = 0;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		boolean isHasNext = this.currentPos < this.registerForms.getRegisterForms().size();
		
		if(currentPos >= this.registerForms.getRegisterForms().size()) {
			currentPos = 0;
		}
		
		return isHasNext;
	}

	@Override
	public RegisterForm getNext() {
		// TODO Auto-generated method stub
		if (!hasNext()) {
			return null;
		}
		RegisterForm registerForm = this.registerForms.getRegisterForms().get(currentPos);
		
		currentPos++;
		
		return registerForm;
		
	}

}
