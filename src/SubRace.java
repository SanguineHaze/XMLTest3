import java.util.ArrayList;

public class SubRace {
	String name, size, source;
	ArrayList<String> speed, language, extra, extraChoice;
	ArrayList<SubRace> subRaces;
	int bonusStr, bonusDex, bonusCon, bonusInt, bonusWis, bonusCha;
	
	public SubRace(){
		name = "Not Set";
		source = "Not Set";
		size = "Not Set";
		speed = new ArrayList<String>();
		language = new ArrayList<String>();
		extra = new ArrayList<String>();
		extraChoice = new ArrayList<String>();
		bonusStr = 0;
		bonusDex = 0;
		bonusCon = 0;
		bonusInt = 0;
		bonusWis = 0;
		bonusCha = 0;
	}
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public ArrayList<String> getSpeed() {
		return speed;
	}
	public void setSpeed(ArrayList<String> speed) {
		this.speed = speed;
	}
	public void addSpeed(String sp){
		speed.add(sp);
	}
	public ArrayList<String> getLanguage() {
		return language;
	}
	public void setLanguage(ArrayList<String> language) {
		this.language = language;
	}
	public void addLanguage(String lang){
		language.add(lang);
	}
	public ArrayList<String> getExtra() {
		return extra;
	}
	public void setExtra(ArrayList<String> extra) {
		this.extra = extra;
	}
	public void addExtra(String ext){
		extra.add(ext);
	}
	public int getBonusStr() {
		return bonusStr;
	}
	public void setBonusStr(int bonusStr) {
		this.bonusStr = bonusStr;
	}
	public int getBonusDex() {
		return bonusDex;
	}
	public void setBonusDex(int bonusDex) {
		this.bonusDex = bonusDex;
	}
	public int getBonusCon() {
		return bonusCon;
	}
	public void setBonusCon(int bonusCon) {
		this.bonusCon = bonusCon;
	}
	public int getBonusInt() {
		return bonusInt;
	}
	public void setBonusInt(int bonusInt) {
		this.bonusInt = bonusInt;
	}
	public int getBonusWis() {
		return bonusWis;
	}
	public void setBonusWis(int bonusWis) {
		this.bonusWis = bonusWis;
	}
	public int getBonusCha() {
		return bonusCha;
	}
	public void setBonusCha(int bonusCha) {
		this.bonusCha = bonusCha;
	}
	public ArrayList<String> getExtraChoice() {
		return extraChoice;
	}
	public void setExtraChoice(ArrayList<String> extraChoice) {
		this.extraChoice = extraChoice;
	}
	
	public void addExtraChoice(String extChoice) {
		extraChoice.add(extChoice);
	}

	@Override
	public String toString() {
		return "SubRace [name=" + name + ", size=" + size + ", source=" + source + ", speed=" + speed + ", language="
				+ language + ", extra=" + extra + ", extraChoice=" + extraChoice + ", bonusStr=" + bonusStr
				+ ", bonusDex=" + bonusDex + ", bonusCon=" + bonusCon + ", bonusInt=" + bonusInt + ", bonusWis="
				+ bonusWis + ", bonusCha=" + bonusCha + ", subRaces=" + subRaces + "]";
	}
}
