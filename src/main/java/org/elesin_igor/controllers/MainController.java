package org.elesin_igor.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Базовый контроллер хеллоу
 */

@RestController
@RequestMapping("/api")
public class MainController {

	/**
	 * Первый рест контроллер
	 * @return 100
	 */

	@GetMapping("/getTask")
	public int getTask() {
		return 100;
	}
}
