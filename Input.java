//package CarroAndando;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



/**
 *
 * @author isaura
 */
public class Input implements KeyListener
{
    private boolean cima = false;
    private boolean baixo = false;
    private boolean esquerda = false;
    private boolean direita = false;

    
    
    //metodos getters
    public boolean isCima() 
    {
        return cima;
    }

    public boolean isBaixo() 
    {
        return baixo;
    }

    public boolean isEsquerda()
    {
        return esquerda;
    }

    public boolean isDireita()
    {
        return direita;
    }
    

    @Override
    public void keyTyped(KeyEvent ke) //Vai retornar o codigo da tecla
    {
        
    }

    @Override   //ke o cod da tecla a ser pressionado
    public void keyPressed(KeyEvent ke) //quando pressionar vc pressiona retorna escuta, diz o que ele escutou
    {
        //keyCode() retorna o codigo da tecla, keyEvent o evento q aconteceu
                                        //cima VK_UP
        
        if(ke.getKeyCode() == KeyEvent.VK_UP)
        {
            cima = true;
        }
        
        if(ke.getKeyCode() == KeyEvent.VK_DOWN)
         {
               baixo = true;     
         }
    }

    @Override
    public void keyReleased(KeyEvent ke) //quando vc pressiona e mantem os dadod la
    {
         if(ke.getKeyCode() == KeyEvent.VK_UP)
        {
            cima = false;
        }
         
         if(ke.getKeyCode() == KeyEvent.VK_DOWN)
        {
            baixo = false;
        }
         
         
    }
    
}
