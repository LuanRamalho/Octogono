import java.awt.*;
import javax.swing.*;


public class Octógono extends JPanel 
{
        
    public Octógono() 
    {        
        super.setPreferredSize( new Dimension( 400, 400 ) ); 
        super.setBackground( Color.GREEN );
    }
    
    public void paintComponent( Graphics g ) 
    {
        super.paintComponent(g); 
        int larguraTela = super.getWidth();
        int alturaTela = super.getHeight();
        
        int centroX = larguraTela / 2;
        int centroY = alturaTela  / 2;
        
        int raio = 200;
        double angulo = Math.PI / 4.0d;
                
        int[] vetorX = new int[ 8 ];
        int[] vetorY = new int[ 8 ];
        
        for( int i = 0; i < 8; i++ ) 
        {
            double a = angulo * i;
            
            vetorX[i] = centroX + (int)Math.round( raio * Math.cos( a ) );
            vetorY[i] = centroY + (int)Math.round( raio * Math.sin( a ) );
            
        }        
        g.setColor(Color.RED);
        g.fillPolygon(vetorX, vetorY, 8);
        
        
        
    }
           
    public static void main(String[] args) {
        Octógono painel = new Octógono();
        
        JFrame f = new JFrame();
        f.setContentPane( painel ); 
        f.setTitle( "Octógono" ); 
        f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        f.setSize( 800, 800 ); 
        f.setLocationRelativeTo( f );                
        f.setVisible( true );
    }
    
}