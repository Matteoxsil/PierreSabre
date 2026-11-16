package personnages;
import personnages.Humain;

public class Commercant extends Humain{

	public Commercant(String name, int money) {
		super(name, "un thé", money);
		// TODO Auto-generated constructor stub
	}
	public int seFaireExtorquer() {
		int argentExtorque = getMoney();
		parler("J'ai tout perdu! Le monde est trop injuste....");
		perdreArgent(argentExtorque);
		return argentExtorque;
	}
	public void recevoirArgent(int argent) {
		parler("Merci généreux doneur pour ces " + argent + " sous!");
		gagnerArgent(argent);
	
	}
}
