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
  <body bgcolor=yellow>
  <form action="Check" method="post">
  <pre>
    1.	Which statement is true given the following?
Double d = Math.random();
	 
<input type="radio" name="1" value="a"/>A.	0.0 < d <= 1.0

 
<input type="radio" name="1" value="b"/>B.	0.0 <= d < 1.0

 
<input type="radio" name="1" value="c"/>C.	Compilation fail

 
<input type="radio" name="1" value="d"/>D.	Cannot say.



2.	What will be the output of the program? 
public abstract class AbstractTest 
{
    public int getNum() 
    {
        return 45;
    }
    public abstract class Bar 
    {
        public int getNum() 
        {
            return 38;
        }
    }
    public static void main (String [] args) 
    {
        AbstractTest t = new AbstractTest() 
        {
            public int getNum() 
            {
                return 22;
            }
        };
        AbstractTest.Bar f = t.new Bar() 
        {
            public int getNum() 
            {
                return 57;
            }
        };
        
        System.out.println(f.getNum() + " " + t.getNum());
    }
}
	 
<input type="radio" name="2" value="a"/>A.	57 22

 
<input type="radio" name="2" value="b"/>B.	45 38

 
<input type="radio" name="2" value="c"/>C.	45 57

 
<input type="radio" name="2" value="d"/>D.	An exception occurs at runtime.



3.	What will be the output of the program? 
public class Test 
{  
    public static void main(String args[]) 
    { 
        int i = 1, j = 0; 
        switch(i) 
        { 
            case 2: j += 6; 
            case 4: j += 1; 
            default: j += 2; 
            case 0: j += 4; 
        } 
        System.out.println("j = " + j); 
    } 
}
	 
<input type="radio" name="3" value="a"/>A.	0
	 
<input type="radio" name="3" value="b"/>B.	2

 
<input type="radio" name="3" value="c"/>C.	4
	 
<input type="radio" name="3" value="d"/>D.	6



4.	What will be the output of the program? 
public class If1 
{
    static boolean b;
    public static void main(String [] args) 
    {
        short hand = 42;
        if ( hand < 50 & !b ) /* Line 7 */
            hand++;
        if ( hand > 50 );     /* Line 9 */
        else if ( hand > 40 ) 
        {
            hand += 7;
            hand++;    
        }
        else
            --hand;
        System.out.println(hand);
    }
}
	 
<input type="radio" name="4" value="a"/>A.	41
	 
<input type="radio" name="4" value="b"/>B.	42

 
<input type="radio" name="4" value="c"/>C.	50
	 
<input type="radio" name="4" value="d"/>D.	51



5.	Suppose that you would like to create an instance of a new Map that has an iteration order that is the same as the iteration order of an existing instance of a Map. Which concrete implementation of the Map interface should be used for the new instance?
	 
<input type="radio" name="5" value="a"/>A.	TreeMap

 
<input type="radio" name="5" value="b"/>B.	HashMap

 
<input type="radio" name="5" value="c"/>C.	LinkedHashMap

 
<input type="radio" name="5" value="d"/>D.	The answer depends on the implementation of the existing instance.

                                                        
                                                         <input type="submit" value="submit"/>
</pre>
</form>
  </body>
</html>
