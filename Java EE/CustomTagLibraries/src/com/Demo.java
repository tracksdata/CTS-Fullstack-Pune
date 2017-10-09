package com;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class Demo extends TagSupport {

	
	
	@Override
	public int doStartTag() {

		JspWriter out = pageContext.getOut();
		// JspWriter out=getJspContext().getOut();
		try {

			out.println("Message from different tld file");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return SKIP_BODY;

	}

}
