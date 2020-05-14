package com.example.demo.DAOS;


import com.example.demo.Model.TsscTimecontrol;

public interface TimeControllerDao {
	
	public TsscTimecontrol guardar(TsscTimecontrol  entidad);
	public TsscTimecontrol  actualizar(TsscTimecontrol  entidad);
	public void eliminar(TsscTimecontrol  entidad);
	public TsscTimecontrol  findById(long id);

}
