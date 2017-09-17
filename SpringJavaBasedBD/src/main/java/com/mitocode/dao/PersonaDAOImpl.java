package com.mitocode.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mitocode.model.Persona;

@Repository
public class PersonaDAOImpl extends JdbcDaoSupport implements IPersonaDAO {

	// @Autowired
	// private DataSource dataSource;

	@Autowired
	public PersonaDAOImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	@Override
	public void create(Persona persona) {
		String sql = "INSERT INTO PERSONA (NOMBRES, APELLIDOS) VALUES (?, ?)";

		/*
		 * try(Connection cx = dataSource.getConnection()){ PreparedStatement ps =
		 * cx.prepareStatement(sql); ps.setString(1, persona.getNombre());
		 * ps.setString(2, persona.getApellidos()); ps.executeUpdate(); ps.close();
		 * }catch(Exception ex){ throw new RuntimeException(ex); }
		 */

		getJdbcTemplate().update(sql, new Object[] { persona.getNombres(), persona.getApellidos() });
	}

	@Override
	public void update(Persona persona) {
		String sql = "UPDATE persona SET nombres = ?, apellidos = ? WHERE id = ?";

		getJdbcTemplate().update(sql, new Object[] { persona.getNombres(), persona.getApellidos(), persona.getId() });
	}

	@Override
	public List<Persona> listAll() {
		String sql = "SELECT id, nombres, apellidos FROM persona ORDER BY nombres, apellidos";
		List<Persona> lista = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(Persona.class));
		return lista;
	}

	@Override
	public Persona find(Integer id) {
		String sql = "SELECT nombres, apellidos FROM persona WHERE id = ? ORDER BY nombres, apellidos";
		Persona persona = getJdbcTemplate().queryForObject(sql, new Object[] { id },
				new BeanPropertyRowMapper<Persona>(Persona.class));

		return persona;
	}
	
	@Transactional
	@Override
	public void delete(Integer id) {
		String sql = "DELETE FROM persona WHERE id = ?";
		getJdbcTemplate().update(sql, new Object[] { id });

		sql = "UPDATE persona SET nombrecccccc = ?, apellidos = ? WHERE id = ?";

		getJdbcTemplate().update(sql, new Object[] { null, null, 21 });
	}

}
