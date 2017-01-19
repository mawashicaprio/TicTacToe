import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
class Tanishk extends MouseAdapter
{	
	int x;int y,flagg,win,chance;
	Frame f;
	
	Button b,b1,b2,bb,b3,b4,b5,b6,b7;
	int flag[]={0,0,0,0,0,0,0,0,0};
	int cl;
	int cross1,oval1,cross2,oval2,cross3,oval3,cross4,oval4,cross5,oval5,cross6,oval6,cross7,oval7,cross8,oval8,cross9,oval9,count;
	JPanel jp,jp1,jp2;
	JTextField jt;
	JButton qb;
	
	Tanishk(String s)
	{
		f=new Frame(s);
		b=new Button();
		b1=new Button();
		b2=new Button();
		bb=new Button();
		b3=new Button();
		b4=new Button();
		b5=new Button();
		b6=new Button();
		b7=new Button();
		//b.setBounds(100,100,100,100);
		//b1.setBounds(200,100,100,100);
		//b2.setBounds(300,100,100,100);
		//bb.setBounds(100,200,100,100);
		//b3.setBounds(200,200,100,100);
		//b4.setBounds(300,200,100,100);
		//b5.setBounds(100,300,100,100);
		//b6.setBounds(200,300,100,100);
		//b7.setBounds(300,300,100,100);
		jp=new JPanel();
		jp1=new JPanel();
		jp2=new JPanel();
		jp.setLayout(new GridLayout(3,3,0,0));
		
		jp.add(b);
		jp.add(b1);
		jp.add(b2);
		jp.add(bb);
		jp.add(b3);
		jp.add(b4);
		jp.add(b5);
		jp.add(b6);
		jp.add(b7);
		
		jt=new JTextField();
		jt.setBounds(10,10,10,10);
		jt.setText("PLAYER 1 v/s PLAYER 2");
		qb=new JButton("CLICK TO CHANGE PLAYER 2 TO COMPUTER");
		qb.setBounds(20,20,300,50);
		
		jp1.add(qb,BorderLayout.NORTH);
		f.add(jt,BorderLayout.NORTH);
		f.add(jp,BorderLayout.CENTER);
		f.add(jp1,BorderLayout.SOUTH);
		
		f.setSize(400,400);
		//f.setSize(600,600);
		f.setVisible(true);
		
		f.addWindowListener(new WindowEventListener());
		b.addMouseListener(this);
		b1.addMouseListener(this);
		b2.addMouseListener(this);
		bb.addMouseListener(this);
		b3.addMouseListener(this);
		b4.addMouseListener(this);
		b5.addMouseListener(this);
		b6.addMouseListener(this);
		b7.addMouseListener(this);
		qb.addMouseListener(this);
		//f.pack();
		
	}

