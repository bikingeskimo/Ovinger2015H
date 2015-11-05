package springmvc.userexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springmvc.userexample.ui.UserForm;

import javax.validation.Valid;


/**
 *
 * @author tomash
 */
@Controller
@RequestMapping(value = "/*")

public class UserController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String showForm(@ModelAttribute(value="userForm") UserForm userForm){
        System.out.println("******************     UserController.showForm   ************************");
        return "userform";
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String showResultPost(@Valid @ModelAttribute(value="userForm") UserForm userForm, BindingResult result){ //merk at vi ikke trenger @ModelAttribute eller @RequestParam. userForm ligger i modellen og vil derfor fylles!
        System.out.println("******************     UserController.showResultPost ************************");
          
        if (result.hasErrors()){
            return "userform";
        }
        return "userformresult";
    }
}
