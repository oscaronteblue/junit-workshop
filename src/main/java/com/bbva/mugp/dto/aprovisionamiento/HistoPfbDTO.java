package com.bbva.mugp.dto.aprovisionamiento;

import java.sql.Timestamp;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.bbva.apx.dto.AbstractDTO;

/**
 * Clase PFB de un DTO fuera del modelo canonico
 * 
 * @author everis
 *
 */
public class HistoPfbDTO extends AbstractDTO {
	private static final long serialVersionUID = 2931699728946643245L;

	
	private String entiofiPre;
	private String histoPBF;
	private String codeEjec;
	private String numCliente;
	private Timestamp fecSancion;
	private Timestamp fecAlta;
	private Timestamp fecFirma;
	private Timestamp fecModifol;
	private Double montoFolio;
	private String estatus;
	private String subetapa;
	private Double porcencomi;
	private Double comiFolio;
	private String ctEsquema;
	private String cdMesa;

	public String getEntiofiPre() {
		return entiofiPre;
	}

	public void setEntiofiPre(String entiofiPre) {
		this.entiofiPre = entiofiPre;
	}

	public String getHistoPBF() {
		return histoPBF;
	}

	public void setHistoPBF(String histoPBF) {
		this.histoPBF = histoPBF;
	}

	public String getCodeEjec() {
		return codeEjec;
	}

	public void setCodeEjec(String codeEjec) {
		this.codeEjec = codeEjec;
	}

	public String getNumCliente() {
		return numCliente;
	}

	public void setNumCliente(String numCliente) {
		this.numCliente = numCliente;
	}

	public Timestamp getFecSancion() {
		return fecSancion;
	}

	public void setFecSancion(Timestamp fecSancion) {
		this.fecSancion = fecSancion;
	}

	public Timestamp getFecAlta() {
		return fecAlta;
	}

	public void setFecAlta(Timestamp fecAlta) {
		this.fecAlta = fecAlta;
	}

	public Timestamp getFecFirma() {
		return fecFirma;
	}

	public void setFecFirma(Timestamp fecFirma) {
		this.fecFirma = fecFirma;
	}

	public Timestamp getFecModifol() {
		return fecModifol;
	}

	public void setFecModifol(Timestamp fecModifol) {
		this.fecModifol = fecModifol;
	}

	public Double getMontoFolio() {
		return montoFolio;
	}

	public void setMontoFolio(Double montoFolio) {
		this.montoFolio = montoFolio;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public String getSubetapa() {
		return subetapa;
	}

	public void setSubetapa(String subetapa) {
		this.subetapa = subetapa;
	}

	public Double getPorcencomi() {
		return porcencomi;
	}

	public void setPorcencomi(Double porcencomi) {
		this.porcencomi = porcencomi;
	}

	public Double getComiFolio() {
		return comiFolio;
	}

	public void setComiFolio(Double comiFolio) {
		this.comiFolio = comiFolio;
	}

	public String getCtEsquema() {
		return ctEsquema;
	}

	public void setCtEsquema(String ctEsquema) {
		this.ctEsquema = ctEsquema;
	}

	public String getCdMesa() {
		return cdMesa;
	}

	public void setCdMesa(String cdMesa) {
		this.cdMesa = cdMesa;
	}
	
	
	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof HistoPfbDTO)) {
			return false;
		}
		HistoPfbDTO castOther = (HistoPfbDTO) other;
		return new EqualsBuilder().append(entiofiPre, castOther.entiofiPre).append(histoPBF, castOther.histoPBF)
				.append(codeEjec, castOther.codeEjec).append(numCliente, castOther.numCliente)
				.append(fecSancion, castOther.fecSancion).append(fecAlta, castOther.fecAlta)
				.append(fecFirma, castOther.fecFirma).append(fecModifol, castOther.fecModifol)
				.append(montoFolio, castOther.montoFolio).append(estatus, castOther.estatus)
				.append(subetapa, castOther.subetapa).append(porcencomi, castOther.porcencomi)
				.append(comiFolio, castOther.comiFolio).append(ctEsquema, castOther.ctEsquema)
				.append(cdMesa, castOther.cdMesa).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(entiofiPre).append(histoPBF).append(codeEjec).append(numCliente)
				.append(fecSancion).append(fecAlta).append(fecFirma).append(fecModifol).append(montoFolio)
				.append(estatus).append(subetapa).append(porcencomi).append(comiFolio).append(ctEsquema).append(cdMesa)
				.toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("entiofiPre", entiofiPre).append("histoPBF", histoPBF)
				.append("codeEjec", codeEjec).append("numCliente", numCliente).append("fecSancion", fecSancion)
				.append("fecAlta", fecAlta).append("fecFirma", fecFirma).append("fecModifol", fecModifol)
				.append("montoFolio", montoFolio).append("estatus", estatus).append("subetapa", subetapa)
				.append("porcencomi", porcencomi).append("comiFolio", comiFolio).append("ctEsquema", ctEsquema)
				.append("cdMesa", cdMesa).toString();
	}
	
}
