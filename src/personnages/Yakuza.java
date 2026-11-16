package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String name, String favoriteDrink, int money, String clan) {
		super(name, favoriteDrink, money);
		this.clan = clan;
	}
	public void extorquer(Commercant victime) {
		parler("tiens tiens ne serait ca pas un faible marchant qui passe par là");
		parler("si tu tiens à la vie donne moi ta bourse !");
		int argentVole = victime.seFaireExtorquer();
		gagnerArgent(argentVole);
		parler("Hehe j'ai piqué " + argentVole + " à " + victime.getName() + " ce qui me fait "+ getMoney()+" sous dans ma poche!");
	}
	
}
