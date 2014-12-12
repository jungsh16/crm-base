package kr.co.tmon.crm;

import java.net.URL;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping(value = "/test.tmon")
	public ResponseEntity<String> getHelloMessage(HttpServletRequest request) throws Exception {
		String result = IOUtils.toString(new URL(request.getParameter("inputUrl")));
		System.out.println(result);
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "text/html; charset=utf-8");

		ResponseEntity<String> responseEntity = new ResponseEntity<String>(result, headers, HttpStatus.OK);

		return responseEntity;
	}
}
