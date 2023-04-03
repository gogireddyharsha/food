package com.gofortrainings.newsportal.core.models;



import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;


@Model(adaptables = Resource.class , defaultInjectionStrategy = DefaultInjectionStrategy.REQUIRED)



public class Slingpractice {
	@ChildResource
	public List<Multipractice> multifield;
	




	public List<Multipractice> getMultifield() {
		return multifield;
	}



	

@Optional
	@ValueMapValue
	private String name;
	
	@Optional
	@ValueMapValue
	private String surname;



	public String getName() {
		return name;
	}



	public String getSurname() {
		return surname;
	}
	

}
