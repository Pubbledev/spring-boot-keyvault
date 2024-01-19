package co.pubble.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{
	@GetMapping("/healthcheck")
	public @ResponseBody String getHealthCheck(HttpServletResponse response)
	{
		response.setStatus(HttpServletResponse.SC_OK);
		return "ok";
	}
	
	@GetMapping("/index")
	public @ResponseBody String getIndex(HttpServletResponse response)
	{
		response.setStatus(HttpServletResponse.SC_OK);
		return "ok";
	}
}