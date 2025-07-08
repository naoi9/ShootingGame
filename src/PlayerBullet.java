
public class PlayerBullet extends Character{
	public PlayerBullet(double x,double y,double vx,double vy,double hx,double hy) {
		super(x,y,vx,vy,hx,hy);
	}
	public void draw(MyFrame f) {
		f.setColor(0, 128, 0);
		f.fillRect(x+10, y, 5,20 );
	}
}
