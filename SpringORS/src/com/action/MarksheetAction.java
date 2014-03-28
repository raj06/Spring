package com.action;

import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MarksheetDaoInt;
import com.dto.MarksheetDTO;
import com.service.MarksheetServiceInt;

public class MarksheetAction extends BaseAction {
	private int rollno;
	private String name;
	private int physics;
	private int chemistry;
	private int maths;
	private MarksheetServiceInt marksheetServiceInt;

	public void setMarksheetServiceInt(MarksheetServiceInt marksheetServiceInt) {
		this.marksheetServiceInt = marksheetServiceInt;

	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	MarksheetDTO marksheetDTO = new MarksheetDTO();

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(rollno);
		if ("Add".equalsIgnoreCase(operation)) {
			marksheetDTO.setRollno(rollno);
			marksheetDTO.setName(name);
			marksheetDTO.setPhysics(physics);
			marksheetDTO.setChemistry(chemistry);
			marksheetDTO.setMaths(maths);
			marksheetServiceInt.addMarksheet(marksheetDTO);
			return "add";
		}
		if ("Update".equalsIgnoreCase(operation)) {
			marksheetDTO.setRollno(rollno);
			list = marksheetServiceInt.ListMarksheet();
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				marksheetDTO = (MarksheetDTO) iterator.next();
				int a = marksheetDTO.getRollno();
				if (a == rollno) {
					Long id = marksheetDTO.getId();
				}
			}
			// marksheetDTO.setId(id);
			marksheetDTO.setName(name);
			marksheetDTO.setPhysics(physics);
			marksheetDTO.setChemistry(chemistry);
			marksheetDTO.setMaths(maths);
			marksheetServiceInt.updateMarksheet(marksheetDTO);
			return "update";
		}
		if ("get".equalsIgnoreCase(operation)) {
			list = marksheetServiceInt.ListMarksheet();
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				marksheetDTO = (MarksheetDTO) iterator.next();
				int a = marksheetDTO.getRollno();
				if (rollno == a) {
					id = marksheetDTO.getId();
					marksheetDTO.setId(id);
					break;
				}
			}
			marksheetDTO = marksheetServiceInt.getMarksheet(marksheetDTO);
			rollno = marksheetDTO.getRollno();
			name = marksheetDTO.getName();
			physics = marksheetDTO.getPhysics();
			chemistry = marksheetDTO.getChemistry();
			maths = marksheetDTO.getMaths();
			return "get";
		}
		return SUCCESS;
	}

	@Override
	public String input() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
