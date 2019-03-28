package com.test.HomeServiesImpl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.test.HomeServies.HomeServices;

@Service
@PropertySource(value="classpath:TestingBootDetails.properties")
public class HomeServicesImpl implements HomeServices {
	@Autowired
	Environment env;

	@Override
	public List<String> getCities() {
		// TODO Auto-generated method stub\
		String cities = env.getProperty("Cities");
		String[] splits = cities.split(",");
		return Arrays.stream(splits).collect(Collectors.toList());
	}

}
