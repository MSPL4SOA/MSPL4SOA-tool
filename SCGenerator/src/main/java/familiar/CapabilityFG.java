package familiar;

import java.util.ArrayList;

public class CapabilityFG {

	public int inputDataCount;
	public int outputDataCount;

	public String name;
	public String id;

	public String capabilityFMSP;
	public String capabilityFMSC;
	
	public String capabilityFM;
	
	public ArrayList<InputFG> inputFGs;
	public ArrayList<OutputFG> outputFGs;

	public CapabilityFG() {
		inputFGs = new ArrayList<InputFG>();
		outputFGs = new ArrayList<OutputFG>();
	}
	
}
