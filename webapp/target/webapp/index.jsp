<%@ page import="java.sql.*" %>
<html>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
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
            color:black;
        }
       body {
    
    background-color: darkgray;
   
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
            </script>

<body  >
    <br><br>
<center><h1>EVENT DETAILS</h1>
<form  name="myform"method="POST" action="mainservlet">
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
   </table>
<br>
<br>
    <center>
                <input type="submit" name="HelloWorld" value="Submit" > &nbsp;&nbsp;&nbsp;&nbsp;
      
                <input type="submit" name="update" value="Update" >&nbsp;&nbsp;&nbsp;&nbsp;
                <input type="submit" name="Delete" value="Delete"> &nbsp;&nbsp;&nbsp;&nbsp;
                
     
       </center>
        
 </form>
</body>
</html>




<!--<html>
    <head>
        <title>admin page
        </title>
    </head>
    <body>
<center><b><h1></h1></b></center>
<form action="mainservlet" method="post">
<fieldset>
    <label>USERNAME:</label> 
    <label><input type="text" name="username"></label><br>
    <label>PASSWORD:</label> 
    <label><input type="password" name="password"></label><br>
    <label><input type="submit" name="Submit" value="login">
    </label>
</fieldset> 
</form>
 </body>
</html>-->
<!--<html>
    <head>
    </head><body>
        <form action="main" method="post">
        <fieldset>
    <label>USERNAME:</label> 
    <label><input type="text" name="email"></label><br>
    
    <label><input type="submit" name="Submit" value="login"></label>
        </fieldset>
        </form>
        </body>
</html>-->