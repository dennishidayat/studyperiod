package com.enigma.task.studyperiod.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;

import com.enigma.task.studyperiod.dao.StudyPeriodDao;
import com.enigma.task.studyperiod.exception.CustomException;
import com.enigma.task.studyperiod.model.StudyPeriod;
import com.enigma.task.studyperiod.repository.StudyPeriodRepository;

public class StudyPeriodDaoImpl extends BaseImpl implements StudyPeriodDao {
	
	@Autowired
	public StudyPeriodRepository repository;

	public StudyPeriod getById(int id) throws CustomException {
		return repository.findById(id).orElse(null);
	}

	public StudyPeriod save(StudyPeriod studyPeriod) throws CustomException {
		return repository.save(studyPeriod);
	}

	public void delete(StudyPeriod studyPeriod) throws CustomException {
		repository.delete(studyPeriod);
	}

	public List<StudyPeriod> getList() throws CustomException {
		CriteriaBuilder critB = em.getCriteriaBuilder();
		CriteriaQuery<StudyPeriod> query = critB.createQuery(StudyPeriod.class);
		Root<StudyPeriod> root = query.from(StudyPeriod.class);
		query.select(root);
		
		TypedQuery<StudyPeriod> i = em.createQuery(query);
		
		return i.getResultList();
	}

	public List<StudyPeriod> getListByActiveFlag() throws CustomException {
		CriteriaBuilder critB = em.getCriteriaBuilder();
		CriteriaQuery<StudyPeriod> query = critB.createQuery(StudyPeriod.class);
		Root<StudyPeriod> root = query.from(StudyPeriod.class);
		query = query.select(root)
				.where(critB.equal(root.get("activeFlag"), 1));
		
		TypedQuery<StudyPeriod> i = em.createQuery(query);
		
		return i.getResultList();
	}
}
