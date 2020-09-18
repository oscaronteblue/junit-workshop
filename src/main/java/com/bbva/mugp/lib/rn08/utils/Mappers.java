package com.bbva.mugp.lib.rn08.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import com.bbva.mugp.dto.aprovisionamiento.HistoPfbDTO;



public class Mappers {


	private static final Logger LOGGER = Logger.getLogger(Mappers.class.getName());
		

	public Map<String, Object> mapeaObjectHistoPFB(HistoPfbDTO objHisto) {
		final Map<String, Object> mapObjHisto = new HashMap<>();
		mapObjHisto.put("histoPfb", (objHisto.getHistoPBF()));
		mapObjHisto.put("codEjec", (objHisto.getCodeEjec()));
		mapObjHisto.put("numCliente", (objHisto.getNumCliente()));
		mapObjHisto.put("fecSancion", (objHisto.getFecSancion()));
		mapObjHisto.put("fecAlta", (objHisto.getFecAlta()));
		mapObjHisto.put("fecFirma", (objHisto.getFecFirma()));
		mapObjHisto.put("fecModiFol", (objHisto.getFecModifol()));
		mapObjHisto.put("montoFolio", (objHisto.getMontoFolio()));
		mapObjHisto.put("estatus", (objHisto.getEstatus()));
		mapObjHisto.put("subEtapa", (objHisto.getSubetapa()));
		mapObjHisto.put("porcenComi", (objHisto.getPorcencomi()));
		mapObjHisto.put("comiFolio", (objHisto.getComiFolio()));
		mapObjHisto.put("ctEsquema", (objHisto.getCtEsquema()));
		mapObjHisto.put("entiofiPre",(objHisto.getEntiofiPre()));
		mapObjHisto.put("mesa", (objHisto.getCdMesa()));

		LOGGER.info("maprer implementacion:_");
		return mapObjHisto;
	}

}
