package com.test;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.dao.MarksheetDaoInt;
import com.dao.RegistrationDaoInt;
import com.dto.MarksheetDTO;
import com.dto.RegistrationDTO;
import com.service.MarksheetServiceInt;

public class MarksheetTest {
	public static void main(String[] args) {

		RegistrationDTO registrationDTO = new RegistrationDTO();

		registrationDTO.setCity("indore");
		registrationDTO.setCountry("India");
		registrationDTO.setUserid("vinod");
		registrationDTO.setPassword("1234");
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"applicationContext.xml"));

		MarksheetDaoInt daoInt = (MarksheetDaoInt) factory
				.getBean("MarksheetDAOBean");

		MarksheetDTO marksheetDTO = new MarksheetDTO();
		marksheetDTO.setName("naveen");
		List list = daoInt.ListMarksheet();
		System.out.println(list);
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			MarksheetDTO marksheetDTO2 = (MarksheetDTO) iterator
					.next();
			System.out.println(marksheetDTO2.getId() + "\t  "
					+ marksheetDTO2.getName() + "\t"
					+ marksheetDTO2.getRollno() + "\t"
					+ marksheetDTO2.getPhysics() + "\t"
					+ marksheetDTO2.getChemistry() + "\t"
					+ marksheetDTO2.getMaths());
		}

	}

}
