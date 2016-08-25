package util;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.eclipse.persistence.jaxb.MarshallerProperties;

public class JAXBUtil {

	public static void marshall(Object object, String fileOutPath) {
		try {

			File fileOut = new File(fileOutPath);

			fileOut.delete();

			JAXBContext jaxbContext = JAXBContext
					.newInstance(object.getClass());
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(object, fileOut);
//			jaxbMarshaller.marshal(object, System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	public static void marshall(Object object, String fileOutPath, String graphName) {
		try {

			File fileOut = new File(fileOutPath);

			fileOut.delete();

			JAXBContext jaxbContext = JAXBContext
					.newInstance(object.getClass());
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.setProperty(MarshallerProperties.OBJECT_GRAPH, graphName);

			jaxbMarshaller.marshal(object, fileOut);
//			jaxbMarshaller.marshal(object, System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public static Object unmarshall(String fileOutPath,
			Class<?> classReturn) {

		Object returnObject = null;

		try {

			File fileOut = new File(fileOutPath);
			JAXBContext jaxbContext = JAXBContext.newInstance(classReturn);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Object object = (Object) jaxbUnmarshaller.unmarshal(fileOut);

			returnObject = object;

		} catch (JAXBException e) {
			e.printStackTrace();
		}

		return returnObject;
	}

}
