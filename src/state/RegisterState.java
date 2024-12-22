package state;

import model.RegisterForm;

public abstract class RegisterState {
	protected String name;
	
	public abstract void nextPhase(RegisterForm registerform);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
