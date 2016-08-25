package util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileSearch {
	private String regex;
	private List<String> result = new ArrayList<String>();

	public String getRegex() {
		return regex;
	}

	public void setRegex(String regex) {
		this.regex = regex;
	}

	public List<String> getResult() {
		return result;
	}
	//
	// public static void main(String[] args) {
	//
	// FileSearch fileSearch = new FileSearch();
	//
	// // try different directory and filename :)
	// fileSearch.searchDirectory(new File("/Users/mkyong/websites"),
	// "post.php");
	//
	// int count = fileSearch.getResult().size();
	// if (count == 0) {
	// System.out.println("\nNo result found!");
	// } else {
	// System.out.println("\nFound " + count + " result!\n");
	// for (String matched : fileSearch.getResult()) {
	// System.out.println("Found : " + matched);
	// }
	// }
	// }

	public void searchDirectory(File directory, String regex) {

		setRegex(regex);

		if (directory.isDirectory()) {
			search(directory);
		} else {
			// System.out.println(directory.getAbsoluteFile()
			// + " is not a directory!");
		}

	}

	private void search(File file) {

		if (file.isDirectory()) {
			// System.out.println("Searching directory ... "
			// + file.getAbsoluteFile());

			// do you have permission to read this directory?
			if (file.canRead()) {
				for (File temp : file.listFiles()) {
					if (temp.isDirectory()) {
						search(temp);
					} else {
						if (temp.getName().toLowerCase().matches(regex)) {
							result.add(temp.getAbsoluteFile().toString());
						}

					}
				}

			} else {
				System.out.println(file.getAbsoluteFile() + "Permission Denied");
			}
		}

	}
}
