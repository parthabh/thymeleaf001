package foo.bar.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import foo.bar.dao.IPersonDAO;
import foo.bar.dao.dummy.DummyPersonDAO;

@Controller
public class PersonC {

	private final static Logger logger = LoggerFactory.getLogger(PersonC.class);
	private IPersonDAO personDAO; 

	@RequestMapping("/user/list")
	public ModelAndView getAllUsers() {

		logger.debug("Send to show all users page.");
		ModelAndView showAllUsers = new ModelAndView("ShowAllUsers");
		
		logger.debug("Send a list of dummy users to show.");
		personDAO = new DummyPersonDAO(); 
		showAllUsers.addObject("userList", personDAO.getAll()); 
		
		return showAllUsers;
	}
}
