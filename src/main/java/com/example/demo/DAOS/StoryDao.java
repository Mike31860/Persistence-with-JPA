package com.example.demo.DAOS;

import java.util.List;

import com.example.demo.Model.TsscStory;

public interface StoryDao {
	
	public TsscStory guardar(TsscStory entidad);
	public TsscStory actualizar(TsscStory entidad);
	public void eliminar(TsscStory entidad);
	public TsscStory encontrarPorId(long id);
	public List<TsscStory> findAll();
	public boolean existsById(Long id);

}
