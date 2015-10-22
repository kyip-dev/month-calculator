package com.kyip;

import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.client.HttpClientBuilder;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;
import lombok.extern.slf4j.Slf4j;

import org.apache.http.client.HttpClient;

import com.kyip.resources.CalculatorResource;

@Slf4j
public class MainApplication extends Application<MainConfiguration> {

	public static void main(String[] args) throws Exception {
		new MainApplication().run(args);
	}

	@Override
	public void initialize(Bootstrap<MainConfiguration> bootstrap) {
		bootstrap.addBundle(new ViewBundle());
		bootstrap.addBundle(new AssetsBundle("/assets"));
	}

	@Override
	public void run(MainConfiguration configuration, Environment environment) throws Exception {
		environment.jersey().register(new CalculatorResource());
	}

}
