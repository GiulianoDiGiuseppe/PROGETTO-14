package Entity;

public class pacchettofinanziario {

	String ID_pacchetto	;				//Identificativo pacchetto
	double Fattore_di_rischio;			//Indica percentule di fallimento del pacchetto
	double Stima_di_rendimento ;		//Indica la probabile percentuale di gudagno 
	String Nome_pacchetto;				//Nome assegnato dal broker
	enum  Stato{A("DISP"),B("NON_DISP"),C("FASE_ELIMINAZIONE")};	//Indica se è disponibile , non disponibile o in fase di eliminazione
	double Valore_pacchetto;			//Indica il prezzo che vale il pacchetto
	int N_reg_cam_commercio;			//Id del broker che corrisponde alla sua registrazione alla camera di commercio
	String Descrizione	;				//Commento per i clienti
	int N_titoli;						//Numero totale di Titoli azionari inseriti
	
	
	
	//Inserisco la fatt	
		public void inserimento_Fattore_di_rischio(double Fattore_di_rischio){			
			this.Fattore_di_rischio= Fattore_di_rischio;
		}
	//Inserisco la stima	
		public void inserimento_Stima_di_rendimento(double Stima_di_rendimento)	{		
			this.Stima_di_rendimento= Stima_di_rendimento;
		}
	//Inserisco la nome pacchetto	
		public void inserimento_Nome_Pacchetto(String Nome_pacchetto) {
			this.Nome_pacchetto= Nome_pacchetto;
		}
	//Inserisco la descrizione
		public void inserimento_decrizione(String Descrizione) {
			this.Descrizione= Descrizione;
		}
		
		
		
		public String getPersistantID() {
			return ID_pacchetto;
		}

		public void setPersistantID(String ID_pacchetto) {
			this.ID_pacchetto = ID_pacchetto;
		}	
		
		
		
	/*//get  ID	
		public int get_ID_pacchetto(){			
			return ID_pacchetto ;
		}	*/
	//get la fatt	
		public double get_Fattore_di_rischio(){			
			return Fattore_di_rischio;
		}
	//get la stima	
		public double get_Stima_di_rendimento()	{		
			return Stima_di_rendimento;
		}
	//get la nome pacchetto	
		public String get_Nome_Pacchetto() {
			return Nome_pacchetto;
		}

	//get la stato	
		public String get_Stato()	{		
			if(Stato.DISP){
		         return YES;
		      }
		      else if (x.equals('N')){
		         return NO;
		      }
		      else{
		         return OTHER;		}
			
		//get valore
		public double get_valore_pacchetto() {
			return Valore_pacchetto;
		}
		
		//get la cam-comm
		public int get_N_Cam_commercio() {
			return  N_reg_cam_commercio;
		}				
		//get la descrizione
		public String get_decrizione() {
			return Descrizione;
		}
		//get la num_tit
		public int get_N_titoli() {
			return N_titoli;
		}		
		
		
		
		
		
//inserimento valori
	public void Inserimento_informazioni() {
		System.out.print("Inserisci il NOME del pacchetto:");
		this.Nome_pacchetto = Input.readLine(); 
		System.out.print("inserisci la DESCRIZIONE:");
		this.Descrizione = Input.readLine(); 
		System.out.print("Inserisci la STIMA DI RENDIMENTO:");
		this.Stima_di_rendimento = Input.readDouble(); 
		System.out.print("Inserisci : FATTORE DI RISCHIO:");
		this.Fattore_di_rischio = Input.readDouble(); 
		System.out.print("Inserisci : NUMERI DI TITOLI:");
		this.N_titoli = Input.readInt(); 
	}
	

//stampa 
	public void Stampa() {
		System.out.print("\n NOME:"+this.Nome_pacchetto);
		System.out.print("\n DESCRIZIONE:"+this.Descrizione);
		System.out.print("\n ID:"+ID_pacchetto);
		System.out.print("\t STIMA DI RENDIMENTO:"+this.Stima_di_rendimento);
		System.out.print("\t FATTORE DI RISCHIO:"+this.Fattore_di_rischio);
		System.out.print("\n VALORE:"+this.Valore_pacchetto);
		System.out.print("\tNUMERO DI TITOLI:"+this.N_titoli);
	}

//CREAZIONE
public void Crea_paccchettoFinanziario() {
	
								//	int ID_Pacchetto,double Fattore_di_rischio,double Stima_di_rendimento,string Nome_pacchetto
								//	,enum Stato,double Valore_pacchetto,int N_Reg_Cam_Commercio,string Descrizione				
	 Inserimento_informazioni()	;						
		
	 /*for() {
			inserimento_decrizione();
			selezione_titolo();	
				if() {//Titolo non selezionato
					
				}
			inserimento_azioni();
				if() {//Num di azioni non disponibili
					
				}
			Calcolo_valore_pacchetto();	
			Calcolo_numero di titoli();	
			Stampa_anteprima();	
		}
		
		Stampa_anteprima();	
			if(){
			Modifica_descrizione();
			Stampa();

			}
			
		if() {
			Elimina();
		}
		Salva();
		*/
	 
		Stampa();
		}
}

		
		
	/*
	public void Crea_paccchettoFinanziario();		//Creo il pacchetto finanziario
	
OK	public void inserimento_ID_pacchetto();			//Inserisco la descrizione
OK	public void inserimento_Fattore_di_rischio();			//Inserisco la descrizione
OK	public void inserimento_Stima_di_rendimento();			//Inserisco la descrizione
OK	public void inserimento_Nome_Pacchetto();			//Inserisco la descrizione
OK	public void inserimento_Decrizione();			//Inserisco la descrizione

	
	
	
	public void selezione_titolo();					//prendo i valori del titolo selezionato
	public void inserimento_azioni();				//Inserimento numero di azioni
	public void Calcolo_valore_pacchetto();			//Calcolo il valore del pacchetto sommatoria(Num_azioni*Valore_Azione)
	public void Calcolo_numero_di_titoli();			//Calcolo il numero di titoli presenti nel pacchetto
	public void Stampa_anteprima();					//Stampo tutti i titoli+Num_azioni+Valore
OK	public void Stampa();							//Stampo tutti i Valori del pacchetto (titoli+Num_azioni+Valore)
OK	public void Modifica_descrizione();				//Inserisco o modifico: StimaDiRendimento,Fattore di rischio,Nomepacchetto descrizione
	public void Elimina();							//non salvo il pacchetto
	public void Salva();							//Salvo il pacchetto
	


}	*/
