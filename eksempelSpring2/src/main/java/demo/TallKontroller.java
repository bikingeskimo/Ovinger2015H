package demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Roger on 21/10/2015.
 */

@Controller
public class TallKontroller {

    @RequestMapping("/")
    public String visStartView(){
        System.out.println("I viewStartView() ************************    ");
        return "/WEB-INF/jsp/index.jsp";
    }

    @RequestMapping("tall")
    public String leggSammenTall(HTTPServletRequest request, Model model){
        System.out.println("I leggSammenTall() ************************    ");
        int tall1 = Integer.parseInt(request.getParamteter("tall1"));
        int tall2 = Integer.parseInt(request.getParameter("tall2"));

        int sum = tall1 + tall2;

        model.addAttribute("sum", sum);

        return "tallvisning";
    }
}
