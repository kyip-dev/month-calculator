package com.kyip.resources;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalResponse {
	private BigDecimal result;
	private BigDecimal resultMine;
	private BigDecimal resultPing;
	private BigDecimal resultPingYan;
	private BigDecimal resultPingYi;

	public BigDecimal getResult() {
		return result;
	}

	public void setResult(BigDecimal result) {
		this.result = result;
	}

	public BigDecimal getResultMine() {
		return resultMine;
	}

	public void setResultMine(BigDecimal resultMine) {
		this.resultMine = resultMine;
	}

	public BigDecimal getResultPing() {
		return resultPing;
	}

	public void setResultPing(BigDecimal resultPing) {
		this.resultPing = resultPing;
	}

	public BigDecimal getResultPingYan() {
		return resultPingYan;
	}

	public void setResultPingYan(BigDecimal resultPingYan) {
		this.resultPingYan = resultPingYan;
	}

	public BigDecimal getResultPingYi() {
		return resultPingYi;
	}

	public void setResultPingYi(BigDecimal resultPingYi) {
		this.resultPingYi = resultPingYi;
	}

}
