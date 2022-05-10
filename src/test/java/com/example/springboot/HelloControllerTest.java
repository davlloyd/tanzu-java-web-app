package com.example.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HelloController.class)
class HelloControllerTest {

    @Autowired
    private HelloController controller;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void index() throws Exception {
		StringBuilder buildpage = new StringBuilder();
		buildpage.append("<br><br>");
		buildpage.append("<center>");
		buildpage.append("<br><br><center><h1>G'day from <b>TAP</b> + <b>Tanzu</b>! <h1>");
		buildpage.append("<img src='https://dtb5pzswcit1e.cloudfront.net/assets/images/product_logos/icon_tanzugemfire_1594695582.png' width='32' height='32'>");
		buildpage.append("</center>");
		buildpage.append("<br><br>");
		buildpage.append("<center><img src='https://www.visuartists.com/images/pics/1035_6cHgfp_giphy-23gif.gif' width='150' height='150'></center>");
		String webpage = buildpage.toString();

        assertEquals(webpage, controller.index());

        mockMvc
            .perform(get("/"))
            .andExpect(status().isOk())
            .andExpect(content().string(webpage));
    }
}
