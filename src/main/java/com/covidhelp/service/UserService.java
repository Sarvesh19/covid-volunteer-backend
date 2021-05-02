package com.covidhelp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covidhelp.model.ForCovidHelp;
import com.covidhelp.model.NeedCovidHelp;
import com.covidhelp.model.NeedCovidHelpDto;
import com.covidhelp.repository.ForCovidHelpRepository;
import com.covidhelp.repository.NeedCovidHelpRepository;

@Service
public class UserService {

	@Autowired
	private NeedCovidHelpRepository needCovidHelpRepository;

	@Autowired
	private ForCovidHelpRepository forCovidHelpRepository;
	
	public boolean seekHelp(NeedCovidHelpDto needCovidHelpDto) {

		try {
			NeedCovidHelp needHelp = new NeedCovidHelp();
			needHelp.setAddress(needCovidHelpDto.getAddress());
			needHelp.setCity(needCovidHelpDto.getCity());
			needHelp.setMobContact(needCovidHelpDto.getMobContact());
			needHelp.setState(needCovidHelpDto.getState());
			needHelp.setEmailId(needCovidHelpDto.getEmail());
			needHelp.setZip(needCovidHelpDto.getZip());
			needHelp.setName(needCovidHelpDto.getName());
			needHelp.setDescription(needCovidHelpDto.getDescription());

			needCovidHelpDto.getListNeeds().stream().forEach(x -> {
				if (x.equals("Plasma")) {
					needHelp.setPlasmaHelp(true);
				} else if (x.equals("Bed")) {
					needHelp.setBedHelp(true);
				} else if (x.equals("Food")) {
					needHelp.setFoodSupplyHelp(true);
				} else if (x.equals("Medicine")) {
					needHelp.setMedicineHelp(true);
				} else if (x.equals("Oxygen")) {
					needHelp.setOxygenHelp(true);
				} else if (x.equals("Financial")) {
					needHelp.setFinancialHelp(true);
				} else {
					needHelp.setOtherHelp(true);
				}
			});

			needCovidHelpRepository.save(needHelp);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}

		return false;

	}
	
	public boolean forHelp(NeedCovidHelpDto needCovidHelpDto) {

		try {
			ForCovidHelp forHelp = new ForCovidHelp();
			forHelp.setAddress(needCovidHelpDto.getAddress());
			forHelp.setCity(needCovidHelpDto.getCity());
			forHelp.setMobContact(needCovidHelpDto.getMobContact());
			forHelp.setState(needCovidHelpDto.getState());
			forHelp.setEmailId(needCovidHelpDto.getEmail());
			forHelp.setZip(needCovidHelpDto.getZip());
			forHelp.setName(needCovidHelpDto.getName());
			forHelp.setDescription(needCovidHelpDto.getDescription());

			needCovidHelpDto.getListNeeds().stream().forEach(x -> {
				if (x.equals("Plasma")) {
					forHelp.setPlasmaHelp(true);
				} else if (x.equals("Bed")) {
					forHelp.setBedHelp(true);
				} else if (x.equals("Food")) {
					forHelp.setFoodSupplyHelp(true);
				} else if (x.equals("Medicine")) {
					forHelp.setMedicineHelp(true);
				} else if (x.equals("Oxygen")) {
					forHelp.setOxygenHelp(true);
				} else if (x.equals("Financial")) {
					forHelp.setFinancialHelp(true);
				} else {
					forHelp.setOtherHelp(true);
				}
			});

			forCovidHelpRepository.save(forHelp);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}

		return false;

	}
	
	public List<NeedCovidHelp> getAllHelp(){
		
		return needCovidHelpRepository.findAll();
	}


}
