package by.epam.jdw.actions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import by.epam.jdw.entity.Composite;
import by.epam.jdw.entity.Paragraph;

public abstract class FileParser {

	private static final Logger logger = Logger.getLogger(FileParser.class);
	
	public static String parseFile(String path) throws FileNotFoundException {
		
		String inputString = "";
		try (BufferedReader reader = new BufferedReader(new FileReader(path))) {			
			
			while (reader.ready()) {
				inputString += " " + reader.readLine() + '\n';
			}		
			logger.info("The file has been successfullsy read  ");
		} catch (IOException ex) {
			logger.error(ex + ": error with trying to read file ");
		}	
		
		return inputString;
	}
	
}
