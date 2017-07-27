# College Event Website




## Description :
Our project goal is to create a web application for  Student event registration. Student can view the event details and upload the file for paper presentation. My website is used to create java language(servlet and jsp).we used some concepts in java (mail,session,oops,filter,bootstrap)
### Requirements

### JSP
___
* Adminviewlist
* Alreadylogin
* Eventlist
* Index
* Index7
* login
* Mainpage

### JAVA
___
* AdminServlet
* Checklogin
* DBconnection
* Deletedetails
* Editdetails
* Eventdetails2
* Eventwisedetails
* Logindbconnection
* Logindetails
* Logoutpage
* mainservlet
* Myfilter
* Pojoevent
* Pojologin
* Viewdetails

### SQL
___
#### Db
* eventmanagementsystem

#### Tables
* eventtable
* logintable

## Code:

## 1.Mainpage.jsp

```sh
<html>
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
    .well{
        text-align:center;
        font-size: 20px;
        color:White;
        background-color: #42f4f4;
         margin-bottom: 5px;
         background-image: url(https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ3-5m0NXIKVxLg0cLEPN2na0VxkRqyDXG02WMOvPQB6Jv-Urtp);
          background-position: 0% 25%;
        background-size:cover;
        background-repeat: no-repeat;
    }
    .jumbotron{
         background-color: #42f4f4;
        margin-bottom: 0px;
        background-image: url(https://d2gg9evh47fn9z.cloudfront.net/800px_COLOURBOX6129591.jpg);
        background-position: 50% 50%;
        background-size:cover;
        background-repeat: no-repeat;
        height: 600px;
        width:1350px;

    }
    .red{
        color:#ff1000;
    }
    .green{
        color:green;
    }
    label{
        display:inline-block;
        width:80%;
        text-align: left;
    }

  </style>
    <body>
       <div class="jumbotron text-center">
  <h1><b>KGISL EVENTS</b></h1>
 <address>KG Information Systems Private Limited<br>
</address><div>
<div class="container">
     <div class="row">
    <div class="col-sm-10">
        </div>
         <div class="col-sm-1">
 <form action="Alreadylogin.jsp">
<button type="submit" class="btn btn-primary" name="signin">signin</button>
 </form>
         </div>
  <div class="col-sm-1">
   <form action="login.jsp">
<button type="submit" class="btn btn-primary" name="signup">signup</button>
   </form>
   <br><br><Br><br><br><br><br><Br><br><br><br><Br><br><br>
   <form action="index7.jsp" method="post">
        <button type="submit" class="btn btn-primary" name="Adminpanel" >Adminpanel</button>
</div>
</div>
</div>
 </form>
 </body>
</html>
```

 
___

## 2.Alreadylogin.jsp :


```sh
<html>
       <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>

form {
    border: 3px solid black;
}

input[type=email], input[type=password] {
    width: 50%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 30%;
    align:center;
}

button:hover {
    opacity: 0.8;
}

.cancelbtn {
    width: auto;
    padding: 10px 18px;
    background-color: #f44336;
}

.imgcontainer {
    text-align: center;
    margin: 12px 0 12px 0;
}

img.avatar {
    width: 30%;
    border-radius:20%;
}

.container {
    padding: 20px;
}

span.psw {
    float: right;
    padding-top: 16px;
}


@media screen and (max-width: 300px) {
    span.psw {
       display: block;
       float: none;
    }
    
}
</style>

    <head>
        <title>admin page
        </title>
    </head>
    <body>
<center><b><h1></h1></b></center>

<form action="Checklogin" method="post">
<div class="imgcontainer">
    <img src="data:image/jpeg;base64,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" alt="Avatar" class="avatar">
  </div>
   <div class="container">
       <center>
           <fieldset>
    <label>EmailID</label> &nbsp;&nbsp;&nbsp;
    <input type="email" name="email" placeholder="Enter Email ID"><br>
    <label>Password</label> 
  <input type="password" name="password" placeholder="Enter Password"><br>
    <button type="submit" name="Submit" >Signin</button></center>
    </fieldset>
    </div>
    </form>
    </body>
    </html>
```
___

## 3.Login.jsp :


 ```sh
 <html>
    <head>
        <title>admin page
        </title>
    </head><style>
input[type=email], input[type=password] {
    width: 30%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}
button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 10%;
    align:center;
}

button:hover {
    opacity: 0.8;
}

.cancelbtn {
    width: auto;
    padding: 10px 18px;
    background-color: #f44336;
}

.imgcontainer {
    text-align: center;
    margin: 12px 0 12px 0;
}

img.avatar {
    width: 30%;
    border-radius:20%;
}

.container {
    padding: 20px;
}

span.psw {
    float: right;
    padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
    span.psw {
       display: block;
       float: none;
    }
    
}
.jumbotron{
      
        background-color: #42f4f4;
        margin-bottom: 0px;
        background-image: url(http://buzzsouthafrica.com/wp-content/uploads/music_downloads.jpg);
        background-position: 50% 50%;
        background-size:cover;
        background-repeat: no-repeat;
        height: 600px;
        width:1350px;

    }
</style>


    <body class="jumbotron">
<center><b><h1></h1></b></center>

<form action="Logindetails" method="post">
    <div class="imgcontainer">
        <img src="http://cubpack811.org/wordpress/wp-content/uploads/2014/03/sign-up-here.png">
        </div>
   <div class="container">
       <center>

    <label>EmailID</label> &nbsp;
    <input type="email" name="email" placeholder="Enter Email ID"><br>
    <label>Password</label> 
    <input type="password" name="password" placeholder="Enter Password"><br>
    <button type="submit" name="Submit" >login</button>
    </center>
     </div>
</form>
</body>
</html>
</form>
```
___

