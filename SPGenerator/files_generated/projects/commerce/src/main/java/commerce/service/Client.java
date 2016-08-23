package commerce.service;

import commerce.input.InformationToUpdate;

import commerce.output.ConnectionStatus;
import commerce.output.UpdateStatus;

public interface Client {

	public ConnectionStatus connectProfile();

	public UpdateStatus updateProfile(InformationToUpdate informationToUpdate);

}
