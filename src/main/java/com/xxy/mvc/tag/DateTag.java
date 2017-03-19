package com.xxy.mvc.tag;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class DateTag  extends SimpleTagSupport {
	@Override
	/**
	 * @author xxy
	 * <br>
	 * 自定义输出当前时间JSP标签
	 */
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = sim.format(new Date());
		getJspContext().getOut().write(str);
		super.doTag();
	}
}
