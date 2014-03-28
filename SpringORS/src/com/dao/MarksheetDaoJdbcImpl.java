package com.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.support.rowset.ResultSetWrappingSqlRowSet;

import com.dto.MarksheetDTO;

public class MarksheetDaoJdbcImpl extends JdbcDaoSupport implements
		MarksheetDaoInt {

	public void addMarksheet(MarksheetDTO marksheetDTO) {
		// TODO Auto-generated method stub
		getJdbcTemplate().update(
				"insert into marksheet value(" + marksheetDTO.getId() + ","
						+ marksheetDTO.getRollno() + ",'"
						+ marksheetDTO.getName() + "',"
						+ marksheetDTO.getPhysics() + ","
						+ marksheetDTO.getChemistry() + ","
						+ marksheetDTO.getMaths() + ")");

	}

	public void updateMarksheet(MarksheetDTO marksheetDTO) {
		// TODO Auto-generated method stub
		getJdbcTemplate().update(
				"update marksheet set rollno=" + marksheetDTO.getRollno()
						+ ",name='" + marksheetDTO.getName() + "',physics="
						+ marksheetDTO.getPhysics() + ",chemistry="
						+ marksheetDTO.getChemistry() + ",maths="
						+ marksheetDTO.getMaths() + " where id="
						+ marksheetDTO.getId());
	}

	public void deleteMarksheet(MarksheetDTO marksheetDTO) {
		// TODO Auto-generated method stub
		getJdbcTemplate().update(
				"delete from marksheet where id=" + marksheetDTO.getId());
	}

	public MarksheetDTO getMarksheet(MarksheetDTO marksheetDTO) {

		// TODO Auto-generated method stub
		ResultSetWrappingSqlRowSet rowSet;
		rowSet = (ResultSetWrappingSqlRowSet) getJdbcTemplate().queryForRowSet(
				"select * from marksheet where id=" + marksheetDTO.getId());
		MarksheetDTO marksheetDTO2 = new MarksheetDTO();
		while (rowSet.next()) {

			marksheetDTO2.setId(rowSet.getLong(1));
			marksheetDTO2.setRollno(rowSet.getInt(2));
			marksheetDTO2.setName(rowSet.getString(3));
			marksheetDTO2.setPhysics(rowSet.getInt(4));
			marksheetDTO2.setChemistry(rowSet.getInt(5));
			marksheetDTO2.setMaths(rowSet.getInt(6));
		}
		return marksheetDTO2;

	}

	public List searchMarksheetByName(MarksheetDTO marksheetDTO) {
		List l1=new ArrayList();
		List<Map> list1 = getJdbcTemplate().queryForList("select * from marksheet where name like '"+marksheetDTO.getName()+"%'");
		for (Map row : list1) {
			MarksheetDTO marksheetDTO2 = new MarksheetDTO();
			marksheetDTO2.setId((Long) row.get("id"));
			marksheetDTO2.setRollno((Integer) row.get("rollno"));
			marksheetDTO2.setName((String) row.get("name"));
			marksheetDTO2.setPhysics((Integer) row.get("physics"));
			marksheetDTO2.setChemistry((Integer) row.get("chemistry"));
			marksheetDTO2.setMaths((Integer) row.get("maths"));
			l1.add(marksheetDTO2);
		}
		return l1;
	}

	public List ListMarksheet() {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		List<Map> list1 = getJdbcTemplate().queryForList(
				"select * from marksheet");
		for (Map row : list1) {
			MarksheetDTO marksheetDTO2 = new MarksheetDTO();
			marksheetDTO2.setId((Long) row.get("id"));
			marksheetDTO2.setRollno((Integer) row.get("rollno"));
			marksheetDTO2.setName((String) row.get("name"));
			marksheetDTO2.setPhysics((Integer) row.get("physics"));
			marksheetDTO2.setChemistry((Integer) row.get("chemistry"));
			marksheetDTO2.setMaths((Integer) row.get("maths"));
			list.add(marksheetDTO2);
		}
		return list;

	}

	public List searchByPage(int pageno, int maxsize) {
		List l1=new ArrayList();
		List<Map> list1 = getJdbcTemplate().queryForList("select * from marksheet limit "+maxsize*(pageno-1)+","+maxsize);
		for (Map row : list1) {
			MarksheetDTO marksheetDTO2 = new MarksheetDTO();
			marksheetDTO2.setId((Long) row.get("id"));
			marksheetDTO2.setRollno((Integer) row.get("rollno"));
			marksheetDTO2.setName((String) row.get("name"));
			marksheetDTO2.setPhysics((Integer) row.get("physics"));
			marksheetDTO2.setChemistry((Integer) row.get("chemistry"));
			marksheetDTO2.setMaths((Integer) row.get("maths"));
			l1.add(marksheetDTO2);
		}
		return l1;

	}

	public List searchMarksheetByRollno(MarksheetDTO marksheetDTO) {
		List l1=new ArrayList();
		List<Map> list1 = getJdbcTemplate().queryForList("select * from marksheet where rollno like "+marksheetDTO.getRollno());
		for (Map row : list1) {
			MarksheetDTO marksheetDTO2 = new MarksheetDTO();
			marksheetDTO2.setId((Long) row.get("id"));
			marksheetDTO2.setRollno((Integer) row.get("rollno"));
			marksheetDTO2.setName((String) row.get("name"));
			marksheetDTO2.setPhysics((Integer) row.get("physics"));
			marksheetDTO2.setChemistry((Integer) row.get("chemistry"));
			marksheetDTO2.setMaths((Integer) row.get("maths"));
			l1.add(marksheetDTO2);
		}
		return l1;
		

	}

}
