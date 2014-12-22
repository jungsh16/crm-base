package kr.co.tmon.crm.test;

import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class TestController {
	@RequestMapping(value = "/test.tmon")
	public ResponseEntity<String> getHelloMessage(String url, List<String> keyList) throws Exception {
		System.out.println(url);
		System.out.println(keyList);

		ObjectMapper mapper = new ObjectMapper();
		Map<String, String> jsonMap = mapper.readValue(new URL(url), new TypeReference<Map<String, String>>() {
		});

		Set<String> keySet = jsonMap.keySet();

		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json; charset=utf-8");
		ResponseEntity<String> responseEntity = new ResponseEntity<String>(mapper.writeValueAsString(jsonMap), headers, HttpStatus.OK);

		return responseEntity;
	}
}
