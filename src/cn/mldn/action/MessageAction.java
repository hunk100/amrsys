package cn.mldn.action;

import java.text.SimpleDateFormat;

import javax.annotation.Resource;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.mldn.service.IMessageService;
import cn.mldn.vo.Message;

@Controller
@RequestMapping("/pages/back/msg/*")
public class MessageAction {
	@Resource
	private IMessageService messageService;
	@RequestMapping("add") 
	public ModelAndView add(Message msg) {
		try {
			System.out.println(this.messageService.add(msg));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@RequestMapping("list")
	public ModelAndView list(String col, String kw, int cp, int ls) {
		try {
			System.out.println(this.messageService.list(col, kw, cp, ls));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@InitBinder
	public void initBindler(WebDataBinder binder) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(
				sdf, true));
	}
}
