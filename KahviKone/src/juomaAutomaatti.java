public class juomaAutomaatti {
							// @author Santeri Kilpel�inen
 private int teet�;
 private int kahvia;
 private int kaakaota;
 
 
 	public juomaAutomaatti() {
	this.teet� = 50;
	this.kahvia = 50;
	this.kaakaota = 50;
 	}


		// GETTERIT
		public int getTeet�() {
			return teet�;
		}		
		public int getKahvia() {
			return kahvia;
		}		
		public int getKaakaota() {
			return kaakaota;
		}
		
		// SETTERIT
		public void setTeet�(int teet�) {
			this.teet� = teet�;
		}

		public void setKahvia(int kahvia) {
			this.kahvia = kahvia;
		}

		public void setKaakaota(int kaakaota) {
			this.kaakaota = kaakaota;
		}
		
		// Teen valmistus
		public void valmistaTee() {
			if (this.teet� -10 < 0) {
				this.teet� = 0;
				System.out.println("T�yt� s�ili�, ei teet� sinulle :)");
				return ;}
				
				this.teet� -= 10;
				System.out.println("Teenne on valmis. Teet� j�ljell� " + this.teet� + " yksikk��.");
				}
		// Kahvin valmistus
		public void valmistaKahvi() {
			if (this.kahvia -10 < 0 ) {
				this.kahvia = 0;
				System.out.println("T�yt� s�ili�, ei kahvia sinulle :)");
				return; }
			
				this.kahvia -= 10;
				System.out.println("Kahvinne on valmis. Kahvia j�ljell� " + this.kahvia + " yksikk��.");
				}
		// Kaakaon valmistus
		public void valmistaKaakao() {
			if (this.kaakaota -10 < 0) {
				this.kaakaota = 0;
				System.out.println("T�yt� s�ili�, ei kaakaota sinulle :)");
				return; }
				
				this.kaakaota  -= 10; 
				System.out.println("Kaakaonne on valmis. Kaakaota j�ljell� " + this.kaakaota + " yksikk��.");
				}

		
		// toString()
		@Override
		public String toString() {
			return "JuomaAutomaatti: [teet�=" + teet� + ", kahvia=" + kahvia + ", kaakaota=" + kaakaota + "]";
		}
}