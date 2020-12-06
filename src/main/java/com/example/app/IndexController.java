package com.example.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping({ "/", "/index" })
public class IndexController {


	/**
	 * Index page that set game grid
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping
	public String getIndex(Model model) {

		// This is to resolve the view
		return "index";
	}


}
