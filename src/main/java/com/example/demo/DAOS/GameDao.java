package com.example.demo.DAOS;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.example.demo.Model.TsscGame;



public interface GameDao {
	
	public TsscGame guardar(TsscGame entidad);
	public TsscGame actualizar(TsscGame entidad);
	public void eliminar(TsscGame entidad);
	public TsscGame encontrarPorId(long id);
	public List<TsscGame> findAll();
	public boolean existsById(Long id);

	
	public List<TsscGame> encontrarPorNameTopic(String name);
	public List<TsscGame> encontrarPorDescriptionTopic(String description);
	public List<TsscGame> encontrarPorIdTopic(long idTopic);
	

	public List<TsscGame> encontrarPorDates(LocalDate date1, LocalDate date2);
	public List<TsscGame> encontrarPorDateHours(LocalDate date, LocalTime h1, LocalTime h2);
	public List<TsscGame> encontrarPorDateStoryTime(LocalDate date);

}
