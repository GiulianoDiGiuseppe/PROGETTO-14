package Entity;

public class titoloFinanziario {
	
	int ID_titolo;					//Identificativo titolo
	double Valore_titolo;			//Valore titolo
	String Nome_titolo;				//Nome del titolo
	String Borsa;						//Borsa in cui è quotato

	
	// funzioni GET
public int get_ID_titolo() {
	return ID_titolo ;
}

public Double get_Valore_titolo() {
	return Valore_titolo ;
}

public String get_Nome_titolo() {
	return Nome_titolo ;
}

public String get_Borsa() {
	return Borsa ;
}

// INSERIMENTO DI TUTTI I VALORI
public void inserimento_titolo() {
	
	System.out.print("Inserisci :NOME DEL TITOLO:");
	this.Nome_titolo = Input.readLine(); 	
	System.out.print("Inserisci : ID TITOLO");
	this.ID_titolo = Input.readInt(); 
	System.out.print("Inserisci : VALORE:");
	this.Valore_titolo = Input.readDouble(); 	
	System.out.print("Inserisci : BORSA:");
	this.Borsa = Input.readLine(); 

}




}
