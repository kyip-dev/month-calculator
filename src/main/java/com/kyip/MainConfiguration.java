package com.kyip;

import io.dropwizard.Configuration;
import io.dropwizard.client.HttpClientConfiguration;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MainConfiguration extends Configuration {
	@NotNull
	@JsonProperty("applicationName")
	@Getter
	@Setter
	private String applicationName;

	@Valid
	@NotNull
	@JsonProperty("httpClient")
	@Getter
	@Setter
	private final HttpClientConfiguration httpClient = new HttpClientConfiguration();
}
