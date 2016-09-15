package scfactory;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;

import features.bean.Input;
import util.Functions;
import util.JavaCodeFormatter;

public class InputFactory {

	public static Object getInstance(SCGenerator configurationGenerating) throws SCGeneratorException {

		// extractCapabilityFromContract().dataInputClassName

		try {
			
			String inputClassName = configurationGenerating.contractCapability.dataInputPkg + "."
					+ configurationGenerating.extractCapabilityFromContract().dataInputClassName;

			Object dataInputClassNameObject = Class.forName(inputClassName.trim()).newInstance();

			for (Input input : configurationGenerating.extractCapabilityFromContract().inputs) {

				String inputMethod = "set" + input.name.substring(0, 1).toUpperCase() + input.name.substring(1);

//				System.out.println(input.type);
				Class<?> typeIn = Class.forName("java.lang." + input.type);

				Method theMethod = dataInputClassNameObject.getClass().getMethod(inputMethod, typeIn);

				Object inputObj;

				// Method to cast (e.g., String.valueOf)
				if (input.type.equals("String"))
					inputObj = input.value;
				else {
					Method theMethodType = typeIn.getMethod("valueOf", String.class);
					inputObj = theMethodType.invoke(null, input.value);
				}

				// input.value -> String
				theMethod.invoke(dataInputClassNameObject, inputObj); // set
			}
			return dataInputClassNameObject;
		} catch (Exception e) {
//			e.printStackTrace();
			StringWriter errors = new StringWriter();
			e.printStackTrace(new PrintWriter(errors));
			throw new SCGeneratorException(errors.toString());
		}
	}

	public static String getDataRest(SCGenerator configurationGenerating) {

		String result = "/";

		for (Input input : configurationGenerating.extractCapabilityFromContract().inputs) {

			result += input.value + "/";
		}

		return result;

	}

//	public static void generateInput(ConfigurationGenerating configurationGenerating) {
//		VelocityEngine ve = new VelocityEngine();
//	ve.setProperty(RuntimeConstants.FILE_RESOURCE_LOADER_PATH, SwitchyardProject.getVelocityResourcePath(""));
//		ve.init();
//
//		/* add that list to a VelocityContext */
//		VelocityContext context = new VelocityContext();
//		StringWriter writer;
//		Template t = ve.getTemplate("input_data.vm");
//		context.put("inputDataPkg", configurationGenerating.contract.dataInputPkg);
//
//		for (Service service : configurationGenerating.contract.services) {
//
//			for (Capability capability : service.getCapabilities()) {
//
//				if (extractCapabilityFromContract().getInputs() != null && extractCapabilityFromContract().getInputs().size() != 0) {
//
//					context.put("service", service);
//					context.put("capability", capability);
//
//					/* get the Template */
//
//					/* now render the template into a Writer */
//					writer = new StringWriter();
//					t.merge(context, writer);
//					System.out.println(writer);
//
//					String dirData = configurationGenerating.contract.dataInputPkg;
//					dirData = "./src/main/java/" + dirData.replaceAll("\\.", "/").trim() + "/";
//					(new File(dirData)).mkdirs();
//
//					String fileOutPath = dirData + extractCapabilityFromContract().dataInputClassName.trim() + ".java";
//					Functions.stringToFile(writer.toString(),
//							fileOutPath, false);
//					
//					JavaCodeFormatter.formattingCode(new File(fileOutPath));
//					
////					System.out.println(dirData + extractCapabilityFromContract().dataInputClassName.trim() + ".java");
//
//				}
//			}
//		}
//	}
//
//	public static void generateOutput(ConfigurationGenerating configurationGenerating) {
//		VelocityEngine ve = new VelocityEngine();
//	ve.setProperty(RuntimeConstants.FILE_RESOURCE_LOADER_PATH, SwitchyardProject.getVelocityResourcePath(""));
//		ve.init();
//
//		/* add that list to a VelocityContext */
//		VelocityContext context = new VelocityContext();
//		StringWriter writer;
//		Template t = ve.getTemplate("output_data.vm");
//		context.put("outputDataPkg", configurationGenerating.contract.dataOutputPkg.trim());
//
//		for (Service service : configurationGenerating.contract.services) {
//
//			for (Capability capability : service.getCapabilities()) {
//
//				if (extractCapabilityFromContract().getOutputs() != null && extractCapabilityFromContract().getOutputs().size() != 0) {
//
//					context.put("service", service);
//					context.put("capability", capability);
//
//					/* get the Template */
//
//					/* now render the template into a Writer */
//					writer = new StringWriter();
//					t.merge(context, writer);
//					System.out.println(writer);
//
//					String dirData = configurationGenerating.contract.dataOutputPkg;
//
//					dirData = "./src/main/java/" + dirData.replaceAll("\\.", "/").trim() + "/";
//					(new File(dirData)).mkdirs();
//
//					String fileOutPath = dirData + extractCapabilityFromContract().dataOutputClassName.trim() + ".java";
//					
//					Functions.stringToFile(writer.toString(),
//							fileOutPath, false);
//
//					JavaCodeFormatter.formattingCode(new File(fileOutPath));
//				}
//			}
//		}
//	}

