package com.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class FrontCTL extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		ActionSupport actionSupport=(ActionSupport) invocation.getAction();
		Map session=invocation.getInvocationContext().getSession();
		if(session.get("userid")==null)
		{
		
			actionSupport.addActionError("Oops Your Session Has Been Expired");
			return "logout";
		}
		String val=invocation.invoke();
		System.out.println(val);
		return val;
	}

}
