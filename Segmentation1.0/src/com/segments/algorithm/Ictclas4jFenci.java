package com.segments.algorithm;

import org.ictclas4j.bean.SegResult;
import org.ictclas4j.segment.SegTag;

public class Ictclas4jFenci implements Ialgorithm{
	String text=null;
	public void operate(){
//		String text="��ǩ����Ϊһ�ֿ��ӻ������ӿ����������������У�"
//				+ "���б�ǩ���ӻ����Կ��Զ��û��������һ���ĵ������ã��Ӷ����û��Ĺ�ע���������ض��ֶλ�����"
//				+ "����Ŀǰ���о���Ա�Ա�ǩ�����Եĵ�������֪֮���١�����Χ�Ʋ�ͬ�ı�ǩ�ƿ��ӻ����ֶ��û������Ӱ��̶Ƚ����о���"
//				+ "ͨ����ǩ���ޱ�����ɫ����ǩ�ܼ��̶ȡ��û��Ա�ǩ����Ϥ�̶ȡ���ǩ������ɫ���������飬������ͬ�Ŀ��ӻ����Զ��û���Ӱ��̶ȡ�"
//				+ "�ڽ��ı�ǩ������п��Ը��ݲ�ͬ��Ⱥ������Եĸı�Ȩ�ظߵ����ԣ�ʹ�û��ڱ�ǩ�ƽ����о��е����Ժ͸�Ч������������Ч����";
		SegTag segTag=new SegTag(1);
		SegResult segResult=segTag.split(text.trim());
		String classifyContent=segResult.getFinalResult();
		System.out.println(classifyContent);
	}

	@Override
	public void setText(String text) {
		// TODO Auto-generated method stub
		this.text=text;
	}
}
