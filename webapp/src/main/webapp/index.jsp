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






