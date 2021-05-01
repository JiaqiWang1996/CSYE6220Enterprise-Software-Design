<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Registration Form</title>
</head>
<body>
<form action="show.jsp" method="post">
  Email: <input type="email" name="email"/>
  <br/>

  Password: <input type="password" name="password"/>
  <br/>

  Confirm Password: <input type="password" name="conpassword"/>
  <br/>

  Upload Your Picture:
  <%--    <input type="text">--%>
  <input type="file" name="picture"/>
  <br/>

  Gender:
  <input type="radio" name="gender" value="male"/>
  <label>Male</label>

  <input type="radio" name="gender" value="female"/>
  <label>Female</label>
  <br/>

  Select Country:
  <select name="country">
     <option>United Kingdom</option>
                            <option>China</option>
                            <option>Japan</option>
                            <option>Korea</option>
                            <option>USA</option>
  </select>
  <br/>

  Hobby:
  <input type="checkbox" name="hobby" value="Cricket">
  <label>Cricket</label>

  <input type="checkbox" name="hobby" value="Football">
  <label>Football</label>
  <br/>

  Address:
  <textarea name="address"></textarea>
  <br/>
  <input type="submit" value="Submit"/>

</form>
</body>
</html>

