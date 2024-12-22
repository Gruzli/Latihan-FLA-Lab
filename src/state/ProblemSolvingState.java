package state;

import model.RegisterForm;

public class ProblemSolvingState extends RegisterState{

	public ProblemSolvingState() {
		setName("Problem Solving");
	}
	@Override
	public void nextPhase(RegisterForm registerform) {
		// TODO Auto-generated method stub
		registerform.setState(new FinishState());
	}

}
