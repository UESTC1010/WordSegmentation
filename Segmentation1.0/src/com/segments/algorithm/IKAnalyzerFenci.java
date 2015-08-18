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
//		String text="标签云作为一种可视化导航接口在网络上愈加流行，"
//				+ "云中标签可视化属性可以对用户浏览产生一定的导向作用，从而把用户的关注点吸引到特定字段或区域。"
//				+ "但是目前，研究人员对标签云属性的导向作用知之甚少。文章围绕不同的标签云可视化布局对用户浏览的影响程度进行研究，"
//				+ "通过标签有无背景颜色、标签密集程度、用户对标签的熟悉程度、标签背景颜色亮暗等试验，分析不同的可视化属性对用户的影响程度。"
//				+ "在今后的标签云设计中可以根据不同人群有针对性的改变权重高的特性，使用户在标签云交互中具有导向性和高效、完美的体验效果。";
//	    //创建分词对象
//		String text1="据路透社报道，印度尼西亚社会事务部一官员星期二（29日）表示，"
//				+ "日惹市附近当地时间27日晨5时53分发生里氏6.2级地震已造成至少5427人死亡，"
//				+ "20000余人受伤，近20万人无家可归。";
//		String text2="基于java语言开发的轻量级的中文分词工具包。";
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
