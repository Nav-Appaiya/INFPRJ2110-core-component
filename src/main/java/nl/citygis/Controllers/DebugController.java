package nl.citygis.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

/**
 * Created by nav on 04-01-16.
 *
 * mysql service db jdbc @cloudfoundry info:
 * hostname: us-cdbr-iron-east-03.cleardb.net
 * jdbcUrl: jdbc:mysql://us-cdbr-iron-east-03.cleardb.net/ad_e0c95e38ef3eabc?user=b6f9880502ce7d&password=15897ea1
 * name: ad_e0c95e38ef3eabc
 * password: 15897ea1
 * port: 3306
 * uri: mysql://b6f9880502ce7d:15897ea1@us-cdbr-iron-east-03.cleardb.net:3306/ad_e0c95e38ef3eabc?reconnect=true
 * username: b6f9880502ce7d
 */
@Controller
public class DebugController {

    final RestTemplate restTemplate = new RestTemplate();
    String apiRoot = "http://149.210.236.249:8000/?format=json";

    @RequestMapping("/")
    public String debug(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);

        String root = restTemplate.getForObject(apiRoot, String.class);
        return root;
    }

}

