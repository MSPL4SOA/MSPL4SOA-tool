package hidden1.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.switchyard.component.bean.Service;

@Service(DownloadContract.class)
public class DownloadContractBean implements DownloadContract {

	@Override
	public String downloadFile(String fileIn) {

		System.out.println(fileIn);
		String fileName = "";

		if (fileIn.equals("contract.xml"))
			fileName = "/files/contract.xml";
		else if (fileIn.equals("fm_sc_update.fml"))
			fileName = "/files/fm_sc_update.fml";
		else if (fileIn.equals("fm_sc_update.fmprimitives"))
			fileName = "/files/fm_sc_update.fmprimitives";
		else
			return "Please choose between contract or fm_sc_update.fml or fm_sc_update.fmprimitives";

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
