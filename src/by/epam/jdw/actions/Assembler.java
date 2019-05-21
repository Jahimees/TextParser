package by.epam.jdw.actions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

import by.epam.jdw.Priority;
import by.epam.jdw.entity.*;

public abstract class Assembler {
	
	
			
	public static void assemblyToDefault(Composite composite) {
		
		ArrayList<Text> components = (ArrayList<Text>) composite.getList();
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("src\\AssemblyTextDefault.txt"))) {
			for (Text t : components) {
				if (t.getClass()!=Composite.class) {
					writer.write(t.getValue());
				}
			}
			
			
		} catch (IOException ex) {
			
		}
		
	}
	
	public static void assemblyWithSorting(Composite composite) {

		ArrayList<Text> 	components 						= (ArrayList<Text>) composite.getList();
		ArrayList<String> 	values 							= new ArrayList<>();
		Composite 			compositeSentences				= new Composite();
		Composite 			dompositeWods					= new Composite();
		SentenceParser 		sentenceParser 					= new SentenceParser(Priority.SENTENCE);
		WordParser			wordParser						= new WordParser(Priority.WORD);
		
		//public static final Comparator<Sentence> comparator = (sentence1, sentence2) -> 
				
		
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("src\\AssemblyTextDefault.txt"))) {
			for (Text t : components) {
				if (t.getClass()!=Composite.class) {
					values.add(t.getValue());					
				}
			}
			
			for (int i = 0; i < values.size(); i++) {
				sentenceParser.parserManager(values.get(i), compositeSentences, Priority.SENTENCE);
			}
			
			for (int i = 0; i < values.size(); i++) {
				wordParser.parserManager(values.get(i), compositeSentences, Priority.SENTENCE);
			}
			int a = compositeSentences.getList().size()-1;
			///?????
			
			
			
		} catch (IOException ex) {
			
		}
	}
}
