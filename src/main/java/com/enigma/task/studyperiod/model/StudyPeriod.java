package com.enigma.task.studyperiod.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="study_period")
public class StudyPeriod {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="sequence")
	private int sequence;
	@Column(name="description")
	private String description;
	@Column(name="active_flag")
	private Boolean activeFlag;
	
	public StudyPeriod(int sequence, String description, Boolean activeFlag) {
		this.sequence = sequence;
		this.description = description;
		this.activeFlag = activeFlag;
	}
	
	public StudyPeriod() {}
	
	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(Boolean activeFlag) {
		this.activeFlag = activeFlag;
	}

}
