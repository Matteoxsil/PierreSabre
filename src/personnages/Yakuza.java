package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String name, String favoriteDrink, int money, String clan) {
		super(name, favoriteDrink, money);
		this.clan = clan;
	}
	
	public int getReputation() {
		return reputation;
	}

	public void extorquer(Commercant victime) {
		parler("tiens tiens ne serait ca pas un faible marchant qui passe par là");
		parler("si tu tiens à la vie donne moi ta bourse !");
		int argentVole = victime.seFaireExtorquer();
		gagnerArgent(argentVole);
		parler("Hehe j'ai piqué " + argentVole + " à " + victime.getName() + " ce qui me fait "+ getMoney()+" sous dans ma poche!");
	}
	public int perdre() {
		if(reputation < 0) {
			reputation -= 1;
		}
		int argentPerdu = getMoney();
		perdreArgent(argentPerdu);
		parler("J'ai perdu mon duel et mes " + argentPerdu +"sous, snif... j'ai déshonoré le clan des "+ clan);
		return argentPerdu;
		
	}
	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation += 1;
		parler("Ce ronin pensait battre " + getName() + " du clan de "+ clan + " ? Je l'ai dépouillé de ses "+ gain + "sous.");
	}
	
}