	void winn()
	{
		Graphics g=b.getGraphics();
		Graphics2D g20 = (Graphics2D) g;
		Graphics g1=b1.getGraphics();
		Graphics2D g21 = (Graphics2D) g1;
		Graphics g2=b2.getGraphics();
		Graphics2D g22 = (Graphics2D) g2;
		Graphics g3=bb.getGraphics();
		Graphics2D g23 = (Graphics2D) g3;
		Graphics g4=b3.getGraphics();
		Graphics2D g24 = (Graphics2D) g4;
		Graphics g5=b4.getGraphics();
		Graphics2D g25 = (Graphics2D) g5;
		Graphics g6=b5.getGraphics();
		Graphics2D g26 = (Graphics2D) g6;
		Graphics g7=b6.getGraphics();
		Graphics2D g27 = (Graphics2D) g7;
		Graphics g8=b7.getGraphics();
		Graphics2D g28 = (Graphics2D) g8;
//cheking if won
		
		if(((flag[0]==1)&&(flag[1]==1)&&(flag[2]==1)&&(flag[3]==1)&&(flag[4]==1)&&(flag[5]==1)&&(flag[6]==1)&&(flag[7]==1)&&(flag[8]==1)))
		jt.setText("ITS A DRAW!!!!! :-/");
		else
		if((cross1==1)&&(cross2==1)&&(cross3==1))
		{	b.setBackground(Color.blue);
			b1.setBackground(Color.blue);
			b2.setBackground(Color.blue);
			g20.setStroke(new BasicStroke(10));
			g.drawLine(55,30,30,75);
			g.drawLine(30,30,55,75);
			g21.setStroke(new BasicStroke(10));
			g21.drawLine(55,30,30,75);
			g1.drawLine(30,30,55,75);
			g22.setStroke(new BasicStroke(10));
			g2.drawLine(55,30,30,75);
			g2.drawLine(30,30,55,75);
			if(cl==0)
			{
				jt.setText("CONGRATS 1st PLAYER WON!!!!! :-D");
			}
			else
			if(cl==1)
			{	jt.setText("CONGRATS YOU WON!!!!! :-D");win=1;
			}
			
		}
		else	
		if((cross4==1)&&(cross5==1)&&(cross6==1))			
		{
			bb.setBackground(Color.blue);
			b3.setBackground(Color.blue);
			b4.setBackground(Color.blue);
			g23.setStroke(new BasicStroke(10));
			g3.drawLine(55,30,30,75);
			g3.drawLine(30,30,55,75);
			g24.setStroke(new BasicStroke(10));
			g4.drawLine(55,30,30,75);
			g4.drawLine(30,30,55,75);
			g25.setStroke(new BasicStroke(10));
			g5.drawLine(55,30,30,75);
			g5.drawLine(30,30,55,75);
			if(cl==0)
			{
				jt.setText("CONGRATS 1st PLAYER WON!!!!! :-D");
			}
			else
			if(cl==1)
			{	jt.setText("CONGRATS YOU WON!!!!! :-D");win=1;
			}
			
		}
		else	
		if((cross7==1)&&(cross8==1)&&(cross9==1))
		{
			b5.setBackground(Color.blue);
			b6.setBackground(Color.blue);
			b7.setBackground(Color.blue);
			g26.setStroke(new BasicStroke(10));
			g6.drawLine(55,30,30,75);
			g6.drawLine(30,30,55,75);
			g27.setStroke(new BasicStroke(10));
			g7.drawLine(55,30,30,75);
			g7.drawLine(30,30,55,75);
			g28.setStroke(new BasicStroke(10));
			g8.drawLine(55,30,30,75);
			g8.drawLine(30,30,55,75);
			if(cl==0)
			{
				jt.setText("CONGRATS 1st PLAYER WON!!!!! :-D");
			}
			else
			if(cl==1)
			{	jt.setText("CONGRATS YOU WON!!!!! :-D");win=1;
			}
		}
		else	
		if((cross1==1)&&(cross4==1)&&(cross7==1))
		{
			b.setBackground(Color.blue);
			bb.setBackground(Color.blue);
			b5.setBackground(Color.blue);
			g20.setStroke(new BasicStroke(10));
			g.drawLine(55,30,30,75);
			g.drawLine(30,30,55,75);
			g23.setStroke(new BasicStroke(10));
			g3.drawLine(55,30,30,75);
			g3.drawLine(30,30,55,75);
			g26.setStroke(new BasicStroke(10));
			g6.drawLine(55,30,30,75);
			g6.drawLine(30,30,55,75);
			if(cl==0)
			{
				jt.setText("CONGRATS 1st PLAYER WON!!!!! :-D");
			}
			else
			if(cl==1)
			{	jt.setText("CONGRATS YOU WON!!!!! :-D");win=1;
			}
			
		}
		
		else
		if((cross2==1)&&(cross5==1)&&(cross8==1))	
		{
			b1.setBackground(Color.blue);
			b3.setBackground(Color.blue);
			b6.setBackground(Color.blue);
			g21.setStroke(new BasicStroke(10));
			g1.drawLine(55,30,30,75);
			g1.drawLine(30,30,55,75);
			g24.setStroke(new BasicStroke(10));
			g4.drawLine(55,30,30,75);
			g4.drawLine(30,30,55,75);
			g27.setStroke(new BasicStroke(10));
			g7.drawLine(55,30,30,75);
			g7.drawLine(30,30,55,75);
			if(cl==0)
			{
				jt.setText("CONGRATS 1st PLAYER WON!!!!! :-D");
			}
			else
			if(cl==1)
			{	jt.setText("CONGRATS YOU WON!!!!! :-D");win=1;
			}
			
		}
		else
		if((cross3==1)&&(cross6==1)&&(cross9==1))
		{
			b2.setBackground(Color.blue);
			b4.setBackground(Color.blue);
			b7.setBackground(Color.blue);
			g22.setStroke(new BasicStroke(10));
			g2.drawLine(55,30,30,75);
			g2.drawLine(30,30,55,75);
			g25.setStroke(new BasicStroke(10));
			g5.drawLine(55,30,30,75);
			g5.drawLine(30,30,55,75);
			g28.setStroke(new BasicStroke(10));
			g8.drawLine(55,30,30,75);
			g8.drawLine(30,30,55,75);
			if(cl==0)
			{
				jt.setText("CONGRATS 1st PLAYER WON!!!!! :-D");
			}
			else
			if(cl==1)
			{	jt.setText("CONGRATS YOU WON!!!!! :-D");win=1;
			}
			
		}
		else
		if((cross1==1)&&(cross5==1)&&(cross9==1))	
		{
			b.setBackground(Color.blue);
			b3.setBackground(Color.blue);
			b7.setBackground(Color.blue);
			g20.setStroke(new BasicStroke(10));
			g.drawLine(55,30,30,75);
			g.drawLine(30,30,55,75);
			g24.setStroke(new BasicStroke(10));
			g4.drawLine(55,30,30,75);
			g4.drawLine(30,30,55,75);
			g28.setStroke(new BasicStroke(10));
			g8.drawLine(55,30,30,75);
			g8.drawLine(30,30,55,75);
			if(cl==0)
			{
				jt.setText("CONGRATS 1st PLAYER WON!!!!! :-D");
			}
			else
			if(cl==1)
			{	jt.setText("CONGRATS YOU WON!!!!! :-D");win=1;
			}
			
		}
		else	
		if((cross3==1)&&(cross5==1)&&(cross7==1))	
		{
			b2.setBackground(Color.blue);
			b3.setBackground(Color.blue);
			b5.setBackground(Color.blue);
			g22.setStroke(new BasicStroke(10));
			g2.drawLine(55,30,30,75);
			g2.drawLine(30,30,55,75);
			g24.setStroke(new BasicStroke(10));
			g4.drawLine(55,30,30,75);
			g4.drawLine(30,30,55,75);
			g26.setStroke(new BasicStroke(10));
			g6.drawLine(55,30,30,75);
			g6.drawLine(30,30,55,75);
			if(cl==0)
			{
				jt.setText("CONGRATS 1st PLAYER WON!!!!! :-D");
			}
			else
			if(cl==1)
			{	jt.setText("CONGRATS YOU WON!!!!! :-D");win=1;
			}
		
		}
		
}
void winn2()
{
		Graphics g=b.getGraphics();
		Graphics2D g20 = (Graphics2D) g;
		Graphics g1=b1.getGraphics();
		Graphics2D g21 = (Graphics2D) g1;
		Graphics g2=b2.getGraphics();
		Graphics2D g22 = (Graphics2D) g2;
		Graphics g3=bb.getGraphics();
		Graphics2D g23 = (Graphics2D) g3;
		Graphics g4=b3.getGraphics();
		Graphics2D g24 = (Graphics2D) g4;
		Graphics g5=b4.getGraphics();
		Graphics2D g25 = (Graphics2D) g5;
		Graphics g6=b5.getGraphics();
		Graphics2D g26 = (Graphics2D) g6;
		Graphics g7=b6.getGraphics();
		Graphics2D g27 = (Graphics2D) g7;
		Graphics g8=b7.getGraphics();
		Graphics2D g28 = (Graphics2D) g8;

		if((oval1==1)&&(oval2==1)&&(oval3==1))		
		{	b.setBackground(Color.blue);
			b1.setBackground(Color.blue);
			b2.setBackground(Color.blue);
			g20.setStroke(new BasicStroke(10));
			g.drawOval(20,20,50,70);
			g21.setStroke(new BasicStroke(10));
			g1.drawOval(20,20,50,70);
			g22.setStroke(new BasicStroke(10));
			g2.drawOval(20,20,50,70);
			if(cl==0)
			{
				jt.setText("CONGRATS 2nd PLAYER WON!!!!! :-D");
			}
			else
			if(cl==1)
			{	jt.setText("SORRY YOU LOSE!!!!! :-(");
			}
			
		}
else
		if((oval4==1)&&(oval5==1)&&(oval6==1))
		{	bb.setBackground(Color.blue);
			b3.setBackground(Color.blue);
			b4.setBackground(Color.blue);
			g23.setStroke(new BasicStroke(10));
			g3.drawOval(20,20,50,70);
			g24.setStroke(new BasicStroke(10));
			g4.drawOval(20,20,50,70);
			g25.setStroke(new BasicStroke(10));
			g5.drawOval(20,20,50,70);
			if(cl==0)
			{
				jt.setText("CONGRATS 2nd PLAYER WON!!!!! :-D");
			}
			else
			if(cl==1)
			{	jt.setText("SORRY YOU LOSE!!!!! :-(");
			}
			
		}
else
		if((oval7==1)&&(oval8==1)&&(oval9==1))	
		{	b5.setBackground(Color.blue);
			b6.setBackground(Color.blue);
			b7.setBackground(Color.blue);
			g26.setStroke(new BasicStroke(10));
			g6.drawOval(20,20,50,70);
			g27.setStroke(new BasicStroke(10));
			g7.drawOval(20,20,50,70);
			g28.setStroke(new BasicStroke(10));
			g8.drawOval(20,20,50,70);
			if(cl==0)
			{
				jt.setText("CONGRATS 2nd PLAYER WON!!!!! :-D");
			}
			else
			if(cl==1)
			{	jt.setText("SORRY YOU LOSE!!!!! :-(");
			}
			
		}
else
		if((oval1==1)&&(oval4==1)&&(oval7==1))
		{	b.setBackground(Color.blue);
			bb.setBackground(Color.blue);
			b5.setBackground(Color.blue);
			g20.setStroke(new BasicStroke(10));
			g.drawOval(20,20,50,70);
			g23.setStroke(new BasicStroke(10));
			g3.drawOval(20,20,50,70);
			g26.setStroke(new BasicStroke(10));
			g6.drawOval(20,20,50,70);
			if(cl==0)
			{
				jt.setText("CONGRATS 2nd PLAYER WON!!!!! :-D");
			}
			else
			if(cl==1)
			{	jt.setText("SORRY YOU LOSE!!!!! :-(");
			}
			
		}
else 
		if((oval2==1)&&(oval5==1)&&(oval8==1))
		{	b1.setBackground(Color.blue);
			b3.setBackground(Color.blue);
			b6.setBackground(Color.blue);
			g21.setStroke(new BasicStroke(10));
			g1.drawOval(20,20,50,70);
			g24.setStroke(new BasicStroke(10));
			g4.drawOval(20,20,50,70);
			g27.setStroke(new BasicStroke(10));
			g7.drawOval(20,20,50,70);
			if(cl==0)
			{
				jt.setText("CONGRATS 2nd PLAYER WON!!!!! :-D");
			}
			else
			if(cl==1)
			{	jt.setText("SORRY YOU LOSE!!!!! :-(");
			}
			
		}
		
		else
		if((oval3==1)&&(oval6==1)&&(oval9==1))	
		{
			b2.setBackground(Color.blue);
			b4.setBackground(Color.blue);
			b7.setBackground(Color.blue);
			g22.setStroke(new BasicStroke(10));
			g2.drawOval(20,20,50,70);
			g25.setStroke(new BasicStroke(10));
			g5.drawOval(20,20,50,70);
			g28.setStroke(new BasicStroke(10));
			g8.drawOval(20,20,50,70);
			if(cl==0)
			{
				jt.setText("CONGRATS 2nd PLAYER WON!!!!! :-D");
			}
			else
			if(cl==1)
			{	jt.setText("SORRY YOU LOSE!!!!! :-(");
			}
			
		}
else 
		if((oval1==1)&&(oval5==1)&&(oval9==1))
		{	b.setBackground(Color.blue);
			b3.setBackground(Color.blue);
			b7.setBackground(Color.blue);
			g20.setStroke(new BasicStroke(10));
			g.drawOval(20,20,50,70);
			g24.setStroke(new BasicStroke(10));
			g4.drawOval(20,20,50,70);
			g28.setStroke(new BasicStroke(10));
			g8.drawOval(20,20,50,70);
			if(cl==0)
			{
				jt.setText("CONGRATS 2nd PLAYER WON!!!!! :-D");
			}
			else
			if(cl==1)
			{	jt.setText("SORRY YOU LOSE!!!!! :-(");
			}
			
		}
else
		if((oval3==1)&&(oval5==1)&&(oval7==1))
		{
			
			b2.setBackground(Color.blue);
			b3.setBackground(Color.blue);
			b5.setBackground(Color.blue);
			g22.setStroke(new BasicStroke(10));
			g2.drawOval(20,20,50,70);
			g24.setStroke(new BasicStroke(10));
			g4.drawOval(20,20,50,70);
			g26.setStroke(new BasicStroke(10));
			g6.drawOval(20,20,50,70);
			if(cl==0)
			{
				jt.setText("CONGRATS 2nd PLAYER WON!!!!! :-D");
			}
			else
			if(cl==1)
			{	jt.setText("SORRY YOU LOSE!!!!! :-(");
			}

			
		}
}

