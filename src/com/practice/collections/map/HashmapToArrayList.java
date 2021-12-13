package com.practice.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashmapToArrayList {

	public static void main(String[] args) {

		HashMap<String, Integer> companyDetails = new HashMap<String, Integer>();

		// create hashmap with keys and values (CompanyName, #Employees)
		companyDetails.put("eBay", 4444);
		companyDetails.put("Paypal", 5555);
		companyDetails.put("IBM", 6666);
		companyDetails.put("Google", 7777);
		companyDetails.put("Yahoo", 8888);

		System.out.println("==> Size of companyDetails Map: " + companyDetails.size());
		
		Iterator<Entry<String, Integer>> it = companyDetails.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Integer> pairs = it.next();
			System.out.println(pairs.getKey() + " = " + pairs.getValue());
		}

		// Converting HashMap keys into ArrayList
		List<String> keyList = new ArrayList<String>(companyDetails.keySet());
		System.out.println("\n==> Size of Key list: " + keyList.size());

		for (String temp : keyList) {
			System.out.println(temp);
		}

		// Converting HashMap Values into ArrayList
		List<Integer> valueList = new ArrayList<Integer>(companyDetails.values());
		System.out.println("\n==> Size of Value list: " + valueList.size());
		for (Integer temp : valueList) {
			System.out.println(temp);
		}

		List<Entry<String, Integer>> entryList = new ArrayList<Entry<String, Integer>>(companyDetails.entrySet());
		System.out.println("\n==> Size of Entry list: " + entryList.size());
		for (Entry<String, Integer> temp : entryList) {
			System.out.println(temp);
		}

	}

}
