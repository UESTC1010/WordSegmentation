package com.segments.algorithm;

import java.io.IOException;

import jeasy.analysis.MMAnalyzer;

public class MMAnalyzerFenci implements Ialgorithm{
	String text=null;
	public void operate(){
//		String text="��ǩ����Ϊһ�ֿ��ӻ������ӿ����������������У�"
//				+ "���б�ǩ���ӻ����Կ��Զ��û��������һ���ĵ������ã��Ӷ����û��Ĺ�ע���������ض��ֶλ�����"
//				+ "����Ŀǰ���о���Ա�Ա�ǩ�����Եĵ�������֪֮���١�����Χ�Ʋ�ͬ�ı�ǩ�ƿ��ӻ����ֶ��û������Ӱ��̶Ƚ����о���"
//				+ "ͨ����ǩ���ޱ�����ɫ����ǩ�ܼ��̶ȡ��û��Ա�ǩ����Ϥ�̶ȡ���ǩ������ɫ���������飬������ͬ�Ŀ��ӻ����Զ��û���Ӱ��̶ȡ�"
//				+ "�ڽ��ı�ǩ������п��Ը��ݲ�ͬ��Ⱥ������Եĸı�Ȩ�ظߵ����ԣ�ʹ�û��ڱ�ǩ�ƽ����о��е����Ժ͸�Ч������������Ч����";
		MMAnalyzer analyzer=new MMAnalyzer();
		try {
			System.out.println(analyzer.segment(text, "|"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void setText(String text) {
		// TODO Auto-generated method stub
		this.text=text;
	}
}
