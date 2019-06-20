package com.smr.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class TestAop {
    // 此方法将用作前置通知
    public void BeforeAdvice(JoinPoint joinpoint) {
        String classAndMethod = joinpoint.getTarget().getClass().getName()
                + "类的" + joinpoint.getSignature().getName();

        System.out.println("\n前置通知:" + classAndMethod + "方法开始执行！");
        Object[] args = joinpoint.getArgs();
        if (args.length > 0)
            System.out.print("参数值：");
        for (int i = 0; i < args.length; i++) {
            Object object = args[i];
            System.out.println(object.toString());

        }
    }

    // 此方法将用作后置通知
    public void AfterReturningAdvice(JoinPoint joinpoint) {
        String classAndMethod = joinpoint.getTarget().getClass().getName()
                + "类的" + joinpoint.getSignature().getName();
        System.out.println("后置通知:" + classAndMethod + "方法执行正常结束！");
    }

    // 此方法将用作异常通知
    public void AfterThrowingAdvice(JoinPoint joinpoint, Exception e) {
        String classAndMethod = joinpoint.getTarget().getClass().getName()
                + "类的" + joinpoint.getSignature().getName();
        System.out.println("异常通知:" + classAndMethod + "方法抛出异常："
                + e.getMessage());
    }

    // 此方法将用作最终通知
    public void AfterAdvice(JoinPoint joinpoint) {
        String classAndMethod = joinpoint.getTarget().getClass().getName()
                + "类的" + joinpoint.getSignature().getName();
        System.out.println("最终通知:" + classAndMethod + "方法执行结束！");
    }

    // 此方法将用作环绕通知
    public Object AroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
        long begintime = System.currentTimeMillis();// 记下开始时间
        // 传递给连接点对象进行接力处理
        Object result = pjp.proceed();
        long endtime = System.currentTimeMillis();// 记下结束时间
        String classAndMethod = pjp.getTarget().getClass().getName() + "类的"
                + pjp.getSignature().getName();
        System.out.println("环绕通知:" + classAndMethod + "方法执行结束,耗时"
                + (endtime - begintime) + "毫秒！");
        return result;
    }
}
