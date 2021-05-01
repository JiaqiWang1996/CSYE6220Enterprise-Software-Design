<%@page session="true"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div>Question 2</div>
          <form action="quizservlet" method="post">
            <h2>Q1:Which set class will be most popular in a multi-thread environment?</h2>
            <input type="radio" name="question" value="a"> Hashset<br/>
        <input type="radio" name="question" value="b">LinkedHashset<br/>
        <input type="radio" name="question" value="c">CopyOnWriteArraySet<br/>
        <input type="radio" name="question" value="d">ConcurrentSkipListSet<br/>
        <input type="hidden" name="qn" value="2">//indicate the question submitted
        <input type="submit" value="Submit Answer"/>
        </form>
    </body>
</html>
