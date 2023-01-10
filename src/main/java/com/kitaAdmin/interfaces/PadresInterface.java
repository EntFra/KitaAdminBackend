package com.kitaAdmin.interfaces;

import com.kitaAdmin.KitaAdmin.entity.Padres;

public interface PadresInterface {

	public Iterable<Padres> findAllByAlumnoId(int alumnoId);

	public Padres findByUsuariosId(int usuariosId);

	public Padres update(Padres padre);
}
