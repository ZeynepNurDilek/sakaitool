package org.sakaiproject.dao.impl;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import org.sakaiproject.model.Thing;

/**
 * Kullanacagimiz nesnelerle db baglantisini saglayan class
 * RowMapper to handle Things
 *
 * @author Steve Swinsburg (steve.swinsburg@anu.edu.au)
 *
 */
public class ThingMapper implements RowMapper{
	
	/* (non-Javadoc)
	 * @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet, int)
	 */
	@Override
	public Thing mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Thing t = new Thing();
		
		t.setId(rs.getLong("ID"));
		t.setName(rs.getString("TITLE"));
		
		return t;
	}
	
	
	
}
