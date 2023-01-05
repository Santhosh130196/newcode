package org.javaa;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Employee {
public static void main(String[] args) {
	int a[]=new int[7];
	a[0]=900;
	a[1]=800;
	a[2]=908;
	a[3]=908;
	a[4]=987;
	a[5]=244;
	a[6]=988;


	
	for (int i = 0; i < a.length; i++) {
		
		for (int j = i+1; j < a.length; j++) {
			
			if (a[i]<a[j]) {
				int tem=a[i];
				a[i]=a[j];
				a[j]=tem;
			}
		}
	}
	for (int i = 0; i < a.length; i++) {
		
		System.out.println(a[i]);
	}
	
	}
	}
	
    	
