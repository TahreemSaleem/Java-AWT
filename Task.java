/*
<applet code="MoveBall" width=400 height=300>
</applet>
*/

/* Tahreem Saleem BESE-4B  
this is my own work and is not copied from someone else*/ 


import  java.awt.*;
import java.applet.*;

public class MoveBall extends Applet
{
int y=0;
int i=0;
int j=0;
int k=0;
public void init()	{
color =Color.red;	
}


public void paint(Graphics g){
	
g.fillArc(20+y,20,20,20,60,250) ; // first arc moving right
g.setColor(color);
if (y!=380) y+=2;

	if (y==380) 				 // moving down
		{ repaint(5);
			g.fillArc(380,20+i,20,20,320,250) ; 
			
			try{
			Thread.sleep(10);
			}//try ends
			catch(Exception e){}
			repaint(5); 

			if (i!=280) i+=2;
			if (i==280)
			{
				g.fillArc(380-j,280,20,20,240,250) ; //moving left
				try{
				Thread.sleep(5);
				}//if ends
				catch(Exception e){}
				repaint(5); 

				if (j!=400) j+=2;
				if (j==400) 			//moving up
				{

				g.fillArc(0,280-k,20,20,140,250) ;
				try{
				Thread.sleep(5);
				}//try ends
				catch(Exception e){}
				repaint(5); 

				if (k!=280) k+=2;
				}//if ends
			}//if ends
 		}

try{
			Thread.sleep(10);
			}//try ends
catch(Exception e){}
		repaint(10); 



}//paint ends 

}//class ends