## 4.index7.jsp :


```sh
<html>
    <STYLE>
    input[type=select], input[type=password],input[type=text] {
    width: 20%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}
button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 10%;
    align:center;
}

button:hover {
    opacity: 0.8;
}

.cancelbtn {
    width: auto;
    padding: 10px 18px;
    background-color: #f44336;
}

.imgcontainer {
    text-align: center;
    margin: 12px 0 12px 0;
}

img.avatar {
    width: 30%;
    border-radius:20%;
}

.container {
    padding: 20px;
}

span.psw {
    float: right;
    padding-top: 16px;
}
@media screen and (max-width: 300px) {
    span.psw {
       display: block;
       float: none;
    }
    
}
.jumbotron{
        margin-bottom: 0px;
        background-position: 50% 50%;
        background-size:cover;
        background-repeat: no-repeat;
        height: 600px;
        width:1350px;
        background-image: url("data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBxATEhUSExIVFRIVEhY");
 }
</style>
<body class="jumbotron">
<center><b><h1></h1></b></center>
<center>
<form action="servlet1" method="post">
<div class="container">
<center>
<label> Select Type:</label>
 <select name="admin" id="admin">
      
       <option  value="view">View authendication</option>
        <option  name="edit" value="edit">Edit authendication</option>
       </select><br/>
  
 <label>Name:</label><input type="text" name="name"/><br/>  
<label>Password:</label><input type="password" name="password"/><br/>  
  
<input type="submit" value="login">  
</div>
</form>
</center>
    </body>
  
</html>
```
___
## 5.Eventlist.jsp :
```sh
<html>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
    .jumbotron{
      
        
        margin-bottom: 0px;

        background-position: 50% 50%;
        background-size:cover;
        background-repeat: no-repeat;
        height: 600px;
        width:1350px;

    }
    .headingdiv
    {
        height:120px;
        width:1300;
        background-color: white;
        margin-left: 20px;
        margin-right:30px;
         color:white;
      
        background-image: url("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQNV43tmp1xqWfrSXukpJrBadhz_XZY3dNcIJFFwpifC16r4xwNYg");
    }
    .but
    {
      margin-left:1200px;
    }
    h1{
       
    }
    </style>
     <body class="jumbotron">
      
          <div class="headingdiv">
           
            <center><h1>Event Lists</h1></center>
            <form action="logoutpage" method="post"><button  class="btn btn-info but" name="button" align="left" >Logout</button></form>
        </div>
        <br>
        <br>
    <div class="container">
  <div class="row">
    <div class="col-sm-4">
      <div class="thumbnail">
        <a href="/w3images/lights.jpg" target="_blank"></a>
          <img src="https://i1.wp.com/krazytech.com/wp-content/uploads/Latest-Technical-Paper-Presentation-Topics-1.jpg?fit=210%2C193&ssl=1" alt="Lights" style="width:100%">
          <div class="caption">
            <p color="green">Paper Presentation</p>
            <P>Time:10:00 AM</P>
          </div>
        
      </div>
      
    </div>
    <div class="col-sm-4">
       <div class="thumbnail">
        <a href="/w3images/lights.jpg" target="_blank">
          <img src="https://image.shutterstock.com/display_pic_with_logo/166705240/634574171/stock-photo-software-source-code-programming-code-programming-code-on-computer-screen-developer-working-on-634574171.jpg" alt="Lights" style="width:100%">
          <div class="caption">
            <p>Bug Blaster</p>
            <p>Time : 11:00 AM</p>
          </div>
        </a>
      </div>
    </div>
    <div class="col-sm-4">
       <div class="thumbnail">
        <a href="/w3images/lights.jpg" target="_blank">
          <img src="data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBxM" alt="Lights" style="width:100%">
          <div class="caption">
            <p>Treasure Hunt</p>
            <p>Time: 11:30 AM</p>
          </div>
        </a>
      </div>
    </div>
  </div>
</div>
 <div class="row">
      <div class="col-sm-2">
      </div>
    <div class="col-sm-4">
      <div class="thumbnail">
        <a href="/w3images/lights.jpg" target="_blank">
          <img src="https://cdn-attachments.timesofmalta.com/life-features_01_temp-1315292894-4e65c6de-620x348.jpg" alt="Lights" style="width:100%">
          <div class="caption">
            <p>vegetable Carving</p>
            <p>Time 1:00 PM</p> 
          </div>
        </a>
      </div>
      
    </div>
      <div class="col-sm-4">
      <div class="thumbnail">
        <a href="/w3images/lights.jpg" target="_blank">
          <img src="http://www.gochengdu.cn/images/cmscontent/chengdu-rock-band-ausra-enyj-1355.jpg" alt="Lights" style="width:100%">
          <div class="caption">
            <p>Let's MocktheBand</p>
            <p> Time: 4:00 PM</p>
          </div>
        </a>
      </div>
      
    </div>
     <div class="col-sm-2">
      </div>
 </div>
 <form action="index.jsp" method="post">
           <center><button type="submit" class="btn btn-success" >Register</button>
           
        </form>
    </body></html>
```
___
## 6.index.jsp
```sh
<%@ page import="java.sql.*" %>
<html>
  <style>
        table{
            padding: 10px;
            border-spacing:15px;
            border-style:solid;
            border-color: black;
        }
        h1
        {
            font: bold;
            color:white;
        }
       body {
    color:white;
    background-color:mediumpurple;
 background-image: url("http://media.istockphoto.com/photos/perfect-wood-planks-background-picture-id523584249?k=6&m=523584249&s=612x612&w=0&h=733mmrl5yJ3wMbiSFiTCRwDq5Mth-sUeDcRVAn8Qakw=");
   
}
</style>
        <script>
            function validate()
            {
                var email=document.myform.email.value;
                var atposition=email.indexOf("@");
                var dotposition=email.indexOf(".");
                if (atposition<1 || dotposition<atposition+5|| dotposition+2>=x.length)
                {
                    alert("please enter valid email");
                }
                return false;
            }
            
    function myFunction() {

    var x = document.getElementById("content");
    x.disabled = true;

}
</script>
<body  >
    <br><br>
<center><h1>EVENT DETAILS</h1>
<form  name="myform"method="POST" action="mainservlet"  enctype="multipart/form-data">
 <table color="cornflowerblue">
      <tr>
     <td>  StudentID :</td>
     <td><input type="text" name="studentid"></td>
     </tr>
     <tr>
     <td>  FirstName :</td>
     <td><input type="text" name="fname"></td>
     </tr>
     <tr>
         <td> LastName:</td>
   <td><input type="text" name="lname"></td>
   </tr>
    <tr>
         <td> Email :</td>
   <td><input type="text" name="email"></td>
   </tr>
    <tr>
         <td> Date:</td>
   <td><input type="Date" name="date"></td>
   </tr>
    <tr>
         <td> Time :</td>
   <td><input type="Time" name="time"></td>
   </tr>
   <tr>
         <td> Topic:</td>
   <td><input type="text" name="topic"></td>
   </tr>
   <tr>
         <td> Location:</td>
   <td><input type="text" name="location"></td>
   </tr>
   <tr>
       <td>
   FILENAME:</td><td><input type="text" name="filename"></td></tr>
   <tr><td>UPLOAD FILE:</td><td><input type="file" name="content"></td></tr>
   </table>
<br>
<br>
    <center>
                <input type="submit" name="HelloWorld" value="Submit" onclick="myFunction()"> &nbsp;&nbsp;&nbsp;&nbsp;
                </center>
</form>
</body>
</html>
```
___
## 7.Adminviewlist.jsp
```sh
<html>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <head>
    </head>
    <style>
     .jumbotron{
        margin-bottom: 0px;
        background-image: url("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQw0X77IggJxqeTQWL_vInDIFCS5tJnA12q6hQqQWGuzRYf-dnL");
        background-position: 50% 50%;
        background-size:cover;
        background-repeat: no-repeat;
        height: 600px;
        width:1350px;

    }
    </style>
    <body class="jumbotron"><center>
        <form action="Eventwisedetails" method="Post">
        <button type="submit" name="ppt" class="btn btn-info" >Paper Presentation</button>&nbsp;&nbsp;&nbsp;&nbsp;<br><br><br><br><br>
        <button type="submit" name="bb"  class="btn btn-info">Bug Blaster</button>&nbsp;&nbsp;&nbsp;&nbsp;<br><br><br><br><br>
        <button type="submit" name="th"  class="btn btn-info">Treasure Hunt</button>&nbsp;&nbsp;&nbsp;&nbsp;<br><br><br><br><br>
        <button type="submit" name="vc"  class="btn btn-info">Vegetable Carving</button>&nbsp;&nbsp;&nbsp;&nbsp;<br><br><br><br><br>
        <button type="submit" name="band"  class="btn btn-info">Let's MocktheBand</button>&nbsp;&nbsp;&nbsp;&nbsp;<br><br><br><br><br>
        </center>
       </form>
        </body>
        </html>
```
___
### JAVA

