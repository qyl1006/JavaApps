package com.qyl._3_dom;

import java.io.File;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class NewDocument {
	/*
	 * 需求：在xml不存在的情况下，保存一个新的联系人到xml中
		思路: 1) 创建Document对象
			2) 创建根元素并加入到Document
			3  创建linkman name email address group元素,设置并加到相对应的老爸中
			4) 同步信息
	 */
	@Test
	public void test() throws Exception{
//		1) 创建Document对象
		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
//		2) 创建根元素并加入到Document
		Element root = doc.createElement("contacts");
		doc.appendChild(root);
//		3  创建linkman name email address group元素,设置并加到相对应的老爸中
		Element linkmanE1 = doc.createElement("linkman");
		Element nameE1 = doc.createElement("name");
		Element emailE1 = doc.createElement("email");
		Element addressE1 = doc.createElement("address");
		Element groupE1 = doc.createElement("group");
		
		linkmanE1.setAttribute("idd", "fuck");
		nameE1.setTextContent("张三");
		emailE1.setTextContent("sansan@qq.com");
		addressE1.setTextContent("广州天河区");
		groupE1.setTextContent("达内科技");
		
		root.appendChild(linkmanE1);
		linkmanE1.appendChild(nameE1);
		linkmanE1.appendChild(emailE1);
		linkmanE1.appendChild(addressE1);
		linkmanE1.appendChild(groupE1);

//		4) 同步信息
		Transformer tran = TransformerFactory.newInstance().newTransformer();
		Source xmlSource = new DOMSource(doc);
		Result outputTarget = new StreamResult(new File("H:/123.xml"));
		tran.transform(xmlSource, outputTarget);
	}
}
