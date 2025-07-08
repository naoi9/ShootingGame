
public class DropEnemy extends Enemy{
	public DropEnemy(double x,double y,double vx,double vy,double hx,double hy) {
		super(x,y,vx,vy,hx,hy);
	}
	public void move() {
		super.move();
		vy=vy+0.1;
	}
	public void draw(MyFrame f){
		f.setColor(0,0,200);
		f.fillRect(x, y, 30, 10);
		f.setColor(0,0,200);
		f.fillRect(x+10, y+10, 10, 20);
	}
}
