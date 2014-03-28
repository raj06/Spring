package com.service;

import java.util.List;

import com.dto.MarksheetDTO;

public interface MarksheetServiceInt {
	public void addMarksheet(MarksheetDTO marksheetDTO);
	public void updateMarksheet(MarksheetDTO marksheetDTO);
	public void deleteMarksheet(MarksheetDTO marksheetDTO);
	public MarksheetDTO getMarksheet(MarksheetDTO marksheetDTO);
	public List searchMarksheetByName(MarksheetDTO marksheetDTO);
	public List searchMarksheetByRollno(MarksheetDTO marksheetDTO);
	public List searchByPage(int pageno,int maxsize);
	public List ListMarksheet();

}
