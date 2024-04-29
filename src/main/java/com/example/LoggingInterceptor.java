package com.example;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class LoggingInterceptor implements Interceptor {
    public void init() {
        // Perform here the initialization of your interceptor
    }

    public String intercept(ActionInvocation invocation) throws Exception {
        // Before calling the action
        System.out.println("Entering action: " + invocation.getAction().getClass().getName());

        String result = invocation.invoke(); // Execute the action

        // After calling the action
        System.out.println("After action execution: " + result);

        return result;
    }

    public void destroy() {
        // Cleanup resources if any
    }
}