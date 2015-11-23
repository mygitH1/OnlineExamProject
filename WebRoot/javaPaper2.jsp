<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'javaPaper2.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <!-- 
 <script> 
function displayResult()
{
var count=0;
var result;
for (var j=1;j<=5;j++)
{
    var radios = document.getElementsByName(""+j+"");

    for (var i = 0; i < radios.length; i++) 
    {       
        if (radios[i].checked) 
        {
        result=result+radios[i].value;
            count++;
            break;
        }
    }
 }
 alert("You answered ======>"+count+" questions");
 
}
 </script>
 
  --> 
  <body BGCOLOR=wheat  >
  <form action="Check" method="post">
  
  <input type='hidden' name='paperId' value="javaPaper2" />
  <pre>
    1.	What will be the output of the program? 
String s = "hello"; 
Object o = s; 
if( o.equals(s) )
{
    System.out.println("A"); 
} 
else
{
    System.out.println("B"); 
} 
if( s.equals(o) )
{
    System.out.println("C"); 
} 
else
{ 
    System.out.println("D"); 
}
1.	A
2.	B
3.	C4.	D
	 
<input type="radio" name="1" value="a"/>A.	1 and 3

 
<input type="radio" name="1" value="b"/>B.	2 and 4

 
<input type="radio" name="1" value="c"/>C.	3 and 4

 
<input type="radio" name="1" value="d"/>D.	1 and 2



2.	What will be the output of the program? 
String s = "ABC"; 
s.toLowerCase(); 
s += "def"; 
System.out.println(s);
	 
<input type="radio" name="2" value="a"/>A.ABC

 
<input type="radio" name="2" value="b"/>B.abc

 
<input type="radio" name="2" value="c"/>C.ABCdef

 
<input type="radio" name="2" value="d"/>D.Compile Error



3.	What will be the output of the program? 
class A 
{ 
    public A(int x){} 
} 
class B extends A { } 
public class test 
{ 
    public static void main (String args []) 
    {
        A a = new B(); 
        System.out.println("complete"); 
    } 
}
	 
<input type="radio" name="3" value="a"/>A.	It compiles and runs printing nothing

 
<input type="radio" name="3" value="b"/>B.	Compiles but fails at runtime

 
<input type="radio" name="3" value="c"/>C.	Compile Error

 
<input type="radio" name="3" value="d"/>D.	Prints "complete"



4.	What will be the output of the program? 
class Q207 
{ 
    public static void main(String[] args) 
    {
        int i1 = 5; 
        int i2 = 6; 
        String s1 = "7"; 
        System.out.println(i1 + i2 + s1); /* Line 8 */
    } 
}
	 
<input type="radio" name="4" value="a"/>A.	18

 
<input type="radio" name="4" value="b"/>B.	117

 
<input type="radio" name="4" value="c"/>C.	567

 
<input type="radio" name="4" value="d"/>D.	Compiler error



5.	public class MyRunnable implements Runnable 
{
    public void run() 
    {
        // some code here
    }
}
which of these will create and start this thread?
	 
<input type="radio" name="5" value="a"/>A.	new Runnable(MyRunnable).start();

 
<input type="radio" name="5" value="b"/>B.	new Thread(MyRunnable).run();

 
<input type="radio" name="5" value="c"/>C.	new Thread(new MyRunnable()).start();

 
<input type="radio" name="5" value="d"/>D.	new MyRunnable().start();
                     
                     
                                         
                                            <input type="submit" value="submit" />
    


</pre>
</form>
  </body>
</html>