	// public static Object getInputInstance(String serviceName, String
	// methodName, ArrayList<String> inputList)
	// throws GenConfigurationException {
	// if (serviceName.equals("Hello") && methodName.equals("sayHello")) {
	// HelloInMessage in = new HelloInMessage();
	// in.setId(String.valueOf(inputList.get(0)));
	// in.setName(String.valueOf(inputList.get(1)));
	// in.setAge(Integer.valueOf(inputList.get(2)));
	// return in;
	// }
	//
	// if (serviceName.equals("Hello") && methodName.equals("sayHello2")) {
	// HelloInMessage in = new HelloInMessage();
	// in.setId(String.valueOf(inputList.get(0)));
	// in.setName(String.valueOf(inputList.get(1)));
	// in.setAge(Integer.valueOf(inputList.get(2)));
	// return in;
	// }
	//
	// if (serviceName.equals("Hello") && methodName.equals("sayHello3")) {
	// HelloInMessage in = new HelloInMessage();
	// in.setId(String.valueOf(inputList.get(0)));
	// in.setName(String.valueOf(inputList.get(1)));
	// in.setAge(Integer.valueOf(inputList.get(2)));
	// return in;
	// }
	//
	// if (serviceName.equals("Hello") && methodName.equals("sayHello4")) {
	// return null;
	// }
	//
	// if (serviceName.equals("Hello") && methodName.equals("getHello")) {
	// return String.valueOf(inputList.get(0));
	// }
	//
	// if (serviceName.equals("Hello") && methodName.equals("createHello")) {
	// HelloInMessage in = new HelloInMessage();
	// in.setId(String.valueOf(inputList.get(0)));
	// in.setName(String.valueOf(inputList.get(1)));
	// in.setAge(Integer.valueOf(inputList.get(2)));
	// return in;
	// }
	//
	// if (serviceName.equals("Hello") && methodName.equals("updateHello")) {
	// HelloInMessage in = new HelloInMessage();
	// in.setId(String.valueOf(inputList.get(0)));
	// in.setName(String.valueOf(inputList.get(1)));
	// in.setAge(Integer.valueOf(inputList.get(2)));
	// return in;
	// }
	//
	// if (serviceName.equals("Hello") && methodName.equals("removeHello")) {
	// return String.valueOf(inputList.get(0));
	// }
	//
	// if (serviceName.equals("Thank") && methodName.equals("sayThank")) {
	// HelloInMessage in = new HelloInMessage();
	// in.setId(String.valueOf(inputList.get(0)));
	// return in;
	// }
	//
	// if (serviceName.equals("Thank") && methodName.equals("sayThank2")) {
	// return String.valueOf(inputList.get(0));
	// }
	//
	// throw new GenConfigurationException("Service and method not founded");
	// }
}