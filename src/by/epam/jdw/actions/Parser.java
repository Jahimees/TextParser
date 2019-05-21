package by.epam.jdw.actions;

import by.epam.jdw.entity.Composite;

public abstract class Parser {
	private int priority;
	private Parser nextParser;
	
	public Parser(int priority) {
		this.priority = priority;
	}
	
	public void setNextParser(Parser nextParser) {
		this.nextParser = nextParser;
	}
	
	public void parserManager(String message, Composite composite, int level) {
		if (level >= priority) {
			parse(message, composite);
		}
		if (nextParser != null) {			
			Composite compositeInside = new Composite();
			composite.addComponent(compositeInside);
			nextParser.parserManager(message, compositeInside, level);
		}
		
	}
	
	public abstract void parse(String message, Composite composite);
	
}
