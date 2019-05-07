package com.mitocode.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mitocode.model.Persona;

@Repository
@Transactional
public class PersonaDAOImpl extends AbstractDAO implements IPersonaDAO {

	@Override
	public void registrar(Persona per) throws Exception {
		persist(per);
	}

	@Override
	public void modificar(Persona per) throws Exception {
		update(per);

	}

	@Override
	public void eliminar(Persona per) throws Exception {
		delete(per);
	}

	@Override
	public List<Persona> listarTodos() throws Exception {
		// Criteria criteria = getSession().createCriteria(Persona.class);
		// return (List<Persona>) criteria.list();

		// Hibernate 5
		// https://www.boraji.com/spring-4-hibernate-5-integration-example-with-zero-xml
		TypedQuery<Persona> query = getSession().createQuery("from Persona");
		return query.getResultList();
	}

	@Override
	public Persona listarPorId(int id) throws Exception {
		List<Persona> lista;
		String sql = "FROM Persona WHERE id = :id";

		// Query query = getSession().createQuery(sql);
		// query.setParameter("id", id);

		// lista = query.list();

		// Persona per = lista != null && !lista.isEmpty() ? lista.get(0) : new
		// Persona();
		// return per;

		TypedQuery<Persona> query = getSession().createQuery(sql);
		query.setParameter("id", id);

		lista = query.getResultList();
		Persona per = lista != null && !lista.isEmpty() ? lista.get(0) : new Persona();
		return per;
	}

}