___


## 1.Pojoevent.java:


```sh
  public class Pojoevent
{
    public String id,firstname,lastname,email,time,topic,location,date;
   
    public void setId(String id)
    {
        this.id=id;
 }
    public String getId()
    {
        return id;
    }
    public void setFname(String firstname)
    {
        this.firstname=firstname;

    }

    public String getFname()
    {
        return firstname;
    }
    public void setLname(String lastname)
    {
        this.lastname=lastname;
    }
    public String getLname()
    {
        return lastname;
    }
     public void setEmail(String email)
    {
        this.email=email;
    }
    public String getEmail()
    {
        return email;
    }
    public void setDate(String date)
    {
        this.date=date;
    }
    public String getDate()
    {
        return date;
    }
    public void setTopic(String topic)
    {
        this.topic=topic;
    }
    public String getTopic()
    {
        return topic;
    }
     public void setTime(String time)
    {
        this.time=time;
    }
    public String getTime()
    {
        return time;
    }
    public void setLocation(String location)
    {
        this.location=location;
    }
    public String getLocation()
    {
        return location;
    }
}
```
___


## 2.Pojologin.java


```sh
  public class Pojologin
{   
    String email,password;
    public void setEmail(String email)
    {
        this.email=email;
    }
    public String getEmail()
    {
        return email;
    }
    public void setPassword(String password)
    {
        this.password=password;
    }
    public String getPassword()
    {
        return password;
    }
} 
```

