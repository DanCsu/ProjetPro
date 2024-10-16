package infoPersonne;

public class Calculatrice {

	private Integer valeura;
	private Integer valeurb;
	
	public Integer getValeura() {
		return valeura;
	}

	public Integer getValeurb() {
		return valeurb;
	}

	public Calculatrice(Integer valeura, Integer valeurb) {
        this.valeura = valeura;
        this.valeurb = valeurb;
    }

	public static void main(String[] args) {
		Calculatrice calcul = new Calculatrice(21, 3);
	
		System.out.println("Valeura x Valeurb : " + calcul.getValeura()*calcul.getValeurb());
		System.out.println("Valeura / Valeurb : " + calcul.getValeura()/calcul.getValeurb());
		System.out.println("Valeura + Valeurb : " + calcul.getValeura()+calcul.getValeurb());
	}
}
