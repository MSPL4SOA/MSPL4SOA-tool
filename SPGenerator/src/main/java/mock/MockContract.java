package mock;

import features.bean.Capability;
import features.bean.Contract;
import features.bean.Input;
import features.bean.Output;
import features.bean.Service;

public class MockContract {

	public static void main(String[] args) {

		// InputDataClassName
		// InputName
		// InputType
		// OutputDataClassName
		// OutputName
		// OutputType
		// CapabilityName
		// ServiceName

		Contract contract = new Contract();

		Service service1 = new Service();
		service1.interfaceName = "Cart";

		/////////////////////

		//////////////////
		Capability capability1_1 = new Capability();
		capability1_1.name = "addProduct";
		capability1_1.dataInputClassName = "Product";

		Input input1_1_1 = new Input();
		input1_1_1.name = "id";
		input1_1_1.type = "String";
		input1_1_1.value = "P001";

		Input input1_1_2 = new Input();
		input1_1_2.name = "name";
		input1_1_2.type = "String";
		input1_1_2.value = "PS4";

		Input input1_1_3 = new Input();
		input1_1_3.name = "qte";
		input1_1_3.type = "Integer";
		input1_1_3.value = "4";

		capability1_1.inputs.add(input1_1_1);
		capability1_1.inputs.add(input1_1_2);
		capability1_1.inputs.add(input1_1_3);

		service1.capabilities.add(capability1_1);

		///////////////

		Capability capability1_2 = new Capability();
		capability1_2.name = "getProduct";
		capability1_2.dataInputClassName = "Order";
		capability1_2.dataOutputClassName = "OrderResponse";

		Input input1_2_1 = new Input();
		input1_2_1.name = "id";
		input1_2_1.type = "String";
		input1_2_1.value = "P001";

		capability1_2.inputs.add(input1_2_1);

		Output output1_2_1 = new Output();
		output1_2_1.name = "id";
		output1_2_1.type = "String";
		output1_2_1.value = "P001";

		Output output1_2_2 = new Output();
		output1_2_2.name = "name";
		output1_2_2.type = "String";
		output1_2_2.value = "Keyboard";

		capability1_2.outputs.add(output1_2_1);
		capability1_2.outputs.add(output1_2_2);

		service1.capabilities.add(capability1_2);

		///////////////

		Capability capability1_3 = new Capability();
		capability1_3.name = "bayProduct";
		capability1_3.dataInputClassName = "Bay";
		capability1_3.dataOutputClassName = "BayResponse";

		Input input1_3_1 = new Input();
		input1_3_1.name = "id";
		input1_3_1.type = "String";
		input1_3_1.value = "P001";

		capability1_3.inputs.add(input1_3_1);

		Output output1_3_1 = new Output();
		output1_3_1.name = "message";
		output1_3_1.type = "String";
		output1_3_1.value = "Product_buying_success";

		capability1_3.outputs.add(output1_3_1);

		service1.capabilities.add(capability1_3);

		/////////

		Capability capability1_4 = new Capability();
		capability1_4.name = "bayAllProduct";
		capability1_4.dataInputClassName = "BayAll";
		capability1_4.dataOutputClassName = "BayAllResponse";

		Output output1_4_1 = new Output();
		output1_4_1.name = "message";
		output1_4_1.type = "String";
		output1_4_1.value = "All_product_buying_success";

		capability1_4.outputs.add(output1_4_1);

		service1.capabilities.add(capability1_4);

		////////////////////////
		contract.services.add(service1);
		////////////////////////

		// service 2
		////////////////////

		Service service2 = new Service();
		service2.interfaceName = "Client";

		/////////////////////

		//////////////////
		Capability capability2_1 = new Capability();
		capability2_1.name = "connectProfile";
		capability2_1.dataInputClassName = "Profile";
		capability2_1.dataOutputClassName = "ProfileResponse";

		Input input2_1_1 = new Input();
		input2_1_1.name = "user";
		input2_1_1.type = "String";
		input2_1_1.value = "Akram";

		Input input2_1_2 = new Input();
		input2_1_2.name = "password";
		input2_1_2.type = "String";
		input2_1_2.value = "sEcrEt";

		capability2_1.inputs.add(input2_1_1);
		capability2_1.inputs.add(input2_1_2);

		Output output2_1_1 = new Output();
		output2_1_1.name = "message";
		output2_1_1.type = "String";
		output2_1_1.value = "Welcome_to_your_profile";

		capability2_1.outputs.add(output2_1_1);

		service2.capabilities.add(capability2_1);

		///////////////

		//////////////////
		Capability capability2_2 = new Capability();
		capability2_2.name = "updateProfile";
		capability2_2.dataInputClassName = "InformationProfile";
		capability2_2.dataOutputClassName = "UpdateProfileResponse";

		Input input2_2_1 = new Input();
		input2_2_1.name = "user";
		input2_2_1.type = "String";
		input2_2_1.value = "Ahmad";

		Input input2_2_2 = new Input();
		input2_2_2.name = "password";
		input2_2_2.type = "String";
		input2_2_2.value = "sEcrEt";

		Input input2_2_3 = new Input();
		input2_2_3.name = "address";
		input2_2_3.type = "String";
		input2_2_3.value = "World";

		Input input2_2_4 = new Input();
		input2_2_4.name = "age";
		input2_2_4.type = "Integer";
		input2_2_4.value = "28";

		capability2_2.inputs.add(input2_2_1);
		capability2_2.inputs.add(input2_2_2);
		capability2_2.inputs.add(input2_2_3);
		capability2_2.inputs.add(input2_2_4);

		Output output2_2_1 = new Output();
		output2_2_1.name = "message";
		output2_2_1.type = "String";
		output2_2_1.value = "Your_profile_have_been_updated";

		capability2_1.outputs.add(output2_2_1);

		service2.capabilities.add(capability2_2);

		///////////////

		//////////////////
		Capability capability2_3 = new Capability();
		capability2_2.name = "retrievePassword";
		capability2_2.dataInputClassName = "InformationPassword";
		capability2_2.dataOutputClassName = "retrievePasswordResponse";

		Input input2_3_1 = new Input();
		input2_3_1.name = "user";
		input2_3_1.type = "String";
		input2_3_1.value = "Ahmad";

		capability2_2.inputs.add(input2_3_1);

		Output output2_3_1 = new Output();
		output2_3_1.name = "password";
		output2_3_1.type = "String";
		output2_3_1.value = "sEcrEt";

		capability2_1.outputs.add(output2_3_1);

		service2.capabilities.add(capability2_3);

		///////////////

		////////////////////////
		contract.services.add(service2);
		////////////////////////

		/////////

		System.out.println("ok");

	}

}
