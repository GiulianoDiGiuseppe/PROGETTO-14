package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Entity.titoloFinanziario;

public class titoloFinanziarioDAO {

	
	public static java.util.ArrayList<titoloFinanziario> readtitoli() throws SQLException {
		Connection conn = DBManager.getInstance().getConnection();
		Statement s = null;
		
		try { 
			s = conn.createStatement();
			
			ResultSet rs = s.executeQuery("SELECT * FROM TITOLI_FINANZIARI");
			java.util.ArrayList<titoloFinanziario> gruppi = new java.util.ArrayList<titoloFinanziario>();
			
			while (rs.next()) {
				String ID = rs.getString("ID");
				titoloFinanziario c = null;
				
				if (persistanceMap.containsKey(ID)) {
					c = persistanceMap.get(ID);
				} else {
					c = restoreGruppo(rs);
					persistanceMap.put(c.getPersistantID(), c);
				}
				gruppi.add(c);
			}
			return gruppi;
		} finally {
			if (s != null) { s.close(); }
		}
	}
	
	
}
