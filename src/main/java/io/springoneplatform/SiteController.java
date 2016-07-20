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

	@RequestMapping("/agenda")
	public String agenda() {
		return "redirect:https://2016.event.springoneplatform.io/schedule/sessions";
	}

	@RequestMapping("/code-of-conduct")
	public String codeofconduct() {
		return "codeofconduct";
	}

	@RequestMapping("/faq")
	public String faq() {
		return "faq";
	}

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/ignite")
	public String ignite() {
		return "redirect:https://2016.event.springoneplatform.io/schedule/sessions/ignite_springone_platform.html";
	}

	@RequestMapping("/keynotes")
	public String keynotes() {
		return "keynotes";
	}

	@RequestMapping("/openapi-workshop")
	public String openapiworkshop() {
		return "openapiworkshop";
	}

	@RequestMapping("/pcf-open-space")
	public String pcfopenspace() {
		return "pcfopenspace";
	}


	@RequestMapping("/register")
	public String register() {
		return "redirect:https://2016.event.springoneplatform.io/register";
	}

	@RequestMapping("/sessions")
	public String sessions() {
		return "redirect:https://2016.event.springoneplatform.io/schedule/sessions";
	}

	@RequestMapping("/speaker-guidelines")
	public String speakerguidelines() {
		return "redirect:/speaker-guidelines/breakout";
	}

	@RequestMapping("/speaker-guidelines/breakout")
	public String breakoutspeakerguidelines() {
		return "breakoutspeakerguidelines";
	}

	@RequestMapping("/speaker-guidelines/main-stage")
	public String mainstagespeakerguidelines() {
		return "mainstagespeakerguidelines";
	}

	@RequestMapping("/submit")
	public String submit() {
		return "redirect:https://2016.event.springoneplatform.io/schedule/sessions";
	}

	@RequestMapping("/thank-you")
	public String thankyou() {
		return "thankyou";
	}

	@RequestMapping("/training")
	public String training() {
		return "training";
	}

	@RequestMapping("/travel")
	public String travel() {
		return "travel";
	}

	@RequestMapping("/2015")
	public String index2015() {
		return "index2015";
	}

	@RequestMapping("/2015/training")
	public String training2015() {
		return "training2015";
	}

	@RequestMapping("/2015/sponsors")
	public String sponsors2015() {
		return "sponsors2015";
	}

	@RequestMapping("/2015/travel")
	public String travel2015() {
		return "travel2015";
	}

	@RequestMapping("*")
	public String fallbackMethod() {
		return "404";
	}

}
