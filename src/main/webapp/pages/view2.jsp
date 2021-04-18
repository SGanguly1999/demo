<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Meme Stream</title>
    <style>
    body{
 margin:0;
 padding:0;
}
h1
{
text-align: center;
    margin: 20px auto;
    display:inline-block;
}
header
{
color:blue;
background:rgb(50,50,50);
padding:50px 40%;
font-size: 25px;
}
section
{
display:flex;
}
.strip
{
background:rgb(40,40,0);
padding:30px 70px
}
input[type=text]{
border: 5px solid gray;
height:20px;
 border-radius: 4px;
}
input[type=url]{
border: 5px solid gray;
height:20px;
 border-radius: 4px;
}
input[type=submit]{
background:blue;
font-size: 15px;
}
#scroll-area {
    max-height: 300px;
    overflow: auto;
    /* min-width: 50%; */
}


    </style>
</head>

<body>
<header>
    <h1>
        Online Auction
    </h1>
</header>
<section class="strip">
    <br>
</section>
<section class="form">
    <form action="add" method="post">
        <label for="owner" >
        <h3>Seller:</h3></label>
  <input placeholder="Enter your name" id="owner" type="text"  name="owner" size="100"><br><br>
  <label for="caption"><h3>Price:</h3></label>
  <input placeholder="Enter the caption" id="caption" type="text"  name="caption"  size="100"><br><br>
        <label for="url"><h3>Image Picture:</h3></label>
  <input placeholder="Enter a valid URL" id="url" type="url"  name="url" size="100"><br><br>
  <input type="submit" value="Submit">
    </form>
</section>




<%@ page import="com.example.demo.Meme_schema" %>
<%@ page import="java.util.*" %>
<div class=" container scroll-area" id="scroll-area">
<%

	 List<Meme_schema> obj=(List<Meme_schema>)session.getAttribute("list");
	 if(obj!=null)
	 {

	for(Meme_schema ob:obj)
	{

	out.println("<div>");
	out.println("<b>"+ob.getOwner()+"</b>");
	out.println("</div>");
	out.println("<div>");
	out.println(ob.getCaption());
	out.println("</div>");
	String url="\""+ob.getUrl()+"\"";
	out.println("<div>");
	out.println("<img src="+url+">");
	out.println("</div>");

	}
	 }
	 session.removeAttribute("list");

%>


</div>
</body>
</html>