___


## 3.Checklogin.java


```sh
import java.io.IOException; 
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.net.ssl.ExtendedSSLSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.*;
import java.net.Authenticator;
import java.util.*; 
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.http.HttpSession;  
@WebServlet("/Checklogin")
public class Checklogin extends HttpServlet
 {
  public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException
       {
         response.setContentType("text/html");
            PrintWriter out = response.getWriter();
      String email=request.getParameter("email");
      String password=request.getParameter("password");
      try{
        Pojologin s=Logindbconnection.check(email,password);  
        if(email.equals(s.getEmail()) && password.equals(s.getPassword())){
                    out.print("Welcome, "+s.getEmail());  
        HttpSession session=request.getSession();  
        session.setAttribute("name",s.getEmail()); 
          
                   request.getRequestDispatcher("Eventlist.jsp").include(request, response);  
        }
        else{
             out.print("Sorry!!! Ur Login Failed...!!!!! ");  
        } 
 }
      catch(Exception e)
      {
          e.printStackTrace();
      }
    }

 }
```

___


## 4.mainservlet.java


```sh

import java.io.IOException; 
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.*;
import java.net.Authenticator;
import java.util.*; 

@WebServlet("/mainservlet")
@MultipartConfig(location="C://TEMP")
public class mainservlet extends HttpServlet {
    private String message,message1,message3,jid,jfname,jlname,jemail,jdate,jtime,jtopic,jlocation,fname;
    mainservlet javaEmail = null;
String ffname="deep";

 public void init() throws ServletException { 

   }
     public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException
       {
        
           response.setContentType("text/html");
            PrintWriter out = response.getWriter();
      String id=request.getParameter("studentid");
      String fname=request.getParameter("fname");
      String lname=request.getParameter("lname");
      String email=request.getParameter("email");
      String date=request.getParameter("date");
      String time=request.getParameter("time");
      String topic=request.getParameter("topic");
      String location=request.getParameter("location");
         Pojoevent po=new Pojoevent();
                   po.setId(id);
                   po.setFname(fname);
                   po.setLname(lname);
                   po.setEmail(email);
                   po.setDate(date);
                   po.setTime(time);
                   po.setTopic(topic);
                   po.setLocation(location);
         int status=DBconnection.save1(po); 
           
        if(status>0){  
            out.print("<p>Record saved successfully!</p>");  
            request.getRequestDispatcher("index.jsp").include(request, response);  
        }else{  
            out.println("Sorry! unable to save record");  
        }  
          
        out.close();  
        response.setContentType("text/html;charset=UTF-8");
              
        String toMail = request.getParameter("email");
        String filename=request.getParameter("filename");
        request.getPart("content").write("C://TEMP/"+filename+".txt");
         if(request.getPart("content") !=null){
        	out.write("<h3>File uploaded successfully</h3>");}
     
    
        try {
           mainservlet javaEmail = new mainservlet();
         final String username = "deepika.m@kggroup.com";
final String password = "Deepika123$";
Properties props = new Properties();
props.put("mail.smtp.auth", "true");
props.put("mail.smtp.starttls.enable", "false");
props.put("mail.smtp.host", "webmail.kggroup.com");
props.put("mail.smtp.port", "25");
Session session = Session.getInstance(props,
new javax.mail.Authenticator() {
protected PasswordAuthentication getPasswordAuthentication() {
return new PasswordAuthentication(username, password);
}
});
try {
Message message = new MimeMessage(session);
message.setFrom(new InternetAddress("deepika.m@kggroup.com"));
message.setRecipients(Message.RecipientType.TO,
InternetAddress.parse(toMail));

message.setSubject("Event registration successful");
message.setText("Dear Mail Crawler,"
+ "\n\n No spam to my email, please!");
message.setText("<h1>firstname</h1>");
message.setContent("<h1 color='red'> Hi Mr/Mrs."+fname+".Thanks For Registration<h1><br>Event Details :<br><h3>Date:"+date+"<br>Time :"+time+"<br>Topic :"+topic+"<br>Location:"+location+"</h3>","text/html");
Transport.send(message);

System.out.println("Done");
}
catch (MessagingException e) 
{
throw new RuntimeException(e);
}
out.println("Process Completed\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
        out.println("event registered successfully");
         }
     }
```
___


## 5.Logindbconnection.java


