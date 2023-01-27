package dreamlab.dreamlab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LandingPage 
{
    @GetMapping("/homepage")
    String getHomePage()
    {
        return "index";
    }
    
}
