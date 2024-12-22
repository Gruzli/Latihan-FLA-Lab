package state;

import model.RegisterForm;

public class UIUXState extends RegisterState{

	public UIUXState() {
		// TODO Auto-generated constructor stub
		setName("UI UX");
	}
	@Override
	public void nextPhase(RegisterForm registerform) {
		// TODO Auto-generated method stub
		registerform.setState(new FinishState());
	}

}
