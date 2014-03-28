package com.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public abstract class BaseListAction extends BaseAction {
	protected List dtolist;
	protected Long[] ids;
	protected int pageno=1;
	protected int maxsize=5;
	public List getDtolist() {
		return dtolist;
	}
	public void setDtolist(List dtolist) {
		this.dtolist = dtolist;
	}
	public Long[] getIds() {
		return ids;
	}
	public void setIds(Long[] ids) {
		this.ids = ids;
	}
	public int getPageno() {
		return pageno;
	}
	public void setPageno(int pageno) {
		this.pageno = pageno;
	}
	public int getMaxsize() {
		return maxsize;
	}
	public void setMaxsize(int maxsize) {
		this.maxsize = maxsize;
	}
	

}
