public class juomaAutomaatti {
							// @author Santeri Kilpeläinen
 private int teetä;
 private int kahvia;
 private int kaakaota;
 
 
 	public juomaAutomaatti() {
	this.teetä = 50;
	this.kahvia = 50;
	this.kaakaota = 50;
 	}


		// GETTERIT
		public int getTeetä() {
			return teetä;
		}		
		public int getKahvia() {
			return kahvia;
		}		
		public int getKaakaota() {
			return kaakaota;
		}
		
		// SETTERIT
		public void setTeetä(int teetä) {
			this.teetä = teetä;
		}

		public void setKahvia(int kahvia) {
			this.kahvia = kahvia;
		}

		public void setKaakaota(int kaakaota) {
			this.kaakaota = kaakaota;
		}
		
		// Teen valmistus
		public void valmistaTee() {
			if (this.teetä -10 < 0) {
				this.teetä = 0;
				System.out.println("Täytä säiliö, ei teetä sinulle :)");
				return ;}
				
				this.teetä -= 10;
				System.out.println("Teenne on valmis. Teetä jäljellä " + this.teetä + " yksikköä.");
				}
		// Kahvin valmistus
		public void valmistaKahvi() {
			if (this.kahvia -10 < 0 ) {
				this.kahvia = 0;
				System.out.println("Täytä säiliö, ei kahvia sinulle :)");
				return; }
			
				this.kahvia -= 10;
				System.out.println("Kahvinne on valmis. Kahvia jäljellä " + this.kahvia + " yksikköä.");
				}
		// Kaakaon valmistus
		public void valmistaKaakao() {
			if (this.kaakaota -10 < 0) {
				this.kaakaota = 0;
				System.out.println("Täytä säiliö, ei kaakaota sinulle :)");
				return; }
				
				this.kaakaota  -= 10; 
				System.out.println("Kaakaonne on valmis. Kaakaota jäljellä " + this.kaakaota + " yksikköä.");
				}

		
		// toString()
		@Override
		public String toString() {
			return "JuomaAutomaatti: [teetä=" + teetä + ", kahvia=" + kahvia + ", kaakaota=" + kaakaota + "]";
		}
}