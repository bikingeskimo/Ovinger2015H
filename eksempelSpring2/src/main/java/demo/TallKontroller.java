package demo;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by Roger on 21/10/2015.
 */

@Controller
@RequestMapping(value = "/*")
public class TallKontroller {

    @RequestMapping(method = RequestMethod.GET)
    public String visStartView(@ModelAttribute(value = "kalkulator") Tall tall){
        return "index";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String summer(@Valid @ModelAttribute(value="kalkulator") Tall tall, BindingResult error) {

        if (error.hasErrors()){
            return "index";
        }
        return "sum";
    }
}