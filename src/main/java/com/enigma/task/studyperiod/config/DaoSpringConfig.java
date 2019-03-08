package com.enigma.task.studyperiod.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.enigma.task.studyperiod.dao.StudyPeriodDao;
import com.enigma.task.studyperiod.dao.impl.StudyPeriodDaoImpl;

@Configuration
public class DaoSpringConfig {
	
	@Bean
	public StudyPeriodDao studyPeriodDao() {
		return new StudyPeriodDaoImpl();
	}
	
	@Bean
    public ModelMapper modelMapper() {
    	return new ModelMapper();
    }

}
