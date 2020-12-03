package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Entity.pacchettofinanziario;

public class pacchettofinanziarioDAO {

	
	public static void createpacchettofinanziario(pacchettofinanziario c) throws SQLException {
		java.sql.Connection conn = DBManager.getInstance().getConnection();
		PreparedStatement s = null;
		
		try { 
			s = conn.prepareStatement("INSERT INTO CONTATTI (ID_PACCHETTO , FATTORE_DI_RISCHIO , STIMA_DI_RENDIMENTO ,NOME_PACCHETTO,STATO,VLAORE_PACCHETTO , N_REG_CAM_COMMERCIO,DESCRIZIONE,N_TITOLI) " +
					"VALUES (?,?,?,?,?,?,?,?,?)");
			
			
			/*
			 * Tramite il metodo getGeneratedKeys lasciamo al DBMS 
			 * il compito di generare la chiave primare dell'istanza.
			 */
			//DUBBIO SE SPOSTARLO GIU
			ResultSet generatedKeys = s.getGeneratedKeys();
			generatedKeys.next();
			String persistantID = generatedKeys.getString(1);
			c.setPersistantID(persistantID);
			
			s.setString(1, c.getPersistantID());
			s.setDouble(2, c.get_Fattore_di_rischio());
			s.setDouble(3, c.get_Stima_di_rendimento());
				s.setString(4, c.get_Nome_Pacchetto());
				
				
				//CAPIRE COME GESTIRE ENUM
				s.setString(5, ("1"));
				
				s.setDouble(6, c.get_valore_pacchetto());
				s.setNull(7, c.get_N_Cam_commercio());
				s.setString(8, c.get_decrizione());
				s.setInt(9, c.get_N_titoli());	
			
			s.executeUpdate();
			
		} finally {
			if (s != null) { s.close(); }
		}
	}
	
	
	
	
}