	void check()
	{
		Graphics g=b.getGraphics();
		Graphics2D g20 = (Graphics2D) g;
		Graphics g1=b1.getGraphics();
		Graphics2D g21 = (Graphics2D) g1;
		Graphics g2=b2.getGraphics();
		Graphics2D g22 = (Graphics2D) g2;
		Graphics g3=bb.getGraphics();
		Graphics2D g23 = (Graphics2D) g3;
		Graphics g4=b3.getGraphics();
		Graphics2D g24 = (Graphics2D) g4;
		Graphics g5=b4.getGraphics();
		Graphics2D g25 = (Graphics2D) g5;
		Graphics g6=b5.getGraphics();
		Graphics2D g26 = (Graphics2D) g6;
		Graphics g7=b6.getGraphics();
		Graphics2D g27 = (Graphics2D) g7;
		Graphics g8=b7.getGraphics();
		Graphics2D g28 = (Graphics2D) g8;
	
		
//checking if other buttons are clicked
//cheking button 1
				if(flag[0]==1)
				{
					b.setBackground(Color.yellow);
					if(cross1==1)
					{	g20.setStroke(new BasicStroke(10));
						g.drawLine(30,30,55,75);
						g.drawLine(55,30,30,75);
					}
					else
					if(oval1==1)
						{g20.setStroke(new BasicStroke(10));
						g.drawOval(20,20,50,70);}
					
				}

//cheking button 2
			if(flag[1]==1)
			{	
				b1.setBackground(Color.yellow);
				if(cross2==1)
				{	g21.setStroke(new BasicStroke(10));
					g1.drawLine(30,30,55,75);
					g1.drawLine(55,30,30,75);
				}
				
				else
				if(oval2==1)
				{	g21.setStroke(new BasicStroke(10));
					g1.drawOval(20,20,50,70);
				}
					
			}
//checking button 3
			if(flag[2]==1)
			{
				b2.setBackground(Color.yellow);
				if(cross3==1)
				{	g22.setStroke(new BasicStroke(10));
						g2.drawLine(30,30,55,75);
						g2.drawLine(55,30,30,75);
				}	
				else
				if(oval3==1)
				{g22.setStroke(new BasicStroke(10));
					g2.drawOval(20,20,50,70);}
					
			}
//checking button 4
			
			if(flag[3]==1)
			{
				bb.setBackground(Color.yellow);
				if(cross4==1)
				{		g23.setStroke(new BasicStroke(10));
						g3.drawLine(30,30,55,75);
						g3.drawLine(55,30,30,75);
				}	
				else
				if(oval4==1)
				{g23.setStroke(new BasicStroke(10));
					g3.drawOval(20,20,50,70);}
					
			}
//checking button 5
			if(flag[4]==1)
			{
				b3.setBackground(Color.yellow);
				if(cross5==1)
				{		g24.setStroke(new BasicStroke(10));
						g4.drawLine(30,30,55,75);
						g4.drawLine(55,30,30,75);
				}	
				else
				if(oval5==1)
				{g24.setStroke(new BasicStroke(10));
					g4.drawOval(20,20,50,70);}
					
			}
//cheking button 6
			if(flag[5]==1)
			{
				b4.setBackground(Color.yellow);
				if(cross6==1)
				{		g25.setStroke(new BasicStroke(10));
						g5.drawLine(30,30,55,75);
						g5.drawLine(55,30,30,75);
				}	
				else
				if(oval6==1)
				{g25.setStroke(new BasicStroke(10));
					g5.drawOval(20,20,50,70);}
					
			}
//cheking button 7
			if(flag[6]==1)
			{
				b5.setBackground(Color.yellow);
				if(cross7==1)
				{		g26.setStroke(new BasicStroke(10));
						g6.drawLine(30,30,55,75);
						g6.drawLine(55,30,30,75);
				}	
				else
				if(oval7==1)
				{	g26.setStroke(new BasicStroke(10));
					g6.drawOval(20,20,50,70);
				}
					
			}
//cheking button 8
			if(flag[7]==1)
			{
				b6.setBackground(Color.yellow);
				if(cross8==1)
				{		g27.setStroke(new BasicStroke(10));
						g7.drawLine(30,30,55,75);
						g7.drawLine(55,30,30,75);
				}	
				else
				if(oval8==1)
				{	g27.setStroke(new BasicStroke(10));
					g7.drawOval(20,20,50,70);}
					
			}
//cheking button 9
			if(flag[8]==1)
			{
				b7.setBackground(Color.yellow);
				if(cross9==1)
				{		g28.setStroke(new BasicStroke(10));
						g8.drawLine(30,30,55,75);
						g8.drawLine(55,30,30,75);
				}	
				else
				if(oval9==1)
				{	g28.setStroke(new BasicStroke(10));
					g8.drawOval(20,20,50,70);}
					
			}

}
void check2()
	{	System.out.println("win " +win);
		
		if(win!=1)
		{	
				
				Graphics g=b.getGraphics();
				Graphics2D g20 = (Graphics2D) g;
				Graphics g1=b1.getGraphics();
				Graphics2D g21 = (Graphics2D) g1;
				Graphics g2=b2.getGraphics();
				Graphics2D g22 = (Graphics2D) g2;
				Graphics g3=bb.getGraphics();
				Graphics2D g23 = (Graphics2D) g3;
				Graphics g4=b3.getGraphics();
				Graphics2D g24 = (Graphics2D) g4;
				Graphics g5=b4.getGraphics();
				Graphics2D g25 = (Graphics2D) g5;
				Graphics g6=b5.getGraphics();
				Graphics2D g26 = (Graphics2D) g6;
				Graphics g7=b6.getGraphics();
				Graphics2D g27 = (Graphics2D) g7;
				Graphics g8=b7.getGraphics();
				Graphics2D g28 = (Graphics2D) g8;

					
//check for oval			
					
					if((flag[4]!=1)&&(((oval1==1)&&(oval9==1))||((oval3==1)&&(oval7==1))))
					{	System.out.println("flag4 "+flag[4]);
						g24.setStroke(new BasicStroke(10));
						g4.drawOval(20,20,50,70);
						oval5=1;
						flag[4]=1;
						System.out.println("checkO-1");
					}
					else
					if((flag[4]!=1)&&(((oval2==1)&&(oval8==1))||((oval4==1)&&(oval6==1))))
					{
						System.out.println("flag4 "+flag[4]);
						g24.setStroke(new BasicStroke(10));
						g4.drawOval(20,20,50,70);
						oval5=1;
						flag[4]=1;
						System.out.println("checkO-1");
					}
					else
					if((flag[0]!=1)&&((oval2==1)&&(oval3==1))||((oval4==1)&&(oval7==1)))
					{	g20.setStroke(new BasicStroke(10));
						g.drawOval(20,20,50,70);
						oval1=1;
						flag[0]=1;System.out.println("checkO-2");
					}
					else
					if((flag[2]!=1)&&(((oval6==1)&&(oval9==1))||((oval1==1)&&(oval2==1))||((oval5==1)&&(oval7==1))))//&& (cross3!=1))
					{	g22.setStroke(new BasicStroke(10));
						g2.drawOval(20,20,50,70);
						oval3=1;
						flag[2]=1;System.out.println("checkO-3");
					}
					else
					if((flag[6]!=1)&& (((oval8==1)&&(oval9==1))||((oval1==1)&&(oval4==1))||((oval5==1)&&(oval3==1))))//&& (cross7!=1))
					{
						g26.setStroke(new BasicStroke(10));
						g6.drawOval(20,20,50,70);
						oval7=1;
						flag[6]=1;System.out.println("checkO-4");
					}
					else
					if((flag[8]!=1)&& (((oval6==1)&&(oval3==1))||((oval1==1)&&(oval5==1))||((oval7==1)&&(oval8==1))))//&& (cross9!=1))
					{	
						g28.setStroke(new BasicStroke(10));
						g8.drawOval(20,20,50,70);
						oval9=1;
						flag[8]=1;System.out.println("checkO-5");
					}
					else
					if((flag[1]!=1)&& (((oval5==1)&&(oval8==1))||((oval1==1)&&(oval3==1)))) //&& (cross2!=1))
					{	
						g21.setStroke(new BasicStroke(10));
						g1.drawOval(20,20,50,70);
						oval2=1;
						flag[1]=1;System.out.println("checkO-6");
					}
					else
					if((flag[3]!=1)&&(((oval5==1)&&(oval6==1))||((oval1==1)&&(oval7==1))))//&& (cross4!=1))
					{	g23.setStroke(new BasicStroke(10));
						g3.drawOval(20,20,50,70);
						oval4=1;
						flag[3]=1;System.out.println("checkO-7");
					}
					else
					if((flag[5]!=1)&&(((oval5==1)&&(oval4==1))||((oval9==1)&&(oval3==1))))//&& (cross6!=1))
					{
						g25.setStroke(new BasicStroke(10));
						g5.drawOval(20,20,50,70);
						oval6=1;
						flag[5]=1;System.out.println("checkO-8");
					}
					else
					if((flag[7]!=1)&&(((oval7==1)&&(oval9==1))||((oval2==1)&&(oval5==1))))//&& (cross8!=1))	
					{
						g27.setStroke(new BasicStroke(10));
						g7.drawOval(20,20,50,70);
						oval8=1;
						flag[7]=1;System.out.println("checkO-9");
					}

 //check for cross conditions
					else	
					if((flag[4]==0)&&(((cross3==1)&&(cross7==1))||((cross1==1)&&(cross9==1))||((cross4==1)&&(cross6==1))||((cross2==1)&&(cross8==1))))
					{
					g24.setStroke(new BasicStroke(10));
					g4.drawOval(20,20,50,70);
					oval5=1;
					flag[4]=1;System.out.println("checkx-1");
					}
					else
					if((flag[0]!=1)&&(((cross5==1)&&(cross9==1))||((cross2==1)&&(cross3==1))||((cross4==1)&&(cross7==1))))
					{	
						g20.setStroke(new BasicStroke(10));
						g.drawOval(20,20,50,70);
						oval1=1;
						flag[0]=1;System.out.println("checkx-2");
					}
					else
					if((flag[2]!=1)&&(((cross7==1)&&(cross5==1))||((cross9==1)&&(cross6==1))||((cross1==1)&&(cross2==1))))
					{	
						g22.setStroke(new BasicStroke(10));
						g2.drawOval(20,20,50,70);
						oval3=1;
						flag[2]=1;System.out.println("checkx-3");
					}
					else
					if((flag[6]!=1)&&(((cross1==1)&&(cross4==1))||((cross8==1)&&(cross9==1))||((cross3==1)&&(cross5==1))))
					{	
						g26.setStroke(new BasicStroke(10));
						g6.drawOval(20,20,50,70);
						oval7=1;
						flag[6]=1;System.out.println("checkx-4");
					}
					else
					if((flag[8]!=1)&&(((cross7==1)&&(cross8==1))||((cross1==1)&&(cross5==1))||((cross3==1)&&(cross6==1))))
					{	
						g28.setStroke(new BasicStroke(10));
						g8.drawOval(20,20,50,70);
						oval9=1;
						flag[8]=1;System.out.println("checkx-5");
					}
					else
					if((flag[1]!=1)&&(((cross1==1)&&(cross3==1))||((cross5==1)&&(cross8==1))))
					{
						
						g21.setStroke(new BasicStroke(10));
						g1.drawOval(20,20,50,70);
						oval2=1;
						flag[1]=1;System.out.println("checkx-6");
					}
					else
					if((flag[3]!=1)&&(((cross1==1)&&(cross7==1))||((cross5==1)&&(cross6==1))))
					{
						g23.setStroke(new BasicStroke(10));
						g3.drawOval(20,20,50,70);
						oval4=1;
						flag[3]=1;System.out.println("checkx-7");
					}
					else
					if((flag[5]!=1)&&(((cross4==1)&&(cross5==1))||((cross3==1)&&(cross9==1))))
					{
						
						g25.setStroke(new BasicStroke(10));
						g5.drawOval(20,20,50,70);
						oval6=1;
						flag[5]=1;System.out.println("checkx-8");
					}
					else
					if((flag[7]!=1)&&(((cross9==1)&&(cross7==1))||((cross2==1)&&(cross5==1))))
					{
						
						g27.setStroke(new BasicStroke(10));
						g7.drawOval(20,20,50,70);
						oval8=1;
						flag[7]=1;System.out.println("checkx-9");
					} 
					
//check 5th block, step 4
					else
					if((flag[4]==0)&&(chance==1))
					{	
					g24.setStroke(new BasicStroke(10));
					g4.drawOval(20,20,50,70);
					oval5=1;
					flag[4]=1;
					System.out.println("step4");
					}
//step5

					else
					if((cross4==1)&&(cross8==1)&&(flag[6]==0))
					{
						g26.setStroke(new BasicStroke(10));
						g6.drawOval(20,20,50,70);
						oval7=1;
						flag[6]=1;
						System.out.println("step5-1");
					}
					else
					if((cross6==1)&&(cross8==1)&&(flag[8]==0))
					{
						g28.setStroke(new BasicStroke(10));
						g8.drawOval(20,20,50,70);
						oval9=1;
						flag[8]=1;System.out.println("step5-2");
					}
					else
					if((cross2==1)&&(cross6==1)&&(flag[2]==0))
					{
						g22.setStroke(new BasicStroke(10));
						g2.drawOval(20,20,50,70);
						oval3=1;
						flag[2]=1;
						System.out.println("step5-3");
					}
					else
					if((cross4==1)&&(cross2==1)&&(flag[0]==0))
					{
						g20.setStroke(new BasicStroke(10));
						g.drawOval(20,20,50,70);
						oval1=1;
						flag[0]=1;
						System.out.println("step5-4");
					}
//step6
					else
					if((cross4==1)&&(cross3==1)&&(flag[0]==0))
					{
						g20.setStroke(new BasicStroke(10));
						g.drawOval(20,20,50,70);
						oval1=1;
						flag[0]=1;
						System.out.println("step6-1");
					}
					else
					if((cross9==1)&&(flag[6]==0))
					{
						g26.setStroke(new BasicStroke(10));
						g6.drawOval(20,20,50,70);
						oval7=1;
						flag[6]=1;
						System.out.println("step6-2");
					}
					else
					if((cross6==1)&&(cross1==1)&&(flag[2]==0))
					{
						g22.setStroke(new BasicStroke(10));
						g2.drawOval(20,20,50,70);
						oval3=1;
						flag[2]=1;
						System.out.println("step6-3");
					}
					else
					if((cross7==1)&&(flag[8]==0))
					{
						g28.setStroke(new BasicStroke(10));
						g8.drawOval(20,20,50,70);
						oval9=1;
						flag[8]=1;
						System.out.println("step6-4");
					}
					
					else
					if((cross8==1)&&(cross1==1)&&(flag[6]==0))
					{
						g26.setStroke(new BasicStroke(10));
						g6.drawOval(20,20,50,70);
						oval7=1;
						flag[6]=1;
						System.out.println("step6-5");
					}
					else
					if((cross3==1)&&(flag[8]==0))
					{
						g28.setStroke(new BasicStroke(10));
						g8.drawOval(20,20,50,70);
						oval9=1;
						flag[8]=1;
						System.out.println("step6-6");
					}
					else
					if((cross2==1)&&(cross7==1)&&(flag[0]==0))
					{
						g20.setStroke(new BasicStroke(10));
						g.drawOval(20,20,50,70);
						oval1=1;
						flag[0]=1;
						System.out.println("step6-7");
					}
					else
					if((cross9==1)&&(flag[2]==0))
					{
						g22.setStroke(new BasicStroke(10));
						g2.drawOval(20,20,50,70);
						oval3=1;
						flag[2]=1;
						System.out.println("step6-8");
					}

//triangle2
					else
					if((flag[0]==0)&&(cross1!=1))
					{
						g20.setStroke(new BasicStroke(10));
						g.drawOval(20,20,50,70);
						oval1=1;
						flag[0]=1;System.out.println("t2-1");
					
					}
					else
					if((flag[2]==0)&&(cross3!=1)&&(oval1==1))
					{
						g22.setStroke(new BasicStroke(10));
						g2.drawOval(20,20,50,70);
						oval3=1;
						flag[2]=1;
						System.out.println("t2-2");
					
					}
					else
					if((flag[7]==0)&&(cross8!=1)&&(oval1==1)&&(oval3==1))
					{
						g27.setStroke(new BasicStroke(10));
						g7.drawOval(20,20,50,70);
						oval8=1;
						flag[7]=1;
						System.out.println("t2-3");
					
					}
//triangle1
					else
					if((flag[1]==0)&&(cross2!=1))
					{
						g21.setStroke(new BasicStroke(10));
						g1.drawOval(20,20,50,70);
						oval2=1;
						flag[1]=1;System.out.println("t1-1");
					
					}
					else
					if((flag[6]==0)&&(cross7!=1)&&(oval2==1))
					{
						g26.setStroke(new BasicStroke(10));
						g6.drawOval(20,20,50,70);
						oval7=1;
						flag[6]=1;System.out.println("t1-2");
					
					}
					else
					if((flag[8]==0)&&(cross9!=1)&&(oval2==1)&&(oval7==1))
					{
						g28.setStroke(new BasicStroke(10));
						g8.drawOval(20,20,50,70);
						oval9=1;
						flag[8]=1;System.out.println("t1-3");
					
					}

//triangle3
					
					else
					if((flag[3]==0)&&(cross4!=1))
					{
						g23.setStroke(new BasicStroke(10));
						g3.drawOval(20,20,50,70);
						oval4=1;
						flag[3]=1;System.out.println("t3-1");
					
					}
					else
					if((flag[2]==0)&&(cross3!=1)&&(oval4==1))
					{
						g22.setStroke(new BasicStroke(10));
						g2.drawOval(20,20,50,70);
						oval3=1;
						flag[2]=1;System.out.println("t3-2");
					
					}
					else
					if((flag[8]==0)&&(cross9!=1)&&(oval4==1)&&(oval3==1))
					{
						g28.setStroke(new BasicStroke(10));
						g8.drawOval(20,20,50,70);
						oval9=1;
						flag[8]=1;System.out.println("t3-3");
					
					}
//triangle4
					else
					if((flag[0]==0)&&(cross1!=1))
					{
						g20.setStroke(new BasicStroke(10));
						g.drawOval(20,20,50,70);
						oval1=1;
						flag[0]=1;System.out.println("t4-1");
					
					}
					else
					if((flag[5]==0)&&(cross6!=1)&&(oval1==1))
					{
						g25.setStroke(new BasicStroke(10));
						g5.drawOval(20,20,50,70);
						oval6=1;
						flag[5]=1;System.out.println("t4-2");
					}
					else
					if((flag[6]==0)&&(cross7!=1)&&(oval1==1)&&(oval6==1))
					{
						g26.setStroke(new BasicStroke(10));
						g6.drawOval(20,20,50,70);
						oval7=1;
						flag[6]=1;System.out.println("t4-3");
					}
					
//step3				//edge	
					else
					if((flag[0]==0)&&(cross9==1))
					{
						g20.setStroke(new BasicStroke(10));
						g.drawOval(20,20,50,70);
						oval1=1;
						flag[0]=1;
						System.out.println("step3-e-1");
						
					}
				
					else
					if((flag[8]==0)&&(cross1==1))
					{
						g28.setStroke(new BasicStroke(10));
						g8.drawOval(20,20,50,70);
						oval9=1;
						flag[8]=1;
						System.out.println("step3-e-2");
					}
					else
					if((flag[6]==0)&&(cross3==1))
					{
						g26.setStroke(new BasicStroke(10));
						g6.drawOval(20,20,50,70);
						oval7=1;
						flag[6]=1;System.out.println("step3-e-3");
					}
					
					else
					if((flag[2]==0)&&(cross7==1))
					{
						g22.setStroke(new BasicStroke(10));
						g2.drawOval(20,20,50,70);
						oval3=1;
						flag[2]=1;
						System.out.println("step3-e-2");
					}
					
					
				//middle
					else
					if((cross8==1)&&(flag[1]==0))
					{
						g21.setStroke(new BasicStroke(10));
						g1.drawOval(20,20,50,70);
						oval2=1;
						flag[1]=1;	
						System.out.println("step6-8");
					}
					else
					if((cross2==1)&&(flag[7]==0))
					{
						g27.setStroke(new BasicStroke(10));
						g7.drawOval(20,20,50,70);
						oval8=1;
						flag[7]=1;System.out.println("step3-m-2");
					}
					else
					if((cross6==1)&&(flag[3]==0))
					{
						g23.setStroke(new BasicStroke(10));
						g3.drawOval(20,20,50,70);
						oval4=1;
						flag[3]=1;System.out.println("step3-m-3");
					}
					else
					if((cross4==1)&&(flag[5]==0))
					{
						g25.setStroke(new BasicStroke(10));
						g5.drawOval(20,20,50,70);
						oval6=1;
						flag[5]=1;
						System.out.println("step3-m-4");
					}


//normal conditions
					else
					if((flag[0]==0)&&(cross1!=1))//&&(count1>=6))
					{	
					g20.setStroke(new BasicStroke(10));
					g.drawOval(20,20,50,70);
					oval1=1;
					flag[0]=1;
					System.out.println("red1");
					}
					else
					if((flag[1]==0)&&(cross2!=1))//&&(count1>=6))
					{	
					g21.setStroke(new BasicStroke(10));
					g1.drawOval(20,20,50,70);
					oval2=1;
					flag[1]=1;
					System.out.println("red2");
					}
					else
					if((flag[2]==0)&&(cross1!=1))//&&(count1>=6))
					{	
					g22.setStroke(new BasicStroke(10));
					g2.drawOval(20,20,50,70);
					oval3=1;
					flag[2]=1;
					System.out.println("red3");
					}
					else
					if((flag[3]==0)&&(cross1!=1))//&&(count1>=6))
					{	
					g23.setStroke(new BasicStroke(10));
					g3.drawOval(20,20,50,70);
					oval4=1;
					flag[3]=1;
					System.out.println("red4");
					}
					else
					if((flag[4]==0)&&(cross1!=1))//&&(count1>=6))
					{	
					g24.setStroke(new BasicStroke(10));
					g4.drawOval(20,20,50,70);
					oval5=1;
					flag[4]=1;
					System.out.println("red5");
					}
					else
					if((flag[5]==0)&&(cross1!=1))//&&(count1>=6))
					{	
					g25.setStroke(new BasicStroke(10));
					g5.drawOval(20,20,50,70);
					oval6=1;
					flag[5]=1;
					System.out.println("red6");
					}
					else
					if((flag[6]==0)&&(cross1!=1))//&&(count1>=6))
					{	
					g26.setStroke(new BasicStroke(10));
					g6.drawOval(20,20,50,70);
					oval7=1;
					flag[6]=1;
					System.out.println("red7");
					}
					else
					if((flag[7]==0)&&(cross1!=1))//&&(count1>=6))
					{	
					g27.setStroke(new BasicStroke(10));
					g7.drawOval(20,20,50,70);
					oval8=1;
					flag[7]=1;
					System.out.println("red8");
					}
					else
					if((flag[8]==0)&&(cross1!=1))//&&(count1>=6))
					{	
					g28.setStroke(new BasicStroke(10));
					g8.drawOval(20,20,50,70);
					oval9=1;
					flag[8]=1;
					System.out.println("red9");
					}

			}
 
}
public void mouseClicked(MouseEvent e)	
{		int q;
		int current;
		Graphics g=b.getGraphics();
		Graphics2D g20 = (Graphics2D) g;
		Graphics g1=b1.getGraphics();
		Graphics2D g21 = (Graphics2D) g1;
		Graphics g2=b2.getGraphics();
		Graphics2D g22 = (Graphics2D) g2;
		Graphics g3=bb.getGraphics();
		Graphics2D g23 = (Graphics2D) g3;
		Graphics g4=b3.getGraphics();
		Graphics2D g24 = (Graphics2D) g4;
		Graphics g5=b4.getGraphics();
		Graphics2D g25 = (Graphics2D) g5;
		Graphics g6=b5.getGraphics();
		Graphics2D g26 = (Graphics2D) g6;
		Graphics g7=b6.getGraphics();
		Graphics2D g27 = (Graphics2D) g7;
		Graphics g8=b7.getGraphics();
		Graphics2D g28 = (Graphics2D) g8;
	
	if(e.getSource()==qb)
	{	b.setBackground(Color.white);
		b1.setBackground(Color.white);
		b2.setBackground(Color.white);
		bb.setBackground(Color.white);
		b3.setBackground(Color.white);
		b4.setBackground(Color.white);
		b5.setBackground(Color.white);
		b6.setBackground(Color.white);
		b7.setBackground(Color.white);
		cl=1;
		for(int i=0;i<9;i++)
		{
			 flag[i]=0;
			System.out.println(flag[i]);
		}
		cross1=0;oval1=0;cross2=0;oval2=0;cross3=0;oval3=0;cross4=0;oval4=0;cross5=0;oval5=0;cross6=0;oval6=0;cross7=0;oval7=0;cross8=0;oval8=0;cross9=0;oval9=0;
		jt.setText("PLAYER 1 v/s COMPUTER");
		win=0;
		chance=0;
	}
	if(cl==1)
	{	 current=0;
		int count=0;
		
//event on button1
//performing operation on current button
	if(e.getSource()==b)
	{			
				chance++;
				b.setBackground(Color.RED);
				g20.setStroke(new BasicStroke(10));
				g.drawLine(30,30,55,75);
				g.drawLine(55,30,30,75);
				cross1=1;
				check();
				flag[0]=1;
				winn();
				check2();
				winn2();
				
	}
	else
	if(e.getSource()==b1)
	{			
				chance++;
				b1.setBackground(Color.RED);
				g21.setStroke(new BasicStroke(10));
				g1.drawLine(30,30,55,75);
				g1.drawLine(55,30,30,75);
				cross2=1;
				check();
				flag[1]=1;
				winn();
				check2();
				winn2();
				
				
	}
	else
	if(e.getSource()==b2)
	{			chance++;
				b2.setBackground(Color.RED);
				g22.setStroke(new BasicStroke(10));
				g2.drawLine(30,30,55,75);
				g2.drawLine(55,30,30,75);
				cross3=1;
				check();
				flag[2]=1;
				winn();
				check2();
				winn2();
	}
	else
	if(e.getSource()==bb)
	{			chance++;
				bb.setBackground(Color.RED);
				g23.setStroke(new BasicStroke(10));
				g3.drawLine(30,30,55,75);
				g3.drawLine(55,30,30,75);
				cross4=1;
				check();
				flag[3]=1;
				winn();
				check2();
				winn2();
	}
	else
	if(e.getSource()==b3)
	{			
				chance++;
				b3.setBackground(Color.RED);
				g24.setStroke(new BasicStroke(10));
				g4.drawLine(30,30,55,75);
				g4.drawLine(55,30,30,75);
				cross5=1;
				check();
				flag[4]=1;
				winn();
				System.out.println("event on button 5");
				check2();
				winn2();
				
				
	}
	else
	if(e.getSource()==b4)
	{			chance++;
				b4.setBackground(Color.RED);
				g25.setStroke(new BasicStroke(10));
				g5.drawLine(30,30,55,75);
				g5.drawLine(55,30,30,75);
				cross6=1;
				check();
				flag[5]=1;
				winn();
				check2();
				winn2();	
	}
	else
	if(e.getSource()==b5)
	{			chance++;
				b5.setBackground(Color.RED);
				g26.setStroke(new BasicStroke(10));
				g6.drawLine(30,30,55,75);
				g6.drawLine(55,30,30,75);
				cross7=1;
				check();
				flag[6]=1;
				winn();
				check2();
				winn2();	
	}
	else
	if(e.getSource()==b6)
	{				chance++;
					b6.setBackground(Color.RED);
					g27.setStroke(new BasicStroke(10));
					g7.drawLine(30,30,55,75);
					g7.drawLine(55,30,30,75);
					cross8=1;
					check();
					flag[7]=1;
					winn();
					check2();
					winn2();
	}
	else
	if(e.getSource()==b7)
	{				
					chance++;
					b7.setBackground(Color.RED);
					g28.setStroke(new BasicStroke(10));
					g8.drawLine(30,30,55,75);
					g8.drawLine(55,30,30,75);
					cross9=1;
					check();
					flag[8]=1;
					winn();
					check2();
					winn2();
	}	
	
	for(int i=0;i<9;i++)
	{
		System.out.println("flag "+i+" = " + flag[i]);
	}
				
				
	
	
}
	else
	if(cl==0)
	{ 
//event on button1
	if(e.getSource()==b)
	{	
		check();
//performing operation on current button	
				flag[0]=1;
				b.setBackground(Color.RED);
				count=0;
				
				for(int i=0;i<9;i++)
				{
					if (flag[i]==1)
					count++;
				}
				if((count%2)!= 0)
				{	g20.setStroke(new BasicStroke(10));
					
 					g.drawLine(30,30,55,75);
					g.drawLine(55,30,30,75);
					cross1=1;
				}
				else
				if((count%2)== 0)
				{	g20.setStroke(new BasicStroke(10));
					g.drawOval(20,20,50,70);
					oval1=1;
				}
				winn();
				winn2();

	}
//event on button2
	if(e.getSource()==b1)

	{	check();
//performing operation on current button	
				flag[1]=1;
				b1.setBackground(Color.RED);
				count=0;
				
				for(int i=0;i<9;i++)
				{
					if (flag[i]==1)
					count++;
				}
				if((count%2)!= 0)
				{	g21.setStroke(new BasicStroke(10));
					
 					g1.drawLine(30,30,55,75);
					g1.drawLine(55,30,30,75);
					cross2=1;
				}
				else
				if((count%2)== 0)
				{	g21.setStroke(new BasicStroke(10));
					g1.drawOval(20,20,50,70);
					oval2=1;
				}
				winn();
				winn2();
				
	}
//event on button3
	if(e.getSource()==b2)

	{	check();
//performing operation on current button	
				flag[2]=1;
				b2.setBackground(Color.RED);
				count=0;
				
				for(int i=0;i<9;i++)
				{
					if (flag[i]==1)
					count++;
				}
				if((count%2)!= 0)
				{	g22.setStroke(new BasicStroke(10));
					
 					g2.drawLine(30,30,55,75);
					g2.drawLine(55,30,30,75);
					cross3=1;
				}
				else
				if((count%2)== 0)
				{	g22.setStroke(new BasicStroke(10));
					g2.drawOval(20,20,50,70);
					oval3=1;
				}
				winn();
				winn2();
				
	}
//event on button4
	if(e.getSource()==bb)
	{
		check();
//performing operation on current button				
				flag[3]=1;
				bb.setBackground(Color.RED);
				count=0;
				for(int i=0;i<9;i++)
				{
					if (flag[i]==1)
					count++;
				}
				if((count%2)!= 0)
				{	g23.setStroke(new BasicStroke(10));
					g3.drawLine(55,30,30,75);
					g3.drawLine(30,30,55,75);
					cross4=1;
				}
				else
				{	g23.setStroke(new BasicStroke(10));
					g3.drawOval(20,20,50,70);
					oval4=1;
				}
				winn();
				winn2();
				
	}
//event on button5
	if(e.getSource()==b3)
	{
		check();
//performing operation on current button				
				flag[4]=1;
				b3.setBackground(Color.RED);
				count=0;
				for(int i=0;i<9;i++)
				{
					if (flag[i]==1)
					count++;
				}
				if((count%2)!= 0)
				{	g24.setStroke(new BasicStroke(10));
					g4.drawLine(55,30,30,75);
					g4.drawLine(30,30,55,75);
					cross5=1;
				}
				else
				{	g24.setStroke(new BasicStroke(10));
					g4.drawOval(20,20,50,70);
					oval5=1;
				}
				winn();
				winn2();
				


	}
//event on button6
	if(e.getSource()==b4)
	{	check();
//performing operation on current button				
				flag[5]=1;
				b4.setBackground(Color.RED);
				count=0;
				for(int i=0;i<9;i++)
				{
					if (flag[i]==1)
					count++;
				}
				if((count%2)!= 0)
				{	g25.setStroke(new BasicStroke(10));
					g5.drawLine(55,30,30,75);
					g5.drawLine(30,30,55,75);
					cross6=1;
				}
				else
				{	g25.setStroke(new BasicStroke(10));
					g5.drawOval(20,20,50,70);
					oval6=1;
				}
				winn();
				winn2();
				
		}
//event on button7
		if(e.getSource()==b5)
		{	check();
//performing operation on current button				
				flag[6]=1;
				b5.setBackground(Color.RED);
				count=0;
				for(int i=0;i<9;i++)
				{
					if (flag[i]==1)
					count++;
				}
				if((count%2)!= 0)
				{	g26.setStroke(new BasicStroke(10));
					g6.drawLine(55,30,30,75);
					g6.drawLine(30,30,55,75);
					cross7=1;
				}
				else
				{	g26.setStroke(new BasicStroke(10));
					g6.drawOval(20,20,50,70);
					oval7=1;
				}
				winn();
				winn2();
				
		}
//event on button8
		if(e.getSource()==b6)
		{	check();
//performing operation on current button				
				flag[7]=1;
				b6.setBackground(Color.RED);
				count=0;
				for(int i=0;i<9;i++)
				{
					if (flag[i]==1)
					count++;
				}
				if((count%2)!= 0)
				{	g27.setStroke(new BasicStroke(10));
					g7.drawLine(55,30,30,75);
					g7.drawLine(30,30,55,75);
					cross8=1;
				}
				else
				{	g27.setStroke(new BasicStroke(10));
					g7.drawOval(20,20,50,70);
					oval8=1;
				}
				winn();
				winn2();
				
		}

//event on button9
		if(e.getSource()==b7)
		{	check();
//performing operation on current button				
				flag[8]=1;
				b7.setBackground(Color.RED);
				count=0;
				for(int i=0;i<9;i++)
				{
					if (flag[i]==1)
					count++;
				}
				if((count%2)!= 0)
				{	g28.setStroke(new BasicStroke(10));
					g8.drawLine(55,30,30,75);
					g8.drawLine(30,30,55,75);
					cross9=1;
				}
				else
				{	g28.setStroke(new BasicStroke(10));
					g8.drawOval(20,20,50,70);
					oval9=1;
				}
				winn();
				winn2();
				
		}

}



}

	public static void main(String... s)
	{
		new Tanishk("TicTacToe");
	}
}
class WindowEventListener extends WindowAdapter
{
	public void windowClosing(WindowEvent e1)
	{
		System.exit(0);
	}
}
