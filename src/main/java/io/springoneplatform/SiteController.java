package io.springoneplatform;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SiteController {

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

    @RequestMapping("/submit")
    public String submit() {
        return "submit";
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
		public String fallbackMethod(){
		    return "404";
		}

}
