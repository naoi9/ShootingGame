
public class StraightEnemy extends Enemy{
	public StraightEnemy(double x,double y,double vx,double vy,double hx,double hy) {
		super(x,y,vx,vy,hx,hy);
		life=5;
	}
	public void draw(MyFrame f){
		f.setColor(200,200,200);
		f.fillRect(x+8, y, 14, 15);
		f.setColor(200,200,200);
		f.fillRect(x+10, y+15, 10, 15);

	}
}
