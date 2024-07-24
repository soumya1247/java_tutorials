package com.springboot.learnoauth;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {

	@GetMapping("/")
	public String HelloWorld(Authentication authentication) {
		System.out.println(authentication);
		return "Hello World";
	}
}

//OAuth2AuthenticationToken [Principal=Name: [108831760408708491101], Granted Authorities: [[OIDC_USER, SCOPE_https://www.googleapis.com/auth/userinfo.email, SCOPE_https://www.googleapis.com/auth/userinfo.profile, SCOPE_openid]], User Attributes: [{at_hash=YU8ju8NbobOXy1NR2s8raA, sub=108831760408708491101, email_verified=true, iss=https://accounts.google.com, given_name=Soumyajit, locale=en, nonce=YSrHY2ISnQgVORfR9Ehk6a5AyKaTf-UwIBrJNZuJG4s, picture=https://lh3.googleusercontent.com/a/ACg8ocJcUKYnNS2MRY86v2tv4FD1iyrUDwAs4LWd_C-8eTtv=s96-c, aud=[673668772912-l2g943bu0mvc7aqumqtn1ij620crgdib.apps.googleusercontent.com], azp=673668772912-l2g943bu0mvc7aqumqtn1ij620crgdib.apps.googleusercontent.com, name=Soumyajit Routh, exp=2023-12-26T09:21:23Z, family_name=Routh, iat=2023-12-26T08:21:23Z, email=soumyadexter5@gmail.com}], Credentials=[PROTECTED], Authenticated=true, Details=WebAuthenticationDetails [RemoteIpAddress=127.0.0.1, SessionId=855B3A264BD72EFD99199BB99B9E1776], Granted Authorities=[OIDC_USER, SCOPE_https://www.googleapis.com/auth/userinfo.email, SCOPE_https://www.googleapis.com/auth/userinfo.profile, SCOPE_openid]]