```sh
import java.util.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class Logindbconnection
{
public static Connection getConnection(){  
        Connection con=null;  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eventmanagementsystem", "root", "");  
        }
        catch(Exception e)
        {System.out.println(e);}  
        return con;  
    } 
    public static int loginsave(Pojologin po)
 {  int status=0; 
      try{  
      Connection con=DBconnection.getConnection();  
      PreparedStatement pre=con.prepareStatement("insert into logintable values(?,?)") ; 
             
               pre.setString(1, po.getEmail());
              pre.setString(2, po.getPassword()); 
               status=pre.executeUpdate();
                   con.close();  
        }
        catch(Exception ex)
        {ex.printStackTrace(); }  
          
        return status;  
    }
    public static Pojologin check(String email,String password)
    {
    Pojologin s=new Pojologin();  
          
        try{  
            Connection con=DBconnection.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from logintable where email=? and password=?"); 
            ps.setString(1,email);
            ps.setString(2, password);
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
               
                s.setEmail(rs.getString(1));  
                s.setPassword(rs.getString(2));  
               }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return s;  
    }    
}
```

___


## 6.DBconnection.java
```sh
import java.util.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class DBconnection
{
public static Connection getConnection(){  
        Connection con=null;  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eventmanagementsystem", "root", "");  
        }catch(Exception e){System.out.println(e);}  
        return con;  
    }  

 public static int save1(Pojoevent po)
 {  int status=0; 
      try{  
      Connection con=DBconnection.getConnection();  
      PreparedStatement pre=con.prepareStatement("insert into eventtable values(?,?,?,?,?,?,?,?)") ; 
             
               pre.setString(1, po.getId());
              pre.setString(2, po.getFname());
               pre.setString(3, po.getLname());
                pre.setString(4, po.getEmail());
                 pre.setString(5, po.getDate());
                  pre.setString(6, po.getTime());
                   pre.setString(7, po.getTopic());
                    pre.setString(8, po.getLocation());
                   status=pre.executeUpdate();
                   con.close();  
        }catch(Exception ex){ex.printStackTrace();
        }  
          
        return status;  
                   
 }
 public static List<Pojoevent> getAllEmployees(){  
        List<Pojoevent> list=new ArrayList<Pojoevent>();  
          
        try{  
            Connection con=DBconnection.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from eventtable");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Pojoevent e=new Pojoevent();  
                e.setId(rs.getString(1));  
                e.setFname(rs.getString(2));  
                e.setLname(rs.getString(3));  
                e.setEmail(rs.getString(4));  
                e.setDate(rs.getString(5));
                e.setTime(rs.getString(6)); 
                e.setTopic(rs.getString(7));
                e.setLocation(rs.getString(8)); 
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }  
    public static Pojoevent getEmployeeById(String id){  
        Pojoevent e=new Pojoevent();  
          
        try{  
            Connection con=DBconnection.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from eventtable where studentid=?");  
            ps.setString(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
               e.setId(rs.getString(1));  
                e.setFname(rs.getString(2));  
                e.setLname(rs.getString(3));  
                e.setEmail(rs.getString(4));  
                e.setDate(rs.getString(5));
                e.setTime(rs.getString(6)); 
                e.setTopic(rs.getString(7));
                e.setLocation(rs.getString(8)); 
            
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return e;  
    }  
    public static int update(Pojoevent e){  
        int status=0;  
        try{  
            Connection con=DBconnection.getConnection();  
            PreparedStatement ps=con.prepareStatement("update eventtable set firstname=?,lastname=?,email=?,date=?,time=?,topic=?,location=? where studentid=?") ; 
           
             
              ps.setString(1, e.getFname());
               ps.setString(2, e.getLname());
                ps.setString(3, e.getEmail());
                 ps.setString(4, e.getDate());
                  ps.setString(5, e.getTime());
                   ps.setString(6, e.getTopic());
                    ps.setString(7, e.getLocation());
                     ps.setString(8, e.getId());
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  

 public static int delete(String id){  
        int status=0;  
        try{  
            Connection con=DBconnection.getConnection();  
            PreparedStatement ps=con.prepareStatement("delete from eventtable where studentid=?");  
            ps.setString(1,id);  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    }  
  public static List<Pojoevent> paperpresentation(){  
        List<Pojoevent> list=new ArrayList<Pojoevent>();  
          
        try{  
            Connection con=DBconnection.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from eventtable where topic='paperpresentation'");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Pojoevent e=new Pojoevent();  
                e.setId(rs.getString(1));  
                e.setFname(rs.getString(2));  
                e.setLname(rs.getString(3));  
                e.setEmail(rs.getString(4));  
                e.setDate(rs.getString(5));
                e.setTime(rs.getString(6)); 
                e.setTopic(rs.getString(7));
                e.setLocation(rs.getString(8)); 
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }  
    public static List<Pojoevent> bugbluster(){  
        List<Pojoevent> list=new ArrayList<Pojoevent>();  
          
        try{  
            Connection con=DBconnection.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from eventtable where topic='bugblaster'");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Pojoevent e=new Pojoevent();  
                e.setId(rs.getString(1));  
                e.setFname(rs.getString(2));  
                e.setLname(rs.getString(3));  
                e.setEmail(rs.getString(4));  
                e.setDate(rs.getString(5));
                e.setTime(rs.getString(6)); 
                e.setTopic(rs.getString(7));
                e.setLocation(rs.getString(8)); 
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }  
   public static List<Pojoevent> treasure(){  
        List<Pojoevent> list=new ArrayList<Pojoevent>();  
          
        try{  
            Connection con=DBconnection.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from eventtable where topic='treasurhunt'");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Pojoevent e=new Pojoevent();  
                e.setId(rs.getString(1));  
                e.setFname(rs.getString(2));  
                e.setLname(rs.getString(3));  
                e.setEmail(rs.getString(4));  
                e.setDate(rs.getString(5));
                e.setTime(rs.getString(6)); 
                e.setTopic(rs.getString(7));
                e.setLocation(rs.getString(8)); 
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }
    public static List<Pojoevent> carving(){  
        List<Pojoevent> list=new ArrayList<Pojoevent>();  
          
        try{  
            Connection con=DBconnection.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from eventtable where topic='vegetable carving'");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Pojoevent e=new Pojoevent();  
                e.setId(rs.getString(1));  
                e.setFname(rs.getString(2));  
                e.setLname(rs.getString(3));  
                e.setEmail(rs.getString(4));  
                e.setDate(rs.getString(5));
                e.setTime(rs.getString(6)); 
                e.setTopic(rs.getString(7));
                e.setLocation(rs.getString(8)); 
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }  
    public static List<Pojoevent> band(){  
        List<Pojoevent> list=new ArrayList<Pojoevent>();  
          
        try{  
            Connection con=DBconnection.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from eventtable where topic='music band'");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Pojoevent e=new Pojoevent();  
                e.setId(rs.getString(1));  
                e.setFname(rs.getString(2));  
                e.setLname(rs.getString(3));  
                e.setEmail(rs.getString(4));  
                e.setDate(rs.getString(5));
                e.setTime(rs.getString(6)); 
                e.setTopic(rs.getString(7));
                e.setLocation(rs.getString(8)); 
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }    
}
```

