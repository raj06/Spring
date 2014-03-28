package com.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dto.RegistrationDTO;

public class RegistrationDaoHibImpl extends HibernateDaoSupport implements
		RegistrationDaoInt {

	public void addRegistration(RegistrationDTO registrationDTO) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(registrationDTO);
	}

	public boolean auth(RegistrationDTO registrationDTO) {
		boolean b=false;
		List list = getHibernateTemplate().findByCriteria(
				DetachedCriteria.forClass(RegistrationDTO.class));
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			RegistrationDTO registrationDTO2 = (RegistrationDTO) iterator
					.next();
			System.out.println(registrationDTO.getUserid());
			System.out.println(registrationDTO2.getUserid());
			if (registrationDTO.getUserid().equalsIgnoreCase(
					registrationDTO2.getUserid())
					&& registrationDTO.getPassword().equalsIgnoreCase(

					registrationDTO2.getPassword())) {
				b=true;
				break;
			}
		}
		return b;
		// TODO Auto-generated method stub

	}

	public List userRegistrationList() {
		// TODO Auto-generated method stub
		List list = getHibernateTemplate().findByCriteria(
				DetachedCriteria.forClass(RegistrationDTO.class));
		return list;
	}

	public void Default() {
		// TODO Auto-generated method stub
		
	}

}
