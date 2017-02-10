/**
 * 
 */
package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Sunjian
 * @version 1.0
 * @since jdk1.7
 */
//@Configuration  
//@ComponentScan  
//@SpringBootApplication 
//@ComponentScan("com")  
//@EntityScan("com")  
//@RestController
@EnableAutoConfiguration
@RequestMapping("/hello")
public class Controller {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Controller.class, args);
	}
	@ResponseBody
	@RequestMapping
	public String hello() {
		String str="Hello Spring-Boot";
		System.out.println(str);
		return str;
	}

	@RequestMapping("/info")
	public Map<String, String> getInfo(@RequestParam String name) {
		Map<String, String> map = new HashMap<>();
		map.put("name", name);
		return map;
	}

	@RequestMapping("/list")
	public List<Map<String, String>> getList() {
		List<Map<String, String>> list = new ArrayList<>();
		Map<String, String> map = null;
		for (int i = 1; i <= 5; i++) {
			map = new HashMap<>();
			map.put("name", "Shanhy-" + i);
			list.add(map);
		}
		return list;
	}
}