___


## 7.Deletedetails.java:


```sh
import java.io.IOException;  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/Deletedetails")  
public class Deletedetails extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
             throws ServletException, IOException {  
        String sid=request.getParameter("id");   
        DBconnection.delete(sid);  
        response.sendRedirect("Viewdetails");  
    }  
}     
```

___


## 8.Editdetails.java :


```sh
  import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/Editdetails")  
public class Editdetails extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
           throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        out.println("<h1>Update Employee</h1>");  
        String sid=request.getParameter("id");  
       // int id=Integer.parseInt(sid);  
          
        Pojoevent e=DBconnection.getEmployeeById(sid);  
          
        out.print("<form action='Editdetails2' method='post'>");  
        out.print("<table color='cornflowerblue'>");  
        out.print("<tr><td></td><td><input type='hidden' name='id' value='"+e.getId()+"'/></td></tr>");  
        out.print("<tr><td>FirstName:</td><td><input type='text' name='fname' value='"+e.getFname()+"'/></td></tr>");  
        out.print("<tr><td>LastName:</td><td><input type='text' name='lname' value='"+e.getLname()+"'/></td></tr>");  
        out.print("<tr><td>Email:</td><td><input type='email' name='email' value='"+e.getEmail()+"'/></td></tr>");  
         out.print("<tr><td>Date:</td><td><input type='Date' name='date' value='"+e.getDate()+"'/></td></tr>");  
          out.print("<tr><td>Time:</td><td><input type='Time' name='time' value='"+e.getTime()+"'/></td></tr>");  
           out.print("<tr><td>Topic:</td><td><input type='text' name='topic' value='"+e.getTopic()+"'/></td></tr>");  
            out.print("<tr><td>Location:</td><td><input type='text' name='location' value='"+e.getLocation()+"'/></td></tr>");  
      
        out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");  
        out.print("</table>");  
        out.print("</form>");  
          
        out.close();  
    }  
}  
```

___


## 9.Editdetails2.java :


```sh
 import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/Editdetails2")  
public class Editdetails2 extends HttpServlet {  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)   
          throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        String id=request.getParameter("id");
      String fname=request.getParameter("fname");
      String lname=request.getParameter("lname");
      String email=request.getParameter("email");
      String date=request.getParameter("date");
      String time=request.getParameter("time");
      String topic=request.getParameter("topic");
      String location=request.getParameter("location");
          
        Pojoevent po=new Pojoevent();
                   po.setId(id);
                   po.setFname(fname);
                   po.setLname(lname);
                   po.setEmail(email);
                   po.setDate(date);
                   po.setTime(time);
                   po.setTopic(topic);
          
                   po.setLocation(location);
        int status=DBconnection.update(po);  
        if(status>0){  
            response.sendRedirect("Viewdetails");  
        }else{  
            out.println("Sorry! unable to update record");  
        }  
          
        out.close();  
    }  
  
}  
```

___


## 10.Logindetails.java


```sh
 import java.io.IOException; 
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.*;
import java.net.Authenticator;
import java.util.*; 

@WebServlet("/Logindetails")
public class Logindetails extends HttpServlet {
    String email,password;
     public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException
       {
        
           response.setContentType("text/html");
            PrintWriter out = response.getWriter();
       email=request.getParameter("email");
      password=request.getParameter("password");
      Pojologin lo=new Pojologin();
     lo.setEmail(email);
     lo.setPassword(password);
      int s=Logindbconnection.loginsave(lo);
         if(s>0){  
            out.print("<p>Login Successfully</p>");  
            request.getRequestDispatcher("Eventlist.jsp").include(request, response);  
        }else{  
            out.println("Sorry! ");  
        }  
          
        out.close();  
 }
}
```

