package com.care.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CookieController {
	@RequestMapping("cookie")
	public String myCookie(
			HttpServletResponse response,
			@CookieValue(value="myCookie", required=false) Cookie cook,
			//myCookie가 없으면 무시해라
			HttpServletRequest request
			) {
		Cookie[] cookies = request.getCookies();
		if(cookies != null) {
			for(Cookie c:cookies) {
				System.out.println(c.getName()+ ":" + c.getValue());
			}
		}
		System.out.println("cook : " + cook);
		Cookie cookie = new Cookie("myCookie", "쿠키생성");
		cookie.setMaxAge(5);
		response.addCookie(cookie);
		return "cookie";
	}
}
