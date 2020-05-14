package com.example.demo.DAOS;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;


import com.example.demo.Model.TsscTimecontrol;

@Repository
@Scope("singleton")
public class TimeControllerDaoImpt implements TimeControllerDao{
	
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public  TsscTimecontrol guardar(TsscTimecontrol entidad) {
		entityManager.persist(entidad);
		return entidad;
	}

	@Override
	public TsscTimecontrol actualizar(TsscTimecontrol entidad) {
		entityManager.merge(entidad);
		return entidad;
	}

	@Override
	public void eliminar(TsscTimecontrol entidad) {
		entityManager.remove(entidad);
		
	}

	@Override
	public TsscTimecontrol findById(long id) {

		return entityManager.find(TsscTimecontrol.class, id);
	}

}
