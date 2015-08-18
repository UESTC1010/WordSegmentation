package com.segments.algorithm;

import java.util.Scanner;

public class UseFenci {
	public static void main(String[] args){
		Context context;
		Scanner inputText=new Scanner(System.in);
		String text=null;
		System.out.println("��������ִʵ��ı���");
		text=inputText.next();
//		setText(text);
//		System.out.println(text);
		
		//ansj�ִ�
		System.out.println("ʹ��ansj�ִʵĽ��Ϊ��");
		context=new Context(new AnsjFenci());
		context.setText(text);
		context.operate();
		System.out.println("----------------------------------");
		
		//ictclas4j�ִ�
		System.out.println("ʹ��ictclas4j�ִʵĽ��Ϊ��");
		context=new Context(new Ictclas4jFenci());
		context.setText(text);
		context.operate();
		System.out.println("----------------------------------");
		
		//Ikanlyzer�ִ�
		System.out.println("ʹ��Ikanalyzer�ִʵĽ��Ϊ��");
		context=new Context(new IKAnalyzerFenci());
		context.setText(text);
		context.operate();
		System.out.println("----------------------------------");
		
		//MMAnalyzer�ִ�
		System.out.println("ʹ��MMAnalyzer�ִʵĽ��Ϊ��");
		context=new Context(new MMAnalyzerFenci());
		context.setText(text);
		context.operate();
		System.out.println("----------------------------------");
		
		//paoding�ִ�
		System.out.println("ʹ��paoding�ִʵĽ��Ϊ��");
		context=new Context(new PaodingFenci());
		context.setText(text);
		context.operate();
		System.out.println("----------------------------------");
	}
}
