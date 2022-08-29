package org.comit.course.controller;

import org.comit.course.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ItemController {
	
	@Autowired
	ItemService itemService;

}
