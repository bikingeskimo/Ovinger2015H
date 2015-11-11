package springmvc.userexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Roger on 11.11.2015.
 */
@Controller
public class DisplayController {

    @RequestMapping("/display.htm")
    public String redirect(){
        return "display";
    }
}
