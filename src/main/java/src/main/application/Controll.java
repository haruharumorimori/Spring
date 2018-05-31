package src.main.application;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Controll {
	@RequestMapping(value="/SampleForm" ,method=RequestMethod.POST)
	public String aaa2(Model model,@ModelAttribute("SampleForm") SampleForm sampleform,HttpServletRequest request,HttpServletResponse response) {
		response.setCharacterEncoding("UTF-8");


		model.addAttribute("name",sampleform.getName());
		return "NewFile";
	}
	@RequestMapping(value="/hontouniatta",method=RequestMethod.GET)
	public String horror(Model model) {
		model.addAttribute("horror", "本当にあったねえ");
		return "kowaihanashi";
	}
	@RequestMapping(value="/CalcForm",method=RequestMethod.POST)
	public String keisan(Model model,@ModelAttribute("CalcForm") CalcForm calcform) {
		model.addAttribute("BMI",Math.round(calcform.getBMI()));
		return "result";
	}
}
