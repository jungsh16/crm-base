package kr.co.tmon.crm;

import java.net.URL;

import org.apache.commons.io.IOUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RelayController {
	@RequestMapping(value = "/relay.tmon")
	public ResponseEntity<String> getHelloMessage(String inputUrl) throws Exception {
		String result = IOUtils.toString(new URL(inputUrl), "UTF-8");
		System.out.println(result);
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json; charset=utf-8");

		ResponseEntity<String> responseEntity = new ResponseEntity<String>(result, headers, HttpStatus.OK);

		return responseEntity;
	}
}
