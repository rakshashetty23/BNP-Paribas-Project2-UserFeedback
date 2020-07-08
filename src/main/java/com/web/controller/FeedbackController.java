package com.web.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;
import javax.xml.ws.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.model.Feedback;
import com.web.service.FeedbackService;

@Controller
public class FeedbackController {

	@Autowired
	FeedbackService fbService;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}
	
	@RequestMapping(value = "/submit-feedback", method = RequestMethod.GET)
	public String showSubmitFeedbackPage(ModelMap model) {
		model.addAttribute("feedback", new Feedback(0, null, null, new Date(), 1, null));
		return "feedback";
	}
	
	@RequestMapping(value = "/submit-feedback", method = RequestMethod.POST)
	public String submitFeedback(ModelMap model, @Valid Feedback feedback, BindingResult result) {
	
		if(result.hasErrors()) {
			return "feedback";
		}
		
		fbService.submitFeedback(feedback.getName(), feedback.getEmailId(), feedback.getDob(), feedback.getRating(), feedback.getSuggestion());
		return "successful-submit";
	}
}
