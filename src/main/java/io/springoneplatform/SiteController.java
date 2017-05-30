/*
 * Copyright 2012-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.springoneplatform;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SiteController {

	@RequestMapping("/")
	public String index2017() {
		return "2017index";
	}

	// 2016

	@RequestMapping("/2016")
	public String index2016() {
		return "2016index";
	}

	@RequestMapping(value={"/agenda","/2016/agenda"})
	public String agenda2016() {
		return "redirect:https://2016.event.springoneplatform.io/schedule/2016-08-02";
	}

	@RequestMapping("/2016/code-of-conduct")
	public String codeofconduct2016() {
		return "2016codeofconduct";
	}

	@RequestMapping("/code-of-conduct")
	public String codeofconduct2017() {
		return "2017codeofconduct";
	}

	@RequestMapping("/2016/faq")
	public String faq2016() {
		return "2016faq";
	}

	@RequestMapping("/faq")
	public String faq() {
		return "redirect:/2016/faq";
	}

	@RequestMapping(value={"/ignite", "/2016/ignite"})
	public String ignite() {
		return "redirect:https://2016.event.springoneplatform.io/schedule/sessions/ignite_springone_platform.html";
	}

	@RequestMapping("/2016/keynotes")
	public String keynotes2016() {
		return "2016keynotes";
	}

	@RequestMapping("/keynotes")
	public String keynotes() {
		return "redirect:/2016/keynotes";
	}

	@RequestMapping("/stay-informed")
	public String stayinformed() {
		return "2017stayinformed";
	}

	@RequestMapping("/on-the-list")
	public String onthelist() {
		return "2017onthelist";
	}

	@RequestMapping("/2016/openapi-workshop")
	public String openapiworkshop2016() {
		return "2016openapiworkshop";
	}

	@RequestMapping("/openapi-workshop")
	public String openapiworkshop() {
		return "redirect:/2016/openapi-workshop";
	}

	@RequestMapping("/2016/pcf-open-space")
	public String pcfopenspace2016() {
		return "2016pcfopenspace";
	}

	@RequestMapping("/pcf-open-space")
	public String pcfopenspace() {
		return "redirect:/2016/pcf-open-space";
	}

	@RequestMapping(value={"/register","/2016/register"})
	public String register() {
		return "redirect:https://2016.event.springoneplatform.io/register";
	}

	@RequestMapping(value={"/sessions","/2016/sessions"})
	public String sessions() {
		return "redirect:https://2017.springoneplatform.io/ehome/s1p/registration";
	}

	@RequestMapping("/2016/speaker-guidelines/breakout")
	public String breakoutspeakerguidelines2016() {
		return "2016breakoutspeakerguidelines";
	}

	@RequestMapping("/speaker-guidelines/breakout")
	public String breakoutspeakerguidelines() {
		return "redirect:/2016/speaker-guidelines/breakout";
	}

	@RequestMapping("/2016/speaker-guidelines/main-stage")
	public String mainstagespeakerguidelines2016() {
		return "2016mainstagespeakerguidelines";
	}

	@RequestMapping("/speaker-guidelines/main-stage")
	public String mainstagespeakerguidelines() {
		return "redirect:/2016/speaker-guidelines/main-stage";
	}

	@RequestMapping(value={"/speaker-guidelines","/2016/speaker-guidelines"})
	public String speakerguidelines() {
		return "redirect:/speaker-guidelines/breakout";
	}

	@RequestMapping("/2016/sponsors")
	public String sponsors2016() {
		return "2016sponsors";
	}

	@RequestMapping("/sponsors")
	public String sponsors() {
		return "redirect:/2016/sponsors";
	}

	@RequestMapping(value={"/submit","/2016/submit"})
	public String submit() {
		return "redirect:/";
	}

	@RequestMapping("/thank-you")
	public String thankyou() {
		return "2017thankyou";
	}

	@RequestMapping("/2016/training")
	public String training2016() {
		return "2016training";
	}

	@RequestMapping("/training")
	public String training() {
		return "2017training";
	}

	@RequestMapping("/training/pivotal-cloud-foundry")
	public String trainingpcf() {
		return "2017trainingpcf";
	}

	@RequestMapping("/training/spring-cloud-services")
	public String trainingscs() {
		return "2017trainingscs";
	}

	@RequestMapping("/training/spring-boot-developer")
	public String trainingsbd() {
		return "2017trainingsbd";
	}

	@RequestMapping("/2016/travel")
	public String travel2016() {
		return "2016travel";
	}

	@RequestMapping("/travel")
	public String travel() {
		return "2017travel";
	}

	// 2015

	@RequestMapping("/2015")
	public String index2015() {
		return "2015index";
	}

	@RequestMapping("/2015/training")
	public String training2015() {
		return "2015training";
	}

	@RequestMapping("/2015/sponsors")
	public String sponsors2015() {
		return "2015sponsors";
	}

	@RequestMapping("/2015/travel")
	public String travel2015() {
		return "2015travel";
	}

	// Catch all

	@RequestMapping("*")
	public String fallbackMethod() {
		return "2017404";
	}

}
