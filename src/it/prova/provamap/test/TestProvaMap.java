package it.prova.provamap.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TestProvaMap {

	public static void main(String[] args) {
		Map<String, Integer> alfabetoMap = new HashMap<String, Integer>();
		alfabetoMap.put("A", 1);
		alfabetoMap.put("G", 7);
		alfabetoMap.put("S", 18);
		alfabetoMap.put("D", 4);

		for (Map.Entry<String, Integer> mapTemp : alfabetoMap.entrySet()) {
			  System.out.print(mapTemp.getKey() + ":");
	            System.out.println(mapTemp.getValue());
		}
	}
}
