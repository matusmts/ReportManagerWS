package br.com.vertechit.rm;

import java.util.HashMap;
import java.util.Map.Entry;

public class ReportManager {

	private String dataBase;
	private String reportName;
	private String reportDir;
	private String formato;
	private HashMap<String,Object> params;

	public String getDataBase() {
		return dataBase;
	}

	public void setDataBase(String dataBase) {
		this.dataBase = dataBase;
	}

	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public String getReportDir() {
		return reportDir;
	}

	public void setReportDir(String reportDir) {
		this.reportDir = reportDir;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public HashMap<String, Object> getParams() {
		return params;
	}

	public void setParams(HashMap<String, Object> params) {
		this.params = params;
	}

	@Override
	public String toString() {
		
		
		StringBuilder sb = new StringBuilder();
		sb.append("ReportManager [dataBase=");
		sb.append(dataBase);
		sb.append(", reportName=");
		sb.append(reportName);
		sb.append(", reportDir=");
		sb.append(reportDir);
		sb.append(", formato=");
		sb.append(formato);
		
		sb.append(", params=");
		sb.append("[");

		if (params != null && !params.isEmpty()) {
			for(Entry<String, Object> entry : params.entrySet()) {
			    String key = entry.getKey();
			    Object value = entry.getValue();
			    
			    sb.append(key).append("= ").append(value.toString());
	
			}
		}
		sb.append("]]");
		
		
		return sb.toString();
	}
}
