package com.segments.algorithm;

import java.util.List;

import org.ansj.domain.Term;
import org.ansj.splitWord.analysis.ToAnalysis;

public class AnsjFenci implements Ialgorithm{
	String text=null;
	public void wordFenci(String news){
		List<Term> parse=ToAnalysis.parse(news);
		for (Term term : parse) {
			System.out.println(term);			
		}
	}
	public void operate(){
//		String text="��ǩ����Ϊһ�ֿ��ӻ������ӿ����������������У�"
//				+ "���б�ǩ���ӻ����Կ��Զ��û��������һ���ĵ������ã��Ӷ����û��Ĺ�ע���������ض��ֶλ�����"
//				+ "����Ŀǰ���о���Ա�Ա�ǩ�����Եĵ�������֪֮���١�����Χ�Ʋ�ͬ�ı�ǩ�ƿ��ӻ����ֶ��û������Ӱ��̶Ƚ����о���"
//				+ "ͨ����ǩ���ޱ�����ɫ����ǩ�ܼ��̶ȡ��û��Ա�ǩ����Ϥ�̶ȡ���ǩ������ɫ���������飬������ͬ�Ŀ��ӻ����Զ��û���Ӱ��̶ȡ�"
//				+ "�ڽ��ı�ǩ������п��Ը��ݲ�ͬ��Ⱥ������Եĸı�Ȩ�ظߵ����ԣ�ʹ�û��ڱ�ǩ�ƽ����о��е����Ժ͸�Ч������������Ч����";
		AnsjFenci cutWord=new AnsjFenci();
		cutWord.wordFenci(text);
	}
	@Override
	public void setText(String text) {
		this.text=text;		
	}
}
