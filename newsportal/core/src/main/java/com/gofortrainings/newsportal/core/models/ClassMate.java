package com.gofortrainings.newsportal.core.models;



import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables =Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL )
public class ClassMate {
	@ValueMapValue
	private String text1;
	
	@ValueMapValue
	private String text2;
	
	
	@ValueMapValue
	private String text3;
	
	@ValueMapValue
	private String gender;
	
	@ValueMapValue
	private String checkbox;
	
	public String getText1() {
		return text1;
	}
	public String getText2() {
		return text2;
	}
	public String getText3() {
		return text3;
	}
	public String getGender() {
		return gender;
	}
	public String getCheckbox() {
		return checkbox;
	}
	
	

}
