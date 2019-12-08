package chanaka.dkb.expenses.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    String message = "this is first message";

    @RequestMapping("/")
    public String showHomePage() {
        return "home";
    }

    @RequestMapping("/add-expense")
    public ModelAndView showMessage(
            @RequestParam(value = "name", required = false, defaultValue = "World") String name) {
        System.out.println("in controller");

        ModelAndView mv = new ModelAndView("add-expense");
        mv.addObject("message", message);
        mv.addObject("name", name);
        return mv;
    }
}
