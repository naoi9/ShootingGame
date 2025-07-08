
public class Character {
	double x,y,vx,vy,hx,hy;
	public Character(double x,double y,double vx,double vy,double hx ,double hy){
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
		this.hx = hx;
		this.hy = hy;
	
	}
	public void move() {
		x+=vx;
		y+=vy;
	}
	public void draw(MyFrame f) {
		f.setColor(0, 128, 0);
		f.fillRect(x+10, y, 30, 30);
	}
}
