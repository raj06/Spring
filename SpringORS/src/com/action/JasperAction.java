package com.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.service.MarksheetServiceInt;
import com.service.MarksheetServiceSJImpl;

public class JasperAction extends ActionSupport {
	private MarksheetServiceInt marksheetServiceInt;
	private List myList;

	private String format = "PDF";

	private String contentType = "application/pdf";

	private String fileName = "document.pdf";

	private String jasperfileName = "jaspe.jasper";

	public String getJasperfileName() {
		return jasperfileName;
	}

	public String getFormat() {
		return format;
	}

	public String execute() throws Exception {
		// myList = marksheetServiceInt.ListMarksheet();
		return SUCCESS;
	}

	public List getMyList() {
		return myList;
	}

	public void setMyList(List myList) {
		this.myList = myList;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public void setJasperfileName(String jasperfileName) {
		this.jasperfileName = jasperfileName;
	}

	public void setMarksheetServiceInt(MarksheetServiceInt marksheetServiceInt) {
		this.marksheetServiceInt = marksheetServiceInt;
	}
}