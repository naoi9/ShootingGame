
public class RandomEnemy extends Enemy{
	public RandomEnemy(double x,double y,double vx,double vy,double hx,double hy) {
		super(x,y,vx,vy,hx,hy);
		life=2;
	}
	public void move() {
		super.move();
		vx=Math.random()*4-2;
	}
	public void draw(MyFrame f){
		f.setColor(200,0,0);
		f.fillRect(x, y, 10, 20);
		f.setColor(200,0,0);
		f.fillRect(x+20, y, 10, 20);
		f.setColor(200,0,0);
		f.fillRect(x+10, y+20, 10, 10);
	}
}
