package FileIO;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import Entities.User;

public class PopulateDTOExamplesWithParsedXML
{
   public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException
   {
        List<User> users = parseUsersXML();
        System.out.println(users);
   }

   private static List<User> parseUsersXML() throws ParserConfigurationException, SAXException, IOException
   {
      //Initialize a list of employees
      List<User> users = new ArrayList<User>();
      User user = null;
      
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      DocumentBuilder builder = factory.newDocumentBuilder();
      Document document = builder.parse(new File("users.xml"));
      document.getDocumentElement().normalize();
      NodeList nList = document.getElementsByTagName("user");
      for (int temp = 0; temp < nList.getLength(); temp++)
      {
         Node node = nList.item(temp);
         if (node.getNodeType() == Node.ELEMENT_NODE)
         {
            Element eElement = (Element) node;
            //Create new Employee Object
            user = new User();
            user.setUserName(eElement.getElementsByTagName("userName").item(0).getTextContent());
            user.setPassword(eElement.getElementsByTagName("password").item(0).getTextContent());

            //Add Employee to list
            users.add(user);
         }
      }
      return users;
   }
}
