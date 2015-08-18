package com.segments.algorithm;

import java.io.IOException;
import java.io.StringReader;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.wltea.analyzer.IKSegmentation;
import org.wltea.analyzer.Lexeme;
import org.wltea.analyzer.lucene.IKAnalyzer;

public class IKAnalyzerFenci implements Ialgorithm{
	String text=null;
	public void operate(){
//		String text="��ǩ����Ϊһ�ֿ��ӻ������ӿ����������������У�"
//				+ "���б�ǩ���ӻ����Կ��Զ��û��������һ���ĵ������ã��Ӷ����û��Ĺ�ע���������ض��ֶλ�����"
//				+ "����Ŀǰ���о���Ա�Ա�ǩ�����Եĵ�������֪֮���١�����Χ�Ʋ�ͬ�ı�ǩ�ƿ��ӻ����ֶ��û������Ӱ��̶Ƚ����о���"
//				+ "ͨ����ǩ���ޱ�����ɫ����ǩ�ܼ��̶ȡ��û��Ա�ǩ����Ϥ�̶ȡ���ǩ������ɫ���������飬������ͬ�Ŀ��ӻ����Զ��û���Ӱ��̶ȡ�"
//				+ "�ڽ��ı�ǩ������п��Ը��ݲ�ͬ��Ⱥ������Եĸı�Ȩ�ظߵ����ԣ�ʹ�û��ڱ�ǩ�ƽ����о��е����Ժ͸�Ч������������Ч����";
//	    //�����ִʶ���
//		String text1="��·͸�籨����ӡ���������������һ��Ա���ڶ���29�գ���ʾ��"
//				+ "�����и�������ʱ��27�ճ�5ʱ53�ַ�������6.2���������������5427��������"
//				+ "20000�������ˣ���20�����޼ҿɹ顣";
//		String text2="����java���Կ����������������ķִʹ��߰���";
		Analyzer analyzer=new IKAnalyzer(true);
		StringReader reader=new StringReader(text);
		IKSegmentation ik=new IKSegmentation(reader,true);
		Lexeme lexeme=null;
		try {
			while((lexeme=ik.next())!=null){
				System.out.println(lexeme.getLexemeText());
			}
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
