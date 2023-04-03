package com.gofortrainings.newsportal.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.REQUIRED)
public class Multipractice {
	@ValueMapValue
	private String state;
	
	@ValueMapValue
	private String district;
	
	@ValueMapValue
	private String mandal;
	
	@ValueMapValue
	private String gender;

	public String getState() {
		return state;
	}

	public String getDistrict() {
		return district;
	}

	public String getMandal() {
		return mandal;
	}

	public String getGender() {
		return gender;
	}
	

}
