package com.example.demo.DAOS;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.util.Pair;

import com.example.demo.Model.TsscTopic;

public interface TopicDao {
	
	public TsscTopic guardar(TsscTopic entidad);
	public TsscTopic actualizar(TsscTopic entidad);
	public void eliminar(TsscTopic entidad);
	public List<TsscTopic> encontrarPorNombre(String name);
	public List<TsscTopic> encontrarPorDescription(String description);
	public boolean existsById(Long id);
	public List<Object[]> encontrarTopicPorElDateGame(LocalDate date);
	public TsscTopic findById(long id);
	public List<TsscTopic> findAll();
}
