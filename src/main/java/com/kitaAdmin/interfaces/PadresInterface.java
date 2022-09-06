package com.kitaAdmin.interfaces;

import com.kitaAdmin.KitaAdmin.entity.Padres;

public interface PadresInterface {

	Iterable<Padres> findAllByAlumnoId(int alumnoId);
}
