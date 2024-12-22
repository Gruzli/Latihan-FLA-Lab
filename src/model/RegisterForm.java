package model;

import state.RegisterState;
import state.SubmissionState;

public class RegisterForm {
	private String name;
	private int experience;
	private String preferences;
	private String applicantCode = "";
	private RegisterState state;
	
	public RegisterForm(String name, int experience, String preferences, String applicantCode) {
		super();
		this.name = name;
		this.experience = experience;
		this.preferences = preferences;
		this.applicantCode = applicantCode;
		this.state = new SubmissionState();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getPreferences() {
		return preferences;
	}
	public void setPreferences(String preferences) {
		this.preferences = preferences;
	}
	public String getApplicantCode() {
		return applicantCode;
	}
	public void setApplicantCode(String applicantCode) {
		this.applicantCode = applicantCode;
	}
	public RegisterState getState() {
		return state;
	}
	public void setState(RegisterState state) {
		this.state = state;
	}
	
	public void nextPhase() {
		this.state.nextPhase(this);
	}
}
