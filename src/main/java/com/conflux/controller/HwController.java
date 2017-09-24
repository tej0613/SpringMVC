package com.conflux.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HwController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView model =new ModelAndView("HwPage");
		model.addObject("msg", "hello world");
		return model;
	}

}
