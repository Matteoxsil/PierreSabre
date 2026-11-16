package personnages;

public class Humain {
	private String name;
	private String favoriteDrink;
	private int money;
	
	
	public Humain(String name, String favoriteDrink, int money) {
		super();
		this.name = name;
		this.favoriteDrink = favoriteDrink;
		this.money = money;
	}
	public void parler(String texte) {
		System.out.println("(" + name + ") - " + texte);
	}
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + name + "et j'aime boire du " + favoriteDrink);
	}
	public void boire() {
		parler("MMMM, un bon verre de " + favoriteDrink + " ! GLOUPS !");
	}
	private void gagnerArgent(int gain) {
		money += gain;
	}
	private void perdreArgent(int perte) {
		money -= perte;
	}
	public void acheter(String bien, int prix) {
		if(prix <= money) {
			parler("J'ai " + money + " sous en poche. Je vais pouvoir m'acheter " + bien +" à " + prix +" sous.");
			perdreArgent(prix);
		}
		else {
			parler("Je n'ai que " + money + " sous en poche. Je ne peux pas m'offrir " + bien+ " à " + prix +" sous.");
		}
		
	}
	public String getName() {
		return name;
	}
	public int getMoney() {
		return money;
	}
	
	
}
