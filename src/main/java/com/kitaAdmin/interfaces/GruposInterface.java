package com.kitaAdmin.interfaces;

import java.util.List;
import java.util.Map;

import com.kitaAdmin.KitaAdmin.entity.Grupos;

public interface GruposInterface {
	public List<Map<String, Object>>get();
	public List<Map<String, Object>>get(String nombre);
	public Grupos add(Grupos g);
	public Grupos edit(Grupos g);
	public void delete(String nombre);

}
