package com.kitaAdmin.KitaAdmin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kitaAdmin.KitaAdmin.dao.AlumnosDao;
import com.kitaAdmin.KitaAdmin.entity.Alumnos;
import com.kitaAdmin.interfaces.AlumnosInterface;

@Service
public class AlumnosService implements AlumnosInterface{
	
@Autowired
private AlumnosDao alumnosDao;
//Recupera todos los alumnos

@Transactional
public Alumnos update(Alumnos alumno) {
	return alumnosDao.save(alumno);
}
@Override
@Transactional(readOnly = true)
public Iterable<Alumnos> findAllByGrupo(String grupo) {		
	return alumnosDao.findAllByGrupo(grupo);
}
@Override
@Transactional(readOnly = true)
public Iterable<Alumnos> findAll() {
	return alumnosDao.findAll();
}
@Override
@Transactional
public Alumnos save(Alumnos alumno) {
	// TODO Auto-generated method stub
	return alumnosDao.save(alumno);
}
@Override
public void deleteById(int alumnoId) {
	alumnosDao.deleteById(alumnoId);
	
}

}
