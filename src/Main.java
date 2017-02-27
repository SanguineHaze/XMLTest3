import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Node;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class Main {
	
	
	//reference resource: https://www.tutorialspoint.com/java_xml/java_dom_query_document.htm
	
	public static void main(String[] args){
		
		
		try {
			File xmlSourceFile = new File("RaceOptions.xml");
			DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document doc = docBuilder.parse(xmlSourceFile);
			doc.getDocumentElement().normalize();
			
			System.out.println("Root: " + doc.getDocumentElement().getNodeName());
			
			NodeList nList = doc.getElementsByTagName("race");
			parseData(nList);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void parseData(NodeList nodeList){
		ArrayList<Race> races = new ArrayList<Race>();
		
		NodeList nList = nodeList;
		System.out.println("-----------------------------------------------------");
		
		//start looping through races
		for(int i = 0; i < nList.getLength(); i++){
			//set up items
			
			Race tempRace = new Race();
			Node raceNode = nList.item(i);
			NodeList raceList = raceNode.getChildNodes();
			
			//go through races child nodes
			for(int j = 0; j < raceList.getLength(); j++){
				Node cNode = raceList.item(j);
				//parse children
				switch(cNode.getNodeName().toLowerCase()){
				
				case "name": 
					if(!"name".isEmpty()){
						tempRace.setName(cNode.getTextContent());
					}				
					break;
				case "size": 
					if(!"size".isEmpty()){
						tempRace.setSize(cNode.getTextContent());
					}
					break;
				case "speed": 
					if(!"speed".isEmpty()){
						tempRace.addSpeed(cNode.getTextContent());
					}
					break;
				case "language": 
					if("language".isEmpty()){
						tempRace.addLanguage(cNode.getTextContent());
					}
					break;
				case "bonusstr": 
					if(!"bonusstr".isEmpty()){
						tempRace.setBonusStr(Integer.parseInt(cNode.getTextContent()));

					}
					break;
				case "bonusdex": 
					if(!"bonusdex".isEmpty()){
						tempRace.setBonusDex(Integer.parseInt(cNode.getTextContent()));
					}
					break;
				case "bonuscon": 
					if(!"bonuscon".isEmpty()){
						tempRace.setBonusCon(Integer.parseInt(cNode.getTextContent()));
					}
					break;
				case "bonusint": 
					if(!"bonusint".isEmpty()){
						tempRace.setBonusInt(Integer.parseInt(cNode.getTextContent()));
					}
					break;
				case "bonuswis": 
					if(!"bonuswis".isEmpty()){
						tempRace.setBonusWis(Integer.parseInt(cNode.getTextContent()));
					}
					break;
				case "bonuscha": 
					if(!"bonuscha".isEmpty()){
						tempRace.setBonusCha(Integer.parseInt(cNode.getTextContent()));
					}
					break;
				case "extra": 
					if(!"extra".isEmpty()){
						tempRace.addExtra(cNode.getTextContent());
					}				
					break;
				case "extrachoice": 
					if(!"extrachoice".isEmpty()){
						tempRace.addExtraChoice(cNode.getTextContent());
					}
					break;
				case "source": 
					if(!"source".isEmpty()){
						tempRace.setSource(cNode.getTextContent());
					}
					break;
				case "subrace": 
					tempRace.addSubRaces(parseSubrace(cNode));
					break;
				}
				
			}
			races.add(tempRace);
		}
				
		for(Race thisRace: races){
			System.out.println("\n" + "Race: " + thisRace.getName());
			System.out.println("\t" + "Source: " + thisRace.getSource());
			System.out.println("\t" + "Size: " + thisRace.getSize());
			System.out.println("\t" + "Speed: " + thisRace.getSpeed());
			System.out.println("\t" + "Languages: " + thisRace.getLanguage());
			System.out.println("\t" + "Bonus Strength: " + thisRace.getBonusStr());
			System.out.println("\t" + "Bonus Dexterity: " + thisRace.getBonusDex());
			System.out.println("\t" + "Bonus Constitution: " + thisRace.getBonusCon());
			System.out.println("\t" + "Bonus Intelligence: " + thisRace.getBonusInt());
			System.out.println("\t" + "Bonus Wisdom: " + thisRace.getBonusWis());
			System.out.println("\t" + "Bonus Charisma: " + thisRace.getBonusCha());
			System.out.println("\t" + "Extra: " + thisRace.getExtra());
			System.out.println("\t" + "Extra Choice: " + thisRace.getExtraChoice());
			for(int i = 0; i < thisRace.subRaces.size(); i++){
				System.out.println(thisRace.subRaces.get(i));
			}
		}
	}
	
	public static SubRace parseSubrace(Node cNode){
			SubRace subr = new SubRace();
			//set up items
			NodeList raceList = cNode.getChildNodes();
			
			//go through races child nodes
			for(int j = 0; j < raceList.getLength(); j++){
				Node ccNode = raceList.item(j);
				//parse children
				switch(ccNode.getNodeName().toLowerCase()){

				case "name": 
					if(!"name".isEmpty()){
						subr.setName(ccNode.getTextContent());
					}				
					break;
				case "size": 
					if(!"size".isEmpty()){
						subr.setSize(ccNode.getTextContent());
					}
					break;
				case "speed": 
					if(!"speed".isEmpty()){
						subr.addSpeed(ccNode.getTextContent());
					}
					break;
				case "language": 
					if("language".isEmpty()){
						subr.addLanguage(ccNode.getTextContent());
					}
					break;
				case "bonusstr": 
					if(!"bonusstr".isEmpty()){
						subr.setBonusStr(Integer.parseInt(ccNode.getTextContent()));
					}
					break;
				case "bonusdex": 
					if(!"bonusdex".isEmpty()){
						subr.setBonusDex(Integer.parseInt(ccNode.getTextContent()));
					}
					break;
				case "bonuscon": 
					if(!"bonuscon".isEmpty()){
						subr.setBonusCon(Integer.parseInt(ccNode.getTextContent()));
					}
					break;
				case "bonusint": 
					if(!"bonusint".isEmpty()){
						subr.setBonusInt(Integer.parseInt(ccNode.getTextContent()));
					}
					break;
				case "bonuswis": 
					if(!"bonuswis".isEmpty()){
						subr.setBonusWis(Integer.parseInt(ccNode.getTextContent()));
					}
					break;
				case "bonuscha": 
					if(!"bonuscha".isEmpty()){
						subr.setBonusCha(Integer.parseInt(ccNode.getTextContent()));
					}
					break;
				case "extra": 
					if(!"extra".isEmpty()){
						subr.addExtra(ccNode.getTextContent());
					}				
					break;
				case "extrachoice": 
					if(!"extrachoice".isEmpty()){
						subr.addExtraChoice(ccNode.getTextContent());
					}
					break;
				case "source": 
					if(!"source".isEmpty()){
						subr.setSource(ccNode.getTextContent());
					}
					break;
				}
				
			}
		return subr;		
	}
}