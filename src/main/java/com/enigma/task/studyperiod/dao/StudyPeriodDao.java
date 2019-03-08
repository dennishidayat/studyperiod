package com.enigma.task.studyperiod.dao;

import java.util.List;

import com.enigma.task.studyperiod.exception.CustomException;
import com.enigma.task.studyperiod.model.StudyPeriod;

public interface StudyPeriodDao {
	public StudyPeriod getById(int id) throws CustomException;
	public StudyPeriod save(StudyPeriod studyPeriod) throws CustomException;
	void delete(StudyPeriod studyPeriod) throws CustomException;
	
	List<StudyPeriod> getList() throws CustomException;
	List<StudyPeriod> getListByActiveFlag() throws CustomException;
}
