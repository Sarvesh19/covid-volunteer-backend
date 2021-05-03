package com.covidhelp.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "needCovidHelp")

public class NeedCovidHelp {
	
	
	@Id
    private ObjectId needHelpId;
	
	private String name;
	private String address;
	private String city;
	private String emailId;
	private String mobContact;
	private String state;
	private boolean isOxygenHelp;
	private boolean isPlasmaHelp;
	private boolean isBedHelp;
	private boolean isVentilatorHelp;
	private boolean isOtherHelp;
	private boolean isFoodSupplyHelp;
	private boolean isMedicineHelp;
	private boolean isFinancialHelp;
	private boolean isBloodHelp;
	private Integer bedCount;
	private String plasmaBloodGroup;
	private Integer ventilatorCount;
	private String zip;
	private String description;
	
	
	
	
	
	
	
	public boolean isBloodHelp() {
		return isBloodHelp;
	}
	public void setBloodHelp(boolean isBloodHelp) {
		this.isBloodHelp = isBloodHelp;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	public boolean isFinancialHelp() {
		return isFinancialHelp;
	}
	public void setFinancialHelp(boolean isFinancialHelp) {
		this.isFinancialHelp = isFinancialHelp;
	}
	public boolean isMedicineHelp() {
		return isMedicineHelp;
	}
	public void setMedicineHelp(boolean isMedicineHelp) {
		this.isMedicineHelp = isMedicineHelp;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public ObjectId getNeedHelpId() {
		return needHelpId;
	}
	public void setNeedHelpId(ObjectId needHelpId) {
		this.needHelpId = needHelpId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobContact() {
		return mobContact;
	}
	public void setMobContact(String mobContact) {
		this.mobContact = mobContact;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public boolean isOxygenHelp() {
		return isOxygenHelp;
	}
	public void setOxygenHelp(boolean isOxygenHelp) {
		this.isOxygenHelp = isOxygenHelp;
	}
	public boolean isPlasmaHelp() {
		return isPlasmaHelp;
	}
	public void setPlasmaHelp(boolean isPlasmaHelp) {
		this.isPlasmaHelp = isPlasmaHelp;
	}
	public boolean isBedHelp() {
		return isBedHelp;
	}
	public void setBedHelp(boolean isBedHelp) {
		this.isBedHelp = isBedHelp;
	}
	public boolean isVentilatorHelp() {
		return isVentilatorHelp;
	}
	public void setVentilatorHelp(boolean isVentilatorHelp) {
		this.isVentilatorHelp = isVentilatorHelp;
	}
	public boolean isOtherHelp() {
		return isOtherHelp;
	}
	public void setOtherHelp(boolean isOtherHelp) {
		this.isOtherHelp = isOtherHelp;
	}
	public boolean isFoodSupplyHelp() {
		return isFoodSupplyHelp;
	}
	public void setFoodSupplyHelp(boolean isFoodSupplyHelp) {
		this.isFoodSupplyHelp = isFoodSupplyHelp;
	}
	public Integer getBedCount() {
		return bedCount;
	}
	public void setBedCount(Integer bedCount) {
		this.bedCount = bedCount;
	}
	public String getPlasmaBloodGroup() {
		return plasmaBloodGroup;
	}
	public void setPlasmaBloodGroup(String plasmaBloodGroup) {
		this.plasmaBloodGroup = plasmaBloodGroup;
	}
	public Integer getVentilatorCount() {
		return ventilatorCount;
	}
	public void setVentilatorCount(Integer ventilatorCount) {
		this.ventilatorCount = ventilatorCount;
	}
	
}
