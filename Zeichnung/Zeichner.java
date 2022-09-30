
/**
 * Exemplare dieser Klasse zeichnen eine einfache Zeichnung.
 * Um die Zeichnung auf dem Bildschirm anzuzeigen, muss die
 * zeichne-Operation an einem Exemplar aufgerufen werden.
 *
 * Diese Klasse ist als fruehes Java-Lehrbeispiel mit BlueJ gedacht.
 * 
 * @author  Petra Becker-Pechau
 */
class Zeichner
{
 
    /**
     * Zeichne die Zeichnung.
     */
    /**
     * 
     public void zeichne()
    {
        Quadrat wand;
        Quadrat fenster;
        Dreieck dach;
        Kreis sonne;

        wand = new Quadrat();
        wand.sichtbarMachen();
        wand.farbeAendern("gelb");
        wand.vertikalBewegen(80);
        wand.groesseAendern(100);
        
        fenster = new Quadrat();
        fenster.sichtbarMachen();
        fenster.farbeAendern("blau");
        fenster.horizontalBewegen(20);
        fenster.vertikalBewegen(100);

        dach = new Dreieck();  
        dach.sichtbarMachen();
        dach.groesseAendern(50, 140);
        dach.horizontalBewegen(60);
        dach.vertikalBewegen(70);

        sonne = new Kreis();
        sonne.sichtbarMachen();
        sonne.farbeAendern("rot");
        sonne.horizontalBewegen(180);
        sonne.vertikalBewegen(-10);
        sonne.groesseAendern(60);
    }
    */
     public void zeichne()
     {
         Kreis vrad;
         Kreis hrad;
         Kreis vfelge;
         Kreis hfelge;
         Quadrat boden;
         Quadrat kabiene;
         Quadrat fenster;
         
         vrad=new Kreis();
         vrad.sichtbarMachen();
         vrad.farbeAendern("schwarz");
         vrad.vertikalBewegen(100);
         vrad.groesseAendern(40);
         
         hrad=new Kreis();
         hrad.sichtbarMachen();
         hrad.farbeAendern("schwarz");
         hrad.vertikalBewegen(100);
         hrad.horizontalBewegen(150);
         hrad.groesseAendern(40);
         
         boden=new Quadrat();
         boden.sichtbarMachen();
         boden.farbeAendern("rot");
         boden.vertikalBewegen(90);
         
         boden=new Quadrat();
         boden.sichtbarMachen();
         boden.farbeAendern("rot");
         boden.vertikalBewegen(90);
         boden.horizontalBewegen(-30);
         
         boden=new Quadrat();
         boden.sichtbarMachen();
         boden.farbeAendern("rot");
         boden.vertikalBewegen(90);
         boden.horizontalBewegen(-60);
         
         boden=new Quadrat();
         boden.sichtbarMachen();
         boden.farbeAendern("rot");
         boden.vertikalBewegen(90);
         boden.horizontalBewegen(30);
         
         boden=new Quadrat();
         boden.sichtbarMachen();
         boden.farbeAendern("rot");
         boden.vertikalBewegen(90);
         boden.horizontalBewegen(60);
         
         boden=new Quadrat();
         boden.sichtbarMachen();
         boden.farbeAendern("rot");
         boden.vertikalBewegen(90);
         boden.horizontalBewegen(90);
         
         boden=new Quadrat();
         boden.sichtbarMachen();
         boden.farbeAendern("rot");
         boden.vertikalBewegen(90);
         boden.horizontalBewegen(120);
         
         kabiene=new Quadrat();
         kabiene.sichtbarMachen();
         kabiene.farbeAendern("rot");
         kabiene.groesseAendern(100);
         kabiene.horizontalBewegen(47
         );
     }
    
    
       
       
}
