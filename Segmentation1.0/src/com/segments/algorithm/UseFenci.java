package com.segments.algorithm;

import java.util.Scanner;

public class UseFenci {
	public static void main(String[] args){
		Context context;
		Scanner inputText=new Scanner(System.in);
		String text=null;
		System.out.println("请输入待分词的文本：");
		text=inputText.next();
//		setText(text);
//		System.out.println(text);
		
		//ansj分词
		System.out.println("使用ansj分词的结果为：");
		context=new Context(new AnsjFenci());
		context.setText(text);
		context.operate();
		System.out.println("----------------------------------");
		
		//ictclas4j分词
		System.out.println("使用ictclas4j分词的结果为：");
		context=new Context(new Ictclas4jFenci());
		context.setText(text);
		context.operate();
		System.out.println("----------------------------------");
		
		//Ikanlyzer分词
		System.out.println("使用Ikanalyzer分词的结果为：");
		context=new Context(new IKAnalyzerFenci());
		context.setText(text);
		context.operate();
		System.out.println("----------------------------------");
		
		//MMAnalyzer分词
		System.out.println("使用MMAnalyzer分词的结果为：");
		context=new Context(new MMAnalyzerFenci());
		context.setText(text);
		context.operate();
		System.out.println("----------------------------------");
		
		//paoding分词
		System.out.println("使用paoding分词的结果为：");
		context=new Context(new PaodingFenci());
		context.setText(text);
		context.operate();
		System.out.println("----------------------------------");
	}
}
