package by.epam.jdw;

import java.io.FileNotFoundException;
import java.util.logging.Logger;

import by.epam.jdw.actions.FileParser;
import by.epam.jdw.actions.*;
import by.epam.jdw.Priority;
import by.epam.jdw.entity.*;


public class Main {
	
	private static final Logger log = Logger.getLogger("Main");
	
	public static void main(String[] args) {
		try {
			String text = FileParser.parseFile("src\\Text");
			
			ParagraphParser	paragraphParser	= new ParagraphParser(Priority.PARAGRAPH);
			SentenceParser  sentenceParser 	= new SentenceParser(Priority.SENTENCE);
			LexemeParser	lexemeParser	= new LexemeParser(Priority.LEXEME);
			WordParser		wordParser		= new WordParser(Priority.WORD);
			SymbolParser	symbolParser	= new SymbolParser(Priority.SYMBOL);
			
			paragraphParser.setNextParser(sentenceParser);
			sentenceParser.setNextParser(lexemeParser);
			lexemeParser.setNextParser(wordParser);
			wordParser.setNextParser(symbolParser);
			
			
			Composite inputComposite = new Composite();
			paragraphParser.parserManager(text, inputComposite, Priority.PARAGRAPH);
			Composite mainComposite = paragraphParser.getComposite();
			
			
			System.out.println(inputComposite.getList().get(4));
			
			Assembler.assemblyToDefault(mainComposite);
			
			
		} catch (FileNotFoundException e) {
			
		}
	}
	
}
