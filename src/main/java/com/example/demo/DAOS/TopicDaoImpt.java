package com.example.demo.DAOS;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.context.annotation.Scope;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.TsscTopic;

@Repository
@Scope("singleton")
public class TopicDaoImpt implements TopicDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public TsscTopic guardar(TsscTopic entity) {
		entityManager.persist(entity);
		return entity;
	}

	@Override
	public TsscTopic actualizar(TsscTopic entity) {
		entityManager.merge(entity);
		return entity;
	}

	@Override
	public void eliminar(TsscTopic entity) {
		entityManager.remove(entity);
		
	}

	@Override
	public TsscTopic findById(long id) {
		// TODO Auto-generated method stub
		return entityManager.find(TsscTopic.class, id);
	}

	@Override
	public List<TsscTopic> findAll() {
		String quary = "SELECT m FROM TsscTopic m";
		return entityManager.createQuery(quary).getResultList();
	}

	

	// MIGUEL ROMERO ROSAS Punto (1a)
		
		@Override
		public List<TsscTopic> encontrarPorNombre(String name) {
			String quary = "Select m from TsscTopic m "
					+ "where m.name = :name";
			Query resultado = entityManager.createQuery(quary).setParameter("name", name);
			return resultado.getResultList();
		}

		@Override
		public List<TsscTopic> encontrarPorDescription(String description) {
			String quary = "Select m from TsscTopic m"
					+ " where m.description = :description";
			Query resultado = entityManager.createQuery(quary).setParameter("description", description);
			return resultado.getResultList();
		}
	
		
		// MIGUEL ROMERO ROSAS Punto (2a)
		@Override
		public List<Object[]> encontrarTopicPorElDateGame(LocalDate date) {
			

			String quary = "SELECT m.tsscTopic , count(m.tsscTopic) FROM TsscGame m "
					+ "WHERE m.id IN (SELECT n.id from "
					+ "TsscGame n WHERE n.scheduledDate = :date"
			+ " ORDER BY n.scheduledTime DESC) GROUP BY m.tsscTopic";
			Query resultado = entityManager.createQuery(quary);
			resultado.setParameter("date", date);
			return resultado.getResultList();
		}

		@Override
		public boolean existsById(Long id) {
			TsscTopic tema= entityManager.find(TsscTopic.class, id);
			if(tema==null)
			{
				return false;
			}
			else {return true;}
			
		}

		
	
	
	
	
	
}
