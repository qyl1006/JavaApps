package com.qyl._3_dom;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/*
 * 总结: 1)若API查一个类是一个接口/abstract修饰的,那么它一定有办法/实现类来创建对象
 * 		2)工厂设计模式跟单例模式用法一样的,类的内部肯定有静态方法返回本类对象
 * 		3)若查API某个类的方法没有,那么要找的方法应该在它父类的有
 * 		4)写代码前应该理清好思路,不是很明确的地方,勇敢的去尝试测试,但没有必要太纠结细节,疑问先放着,把问题解决好这是关键
 * 
 */
public class DOMTest {
	private File f = new File("H:/contacts.xml");
	
	/*需求:获取Document的对象
	 * 思考-->Document类是interface接口--->DocumentBuilder有获取Douument对象的方法,根据情况选择parse(File f)创建
	 * 		然后DocumentBuilder类abstract的--->API提示可DocumentBuilderFactory.newDocumentBuilder()
	 * 		最后DocumentBuilderFactory类abstract的但有静态获取其对象
	 */
	@Test
	public void test1() throws ParserConfigurationException, Exception, Exception{
		//获取DocumentBuilderFactory对象
		DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
		//获取DocumentBuilder对象
		DocumentBuilder d = newInstance.newDocumentBuilder();
		//获取Document对象
		Document doc = d.parse(f);
	}
	
	/*
	 * 需求: 获取第二个联系人的邮箱
	 *思考: 1)  获取Document的对象
	 *		2) 从Document中获取根元素
	 *		3) 在Document中获取到第二个linkman
	 *		4) 在linkman中获取email元素
	 *		5)在email中获取文本内容
	 */
	@Test
	public void test2() throws Exception{
	//1)  获取Document的对象
		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(f);
  //* 2) 从Document中获取根元素
		Element root = doc.getDocumentElement();
	//3) 在Document中获取到第二个linkman
//		NodeList node = root.getElementsByTagName("linkman");
//		System.out.println(node.getLength());  //2
		Element linkmanE1 = (Element) root.getElementsByTagName("linkman").item(1);
		
//	//4) 在linkman中获取email元素
		Element emailE1 = (Element) linkmanE1.getElementsByTagName("email").item(0);
//    5)在email中获取文本内容
		String str = emailE1.getTextContent();
		System.out.println(str);
	}
	
	/*
	 * 需求: 修改第一个联系人的邮箱为"xy@163.com"
		思路:   1:获取Document对象
				2:从Document中获取根元素
				3:在root中获取到第一个linkman
				4:在linkman中获取email元素
				5:修改email的文本内容
				6:同步转换操作
	 */
	@Test
	public void test3() throws Exception{
//		1:获取Document对象
		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(f);
//		2:从Document中获取根元素
		Element root = doc.getDocumentElement();
//		3:在root中获取到第一个linkman
		Element linkmanE1 = (Element) root.getElementsByTagName("linkman").item(0);
//		4:在linkman中获取email元素
		Element emailE1 = (Element) linkmanE1.getElementsByTagName("email").item(0);
//		5:修改email的文本内容
		emailE1.setTextContent("xy@163.com");
//		6:同步转换操作
		Transformer tran = TransformerFactory.newInstance().newTransformer();
		Source xmlSource = new DOMSource(doc);
		Result outputTarget = new StreamResult(f);
		tran.transform(xmlSource, outputTarget);

	}
	
//	/*
//	 * 需求: 往xml中新增一个新的联系人
//	 * 思考: 1:获取Document对象
//			2:从Document中获取根元素
//			3:创建一个linkman元素(包括name/email/address/group)
//			4:设置name/email/address/group文本内容
//			5:设置层级关系
//			6:同步转换操作
//	 */
//	@Test
//	public void test4() throws Exception{
////		1:获取Document对象
//		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(f);
////		2:从Document中获取根元素
//		Element root = doc.getDocumentElement();
////		3:创建一个linkman元素(包括name/email/address/group)
//		Element linkmanE1 = doc.createElement("linkman");
//		Element nameE1 = doc.createElement("name");
//		Element emailE1 = doc.createElement("email");
//		Element addressE1 = doc.createElement("address");
//		Element groupE1 = doc.createElement("group");
////		4:设置name/email/address/group文本内容
//		nameE1.setTextContent("沙和尚");
//		emailE1.setTextContent("heshang@qq.com");
//		addressE1.setTextContent("广州市黄沙河");
//		groupE1.setTextContent("万达大夏建筑");
////		5:设置层级关系
//		linkmanE1.appendChild(nameE1);
//		linkmanE1.appendChild(emailE1);
//		linkmanE1.appendChild(addressE1);
//		linkmanE1.appendChild(groupE1);
//		root.appendChild(linkmanE1);
////		6:同步转换操作
//		Transformer tran = TransformerFactory.newInstance().newTransformer();
//		Source xmlSource = new DOMSource(doc);
//		Result outputTarget = new StreamResult(f);
//		tran.transform(xmlSource, outputTarget);
//	}
	
	/*
	 * 需求: 删除第三个联系人信息
	 * 思路: 1：获取Document对象
			2：获取根元素对象
			3：获取第三个linkman元素
			4：删除第三个linkman元素
			5：更新到xml文件中
	 */
	@Test
	public void test5() throws Exception{
//		 1：获取Document对象
		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(f);
//			2：获取根元素对象
		Element root = doc.getDocumentElement();
		System.out.println(root);
//			3：获取第三个linkman元素
		Element linkmanE1 = (Element) root.getElementsByTagName("linkman").item(2);
//			4：删除第三个linkman元素
		linkmanE1.getParentNode().removeChild(linkmanE1);
//			5：更新到xml文件
		Transformer tran = TransformerFactory.newInstance().newTransformer();
		Source xmlSource = new DOMSource(doc);
		Result outputTarget = new StreamResult(f);
		tran.transform(xmlSource, outputTarget);
		
	}
}
