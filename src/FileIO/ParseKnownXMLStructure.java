package FileIO;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import Entities.User;

public class ParseKnownXMLStructure {
	public static void main(String[] args) throws Exception {
		List<User> users = new ArrayList<User>();
        List<String> following = new ArrayList<>();
        List<String> followers= new ArrayList<>();

		//Get Docuemnt Builder
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
	      User user = null;
		//Build Document
		Document document = builder.parse(new File("users.xml"));
		 
		//Normalize the XML Structure; It's just too important !!
		document.getDocumentElement().normalize();
		 
		//Here comes the root node
		Element root = document.getDocumentElement();
		System.out.println(root.getNodeName());
		 
		//Get all employees
		NodeList nList = document.getElementsByTagName("user");
		System.out.println("============================");
		 
		for (int temp = 0; temp < nList.getLength(); temp++)
		{
		 Node node = nList.item(temp);
		 System.out.println("");    //Just a separator
		 if (node.getNodeType() == Node.ELEMENT_NODE)
		 {
		    //Print each employee's detail
		    Element eElement = (Element) node;
		    System.out.println("userName : "  + eElement.getElementsByTagName("userName").item(0).getTextContent());
		    System.out.println("password: "   + eElement.getElementsByTagName("password").item(0).getTextContent());
		    System.out.println("followings : "    + eElement.getElementsByTagName("followings").item(0).getTextContent());
		    System.out.println("string : "    + eElement.getElementsByTagName("string").item(0).getTextContent());

		    user = new User();
            user.setUserName(eElement.getElementsByTagName("userName").item(0).getTextContent());
            user.setPassword(eElement.getElementsByTagName("password").item(0).getTextContent());
            eElement.getElementsByTagName("followings").item(0).getTextContent();

            following.add(eElement.getElementsByTagName("followings").item(0).getTextContent());
            user.setFollowingList(following);


            users.add(user);

		 }
		}
		
        System.out.println(users.get(0).getFollowingList().get(0));

	}
}
