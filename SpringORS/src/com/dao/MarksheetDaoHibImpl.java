package com.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dto.MarksheetDTO;

public class MarksheetDaoHibImpl extends HibernateDaoSupport implements
		MarksheetDaoInt {

	public void addMarksheet(MarksheetDTO marksheetDTO) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(marksheetDTO);

	}

	public void updateMarksheet(MarksheetDTO marksheetDTO) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(marksheetDTO);

	}

	public List ListMarksheet() {
		return getHibernateTemplate().findByCriteria(
				DetachedCriteria.forClass(MarksheetDTO.class));

	}

	public void deleteMarksheet(MarksheetDTO marksheetDTO) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(marksheetDTO);

	}

	public MarksheetDTO getMarksheet(MarksheetDTO marksheetDTO) {
		MarksheetDTO marksheetDTO2;
		marksheetDTO2 = (MarksheetDTO) getHibernateTemplate().get(
				MarksheetDTO.class, marksheetDTO.getId());
		return marksheetDTO2;

	}

	public List searchMarksheetByName(MarksheetDTO marksheetDTO) {
		return getHibernateTemplate().findByCriteria(
				DetachedCriteria.forClass(MarksheetDTO.class)
						.add(
								Restrictions.like("name", marksheetDTO
										.getName()
										+ "%")));

	}

	public List searchByPage(int pageno, int maxsize) {
		return getHibernateTemplate().findByCriteria(
				DetachedCriteria.forClass(MarksheetDTO.class),
				maxsize * (pageno - 1), maxsize);

	}

	public List searchMarksheetByRollno(MarksheetDTO marksheetDTO) {
		return getHibernateTemplate().findByCriteria(
				DetachedCriteria.forClass(MarksheetDTO.class).add(
						Restrictions.eq("rollno", marksheetDTO.getRollno())));
	}

}
