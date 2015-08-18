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
//		String text="标签云作为一种可视化导航接口在网络上愈加流行，"
//				+ "云中标签可视化属性可以对用户浏览产生一定的导向作用，从而把用户的关注点吸引到特定字段或区域。"
//				+ "但是目前，研究人员对标签云属性的导向作用知之甚少。文章围绕不同的标签云可视化布局对用户浏览的影响程度进行研究，"
//				+ "通过标签有无背景颜色、标签密集程度、用户对标签的熟悉程度、标签背景颜色亮暗等试验，分析不同的可视化属性对用户的影响程度。"
//				+ "在今后的标签云设计中可以根据不同人群有针对性的改变权重高的特性，使用户在标签云交互中具有导向性和高效、完美的体验效果。";
		AnsjFenci cutWord=new AnsjFenci();
		cutWord.wordFenci(text);
	}
	@Override
	public void setText(String text) {
		this.text=text;		
	}
}
