
	
/*
 An Applet to display an image
 
*/
 
 
import java.applet.*;
import java.awt.*;
import java.awt.Image;
 
/* 
 <applet code ="ImageApplet" width = 600 height = 400>
 <param name = "1" value = "light.jpg">
 </applet>
*/
 
public class ImageApplet extends Applet
{
 Image img1, img2;
 
 public void init(){

 System.out.println("Applet has initialised"); 
 img1 = getImage(getDocumentBase(), getParameter("1"));
 }
public void start()
{
System.out.println("Applet has started"); 
}
public void stop()
{
System.out.println("Applet execution stopped"); 
}
 
 
 public void paint(Graphics g){
 
 //display an image using drwaImage method of Graphics class.
 g.drawImage(img1, 0,0,this);

 }
public void destroy()
{
System.out.println("Applet has been destroyed"); 
}
 
 
}
