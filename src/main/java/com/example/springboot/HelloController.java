package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		StringBuilder buildpage = new StringBuilder();
		buildpage.append("<br><br>");
		buildpage.append("<center>");
		buildpage.append("<br><br><center><h1>G'day from <b>TAP</b> + <b>Tanzu</b>! <h1>");
		buildpage.append("<img src='https://dtb5pzswcit1e.cloudfront.net/assets/images/product_logos/icon_tanzugemfire_1594695582.png' width='32' height='32'>");
		buildpage.append("</center>");
		buildpage.append("<br><br>");
		buildpage.append("<center><img src='https://www.visuartists.com/images/pics/1035_6cHgfp_giphy-23gif.gif' width='150' height='150'></center>");
		String webpage = buildpage.toString();
		return webpage;
	}

}