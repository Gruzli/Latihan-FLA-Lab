package state;

import model.RegisterForm;

public class SubmissionState extends RegisterState{

	public SubmissionState() {
		// TODO Auto-generated constructor stub
		setName("Submission");
	}
	@Override
	public void nextPhase(RegisterForm registerform) {
		// TODO Auto-generated method stub
		registerform.setState(new InterviewState());
	}

}
