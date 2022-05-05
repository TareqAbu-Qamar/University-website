package WebPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   String name = request.getParameter("name");
		    String dgrees = request.getParameter("degree");
		    String address = request.getParameter("address");
		    String street = request.getParameter("street");
		    String city = request.getParameter("city");
		    String zipcode = request.getParameter("zipcode");
		    String email = request.getParameter("email");
		    String movie = request.getParameter("movie");
		    
		    String []check = request.getParameterValues("liked");
		    
		    String interested = request.getParameter("interested");
		    
		    
		    PrintWriter out = new PrintWriter("file.txt"); 
		    
	        out.println(name);   
	        out.println(dgrees);
	        out.println(address);
	        out.println(street);
	        out.println(city);  
	        out.println(zipcode);
	        out.println(email);
	        out.println(movie);
	        out.println(check);  
	        out.println(interested);
	        out.close(); 
	        
	        

	        
	        String [] Movies = movie.split(",");
	        int size = Movies.length;
	        double [] Values = new double [size];
	        int i = 0;
	        for (String obj : Movies) {
	        	Values[i]=Double.parseDouble(obj);
	        	i++;
	        }
	        
	        double meanSum = 0;
	        double sdSum = 0;
	      
	        
	        for (int j = 0; j < size; j++)
	        {
	        	meanSum += Values[j];
	        }

	        double mean = meanSum / Values.length;
	        
	        
	        
	        for (int k = 0; k < size; i++)
	        {
	            Values[k] = (Math.pow((Values[k] - mean), 2));
	            sdSum += Values[k];
	        }
	        double variance = sdSum / Values.length;
	        double standardDeviation = Math.sqrt(variance);
	    
		    
	        
		    PrintWriter out1 = response.getWriter();
		    out1.println("<!DOCTYPE html>\r\n" + 
		    		"<html>\r\n" + 
		    		"<head>\r\n" + 
		    		"<meta charset=\"windows-1256\">\r\n" + 
		    		"<title>Insert title here</title>\r\n" + 
		    		"<style>\r\n" + 
		    		"h1{\r\n" + 
		    		" color:blue;\r\n" + 
		    		"}\r\n" + 
		    		"a{\r\n" + 
		    		" text-decoration: none;\r\n" + 
		    		" color: blue;\r\n" + 
		    		"}\r\n" + 
		    		"a:hover{\r\n" + 
		    		" text-decoration:underline;\r\n" + 
		    		" color: yellow;\r\n" + 
		    		"}\r\n" + 
		    		"data{\r\n" + 
		    		" background-color:whitesmoke;\r\n" + 
		    		" float: right;\r\n" + 
		    		" width: 100%;\r\n" + 
		    		" \r\n" + 
		    		" }\r\n" + 
		    		" table {\r\n" + 
		    		"  width:50%;\r\n" + 
		    		"}\r\n" + 
		    		"table, th, td {\r\n" + 
		    		"  border: 1px solid black;\r\n" + 
		    		"  border-collapse: collapse;\r\n" + 
		    		"}\r\n" + 
		    		"th{\r\n" + 
		    		"  color: red;\r\n" + 
		    		"  padding: 15px;\r\n" + 
		    		"  text-align: left;\r\n" + 
		    		"}\r\n" + 
		    		"td {\r\n" + 
		    		"  padding: 15px;\r\n" + 
		    		"  text-align: left;\r\n" + 
		    		"  color: blue;\r\n" + 
		    		"}\r\n" + 
		    		"</style>\r\n" + 
		    		"</head>\r\n" + 
		    		"<body>\r\n" + 
		    		"  <div id=\"data\">\r\n" + 
		    		"    <h1>Campus Visit Form</h1>\r\n" + 
		    		"    <form action=\"Servlet\" method=\"post\">\r\n" + 
		    		"        <label for=\"name\"><b>Name:</b></label>&nbsp;&nbsp;&nbsp;\r\n" + 
		    		"        <input type=\"text\" name=\"name\"><br><br>\r\n" + 
		    		"\r\n" + 
		    		"        <label for=\"name\"><b>Degree:</b></label>&nbsp;\r\n" + 
		    		"        <input type=\"radio\" name=\"degree\" value=\"Bachelor\">Bachelor\r\n" + 
		    		"        <input type=\"radio\" name=\"degree\" value=\"Master\">M.A\r\n" + 
		    		"        <input type=\"radio\" name=\"degree\" value=\"PhD\">PhD<br><br>\r\n" + 
		    		"\r\n" + 
		    		"        <label for=\"address\"><b>Address:</b></label>\r\n" + 
		    		"        <input type=\"text\" name=\"address\"><br><br>\r\n" + 
		    		"\r\n" + 
		    		"        <label for=\"street\"><b>Street:</b></label>&nbsp;&nbsp;&nbsp;&nbsp;\r\n" + 
		    		"        <input type=\"text\" name=\"street\"><br><br>\r\n" + 
		    		"\r\n" + 
		    		"        <label for=\"city\"><b>City:</b></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n" + 
		    		"        <input type=\"text\" name=\"city\"><br><br>\r\n" + 
		    		"\r\n" + 
		    		"        <label for=\"zipcode\"><b>Zip-Code:</b></label>\r\n" + 
		    		"        <input type=\"text\" name=\"zipcode\"><br><br>\r\n" + 
		    		"\r\n" + 
		    		"        <label for=\"email\"><b>Email:</b></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n" + 
		    		"        <input type=\"text\" name=\"email\"><br><br>\r\n" + 
		    		"\r\n" + 
		    		"        <label for=\"movie\"><b>Movie Raffle:</b></label>\r\n" + 
		    		"        <input type=\"text\" name=\"movie\"><br><br>\r\n" + 
		    		"\r\n" + 
		    		"        <table>\r\n" + 
		    		"          <tr>\r\n" + 
		    		"              <th><b>What you liked most about the campus ?</b></th>\r\n" + 
		    		"              <th><b>How students become interested in the university ?</b></th>\r\n" + 
		    		"              <th><b>What's your degree ?</b></th>\r\n" + 
		    		"          </tr>\r\n" + 
		    		"          <tr>\r\n" + 
		    		"          <td><input type=\"checkbox\" name=\"student\"><label for=\"student\">I'm student</label></td>\r\n" + 
		    		"          <td><input type=\"radio\" name=\"interested\" value=\"friends\">Male</td>\r\n" + 
		    		"          <td>\r\n" + 
		    		"            <li>Bachelor\r\n" + 
		    		"              <ol>\r\n" + 
		    		"                  <li>Java</li>\r\n" + 
		    		"                  <li>UML</li>\r\n" + 
		    		"                  <li>Fundamental of Software Engineering</li>\r\n" + 
		    		"                  <li>Algorithms & Data Structures</li>\r\n" + 
		    		"              </ol>\r\n" + 
		    		"          </li></td>\r\n" + 
		    		"          </tr>\r\n" + 
		    		"          <tr>\r\n" + 
		    		"            <td><input type=\"checkbox\" name=\"location\"><label for=\"location\">location</label></td>\r\n" + 
		    		"            <td><input type=\"radio\" name=\"interested\" value=\"television\">Female</td>\r\n" + 
		    		"            <td>\r\n" + 
		    		"              <li><abbr title=\"Master\">M.A</abbr> \r\n" + 
		    		"                <ol>\r\n" + 
		    		"                  <li><abbr title=\"Artificial intelligence\">AI</abbr></li>\r\n" + 
		    		"                  <li>Advanced Algorithms & Data Structures</li>\r\n" + 
		    		"                  <li>Cloud Computing</li>\r\n" + 
		    		"                </ol>\r\n" + 
		    		"            </li></td>\r\n" + 
		    		"          </tr>\r\n" + 
		    		"          <tr>\r\n" + 
		    		"            <td><input type=\"checkbox\" name=\"campus\"><label for=\"campus\">campus</label></td>\r\n" + 
		    		"            <td><input type=\"radio\" name=\"interested\" value=\"internet\">Internet</td>\r\n" + 
		    		"            <td>\r\n" + 
		    		"              <li>PhD\r\n" + 
		    		"                <ol>\r\n" + 
		    		"                  <li>Advanced Topics in Software Engineering</li>\r\n" + 
		    		"                  <li>Special Topics in Design Computing</li>\r\n" + 
		    		"                  <li>Creativity for Innovation and Design Thinking</li>\r\n" + 
		    		"                </ol>\r\n" + 
		    		"            </li></td>\r\n" + 
		    		"          </tr>\r\n" + 
		    		"          <tr>\r\n" + 
		    		"            <td><input type=\"checkbox\" name=\"atomsphere\"><label for=\"atomsphere\">atomsphere</label></td>\r\n" + 
		    		"            <td><input type=\"radio\" name=\"interested\" value=\"other\">Other<br></td>\r\n" + 
		    		"          </tr>\r\n" + 
		    		"          <tr>\r\n" + 
		    		"            <td><input type=\"checkbox\" name=\"rooms\"><label for=\"rooms\">dorm rooms</label></td>\r\n" + 
		    		"          </tr>\r\n" + 
		    		"          <tr>\r\n" + 
		    		"            <td><input type=\"checkbox\" name=\"sport\"><label for=\"sport\">sports</label></td>\r\n" + 
		    		"          </tr>\r\n" + 
		    		"        </table><br>\r\n" + 
		    		"        <textarea name=\"comment\" rows=\"10\" cols=\"25\">Write your comments here.</textarea><br>\r\n" + 
		    		"       \r\n" + 
		    		"       <label for=\"mean\">"+mean+"</label>\r\n" + 
		    		"       <label for=\"standardDeviation\">"+standardDeviation+"</label>\r\n" + 
		    		"       \r\n" + 
		    		"        <input type=\"submit\" value=\"Submit\" style=\"background-color: blue;color: white; font-size: 15px;\">\r\n" + 
		    		"      </form>\r\n" + 
		    		"   </div>\r\n" + 
		    		" </div>\r\n" + 
		    		"</body>\r\n" + 
		    		"</html>");
		    out1.close();
		    
		    	
		    	
		    	
	}

}
