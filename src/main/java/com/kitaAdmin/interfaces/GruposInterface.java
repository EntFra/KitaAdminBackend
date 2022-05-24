package com.kitaAdmin.interfaces;

import com.kitaAdmin.KitaAdmin.entity.Grupos;

public interface GruposInterface {
	public Iterable<Grupos> findAll();
	public Grupos save(Grupos grupo);
	public Grupos edit(Grupos g);
	public void delete(String nombre);

}
