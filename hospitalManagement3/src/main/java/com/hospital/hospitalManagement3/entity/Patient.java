package com.hospital.hospitalManagement3.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Patient {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer PatientId;
		private String patientName;
		private Integer age;
		private String gender;
		private String disease;
		
		public Integer getPatientId() {
			return PatientId;
		}
		public void setPatientId(Integer patientId) {
			PatientId = patientId;
		}
		public String getPatientName() {
			return patientName;
		}
		public void setPatientName(String patientName) {
			this.patientName = patientName;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		public String getDisease() {
			return disease;
		}
		public void setDisease(String disease) {
			this.disease = disease;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		
}

