package helpers;

import io.cucumber.java.sl.In;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class restHelpers {

    public static void main(String[] args) {
        restHelpers oobj_restHelpers = new restHelpers();
        oobj_restHelpers.getLanguageDependencePoll();
    }

    public String getLanguageDependencePoll() {

        try {
            String format = "xmlapi";
            String objectid = "336986";

            String url = "https://boardgamegeek.com/" + format + "/boardgame/" + objectid + "";
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();

            int responseCode = con.getResponseCode();
            System.out.println("Response Code: " + responseCode);
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            //Boolean inputLine;
            //StringBuffer response = new StringBuffer();
            //while ((inputLine = Boolean.valueOf(String.valueOf(in.readLine() != null)))){
            //    response.append(inputLine);
            //}
            in.close();
            //System.out.println(response.toString());

            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(response.toString())));
//
            //  NodeList errNodes = doc.getElementsByTagName("poll");
            //  for (int itr = 0; itr < errNodes.getLength(); itr++) {
            //      Node node = errNodes.item(itr);
            //      System.out.println("\nNode Name :" + node.);
            // if (node.getNodeType() == Node.ELEMENT_NODE) {
            //     Element eElement = (Element) node;
            //     System.out.println("Student id: " + eElement.getElementsByTagName("name").item(0).getNodeValue());
            //     System.out.println("First Name: " + eElement.getElementsByTagName("title").item(0).getNodeValue());
            //     System.out.println("Last Name: " + eElement.getElementsByTagName("totalvotes").item(0).getNodeValue());
            //             // }
            //          }
            //      } catch (Exception e) {
            //          e.printStackTrace();
            //      }
            //      return null;
            //  }


            NodeList errNodes = doc.getElementsByTagName("boardgames");
            if (errNodes.getLength() > 0) {
                Element err = (Element) errNodes.item(0);
                System.out.println("language_dependence -" + err.getElementsByTagName("poll")
                        .item(1).getAttributes().getNamedItem("totalvotes").getNodeValue());

                System.out.println("language_dependence -" + Arrays.toString(getChildNodesByName((Element) errNodes, "poll")));
            } else {
                //success
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public String getLanguageDependencePoll2() {
        try {
            String format = "xmlapi";
            String objectid = "336986";

            String url = "https://boardgamegeek.com/" + format + "/boardgame/" + objectid + "";
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();

            int responseCode = con.getResponseCode();
            System.out.println("Response Code: " + responseCode);
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(response.toString())));

            NodeList errNodes = doc.getElementsByTagName("boardgames");
            if (errNodes.getLength() > 0) {
                Element err = (Element) errNodes.item(0);
                System.out.println("language_dependence -" + err.getElementsByTagName("poll")
                        .item(1).getAttributes().getNamedItem("totalvotes").getNodeValue());
            } else {
                //success
            }

        }catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    private static String getChildElementValue(
            final String tagName,
            final Element element) {
        Node tagNode = element.getElementsByTagName(tagName).item(0);
        if (tagNode == null)
            return null;
        NodeList nodes = tagNode.getChildNodes();
        Node node = (Node) nodes.item(0);

        return node.getNodeValue();
    }

    public static Node[] getChildNodesByName(Element parent, String name) {
        List<Node> nodeList = new ArrayList<Node>();

        NodeList childNodes = parent.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node current = childNodes.item(i);
            if (current.getNodeName().equals(name))
                nodeList.add(current);//  w  w  w. j  a va 2s .c om
        }

        Node[] nodes = new Node[nodeList.size()];
        nodeList.toArray(nodes);
        return nodes;
    }
}