
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player extends Character implements KeyListener{
	public void draw(MyFrame f) {
		f.setColor(0, 128, 0);
		f.fillRect(x,y+20,30,10);
		f.setColor(200, 200, 200);
		f.fillRect(x+10,y,10,30);
	}
	public Player(double x,double y,double vx,double vy,double hx,double hy) {
		super(x,y,vx,vy,hx,hy);
	}
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			vx=-5;
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			vx=5;
		}
		if(e.getKeyCode()==KeyEvent.VK_SPACE) {
			GameWorld.playerBullets.add(new PlayerBullet(x,y,5,-7,1,1));
			GameWorld.playerBullets.add(new PlayerBullet(x,y,-5,-7,1,1));
			GameWorld.playerBullets.add(new PlayerBullet(x,y,0,-10,1,1));
			System.out.println("弾の数="+GameWorld.playerBullets.size());
		}
		if(e.getKeyCode()==KeyEvent.VK_ENTER) {
			System.out.println("enterキーが押されました");
			GameWorld.enterPressed=true;
		}
		
	}
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			vx=0;
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			vx=0;
		}
	}
	public void keyTyped(KeyEvent e) {
	}
	public void move() {
		super.move();
		if(x<0) x=0;
		if(x>370) x=370;
		
	}
}