___


## 11.Logoutpage.java 


```sh
import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
@WebServlet("/logoutpage")
public class logoutpage extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession(false);
		
		session.removeAttribute("email");
		
        request.getRequestDispatcher("Alreadylogin.jsp").include(request, response);  
        
	}
}
  
```

___


## 12.MyFilter.java :


```sh
import java.io.IOException;  
import java.io.PrintWriter;  
import javax.servlet.Filter;
import javax.servlet.*;  
   import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
      
   import javax.servlet.http.HttpSession; 
 public class MyFilter implements Filter {
   
  
public void init(FilterConfig arg) throws ServletException {}  
      
public void doFilter(ServletRequest request, ServletResponse response,  
        FilterChain chain) throws IOException, ServletException {  
          
    PrintWriter out=response.getWriter();  
 
 HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response; 
     String se=request.getParameter("admin");
     String name=request.getParameter("name");
    
    String password=request.getParameter("password");  
    if(password.equals("123") && se.equals("edit") )
    {  
       
    chain.doFilter(request, response);
}
else if(password.equals("456") && se.equals("view")){
  
      RequestDispatcher rd=request.getRequestDispatcher("/Adminviewlist.jsp");  
       rd.include(request, response);  
}
    
    else{  
    out.print("username or password error!");  
    
    }  
          
}  
    public void destroy() {}  
  
}  
```


___


## 13.Adminservlet.java


```sh
 import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class AdminServlet extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
          
        out.print("welcome ADMIN view"); 
        response.sendRedirect("Viewdetails"); 
        out.close();  
    }  
}  
```

___
## 14.Viewdetails.java


```sh
 import java.io.IOException;  
import java.io.PrintWriter;  
import java.util.List;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse; 
import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
   
@WebServlet("/Viewdetails")  
public class Viewdetails extends HttpServlet {  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)   
               throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        out.println("<a href='index.jsp'>Add New Event</a>");  
        out.println("<h1>Event List </h1>");  
          
        List<Pojoevent> list=DBconnection.getAllEmployees();  
          
        out.print("<table border='1' width='100%'");  
        out.print("<tr><th>StudentId</th><th>FirstName</th><th>Lastname</th><th>Email</th><th>Date</th><th>time</th><th>topic</th><th>location</th><th>Edit</th><th>Delete</th></tr>");  
        for(Pojoevent e:list){  
         out.print("<tr><td>"+e.getId()+"</td><td>"+e.getFname()+"</td><td>"+e.getLname()+"</td> <td>"+e.getEmail()+"</td><td>"+e.getDate()+"</td><td>"+e.getTime()+"</td> <td>"+e.getTopic()+"</td><td>"+e.getLocation()+"</td>"+
                " <td><a href='Editdetails?id="+e.getId()+"'>edit</a></td> " +
                " <td><a href='Deletedetails?id="+e.getId()+"'>delete</a></td></tr>");  
        }  
        out.print("</table>");  
          
        out.close();  
    }  
}  
```

___

## 15.Eventwisedetails.java


