package nl.citygis.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

/**
 * Created by nav on 04-01-16.
 */
@Controller
public class DebugController {

    final RestTemplate restTemplate = new RestTemplate();
    String apiRoot = "http://149.210.236.249:8000/?format=json";

    @RequestMapping("/")
    public String debug(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        String root = restTemplate.getForObject(apiRoot, String.class);
        return root.toString();
    }

}

