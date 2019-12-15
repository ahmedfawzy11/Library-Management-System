import java.util.ArrayList;
import java.util.Arrays;

public class Category {
private String Arts;
private String Biography;
private String Business;
private String Kids;
private String Comics;
private String Technology;
private String History;
private String Science;
private String Romance;
private String Literature;

private ArrayList <String> Arts= new ArrayList <String> () ;
private ArrayList <String> Biography= new ArrayList <String> () ;
private ArrayList <String> Business= new ArrayList <String> () ;
private ArrayList <String> Kids= new ArrayList <String> () ;
private ArrayList <String> Comics= new ArrayList <String> () ;
private ArrayList <String> Technology= new ArrayList <String> () ;
private ArrayList <String> History= new ArrayList <String> () ;
private ArrayList <String> Science= new ArrayList <String> () ;
private ArrayList <String> Romance= new ArrayList <String> () ;
private ArrayList <String> Literature= new ArrayList <String> () ;

public Category(String arts, String biography, String business, String kids, String comics, String technology,
String history, String science, String romance, String literature) {
	
super();
Arts = arts;
Biography = biography;
Business = business;
Kids = kids;
Comics = comics;
Technology = technology;
History = history;
Science = science;
Romance = romance;
Literature = literature;
}
public String getArts() {
return Arts;
}
	
public void setArts(String arts) {
Arts = arts;
}
	
public String getBiography() {
return Biography;
}
	
public void setBiography(String biography) {
Biography = biography;
}
	
public String getBusiness() {
return Business;
}
	
public void setBusiness(String business) {
Business = business;
}
	
public String getKids() {
return Kids;
}
	
public void setKids(String kids) {
Kids = kids;
}
	
public String getComics() {
return Comics;
}
	
public void setComics(String comics) {
Comics = comics;
}
	
public String getTechnology() {
return Technology;
}
	
public void setTechnology(String technology) {
Technology = technology;
}
	
public String getHistory() {
return History;
}
	
public void setHistory(String history) {
History = history;
}
	
public String getScience() {
return Science;
}
	
public void setScience(String science) {
Science = science;
}
	
public String getRomance() {
return Romance;
}
	
public void setRomance(String romance) {
Romance = romance;
}
	
public String getLiterature() {
return Literature;
}
	
public void setLiterature(String literature) {
Literature = literature;
}
	
}