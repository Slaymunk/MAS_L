package ua.agentlab;

//Class associated to the BOOK schema   
 

import jade.content.Concept;   
import jade.util.leap.List;   

public class Boook implements Concept {   
 /**
	 * 
	 */
	private static final long serialVersionUID = 494230387508162528L;
private String title;   
 private List authors;   
 private String editor;   
    
 public String getTitle() {   
     return title;   
 }   
    
 public void setTitle(String title) {   
     this.title = title;   
 }   
    
 public List getAuthors() {   
     return authors;   
 }   
    
 public void setAuthors(List authors) {   
     this.authors = authors;   
 }   
    
 public String getEditor() {   
     return editor;   
 }   
    
 public void setEditor(String editor) {   
     this.editor = editor;   
 }   
}   
