package com.kyip.resources;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.json.JSONArray;

import com.kyip.views.CalculatorHomeView;

@Path("/calculator")
public class CalculatorResource {
	private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(CalculatorResource.class);

	public CalculatorResource() {
		logger.trace("CalculatorResource initialized");
	}

	@GET
	@Path("/")
	@Produces(MediaType.TEXT_HTML)
	public CalculatorHomeView index() {
		return new CalculatorHomeView();
	}

	@POST
	@Path("/add")
	@Produces(MediaType.APPLICATION_JSON)
	public AddResponse add(AddRequest request) {
		int value1 = Integer.parseInt(request.getValue1());
		int value2 = Integer.parseInt(request.getValue2());
		int result = value1 + value2;
		AddResponse response = new AddResponse();
		response.setResult(result);
		return response;
	}

	@POST
	@Path("/cal")
	@Produces(MediaType.APPLICATION_JSON)
	public CalResponse cal(CalRequest request) {
		logger.info("=============, {}", request.toString());
		BigDecimal totalMine = getTotalOfType(request.getMyAmountJson());
		BigDecimal totalPing = getTotalOfType(request.getPingAmountJson()).divide(new BigDecimal(2));
		BigDecimal totalPingYan = getTotalOfType(request.getPingAndYanAmountJson()).divide(new BigDecimal(4));
		BigDecimal totalPingYi = getTotalOfType(request.getPingAndYiAmountJson()).multiply(new BigDecimal(0.75));

		BigDecimal total = totalMine.add(totalPing).add(totalPingYan).add(totalPingYi);

		CalResponse response = new CalResponse();
		response.setResultMine(totalMine);
		response.setResultPing(totalPing);
		response.setResultPingYan(totalPingYan);
		response.setResultPingYi(totalPingYi);
		response.setResult(total);
		return response;
	}

	private BigDecimal getTotalOfType(String json) {
		if (StringUtils.isEmpty(json)) {
			return new BigDecimal(0);
		}
		List<String> amountListMine = jsonArrayToStringArray(new JSONArray(json));
		return sumOfArray(amountListMine);
	}

	private List<String> jsonArrayToStringArray(JSONArray jsonArray) {
		List<String> stringList = new ArrayList<String>();
		for (int i = 0; i < jsonArray.length(); i++) {
			stringList.add(jsonArray.getString(i));
		}
		return stringList;
	}

	private BigDecimal sumOfArray(List<String> amountList) {
		BigDecimal total = new BigDecimal(0);
		for (String amountStr : amountList) {
			BigDecimal amount = StringUtils.isEmpty(amountStr) || !NumberUtils.isNumber(amountStr) ? new BigDecimal(0) : new BigDecimal(amountStr);
			total = total.add(amount);
		}
		return total;
	}
}
