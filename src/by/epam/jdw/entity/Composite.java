package by.epam.jdw.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Composite implements Text  {
	private List<Text> 	components = new ArrayList<>();
	
	public void addComponent(Text component) {
		components.add(component);
	}
	
	public void removeComponent(Text component) {
		components.remove(component);
	}
	
	public void setList(List<Text> list) {
		components = list;		
	}
	
	public List<Text> getList() {	
		return components;
	}

	
	@Override
	public String getValue() {
		
		return null;
	}
}