```sh
import java.io.IOException;  
import java.io.PrintWriter;  
import java.util.List;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/Eventwisedetails")  
public class Eventwisedetails extends HttpServlet {  

    protected void doPost(HttpServletRequest request, HttpServletResponse response)   
               throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        //out.println("<a href='index.jsp'>Add New Event</a>");  
        if (request.getParameter("ppt") != null)
        {
        out.println("<h1>Event List </h1>"); 

          
        List<Pojoevent> list=DBconnection.paperpresentation();  
          
        out.print("<table border='1' width='100%'");  
        out.print("<tr><th>StudentId</th><th>FirstName</th><th>Lastname</th><th>Email</th><th>Date</th><th>time</th><th>topic</th><th>location</th></tr>");  
        for(Pojoevent e:list){  
         out.print("<tr><td>"+e.getId()+"</td><td>"+e.getFname()+"</td><td>"+e.getLname()+"</td> <td>"+e.getEmail()+"</td><td>"+e.getDate()+"</td><td>"+e.getTime()+"</td> <td>"+e.getTopic()+"</td><td>"+e.getLocation()+"</td>  </tr>");  
        }  
        out.print("</table>");  
          
        out.close();  
    }  
    if(request.getParameter("bb")!=null)
    {
         out.println("<h1>Bug Blaster</h1>"); 

          
        List<Pojoevent> list=DBconnection.bugbluster();  
          
        out.print("<table border='1' width='100%'");  
        out.print("<tr><th>StudentId</th><th>FirstName</th><th>Lastname</th><th>Email</th><th>Date</th><th>time</th><th>topic</th><th>location</th></tr>");  
        for(Pojoevent e:list){  
         out.print("<tr><td>"+e.getId()+"</td><td>"+e.getFname()+"</td><td>"+e.getLname()+"</td> <td>"+e.getEmail()+"</td><td>"+e.getDate()+"</td><td>"+e.getTime()+"</td> <td>"+e.getTopic()+"</td><td>"+e.getLocation()+"</td></tr>");  
        }  
        out.print("</table>");  
          
        out.close();  
        
    }
     if(request.getParameter("th")!=null)
    {
         out.println("<h1>Treasure Hunt</h1>"); 

          
        List<Pojoevent> list=DBconnection.treasure();  
          
        out.print("<table border='1' width='100%'");  
        out.print("<tr><th>StudentId</th><th>FirstName</th><th>Lastname</th><th>Email</th><th>Date</th><th>time</th><th>topic</th><th>location</th></tr>");  
        for(Pojoevent e:list){  
         out.print("<tr><td>"+e.getId()+"</td><td>"+e.getFname()+"</td><td>"+e.getLname()+"</td> <td>"+e.getEmail()+"</td><td>"+e.getDate()+"</td><td>"+e.getTime()+"</td> <td>"+e.getTopic()+"</td><td>"+e.getLocation()+"</td></tr>");  
        }  
        out.print("</table>");  
          
        out.close();  
        
    }
    if(request.getParameter("vc")!=null)
    {
         out.println("<h1>vegetable Carving</h1>"); 

          
        List<Pojoevent> list=DBconnection.carving();  
          
        out.print("<table border='1' width='100%'");  
        out.print("<tr><th>StudentId</th><th>FirstName</th><th>Lastname</th><th>Email</th><th>Date</th><th>time</th><th>topic</th><th>location</th></tr>");  
        for(Pojoevent e:list){  
         out.print("<tr><td>"+e.getId()+"</td><td>"+e.getFname()+"</td><td>"+e.getLname()+"</td> <td>"+e.getEmail()+"</td><td>"+e.getDate()+"</td><td>"+e.getTime()+"</td> <td>"+e.getTopic()+"</td><td>"+e.getLocation()+"</td></tr>");  
        }  
        out.print("</table>");  
          
        out.close();  
        
    }
    if(request.getParameter("band")!=null)
    {
         out.println("<h1>Let's MocktheBand</h1>"); 

          
        List<Pojoevent> list=DBconnection.band();  
          
        out.print("<table border='1' width='100%'");  
        out.print("<tr><th>StudentId</th><th>FirstName</th><th>Lastname</th><th>Email</th><th>Date</th><th>time</th><th>topic</th><th>location</th><th>Edit</th><th>Delete</th></tr>");  
        for(Pojoevent e:list){  
         out.print("<tr><td>"+e.getId()+"</td><td>"+e.getFname()+"</td><td>"+e.getLname()+"</td> <td>"+e.getEmail()+"</td><td>"+e.getDate()+"</td><td>"+e.getTime()+"</td> <td>"+e.getTopic()+"</td><td>"+e.getLocation()+"</td</tr>");  
        }  
        out.print("</table>");  
          
        out.close();  
        
    }
}  
}
```
___

## Screen Shots:
## Welcome page:
![alt text](https://raw.githubusercontent.com/deepikamurugesank/EventManagementSystem/master/screenshots/welcomepage.png "Logo Title Text 1")

___
___

## Signup page:
![alt text](https://raw.githubusercontent.com/deepikamurugesank/EventManagementSystem/master/screenshots/signuppage.png "Logo Title Text 1")

___
___


## Signin page:
![alt text](https://raw.githubusercontent.com/deepikamurugesank/EventManagementSystem/master/screenshots/signinpage.png "Logo Title Text 1")

___
___


## Eventlist page:
![alt text](https://raw.githubusercontent.com/deepikamurugesank/EventManagementSystem/master/screenshots/signinnextpage.png "Logo Title Text 1")

![alt text](https://raw.githubusercontent.com/deepikamurugesank/EventManagementSystem/master/screenshots/signincontin.png "Logo Title Text 1")


___
___



## Registration page:
![alt text](https://github.com/deepikamurugesank/EventManagementSystem/blob/master/screenshots/registrationpage.png?raw=true "Logo Title Text 1")


___
___



## Adminfront Page :
![alt text](https://raw.githubusercontent.com/deepikamurugesank/EventManagementSystem/master/screenshots/adminfront.png "Logo Title Text 1")


___
___


## View Authendication page :
![alt text](https://github.com/deepikamurugesank/EventManagementSystem/blob/master/screenshots/viewauthendicate.png?raw=true "Logo Title Text 1")

___
___


## Ex(Paper Presentation Page) :
![alt text](https://github.com/deepikamurugesank/EventManagementSystem/blob/master/screenshots/paperpresentation.png?raw=true "Logo Title Text 1")

___
___


## Edit Authendication page :
![alt text](https://github.com/deepikamurugesank/EventManagementSystem/blob/master/screenshots/editauthen.png?raw=true "Logo Title Text 1")

___
___


## Edit & Delete Operation :
![alt text](https://github.com/deepikamurugesank/EventManagementSystem/blob/master/screenshots/editdeletepage.png?raw=true "Logo Title Text 1")

___
___



## Update page :
![alt text](https://raw.githubusercontent.com/deepikamurugesank/EventManagementSystem/master/screenshots/updatepage.png "Logo Title Text 1")

___
___


## Future Enhancements:
___


* Dropdown list(registration page) 

* Create group mail instruction

* make more links to see views and understandable. 




 



