package com.web.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.web.dao.MyRepo;
import com.web.model.Feedback;

@Service
public class FeedbackService {

	@Autowired
	private MyRepo myRepo;
	private static int feedbackCount = 0;

	public void submitFeedback(String name, String emailId, Date dob, int rating, String suggestion) {
		myRepo.save(new Feedback(++feedbackCount, name, emailId, dob, rating, suggestion));
	}
}
