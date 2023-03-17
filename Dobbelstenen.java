package ijsberenspel;

import java.awt.*;

// declaraties
public class Dobbelstenen {
	private int aantalOgen, x, y, wakken, ijsberen, pinguins, tips,tip2;
	private Color achtergrondDobbelsteen,zwart;
	public Dobbelstenen(int x,int y) {
		achtergrondDobbelsteen = new Color(238,226,172);
		zwart = new Color(0,0,0);	
		this.x = x;
		this.y = y;	
	}
	
	// de body van de dobbelsteen
	public void tekenDobbelsteenOgen (Graphics g) {
		// de achtergrond van de dobbelsteeen
		g.setColor( achtergrondDobbelsteen );
		g.fillRoundRect(x, y, 100, 100, 30, 30);
		// de buitenrand van de dobbelsteen
		g.setColor( zwart );
		g.drawRoundRect(x, y, 100, 100, 30, 30);	
		g.drawRoundRect(x, y,101, 99, 30,30);	
		g.drawRoundRect(x, y,101, 100, 31,31);
		// de positie van de ogen
		g.setColor( zwart );
		if (aantalOgen == 1) {
	        g.fillOval((x+40), (y+40), 20, 20);
	    }
	    else  if (aantalOgen == 2) {
	        g.fillOval((x+10), (y+10), 20, 20);
	        g.fillOval((x+70), (y+70), 20, 20);
	    }
	    else  if (aantalOgen == 3) {
	        g.fillOval((x+10), (y+10), 20, 20);
	        g.fillOval((x+40), (y+40), 20, 20);
	        g.fillOval((x+70), (y+70), 20, 20);
	    }
	    else  if (aantalOgen == 4) {
	        g.fillOval((x+10), (y+10), 20, 20);
	        g.fillOval((x+70), (y+10), 20, 20);
	        g.fillOval((x+70), (y+70), 20, 20);
	        g.fillOval((x+10), (y+70), 20, 20);
	    }
	    else  if (aantalOgen == 5) {
	        g.fillOval((x+10), (y+10), 20, 20);
	        g.fillOval((x+70), (y+10), 20, 20);
	        g.fillOval((x+10), (y+70), 20, 20);
	        g.fillOval((x+70), (y+70), 20, 20);
	        g.fillOval((x+40), (y+40), 20, 20);
	    }
	    else if (aantalOgen == 6) {
	        g.fillOval((x+10), (y+10), 20, 20);
	        g.fillOval((x+10), (y+70), 20, 20);
	        g.fillOval((x+70), (y+10), 20, 20);
	        g.fillOval((x+70), (y+70), 20, 20);
	        g.fillOval((x+10), (y+40), 20, 20);
	        g.fillOval((x+70), (y+40), 20, 20);
	    }	  
	}

	// de tips op positie
	public void tip (Graphics g) {
		if(tips == 1) {
			g.drawString("De som is altijd zeven", (x+5),y);
		}
		if(tips == 1) {
			g.drawString("als het gaat om de pinguin's...", (x-20),(y+20));
		}
		if(tips == 2) {
			g.drawString("Na tien keer fout te hebben geraden", (x-45),y);
		}
		if(tips == 2) {
			g.drawString("kun je de oplossing bekijken", (x-23),(y+20));
		}
		if(tips == 2) {
			g.drawString("en nieuw spel beginnen...", (x-5),(y+40));
		}
		if(tips == 3) {
			g.drawString("Het oog in het midden is een...", (x-30),y);
		}
		if(tips == 4) {
			g.drawString("Er zijn alleen ijsberen en pinguin's", (x-40),y);
		}
		if(tips == 4) {
			g.drawString("wanneer er ook wakken zijn...", (x-23),(y+20));
		}
		if (tip2 == 5){
			g.drawString("Het aantal is minimaal drie...", (x-23),y);
		}
		if(tips == 6) {
			g.drawString("IJsberen vissen graag in een wak", (x-35),y);
		}
		if(tips == 6) {
			g.drawString("dit doen zij minimaal met z'n twee�n...", (x-55),(y+20));
		}
		if(tips == 7) {
			g.drawString("De ogen zijn", (x+40),y);
		}
		if(tips == 7) {
			g.drawString("de wakken, de ijberen en de pinguins...", (x-55),(y+20));
		}
		if(tips == 8) {
			g.drawString("LET OP!", (x+55),y);
		}
		if(tips == 8) {
			g.drawString("De pinguin's kun je niet zien...", (x-25),(y+20));
		}
	}
	
	// om het aantal ogen random te positioneren
	public int random() {	
		aantalOgen = (int) (6 * Math.random() + 1);
		return aantalOgen;
	}
	
	// om de tips random te positioneren
	public int randomTips() {		
		tips = (int) (8 * Math.random() + 1);
		return tips;
	}
	
	// de tip2 is voor de tip die je ziet als je lager dan drie gooit
	public int tip2() {		
		tip2 = 5;
		return tip2;
	}
	
	// de berekening voor het aantal wakken
	public int aantalWakken() {	
		if (aantalOgen == 1 || aantalOgen == 3 || aantalOgen == 5){
	        wakken = 1;
		} else {
			wakken = 0;
		}
		return wakken;	
	}
	
	// de berekening vor het aantal ijsberen
	public int aantalIJsberen(){
		if (aantalOgen == 3) {
	        ijsberen = 2;
		}
		else if (aantalOgen == 5) {
			ijsberen = 4;
		} else {
			ijsberen = 0;
			}
		return ijsberen;
	}
	
	// de berekening voor het aantal pinguins
	public int aantalPinguins() {
	    if (aantalOgen == 1){
	        pinguins = 6;
	    }
	    else if (aantalOgen == 3){
	    	pinguins = 4;
	    }
	    else if (aantalOgen == 5) {
	    	pinguins = 2;
	    } else {
	    	pinguins = 0;
	    	}
	    return pinguins;
	}
}
		
	
	
	
