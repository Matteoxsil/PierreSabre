package personnages;

public class Ronin extends Humain{
	private int honneur = 1;
	public Ronin(String name, String favoriteDrink, int money) {
		super(name, favoriteDrink, money);
		// TODO Auto-generated constructor stub
	}

	public void donner(Commercant beneficiaire) {
		int don = getMoney()/10;
		parler(beneficiaire.getName() + " prend ces "+ don +" sous.");
		beneficiaire.recevoirArgent(don);
		perdreArgent(don);
	}
	
}
