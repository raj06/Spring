package com.service;

import java.util.List;

import com.dao.MarksheetDaoInt;
import com.dto.MarksheetDTO;

public class MarksheetServiceSJImpl  implements MarksheetServiceInt{
MarksheetDaoInt marksheetDaoInt;

	
	public void setMarksheetDaoInt(MarksheetDaoInt marksheetDaoInt) {
	this.marksheetDaoInt = marksheetDaoInt;
}


	public void addMarksheet(MarksheetDTO marksheetDTO) {
		// TODO Auto-generated method stub
		marksheetDaoInt.addMarksheet(marksheetDTO);
	}


	public void updateMarksheet(MarksheetDTO marksheetDTO) {
		// TODO Auto-generated method stub
		marksheetDaoInt.updateMarksheet(marksheetDTO);
		
	}


	public List ListMarksheet() {
		return marksheetDaoInt.ListMarksheet();
	}


	public void deleteMarksheet(MarksheetDTO marksheetDTO) {
		// TODO Auto-generated method stub
		marksheetDaoInt.deleteMarksheet(marksheetDTO);
	}


	public MarksheetDTO getMarksheet(MarksheetDTO marksheetDTO) {
		return marksheetDaoInt.getMarksheet(marksheetDTO);
	}


	public List searchMarksheetByName(MarksheetDTO marksheetDTO) {
		return marksheetDaoInt.searchMarksheetByName(marksheetDTO);
	}


	public List searchByPage(int pageno, int maxsize) {
		// TODO Auto-generated method stub
		return marksheetDaoInt.searchByPage(pageno, maxsize);
		
	}


	public List searchMarksheetByRollno(MarksheetDTO marksheetDTO) {
		return marksheetDaoInt.searchMarksheetByRollno(marksheetDTO);
	}

}
