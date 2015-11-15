package personinput;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PersonController {

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String personForm(Model model) {
        model.addAttribute("person", new Person());
        return "form";
    }

    @RequestMapping(value="/", method=RequestMethod.POST)
    public String personSubmit(Model model, @Valid @ModelAttribute Person person, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "form";
        }
        model.addAttribute("person", person);
        return "result";
    }

}