package com.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.MarksheetDTO;
import com.service.MarksheetServiceInt;

public class MarksheetListAction extends BaseListAction {
	private String name;

	private MarksheetServiceInt marksheetServiceInt;
	MarksheetDTO marksheetDTO = new MarksheetDTO();

	@Override
	public String execute() throws Exception {
		if ("List".equalsIgnoreCase(operation)) {
			list = marksheetServiceInt.searchByPage(pageno, maxsize);
			return "list";

		}
		if ("delete".equalsIgnoreCase(operation)) {

			for (int i = 0; i < ids.length; i++) {
				long id = ids[i];
				System.out.println(id);
				marksheetDTO.setId(id);
				marksheetServiceInt.deleteMarksheet(marksheetDTO);
			}
			list = marksheetServiceInt.searchByPage(pageno, maxsize);
			return "delete";

		}
		if ("search".equalsIgnoreCase(operation)) {
			try {
				int rollno = Integer.parseInt(name);
				marksheetDTO.setRollno(rollno);
				list = marksheetServiceInt
						.searchMarksheetByRollno(marksheetDTO);
				return "search";

			} catch (Exception e) {
				marksheetDTO.setName(name);
				list = marksheetServiceInt.searchMarksheetByName(marksheetDTO);
				return "search";
			}
		}
		if ("next".equalsIgnoreCase(operation)) {
			List total=marksheetServiceInt.ListMarksheet();
			int a=total.size()/maxsize;
			float b=(float)total.size()/maxsize;
			System.out.println(a);
			System.out.println(b);
			if(b>a)
			{
				a=a+1;
				System.out.println(a);
			}
			pageno = pageno + 1;
			System.out.println(pageno);
			if(pageno>a)
			{
				pageno=pageno-1;
				System.out.println(pageno);
			}
			list = marksheetServiceInt.searchByPage(pageno, maxsize);
			return "list";
		}
		if ("previous".equalsIgnoreCase(operation)) {
			pageno = pageno - 1;
			if (pageno == 0) {
				pageno = pageno + 1;
			}
			list = marksheetServiceInt.searchByPage(pageno, maxsize);
			return "list";
		}
		return SUCCESS;

	}

	@Override
	public String input() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
@Override
public void prepare() throws Exception {
	// TODO Auto-generated method stub
	list=marksheetServiceInt.searchByPage(pageno, maxsize);
	super.prepare();
}
	
	public void setMarksheetServiceInt(MarksheetServiceInt marksheetServiceInt) {
		this.marksheetServiceInt = marksheetServiceInt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
