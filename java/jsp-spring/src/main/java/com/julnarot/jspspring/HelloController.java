package com.julnarot.jspspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.HashMap;

@RestController
public class HelloController {

	@GetMapping("/")
	public Map<String, String> getUser() {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", "001");
        map.put("userName", "julnarot");
        map.put("email", "julnarot@mail.com");
        return map;
	}

}