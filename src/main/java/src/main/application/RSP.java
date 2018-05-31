package src.main.application;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RSP {
	@RequestMapping(value="/RSPForm")
	public String rsp(Model model,@ModelAttribute("RSPForm")RSPForm rspform) {
		model.addAttribute("result", rspform.result());
		return"result2";
	}
}
