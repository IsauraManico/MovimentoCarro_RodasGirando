
//package CarroAndando;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author isaura
 */
public class Draw2 extends JPanel implements Runnable
{
    
    Thread thread = new Thread(this);
    
  
    
    Carro ca = new Carro(200,250,500,200);
    
    Carro rod1 = new Carro(300,400,100,100);
    
    Carro esf = new Carro(210,270,50,50);
    
    Input input = new Input();
    
    
    AffineTransform obj ;
    
    int raio = 3; //variavel responsavel pelo incremmento da translacao do affineTransform pai
   
    int c = 3;   //variavel responsavel pelo incremmento da translacao da esfera
    
    int y = 0;    // Variavel q auxilia no movimento de teclado com keyListener
    
    
    public Draw2()
    {
         
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(1000,1200);
                frame.add(this);
                frame.setTitle(" Translation of the car on java Graphics");
                thread.start();
                
                frame.addKeyListener(input);
                frame.setVisible(true);
                
                
                rod1.setRoda(new ImageIcon(getClass().getResource("imagem.png")).getImage());
                rod1.setRoda2(new ImageIcon(getClass().getResource("imagem.png")).getImage());
                
                
             
                
                
                
    }
    
    public void paint( Graphics g)
    {
        super.paint(g);
        
        Graphics2D g2d = ( Graphics2D)g;
        
       
        obj = new AffineTransform();
        
        obj.translate(raio+y, 0);
        
         g2d.setTransform(obj);
        
        g2d.setColor(Color.red);
        
        Rectangle2D.Double carro = new Rectangle2D.Double(ca.getPosx(),ca.getPosy(),ca.getLargura(),ca.getAltura());
        g2d.fill(carro);
        
        AffineTransform ob = g2d.getTransform();
        
       
        
         AffineTransform obj2 = g2d.getTransform();
        
         
        g2d.rotate(rod1.getAngulo(), rod1.getPosx()+(rod1.getAltura()/2), rod1.getPosy()+(rod1.getLargura()/2));
       
        
        g2d.drawImage(rod1.getRoda(), rod1.getPosx(),rod1.getPosy(),rod1.getLargura(),rod1.getAltura(), this);
        
        
       
        
       
        
        g2d.setTransform(obj2);
        
        obj2 = g2d.getTransform();
        
        g2d.rotate(rod1.getAngulo(), ((rod1.getPosx()+200)+(rod1.getAltura()/2)), rod1.getPosy()+(rod1.getLargura()/2));
        
       
        g2d.drawImage(rod1.getRoda(), (rod1.getPosx()+200),rod1.getPosy(),rod1.getLargura(),rod1.getAltura(),this);
        
        g2d.setTransform(obj2);
        
         g2d.translate(c+1, 0);
         Ellipse2D.Double esfera = new Ellipse2D.Double(esf.getPosx(),esf.getPosy(),esf.getLargura(),esf.getAltura());
            g2d.setColor(Color.blue);
            g2d.fill(esfera);
            
        g2d.setTransform(ob);
        ob = g2d.getTransform();

        
        
       
        
    }
    
    public void dormir()
    {
        try 
        {
            Thread.sleep(10);
        } 
        catch (InterruptedException ex) 
        {
            ex.printStackTrace();
        }
    }
    
    public void atualizar()
    {
        
        if( this.raio >= this.getWidth())
        {
            this.raio = raio *(0);
        }
        
        if(c >= ca.getLargura()-100)
        {
            c = c*0;
        }
        
         if( this.input.isCima())
             y-= 3;
         
         if(this.input.isBaixo())
                y+=3;
         
        
       
        this.raio++;
        rod1.setAngulo(rod1.getAngulo()+1);
        c++;
        
        
            
        
        
    }

    @Override
    public void run() 
    {
       
        while( true)
        {
            
            this.atualizar();
            this.repaint();
            
            this.dormir();
        }
    }
    
    
    
}
