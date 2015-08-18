package com.segments.algorithm;

import java.io.IOException;
import java.io.StringReader;

import net.paoding.analysis.analyzer.PaodingAnalyzer;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.Token;
import org.apache.lucene.analysis.TokenStream;

public class PaodingFenci implements Ialgorithm{
	String text=null;
	public void operate(){
		Analyzer analyzer=new PaodingAnalyzer();
//		String indexString="��ǩ����Ϊһ�ֿ��ӻ������ӿ����������������У�"
//				+ "���б�ǩ���ӻ����Կ��Զ��û��������һ���ĵ������ã��Ӷ����û��Ĺ�ע���������ض��ֶλ�����"
//				+ "����Ŀǰ���о���Ա�Ա�ǩ�����Եĵ�������֪֮���١�����Χ�Ʋ�ͬ�ı�ǩ�ƿ��ӻ����ֶ��û������Ӱ��̶Ƚ����о���"
//				+ "ͨ����ǩ���ޱ�����ɫ����ǩ�ܼ��̶ȡ��û��Ա�ǩ����Ϥ�̶ȡ���ǩ������ɫ���������飬������ͬ�Ŀ��ӻ����Զ��û���Ӱ��̶ȡ�"
//				+ "�ڽ��ı�ǩ������п��Ը��ݲ�ͬ��Ⱥ������Եĸı�Ȩ�ظߵ����ԣ�ʹ�û��ڱ�ǩ�ƽ����о��е����Ժ͸�Ч������������Ч����";
		StringReader reader=new StringReader(text);
		TokenStream ts=analyzer.tokenStream(text, reader);
		//Token t=ts.n
		Token t = null;
		try {
			t = ts.next();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(t!=null){
			System.out.print(t.termText()+"\n");
			//System.out.print(t.term()+"|");
			try {
				t=ts.next();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	@Override
	public void setText(String text) {
		// TODO Auto-generated method stub
		this.text=text;
	}
}
