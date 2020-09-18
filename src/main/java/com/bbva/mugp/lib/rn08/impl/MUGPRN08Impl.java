package com.bbva.mugp.lib.rn08.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bbva.mugp.dto.aprovisionamiento.HistoPfbDTO;
import com.bbva.mugp.lib.rn08.utils.Mappers;

public class MUGPRN08Impl extends MUGPRN08Abstract {

	private static final String PCPORCENCOMI = "PC_PORCENCOMI";

	private final Mappers mappers = new Mappers();

	public String executeFolioExist(String histoPF) {
		String strFolExist = this.jdbcUtils.queryForString("mugp.realEstateBroker.validFolio", histoPF);
		return strFolExist;
	}

	public void executeInsertHistoPfb(HistoPfbDTO histoPf) {
		Map<String, Object> mapaHistoPF = mappers.mapeaObjectHistoPFB(histoPf);
		this.jdbcUtils.update("mugp.realEstateBroker.insertHistoPfb", mapaHistoPF);
	}

	public void executeUpdateHistoPfb(HistoPfbDTO histoPf) {
		String strValSubStage = "41";
		String statusFirt = "1";

		Map<String, Object> mapaHistoPF = mappers.mapeaObjectHistoPFB(histoPf);
		mapaHistoPF.put("valSubEtapa", strValSubStage);
		mapaHistoPF.put("v1", statusFirt);

		this.jdbcUtils.update("mugp.realEstateBroker.updateHistoPfb", mapaHistoPF);

	}

	public int executeCountHistoPfb(String tipComp) {
		int intHistoPf = this.jdbcUtils.queryForInt("mugp.realEstateBroker.countHistoPFB", tipComp);
		return intHistoPf;

	}

	public List<Map<String, Object>> executeGetScheme(String strCompany) {

		List<Map<String, Object>> Scheme = new ArrayList<>();
		Map<String, Object> getScheme = new HashMap<String, Object>();
		getScheme.put("idCompany", strCompany);
		Scheme = this.jdbcUtils.queryForList("mugp.realEstateBroker.selectEsquema", getScheme);
		return Scheme;

	}

	public double executeComisOnlyOne(Map<String, Object> infoCompany) {
		String comis = null;
		Double douResp = 0.0;

		comis = this.jdbcUtils.queryForString("mugp.realEstateBroker.selectGetPORCENCOMI", infoCompany);

		douResp = Double.valueOf(comis);
		return douResp;
	}

	public double executeComis(Map<String, Object> infoCompany) {
		BigDecimal bigB = BigDecimal.ZERO;
		Double intA = 0.0;

		List<Map<String, Object>> exitComis = new ArrayList<>();
		Map<String, Object> reponse = new HashMap<>();
		reponse.put(PCPORCENCOMI, BigDecimal.ZERO);

		exitComis = this.jdbcUtils.queryForList("mugp.realEstateBroker.selectGetPORCENCOMIMORE", infoCompany);

		if (exitComis.isEmpty())

		{

			bigB = (BigDecimal) reponse.get(PCPORCENCOMI);

			intA = bigB.doubleValue();

			return intA;
		}

	}

	public String executeEjecExist(String codeEjec) {
		String strCodExist = null;
		try {
			strCodExist = this.jdbcUtils.queryForString("mugp.codeEje", codeEjec);
		} catch (TimeoutException e) {
			this.addAdvice(conMugp00979040(), conSelect(), "TUGP037_HISTOPFB1");
		}
		return strCodExist;
	}

	private String conSelect() {
		return "onlyCollective";
	}

	private String conMugp00979040() {
		return "MUGP00979040";
	}

}
