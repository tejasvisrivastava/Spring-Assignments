package com.capg.mvc.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.capg.mvc.entities.Trainee;
import com.capg.mvc.service.TraineeService;

@Controller
@Transactional
public class TraineeController {

	@Autowired
	private TraineeService traineeService;
	

	@RequestMapping("/save")
	public String addTrainee(@ModelAttribute("trainee")Trainee trainee,ModelMap map) {
		 Trainee savedTrainee = traineeService.newTrainer(trainee);
		 System.out.println("saving...");
		 if(savedTrainee!=null)
		 {
		 map.addAttribute("msg", "employ saved in DB with Id:"+savedTrainee.getTraineeId());
		 }
		 else
		 {
			 map.addAttribute("msg", "employ not saved in DB ");
		 }	 
		 return "save";
	}
	@RequestMapping("/login")
	public String loginTrainee() {
		System.out.println("Hello");
		return "result";
		
		
	}
	@RequestMapping("/addTrainee")
	public String addTrainee() {
		return "addTrainee";
	}
	
	@RequestMapping("/retrieve")
	public String findTrainee(@RequestParam("traineeId") int traineeId,Model model)
	{
		Trainee trainee=traineeService.retrieveTrainee(traineeId);
		if(trainee!=null)
		{
			model.addAttribute("msg",trainee);
		}
		else
		{
			model.addAttribute("msg","Id not found");
		}
		return "viewTrainee";
		
	}
	
	
	@RequestMapping("/retrieveTrainee")
	public String retrieveTrainee()
	{
		return "viewTrainee";
	}
	
	@RequestMapping(value="/deleteTrainee",method=RequestMethod.GET)
	public String showDeleteTrainee() {
		return "deleteTrainee";
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	public String deleteTrainee(@RequestParam("traineeId") int traineeId, ModelMap modelMap) {
		Trainee trainee=traineeService.findTrainee(traineeId);
		modelMap.addAttribute("del",trainee);
		return "deleteTrainee";
		
	}
	@RequestMapping(value="/deleteTrainee/{traineeId}",method=RequestMethod.POST)
	public String delete(@PathVariable("traineeId") int traineeId, ModelMap modelMap) {
		traineeService.traineeDelete(traineeId);
		return "deleteTrainee";
	}
	
	
	@RequestMapping(value="/modifyTrainee", method=RequestMethod.GET)
	public String showModifyTrainee() {
		return "modifyTrainee";
	}
	@RequestMapping(value="/modify",method=RequestMethod.POST)
	public String modifyById(@RequestParam("traineeId") int traineeId, ModelMap modelMap) {
		Trainee trainee=traineeService.findTrainee(traineeId);
		modelMap.addAttribute("val",trainee);
		return "modifyTrainee";
	}
	
	@RequestMapping(value="/modifyTrainee",method=RequestMethod.POST)
	public String modify(@ModelAttribute("trainee") Trainee trainee, ModelMap modelMap) {
		traineeService.modifyTrainee(trainee);
		modelMap.addAttribute("msg","Trainee "+trainee.getTraineeId()+" modified");
		return "modifyTrainee";
	}
	
	@RequestMapping(value="/retrieveAllTrainee",method=RequestMethod.GET)
	public String retrieveall(ModelMap modelMap) {
		List<Trainee> list=traineeService.getAllTrainee();
		modelMap.addAttribute("list", list);
		return "retrieveAllTrainee";
	}

	
	
}


