package com.resource;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ping", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class PingResource {

	@RequestMapping()
	public String pingDB() {
		return "Status: OK";

	}
}