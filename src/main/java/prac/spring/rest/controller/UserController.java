package prac.spring.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import prac.spring.rest.model.User;

@RestController
@RequestMapping("/users")
public class UserController {

	@GetMapping("/{user}")
	private String getUser(@PathVariable("user") String user) {
		return "Hi-" + user;
	}

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<User> saveUser(@Validated @RequestBody User user) {
		return new ResponseEntity<User>(user, HttpStatus.ACCEPTED);
	}
}
