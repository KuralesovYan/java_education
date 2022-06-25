package ru.stqa.java_education.project;

import java.awt.desktop.AboutEvent;

public class helloworld {
	public static void main(String[] args) {
		hello(" and RASHA");

		double lena = 4.0;
		System.out.println(area (lena));

		double a= 5;
		double b= 6;
		System.out.println("какой-то текст " + a + " умножить " + b + " равно " + area(a,b));
	}
	public static void hello(String A) {
		System.out.println("Not war Ukrain" + A);
	}
	public static double area (double l) {
		return l * l;
	}
	public static double area (double a, double b) {
		return a * b;
	}
}
	//String A = "Заебал, твой тип, не правильный тип, держи свои ";
		//System.out.println(A+"психические проблемы при себе");

				//double l = 6;
				//double s = l*l;
				//System.out.println("Площадь " + l + " = " + s);