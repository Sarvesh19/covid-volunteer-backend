package com.covidhelp.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.covidhelp.model.ForCovidHelp;
import com.covidhelp.model.NeedCovidHelp;
import com.covidhelp.model.NeedCovidHelpDto;


@RestController
@CrossOrigin(origins = { "https://covid-volunteer-v1.firebaseapp.com", "http://localhost:4200","https://covid19-312519.firebaseapp.com","https://100milesahead.com","http://100milesahead.com","https://covid19-312519.web.app" })

@RequestMapping("/")
public class UserController {

	@Autowired
	private com.covidhelp.service.UserService userService;

	


	@RequestMapping(value = "test", method = RequestMethod.GET)
	public ResponseEntity<Map<String, String>> welcome() {
		Map<String, String> test = new HashMap<>();
		test.put("data", "Electric Nodes");



		return new ResponseEntity<Map<String, String>>(test, new HttpHeaders(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "seekhelp", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public ResponseEntity<Map<String, Boolean>> seekhelp(@RequestBody NeedCovidHelpDto needCovidHelpDto) {
		
		boolean ishelpadded = userService.seekHelp(needCovidHelpDto);
		
		
		
		Map<String, Boolean> test = new HashMap<>();
		test.put("helpAdded", ishelpadded);



		return new ResponseEntity<Map<String, Boolean>>(test, new HttpHeaders(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "volunteer", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public ResponseEntity<Map<String, Boolean>> volunteer(@RequestBody NeedCovidHelpDto needCovidHelpDto) {
		
		boolean isforHelp  =userService.forHelp(needCovidHelpDto);
		
		
		
		Map<String, Boolean> test = new HashMap<>();
		test.put("isforHelp", isforHelp);



		return new ResponseEntity<Map<String, Boolean>>(test, new HttpHeaders(), HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "getallhelp", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<NeedCovidHelp>> getallhelp() {
		
		List<NeedCovidHelp> listhelp = userService.getAllHelp();
		
	
		return new ResponseEntity<List<NeedCovidHelp>>(listhelp, new HttpHeaders(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "getalloffer", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<ForCovidHelp>> getallOffer() {
		
		List<ForCovidHelp> listOffer = userService.getAllOffer();
		
	
		return new ResponseEntity<List<ForCovidHelp>>(listOffer, new HttpHeaders(), HttpStatus.OK);
	}
	
	
}