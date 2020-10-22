
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;

public class DrawObject extends Canvas implements MouseListener {

    private float _x, _y;
    private int mouseClicks=0;


    public DrawObject(){
        _x = _y =0;
        setSize(500, 500);
        setBackground(Color.BLUE);
        addMouseListener(this);
    }

    @Override
    public void paint(Graphics g) {
        if(_x==0 &&_y==0)return;
        Graphics2D g2d =(Graphics2D) g;
        g2d.setStroke(new BasicStroke(2.5F));
        Ellipse2D ellipse2D = new Ellipse2D.Float(_x, _y, 50, 50);


        g2d.draw(ellipse2D);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    	if(mouseClicks<2) {
        _x = e.getX();
        _y = e.getY();
        
        
       
        paint(getGraphics());
        mouseClicks++;
        }
    	else {
    		_x=0;
    		_y=0;
    		repaint();
    		mouseClicks=0;
    		
    		
    	}
    	
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
