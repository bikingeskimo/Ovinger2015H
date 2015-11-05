package main.kontroller;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import springmvc.leksjon.domene.Tall;

@Controller
public class TallKontroller {
      
    @RequestMapping(value="/*")
    public String visStartView(@ModelAttribute(value="kalkulator") Tall tall){
        return "index";
    }
    
    @RequestMapping(value = "summer")
    public String summer(@Valid @ModelAttribute(value="kalkulator") Tall tall,
        BindingResult error) {
        
        if (error.hasErrors()){ 
            return "index";
        }
        
        return "sum";
    }
}