package br.com.vertechit.rm;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReportManagerController {
	private static final Logger logger = LoggerFactory.getLogger(ReportManagerController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public String home(Locale locale) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		return formattedDate;
	}


	@RequestMapping(value="/form", method = RequestMethod.POST)
	@ResponseBody 
	public ReportManager form(ReportManager reportManager) {
		logger.info("/reportManager/form");
		return reportManager;
	}

	@RequestMapping(value="/json", method = RequestMethod.POST)
	@ResponseBody 
	public ReportManager json(@RequestBody ReportManager reportManager) {
		logger.info("/reportManager/json");
		return reportManager;
	}
	
}