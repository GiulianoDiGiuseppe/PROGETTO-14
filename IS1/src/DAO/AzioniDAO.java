package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Entity.Azioni;


public class AzioniDAO {

	private static java.util.Map<String, Azioni> persistanceMap = new java.util.HashMap<String, Azioni>();
	public static final String ID_TITOLO = "PERSONA";
	public static final String ID_PACCHETTO = "AZIENDA";
	
	
	public static void createAzioni(Azioni c) throws SQLException {
		java.sql.Connection conn = DBManager.getInstance().getConnection();
		PreparedStatement s = null;
		
		try { 
			
			s = conn.prepareStatement("INSERT INTO AZIONI (ID_PACCHETTO, ID_TITOLO , N_AZIONI) " +
					"VALUES (?,?,?)");
			
			s.setInt(1, c.get_ID_pacchetto());
			s.setInt(2, c.get_ID_titolo());
			s.setInt(3, c.get_N_azioni());
			
			s.executeUpdate();
			
			
		} finally {
			if (s != null) { s.close(); }
		}
		
	}
	
	/*
	static Azioni readAzioni(int ID_pacchetto ,int ID_titolo) throws SQLException {
		if (persistanceMap.containsKey(ID_pacchetto ,ID_titolo)) {
			return persistanceMap.get(persistantID);
		}
		
		Connection conn = DBManager.getInstance().getConnection();
		PreparedStatement s = null;
		
		try { 
			s = conn.prepareStatement("SELECT * FROM AZIONI WHERE ID=?");
			s.setString(1, persistantID);
			
			ResultSet rs = s.executeQuery();
			
			while (rs.next()) {
				Contatto c = restoreContatto(rs);
				persistanceMap.put(c.getPersistantID(), c);
				return c;
			}
			
			return null;
		} finally {
			if (s != null) { s.close(); }
		}
	}*/
	
	
}
