package state;

import model.RegisterForm;

public class InterviewState extends RegisterState{

	public InterviewState() {
		setName("Interview");
	}
	@Override
	public void nextPhase(RegisterForm registerform) {
		// TODO Auto-generated method stub
		if (registerform.getPreferences().equals("BE")) {
			registerform.setState(new ProblemSolvingState());
		}else if(registerform.getPreferences().equals("FE")) {
			registerform.setState(new UIUXState());
		}
	}

}
