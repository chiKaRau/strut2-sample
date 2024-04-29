package com.example;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class TimerInterceptor implements Interceptor {
	public void init() {
		// Perform initialization
	}

	public String intercept(ActionInvocation invocation) throws Exception {
		long startTime = System.currentTimeMillis();

		String result = invocation.invoke(); // Execute the action

		long endTime = System.currentTimeMillis();
		System.out.println("Execution time for " + invocation.getAction().getClass().getName() + ": "
				+ (endTime - startTime) + " ms.");

		return result;
	}

	public void destroy() {
		// Cleanup resources if any
	}
}