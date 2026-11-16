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
	public void provoquer(Yakuza adversaire) {
		parler("je t'ai retrouver vermine, tu vas payer pour ce que tu as fait a ce pauvre marchand!");
		int forceRonin = honneur*2;
		if(forceRonin >= adversaire.getReputation()) {
			
			parler("je t'ai eu petit yakuza!");
			int argentGagne = adversaire.perdre();
			gagnerArgent(argentGagne);
			honneur++;
		}
		else {
			if(honneur -1 >=0)
				honneur--;
			int argentPerdu = getMoney();
			perdreArgent(argentPerdu);
			parler("j'ai perdu contre ce yakuza mon honneur et ma bourse en ont pris un coup.");
			adversaire.gagner(argentPerdu);
		}
	}
	
}
