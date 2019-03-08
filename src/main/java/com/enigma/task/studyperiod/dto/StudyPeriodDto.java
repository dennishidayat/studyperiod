package com.enigma.task.studyperiod.dto;

public class StudyPeriodDto {
	private Integer sequence;
	private String description;
	private Boolean activeFlag;

	public StudyPeriodDto(Integer sequence, String description, Boolean activeFlag) {
		this.sequence = sequence;
		this.description =  description;
		this.activeFlag = activeFlag;
	}
	
	public StudyPeriodDto() {}

	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
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
