package com.gofortrainings.newsportal.core.models;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
	public class Composite {
	    @ChildResource
	   public List<ClassMate> multi ;
	    
		@OSGiService
		TigerService tigerservice;
		
		private String monitor;
		
		

		public String getMonitor() {
			return monitor;
		}

		public List<ClassMate> getMulti() {
			return multi;
		}

		@ValueMapValue
		private String text;
		
		@ValueMapValue
		private String textname;

		public String getText() {
			return text;
		}

		public String getTextname() {
			return textname;
		}
		@PostConstruct
	public void mentor() {
		monitor=tigerservice.foo();
			
		}
}
	
