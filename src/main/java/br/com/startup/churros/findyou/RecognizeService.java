package br.com.startup.churros.findyou;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RecognizeService {

	@Test
	public void enroll() throws URISyntaxException {

		RestTemplate restTemplate = new RestTemplate();

		URI url = new URI("https://api.kairos.com/enroll");

		EnrollVO vo = new EnrollVO();

		vo.setImage("http://media.kairos.com/kairos-elizabeth.jpg");
		vo.setSubject_id("subtest1");
		vo.setGallery_name("gallerytest1");
		vo.setSelector("SETPOSE");
		vo.setSymmetricFill("true");

		HttpHeaders headers = new HttpHeaders();

		headers.add("app_id", "4985f625");
		headers.add("app_key", "4423301b832793e217d04bc44eb041d3");

		HttpEntity<EnrollVO> entity = new HttpEntity<EnrollVO>(vo, headers);

		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);

		System.out.println(response.getBody());
		// teste

	}
}
