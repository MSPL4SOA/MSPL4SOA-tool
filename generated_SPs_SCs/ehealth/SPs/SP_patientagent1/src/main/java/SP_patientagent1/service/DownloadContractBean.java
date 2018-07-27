package SP_aircraftcarrier1.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.File;

import org.switchyard.component.bean.Service;

@Service(DownloadContract.class)
public class DownloadContractBean implements DownloadContract {

	@Override
	public String downloadFile(String fileIn) {

		String fileName = "/files/" + fileIn;
		System.out.println(fileName);

		InputStream stream = DownloadContractBean.class
				.getResourceAsStream(fileName);

		BufferedReader reader = new BufferedReader(
				new InputStreamReader(stream));
		StringBuilder out = new StringBuilder();
		String line = "";
		try {
			while ((line = reader.readLine()) != null) {
				out.append(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return out.toString();
	}

}
