package chatProject.member.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import chatProject.member.service.MemberService;
import chatProject.member.vo.MemberVo;

@Controller
public class MemberController {
	
	String dirInfo = "member/";
	MemberService memberService;
	
	
	@RequestMapping("member/regist.do")
	public String regist() {
		return dirInfo + "regist";
	}
	
	@RequestMapping("member/regist_job.do")
	private String insertMemInfo() {
		return dirInfo + "regist";
	}
	
	@RequestMapping("member/view.do")
	public String viewMemberList(Model model) throws Exception {
		
		List<MemberVo> list = new ArrayList<MemberVo>();
		
		list = memberService.getMemberInfo();
		
		model.addAttribute("list", list);
		
		return dirInfo + "view";
	}

}
