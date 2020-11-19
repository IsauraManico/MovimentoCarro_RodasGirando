
//package CarroAndando;

import java.awt.Image;

/**
 *
 * @author isaura
 */
public class Carro 
{
    
   private Image roda;
   private Image roda2;
   
   private int posx,posy,largura,altura;
   
   private int angulo = 45;
   
  
   private int raio =10;
   private int raio2 = 20;
   
   private int velx = 3;

    public Carro(int posx, int posy, int largura, int altura) 
    {
        this.posx = posx;
        this.posy = posy;
        this.largura = largura;
        this.altura = altura;
    }

    public Image getRoda()
    {
        return roda;
    }

    public void setRoda(Image roda) 
    {
        this.roda = roda;
    }

    public int getPosx() 
    {
        return posx;
    }

    public void setPosx(int posx)
    {
        this.posx = posx;
    }

    public int getPosy()
    {
        return posy;
    }

    public void setPosy(int posy)
    {
        this.posy = posy;
    }

    public int getLargura() 
    {
        return largura;
    }

    public void setLargura(int largura)
    {
        this.largura = largura;
    }

    public int getAltura() 
    {
        return altura;
    }

    public void setAltura(int altura) 
    {
        this.altura = altura;
    }

    public int getRaio()
    {
        return raio;
    }

    public void setRaio(int raio)
    {
        this.raio = raio;
    }

    public Image getRoda2() 
    {
        return roda2;
    }

    public void setRoda2(Image roda2)
    {
        this.roda2 = roda2;
    }

    public int getRaio2() 
    {
        return raio2;
    }

    public void setRaio2(int raio2) 
    {
        this.raio2 = raio2;
    }

    public int getVelx() 
    {
        return velx;
    }

    public void setVelx(int velx)
    {
        this.velx = velx;
    }

    public void setAngulo(int angulo) 
    {
        this.angulo = angulo;
    }

    public int getAngulo() 
    {
        return angulo;
    }
    
    
    
    
    
    

  
    
   
   
   
   
   
    
}
