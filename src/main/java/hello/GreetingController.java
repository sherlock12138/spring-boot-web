package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/boot")
public class GreetingController {

	@RequestMapping("/fluid")
	public String greeting(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name,
			Model model) {
		model.addAttribute("name", name);
		System.out.println("kk");
		System.out.println("fffff");
		return "fluid";
	}
	
	
	@RequestMapping("/greeting")
	public String greet(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name,
			Model model) {
		model.addAttribute("name", name);
		System.out.println("kk");
		System.out.println("fffff");
		return "greeting";
	}

}
