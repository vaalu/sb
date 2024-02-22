/**
 * 
 */
package in.jeani.learning.sb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.jeani.learning.sb.services.DataLoadService;

/**
 * 
 */
@RestController
public class SimpleController {
	
	@Autowired
	DataLoadService dataService;
	
	@GetMapping("/load")
	public String laodFiles() {
		dataService.loadData();
		return "Data Loaded";
	}
}
