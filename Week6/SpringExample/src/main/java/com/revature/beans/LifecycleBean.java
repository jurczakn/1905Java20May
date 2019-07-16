package com.revature.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class LifecycleBean implements BeanNameAware, BeanFactoryAware, 
ApplicationContextAware, BeanPostProcessor, InitializingBean, DisposableBean{

	private String beanName;
	
	@Value("42")
	private String secret;
	
	public LifecycleBean() {
		System.out.println("Instantiate: LifecycleBean");
	}
	
	public void setString(String secret) {
		this.secret = secret;
		System.out.println("Populating properties for secret: " + secret);
	}
	
	@Override
	public void setBeanName(String name) {
		this.beanName = name;
		System.out.println("Bean name being set to " + name);
	}
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("Bean Factory being set to: " + beanFactory);
		System.out.println("In bean " + beanName);
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("ApplicationContext being set to: " + applicationContext);
		System.out.println("In bean " + beanName);		
	}	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Inside Before Initialization in " + beanName);
		return bean;
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside After Properties set in " + this.beanName);
	}
	public void myCustomInit() {
		System.out.println("Inside my custom init method for " + this.beanName);
	}
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Inside After Initialization in " + beanName);
		return bean;
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy in " + this.beanName);
	}
	public void myCustomDestroy() {
		System.out.println("Inside my custom destroy in " + this.beanName);
	}
}
