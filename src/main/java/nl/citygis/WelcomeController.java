package nl.citygis;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by nav on 04-01-16.
 */
@Controller
public class WelcomeController {

    @RequestMapping("/")
    @ResponseBody String welcome(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "Welkom bij de CoreComponent Server Citygis [Group-4]";
    }

}

