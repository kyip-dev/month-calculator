package com.kyip.resources;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalRequest implements Serializable {
	private String myAmountJson;
	private String pingAmountJson;
	private String pingAndYanAmountJson;
	private String pingAndYiAmountJson;

	public String getMyAmountJson() {
		return myAmountJson;
	}

	public void setMyAmountJson(String myAmountJson) {
		this.myAmountJson = myAmountJson;
	}

	public String getPingAmountJson() {
		return pingAmountJson;
	}

	public void setPingAmountJson(String pingAmountJson) {
		this.pingAmountJson = pingAmountJson;
	}

	public String getPingAndYanAmountJson() {
		return pingAndYanAmountJson;
	}

	public void setPingAndYanAmountJson(String pingAndYanAmountJson) {
		this.pingAndYanAmountJson = pingAndYanAmountJson;
	}

	public String getPingAndYiAmountJson() {
		return pingAndYiAmountJson;
	}

	public void setPingAndYiAmountJson(String pingAndYiAmountJson) {
		this.pingAndYiAmountJson = pingAndYiAmountJson;
	}

}
