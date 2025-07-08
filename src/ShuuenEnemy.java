
public class ShuuenEnemy extends Enemy{
	public ShuuenEnemy(double x,double y,double vx,double vy,double hx,double hy) {
		super(x,y,vx,vy,hx,hy);
		life=200         ;               
  	}
	public void draw(MyFrame f){
		f.setColor(200,0,200);
		f.fillOval(x, y, 150, 150);
		f.setColor(255,255,255);
		f.fillOval(x+25, y,100,150);
		f.setColor(200,0,200);
		f.fillOval(x, y+60, 150, 30);

	}
}
