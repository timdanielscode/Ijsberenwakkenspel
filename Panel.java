package ijsberenspel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// Het paneel
/**
 * 
 * Klasse Panel representeerd de body, de dobbelstenen, labels en tekstvakken.
 * @author Tim Daniels
 * @see datum 4-3-2018
 * @see Panel
 * 
 */
class Panel extends JPanel {
	private JButton controlerenB, werpenB, nieuwSpelB, oplossingB;
	private JLabel wakkenL, ijsberenL, pinguinsL, aDobbelstenenL, wakkenL2, ijsberenL2, pinguinsL2, aKeerGegooid, aKeerFout, aKeerGoed, tipsT;
	private JTextField wakkenT, ijsberenT, pinguinsT, aDobbelstenenT, wakkenT2, ijsberenT2, pinguinsT2, aKeerGegooidT, aKeerFoutT, aKeerGoedT;
	private Color buitenrand, buitenrand2, vakken, middenstuk, tekstVakGroen, tekstVakRood, tekstVakWit, tipC, achtergrond;
	private int werpen, controlerenWakken, controlerenIJsberen, controlerenPinguins, aantalKeerGegooid, aantalKeerFout, aantalKeerGoed, aantalKeerWerpen, tips;
	
	// Oproepen van de dobbelstenen
	private Dobbelstenen dobbelsteen1 = new Dobbelstenen(150,287);
	private Dobbelstenen dobbelsteen2 = new Dobbelstenen(305,287);  
	private Dobbelstenen dobbelsteen3 = new Dobbelstenen(460,287);
	private Dobbelstenen dobbelsteen4 = new Dobbelstenen(615,287);
	private Dobbelstenen dobbelsteen5 = new Dobbelstenen(770,287);
	private Dobbelstenen dobbelsteen6 = new Dobbelstenen(925,287);
	private Dobbelstenen dobbelsteen7 = new Dobbelstenen(150,416);
	private Dobbelstenen dobbelsteen8 = new Dobbelstenen(305,416);
	private Dobbelstenen dobbelsteen9 = new Dobbelstenen(460,416);
	private Dobbelstenen dobbelsteen10 = new Dobbelstenen(615,416);
	private Dobbelstenen dobbelsteen11 = new Dobbelstenen(770,416);
	private Dobbelstenen dobbelsteen12 = new Dobbelstenen(925,416);
	private Dobbelstenen tip = new Dobbelstenen(140, 660);
	private Dobbelstenen tip2 = new Dobbelstenen(140, 660);

	//constructor
	public Panel() {
	setLayout( null );
	achtergrond = new Color( 53, 53, 53); 
	buitenrand = new Color( 0, 0, 0);
	buitenrand2 = new Color( 0, 89, 132);
	vakken = new Color( 0, 147, 217);
	middenstuk = new Color( 19, 179, 255);
	tekstVakGroen = new Color(125,255,100);
	tekstVakRood = new Color(241,89,89);
	tekstVakWit = new Color(250,250,250);
	tipC = new Color(250,250,250);
	
	// Buttons
	nieuwSpelB = new JButton( " Nieuw spel ");
	nieuwSpelB.setBounds(850, 700, 180, 30);
	nieuwSpelB.addActionListener( new nieuwSpelBHandler() );
	add (nieuwSpelB);
	controlerenB = new JButton( "Controleren" );
	controlerenB.setBounds(445, 200, 180, 30);
	controlerenB.addActionListener( new controlerenBHandler() );
	add (controlerenB);
	werpenB = new JButton(" werpen ");
	werpenB.addActionListener( new werpenBHandler() );
	werpenB.setBounds(80, 200, 150, 30);
	add (werpenB);
	oplossingB = new JButton( "De Oplossing");
	oplossingB.setBounds(445, 700, 200, 30);									 
	oplossingB.addActionListener( new oplossingBHandler() );					
	add (oplossingB);															
	
	// lettertype
	nieuwSpelB.setFont(new Font("Courier", Font.BOLD, 18));
	controlerenB.setFont(new Font("Courier", Font.BOLD, 18));
	werpenB.setFont(new Font("Courier", Font.BOLD, 18));
	oplossingB.setFont(new Font("Courier", Font.BOLD, 18));

	// Labels
	wakkenL = new JLabel();
	wakkenL.setBounds(445, 30, 200, 100);
	wakkenL.setFont(new Font("Courier", Font.BOLD, 25));
	wakkenL.setText( "Wakken:" );
	add (wakkenL);
	wakkenL2 = new JLabel();
	wakkenL2.setBounds(445, 533, 200, 100);
	wakkenL2.setText( "Wakken:" );
	add (wakkenL2);
	ijsberenL = new JLabel();
	ijsberenL.setBounds(445, 60, 200, 100);
	ijsberenL.setText( "Ijsberen:");
	add (ijsberenL);
	ijsberenL2 = new JLabel();
	ijsberenL2.setBounds(445, 563, 200, 100);
	ijsberenL2.setText( "Ijsberen:");
	add (ijsberenL2);
	pinguinsL = new JLabel();
	pinguinsL.setBounds(445, 90, 200, 100);
	pinguinsL.setText( "Pinguin's:" );
	add (pinguinsL);
	pinguinsL2 = new JLabel();
	pinguinsL2.setBounds(445, 593, 200, 100);
	pinguinsL2.setText( "Pinguin's:" );
	add (pinguinsL2);
	aDobbelstenenL = new JLabel();
	aDobbelstenenL.setBounds(80, 30, 200, 100);
	aDobbelstenenL.setText( "Aantal dobbelstenen:");
	add (aDobbelstenenL);
	aKeerGegooid = new JLabel();
	aKeerGegooid.setBounds(80, 60, 200, 100);		
	aKeerGegooid.setText( "Aantal keer gegooid:");
	add (aKeerGegooid);
	aKeerFout = new JLabel();
	aKeerFout.setBounds(800, 30, 200, 100);
	aKeerFout.setText( "Aantal keer fout geraden:");
	add (aKeerFout);
	aKeerGoed = new JLabel();
	aKeerGoed.setBounds(800, 60, 230, 100);
	aKeerGoed.setText( "Aantal keer goed geraden:");
	add (aKeerGoed);	
	tipsT = new JLabel();
	tipsT.setBounds(210, 433, 300,300);
	tipsT.setText("Tips:");
	add (tipsT);
	
	// lettertype
	wakkenL.setFont(new Font("Serif", Font.BOLD, 18));
	wakkenL2.setFont(new Font("Serif", Font.BOLD, 18));
	ijsberenL.setFont(new Font("Serif", Font.BOLD, 18));
	ijsberenL2.setFont(new Font("Serif", Font.BOLD, 18));
	pinguinsL.setFont(new Font("Serif", Font.BOLD, 18));
	pinguinsL2.setFont(new Font("Serif", Font.BOLD, 18));
	aDobbelstenenL.setFont(new Font("Serif", Font.BOLD, 20));
	aKeerGegooid.setFont(new Font("Serif", Font.BOLD, 18));
	aKeerFout.setFont(new Font("Serif", Font.BOLD, 18));
	aKeerGoed.setFont(new Font("Serif", Font.BOLD, 18));
	tipsT.setFont(new Font("Serif", Font.BOLD, 18));
	
	// Textfields
	wakkenT = new JTextField(10);
	wakkenT.setBounds(535, 72, 25, 20);
	add (wakkenT);
	wakkenT2 = new JTextField(10);
	wakkenT2.setBounds(535, 573, 25, 20);
	wakkenT2.setFocusable(false);
	add (wakkenT2);
	ijsberenT = new JTextField(10);
	ijsberenT.setBounds(535, 100, 25, 20);
	add (ijsberenT);
	ijsberenT2 = new JTextField(10);
	ijsberenT2.setBounds(535, 603, 25, 20);
	ijsberenT2.setFocusable(false);
	add (ijsberenT2);
	pinguinsT = new JTextField(10);
	pinguinsT.setBounds(535, 131, 25, 20);
	add (pinguinsT);
	pinguinsT2 = new JTextField(10);
	pinguinsT2.setBounds(535, 633, 25, 20);
	pinguinsT2.setFocusable(false);
	add (pinguinsT2);
	aDobbelstenenT = new JTextField(10);
	aDobbelstenenT.setBounds(270, 72, 25, 20);
	add (aDobbelstenenT);
	aKeerGegooidT = new JTextField(10);
	aKeerGegooidT.setBounds(270, 100, 25, 20);
	aKeerGegooidT.setFocusable(false);
	add (aKeerGegooidT);
	aKeerFoutT = new JTextField(10);
	aKeerFoutT.setBounds(1015, 72, 25, 20);
	aKeerFoutT.setFocusable(false);
	add (aKeerFoutT);
	aKeerGoedT = new JTextField(10);
	aKeerGoedT.setBounds(1015, 100, 25, 20);
	aKeerGoedT.setFocusable(false);
	add (aKeerGoedT);

	// aantal gooien begin
	aantalKeerGegooid = 1;
	oplossingB.setEnabled(false);
	nieuwSpelB.setEnabled(false);
	controlerenB.setEnabled(false);
	wakkenT.setFocusable(false);
	ijsberenT.setFocusable(false);
	pinguinsT.setFocusable(false);
}	
	// teken compoment voor de stenen en het frame
	/**
	 * 
	 * paintcomponent tekent de body en de positie van de dobbelstenen.
	 * @author Tim Daniels
	 * @see datum 4-3-2018
	 * @see Panel
	 * 
	 */
	public void paintComponent( Graphics g ) {
		super.paintComponent( g );
		g.setColor( achtergrond );
		g.fillRect(0, 0, 120000, 85000);
		g.setColor( buitenrand );
		g.fillRect(40, 40, 1095, 723);
		g.setColor( buitenrand2 );
		g.fillRect(50, 50, 1075, 200);
		g.fillRect(50, 553, 1075, 200);
		g.setColor( vakken );
		g.fillRect(60, 60, 345, 180);
		g.fillRect(415, 60, 345, 180);
		g.fillRect(770, 60, 345, 180);
		g.fillRect(60, 563, 345, 180);
		g.fillRect(415, 563, 345, 180);
		g.fillRect(770, 563, 345, 180);
		g.setColor( middenstuk );
		g.fillRect(50, 260, 1075, 283);
		// voor de tip2
		if (werpen < 3 || werpen > 12) {
			setFont(new Font("Serif", Font.BOLD, 18));
			g.setColor( tipC );	
			tip2.tip(g);
		}
		// begin tekenen van de stenen
		else if (werpen == 3) {
			dobbelsteen1.tekenDobbelsteenOgen(g);
			dobbelsteen2.tekenDobbelsteenOgen(g);
			dobbelsteen3.tekenDobbelsteenOgen(g);
			setFont(new Font("Serif", Font.BOLD, 18));
			g.setColor( tipC );	
			tip.tip(g);
		}
		else if (werpen == 4) {
			dobbelsteen1.tekenDobbelsteenOgen(g);
			dobbelsteen2.tekenDobbelsteenOgen(g);
			dobbelsteen3.tekenDobbelsteenOgen(g);
			dobbelsteen4.tekenDobbelsteenOgen(g);
			setFont(new Font("Serif", Font.BOLD, 18));
			g.setColor( tipC );	
			tip.tip(g);
		}
		else if (werpen == 5) {
			dobbelsteen1.tekenDobbelsteenOgen(g);
			dobbelsteen2.tekenDobbelsteenOgen(g);
			dobbelsteen3.tekenDobbelsteenOgen(g);
			dobbelsteen4.tekenDobbelsteenOgen(g);
			dobbelsteen5.tekenDobbelsteenOgen(g);
			setFont(new Font("Serif", Font.BOLD, 18));
			g.setColor( tipC );	
			tip.tip(g);
		}	
		else if (werpen == 6) {
			dobbelsteen1.tekenDobbelsteenOgen(g);
			dobbelsteen2.tekenDobbelsteenOgen(g);
    	  	dobbelsteen3.tekenDobbelsteenOgen(g);
    	  	dobbelsteen4.tekenDobbelsteenOgen(g);
    	  	dobbelsteen5.tekenDobbelsteenOgen(g);
    	  	dobbelsteen6.tekenDobbelsteenOgen(g);
    		setFont(new Font("Serif", Font.BOLD, 18));
			g.setColor( tipC );	
    	  	tip.tip(g);
		}
		else if (werpen == 7) {
			dobbelsteen1.tekenDobbelsteenOgen(g);
			dobbelsteen2.tekenDobbelsteenOgen(g);
			dobbelsteen3.tekenDobbelsteenOgen(g);
			dobbelsteen4.tekenDobbelsteenOgen(g);
			dobbelsteen5.tekenDobbelsteenOgen(g);
			dobbelsteen6.tekenDobbelsteenOgen(g);
			dobbelsteen7.tekenDobbelsteenOgen(g);
			setFont(new Font("Serif", Font.BOLD, 18));
			g.setColor( tipC );	
			tip.tip(g);
		}
		else if (werpen == 8) {
			dobbelsteen1.tekenDobbelsteenOgen(g);
			dobbelsteen2.tekenDobbelsteenOgen(g);
			dobbelsteen3.tekenDobbelsteenOgen(g);
			dobbelsteen4.tekenDobbelsteenOgen(g);
			dobbelsteen5.tekenDobbelsteenOgen(g);
			dobbelsteen6.tekenDobbelsteenOgen(g);
			dobbelsteen7.tekenDobbelsteenOgen(g);
			dobbelsteen8.tekenDobbelsteenOgen(g);
			setFont(new Font("Serif", Font.BOLD, 18));
			g.setColor( tipC );	
			tip.tip(g);
		}
		else if (werpen == 9) {
			dobbelsteen1.tekenDobbelsteenOgen(g);
			dobbelsteen2.tekenDobbelsteenOgen(g);
			dobbelsteen3.tekenDobbelsteenOgen(g);
			dobbelsteen4.tekenDobbelsteenOgen(g);
			dobbelsteen5.tekenDobbelsteenOgen(g);
			dobbelsteen6.tekenDobbelsteenOgen(g);
			dobbelsteen7.tekenDobbelsteenOgen(g);
			dobbelsteen8.tekenDobbelsteenOgen(g);
			dobbelsteen9.tekenDobbelsteenOgen(g);
			setFont(new Font("Serif", Font.BOLD, 18));
			g.setColor( tipC );	
			tip.tip(g);
		}
		else if (werpen == 10) {
			dobbelsteen1.tekenDobbelsteenOgen(g);
			dobbelsteen2.tekenDobbelsteenOgen(g);
			dobbelsteen3.tekenDobbelsteenOgen(g);
			dobbelsteen4.tekenDobbelsteenOgen(g);
			dobbelsteen5.tekenDobbelsteenOgen(g);
			dobbelsteen6.tekenDobbelsteenOgen(g);
			dobbelsteen7.tekenDobbelsteenOgen(g);
			dobbelsteen8.tekenDobbelsteenOgen(g);
			dobbelsteen9.tekenDobbelsteenOgen(g);
			dobbelsteen10.tekenDobbelsteenOgen(g);
			setFont(new Font("Serif", Font.BOLD, 18));
			g.setColor( tipC );	
			tip.tip(g);
		}
		else if (werpen == 11) {
			dobbelsteen1.tekenDobbelsteenOgen(g);
			dobbelsteen2.tekenDobbelsteenOgen(g);
			dobbelsteen3.tekenDobbelsteenOgen(g);
			dobbelsteen4.tekenDobbelsteenOgen(g);
			dobbelsteen5.tekenDobbelsteenOgen(g);
			dobbelsteen6.tekenDobbelsteenOgen(g);
			dobbelsteen7.tekenDobbelsteenOgen(g);
			dobbelsteen8.tekenDobbelsteenOgen(g);
			dobbelsteen9.tekenDobbelsteenOgen(g);
			dobbelsteen10.tekenDobbelsteenOgen(g);
			dobbelsteen11.tekenDobbelsteenOgen(g);
			setFont(new Font("Serif", Font.BOLD, 18));
			g.setColor( tipC );	
			tip.tip(g);
		}
		else if (werpen == 12) {
			dobbelsteen1.tekenDobbelsteenOgen(g);
			dobbelsteen2.tekenDobbelsteenOgen(g);
    	  	dobbelsteen3.tekenDobbelsteenOgen(g);
    	  	dobbelsteen4.tekenDobbelsteenOgen(g);
    	  	dobbelsteen5.tekenDobbelsteenOgen(g);
    	  	dobbelsteen6.tekenDobbelsteenOgen(g);
    	  	dobbelsteen7.tekenDobbelsteenOgen(g);
    	  	dobbelsteen8.tekenDobbelsteenOgen(g);
    	  	dobbelsteen9.tekenDobbelsteenOgen(g);
    	  	dobbelsteen10.tekenDobbelsteenOgen(g);
    	  	dobbelsteen11.tekenDobbelsteenOgen(g);
    	  	dobbelsteen12.tekenDobbelsteenOgen(g);
    		setFont(new Font("Serif", Font.BOLD, 18));
			g.setColor( tipC );	
    	  	tip.tip(g);
		}
	}
	/**
	 * 
	 * Klasse werpenBHandler is de constructie voor de dobbelstenen om deze correct te laten tekenen en
	 * zorgt er onder andere ook voor dat deze constructie het aantal ogen op de juiste manier optelt.
	 * @author Tim Daniels
	 * @see datum 4-3-2018
	 * @see Panel
	 * 
	 */
	class werpenBHandler implements ActionListener {
		public void actionPerformed( ActionEvent e ) {
			// wat er gebeurt na de invoer van het tekstvak aantal dobbelstenen
			int invoer = Integer.parseInt(aDobbelstenenT.getText());
				if (invoer == 3 || invoer == 4 || invoer == 5|| invoer == 6|| invoer == 7|| invoer == 8|| 
					invoer == 9|| invoer == 10|| invoer == 11 || invoer == 12) {
					werpen = invoer;
					aDobbelstenenT.setBackground ( tekstVakWit );
				    String aantalGegooid = Integer.toString(aantalKeerGegooid);
				    aKeerGegooidT.setText(aantalGegooid);
					aantalKeerGegooid++;
					wakkenT.selectAll();
					wakkenT.setFocusable(true);		
					ijsberenT.setFocusable(true);
					pinguinsT.setFocusable(true);
					controlerenB.setEnabled(true);
					wakkenT.setBackground( tekstVakWit );
					ijsberenT.setBackground( tekstVakWit );
					pinguinsT.setBackground( tekstVakWit );
				    wakkenT.setText ("");
				    ijsberenT.setText ("");
				    pinguinsT.setText ("");
				    wakkenT2.setText ("");
				    ijsberenT2.setText ("");
				    pinguinsT2.setText ("");
				    tip.randomTips();	
					repaint();
				}		
				// als de invoer lager dan drie is
				if (invoer < 3 || invoer > 12){
					controlerenB.setEnabled(false);
					wakkenT.setFocusable(false);
					ijsberenT.setFocusable(false);
					pinguinsT.setFocusable(false);									
					werpen = 0;
					tip2.tip2();			
					wakkenT.setText("");
					ijsberenT.setText(""); 
					pinguinsT.setText("");
					wakkenT2.setText("");
					ijsberenT2.setText(""); 
					pinguinsT2.setText("");		
					aDobbelstenenT.setBackground ( tekstVakRood ); 
					wakkenT.setBackground( tekstVakWit );
					ijsberenT.setBackground( tekstVakWit );
					pinguinsT.setBackground( tekstVakWit );
				}     
				// laat drie dobbelstnenen zien als invoer drie is en tel de wakken,ijsberen en pinguins op
				else if (werpen == 3){
			        dobbelsteen1.random();
			        dobbelsteen2.random();
			        dobbelsteen3.random();
			        controlerenWakken =   
			       		dobbelsteen1.aantalWakken() + dobbelsteen2.aantalWakken() + dobbelsteen3.aantalWakken();
			       	controlerenIJsberen =   
			        	dobbelsteen1.aantalIJsberen() + dobbelsteen2.aantalIJsberen() + dobbelsteen3.aantalIJsberen();
			       	controlerenPinguins =   
			        	dobbelsteen1.aantalPinguins() + dobbelsteen2.aantalPinguins() + dobbelsteen3.aantalPinguins();          	
		        }
				// laat vier dobbelstnenen zien als invoer vier is en tel de wakken,ijsberen en pinguins op
				else if (werpen == 4){
					dobbelsteen1.random();
			       	dobbelsteen2.random();
			       	dobbelsteen3.random();
			       	dobbelsteen4.random();
		     		controlerenWakken =   
				       	dobbelsteen1.aantalWakken() + dobbelsteen2.aantalWakken() + dobbelsteen3.aantalWakken() + dobbelsteen4.aantalWakken();
			   		controlerenIJsberen =   
				       	dobbelsteen1.aantalIJsberen() + dobbelsteen2.aantalIJsberen() + dobbelsteen3.aantalIJsberen() + 
				       	dobbelsteen4.aantalIJsberen();
		       		controlerenPinguins =   
				       	dobbelsteen1.aantalPinguins() + dobbelsteen2.aantalPinguins() + dobbelsteen3.aantalPinguins() + 
				       	dobbelsteen4.aantalPinguins();
		        }
				// laat vijf dobbelstnenen zien als invoer vijf is en tel de wakken,ijsberen en pinguins op
				else if (werpen == 5){
					dobbelsteen1.random();
			       	dobbelsteen2.random();
			       	dobbelsteen3.random();
			       	dobbelsteen4.random();
			       	dobbelsteen5.random();
			   		controlerenWakken =    
			   			dobbelsteen1.aantalWakken() + dobbelsteen2.aantalWakken() + dobbelsteen3.aantalWakken() + dobbelsteen4.aantalWakken() +
			   			dobbelsteen5.aantalWakken();
			  		controlerenIJsberen =   
			      		dobbelsteen1.aantalIJsberen() + dobbelsteen2.aantalIJsberen() + dobbelsteen3.aantalIJsberen() + 
			      		dobbelsteen4.aantalIJsberen() + dobbelsteen5.aantalIJsberen();
			     	controlerenPinguins =   
			     		dobbelsteen1.aantalPinguins() + dobbelsteen2.aantalPinguins() + dobbelsteen3.aantalPinguins() + 
			     		dobbelsteen4.aantalPinguins() + dobbelsteen5.aantalPinguins();
		        }	   
				// laat zes dobbelstnenen zien als invoer zes is en tel de wakken,ijsberen en pinguins op
				else if (werpen == 6){
			        dobbelsteen1.random();
			        dobbelsteen2.random();
		        	dobbelsteen3.random();
		        	dobbelsteen4.random();
		         	dobbelsteen5.random();
		         	dobbelsteen6.random();
		           	controlerenWakken =   
		       			dobbelsteen1.aantalWakken() + dobbelsteen2.aantalWakken() + dobbelsteen3.aantalWakken() + dobbelsteen4.aantalWakken() +
				        dobbelsteen5.aantalWakken() + dobbelsteen6.aantalWakken();
		           	controlerenIJsberen =   
		     			dobbelsteen1.aantalIJsberen() + dobbelsteen2.aantalIJsberen() + dobbelsteen3.aantalIJsberen() +
				        dobbelsteen4.aantalIJsberen() + dobbelsteen5.aantalIJsberen() + dobbelsteen6.aantalIJsberen();
		           	controlerenPinguins =   
			   			dobbelsteen1.aantalPinguins() + dobbelsteen2.aantalPinguins() + dobbelsteen3.aantalPinguins() +
				        dobbelsteen4.aantalPinguins() + dobbelsteen5.aantalPinguins() + dobbelsteen6.aantalPinguins();
		        }
				// laat zeven dobbelstnenen zien als invoer zeven is en tel de wakken,ijsberen en pinguins op
				else if (werpen == 7){
		        	dobbelsteen1.random();
		        	dobbelsteen2.random();
		        	dobbelsteen3.random();
		        	dobbelsteen4.random();
		        	dobbelsteen5.random();
		        	dobbelsteen6.random();
		        	dobbelsteen7.random();
		       		controlerenWakken =   
		       			dobbelsteen1.aantalWakken() + dobbelsteen2.aantalWakken() + dobbelsteen3.aantalWakken() + dobbelsteen4.aantalWakken() +
				        dobbelsteen5.aantalWakken() + dobbelsteen6.aantalWakken() + dobbelsteen7.aantalWakken();
		       		controlerenIJsberen =   
		   				dobbelsteen1.aantalIJsberen() + dobbelsteen2.aantalIJsberen() + dobbelsteen3.aantalIJsberen() +
				        dobbelsteen4.aantalIJsberen() + dobbelsteen5.aantalIJsberen() + dobbelsteen6.aantalIJsberen() +
				        dobbelsteen7.aantalIJsberen();
		       		controlerenPinguins =   
		       			dobbelsteen1.aantalPinguins() + dobbelsteen2.aantalPinguins() + dobbelsteen3.aantalPinguins() +
				        dobbelsteen4.aantalPinguins() + dobbelsteen5.aantalPinguins() + dobbelsteen6.aantalPinguins() +
				        dobbelsteen7.aantalPinguins();
		        }
				// laat acht dobbelstnenen zien als invoer acht is en tel de wakken,ijsberen en pinguins op
				else if (werpen == 8){
		        	dobbelsteen1.random();
		        	dobbelsteen2.random();
		        	dobbelsteen3.random();
		        	dobbelsteen4.random();
		        	dobbelsteen5.random();
		        	dobbelsteen6.random();
		        	dobbelsteen7.random();
		        	dobbelsteen8.random();
		      		controlerenWakken =   
		   				dobbelsteen1.aantalWakken() + dobbelsteen2.aantalWakken() + dobbelsteen3.aantalWakken() + dobbelsteen4.aantalWakken() +
				        dobbelsteen5.aantalWakken() + dobbelsteen6.aantalWakken() + dobbelsteen7.aantalWakken() + dobbelsteen8.aantalWakken();
	      			controlerenIJsberen =   
			   			dobbelsteen1.aantalIJsberen() + dobbelsteen2.aantalIJsberen() + dobbelsteen3.aantalIJsberen() +
			   			dobbelsteen4.aantalIJsberen() + dobbelsteen5.aantalIJsberen() + dobbelsteen6.aantalIJsberen() +
				        dobbelsteen7.aantalIJsberen() + dobbelsteen8.aantalIJsberen();
	      			controlerenPinguins =   
			      		dobbelsteen1.aantalPinguins() + dobbelsteen2.aantalPinguins() + dobbelsteen3.aantalPinguins() +
				        dobbelsteen4.aantalPinguins() + dobbelsteen5.aantalPinguins() + dobbelsteen6.aantalPinguins() +
				        dobbelsteen7.aantalPinguins() + dobbelsteen8.aantalPinguins();
		        }
				// laat negen dobbelstnenen zien als invoer negen is en tel de wakken,ijsberen en pinguins op
				else if (werpen == 9){
		        	dobbelsteen1.random();
		        	dobbelsteen2.random();
		        	dobbelsteen3.random();
		        	dobbelsteen4.random();
		        	dobbelsteen5.random();
		        	dobbelsteen6.random();
		        	dobbelsteen7.random();
		        	dobbelsteen8.random();
		        	dobbelsteen9.random();
	      			controlerenWakken =   
		   				dobbelsteen1.aantalWakken() + dobbelsteen2.aantalWakken() + dobbelsteen3.aantalWakken() + dobbelsteen4.aantalWakken() +
				        dobbelsteen5.aantalWakken() + dobbelsteen6.aantalWakken() + dobbelsteen7.aantalWakken() + dobbelsteen8.aantalWakken() +
				        dobbelsteen9.aantalWakken();
	     			controlerenIJsberen =   
	      				dobbelsteen1.aantalIJsberen() + dobbelsteen2.aantalIJsberen() + dobbelsteen3.aantalIJsberen() +
	      				dobbelsteen4.aantalIJsberen() + dobbelsteen5.aantalIJsberen() + dobbelsteen6.aantalIJsberen() +
				        dobbelsteen7.aantalIJsberen() + dobbelsteen8.aantalIJsberen() + dobbelsteen9.aantalIJsberen();
	   				controlerenPinguins =   
			   			dobbelsteen1.aantalPinguins() + dobbelsteen2.aantalPinguins() + dobbelsteen3.aantalPinguins() +
				        dobbelsteen4.aantalPinguins() + dobbelsteen5.aantalPinguins() + dobbelsteen6.aantalPinguins() +
				        dobbelsteen7.aantalPinguins() + dobbelsteen8.aantalPinguins() + dobbelsteen9.aantalPinguins();
		        }
				// laat tien dobbelstnenen zien als invoer tien is en tel de wakken,ijsberen en pinguins op
				else if (werpen == 10){
		        	dobbelsteen1.random();
		        	dobbelsteen2.random();
		        	dobbelsteen3.random();
		        	dobbelsteen4.random();
		        	dobbelsteen5.random();
		        	dobbelsteen6.random();
		        	dobbelsteen7.random();
		        	dobbelsteen8.random();
		        	dobbelsteen9.random();
		        	dobbelsteen10.random();
      				controlerenWakken =   
		       			dobbelsteen1.aantalWakken() + dobbelsteen2.aantalWakken() + dobbelsteen3.aantalWakken() + dobbelsteen4.aantalWakken() +
				        dobbelsteen5.aantalWakken() + dobbelsteen6.aantalWakken() + dobbelsteen7.aantalWakken() + dobbelsteen8.aantalWakken() +
				        dobbelsteen9.aantalWakken() + dobbelsteen10.aantalWakken();
     				controlerenIJsberen =   
    	   				dobbelsteen1.aantalIJsberen() + dobbelsteen2.aantalIJsberen() + dobbelsteen3.aantalIJsberen() +
    			        dobbelsteen4.aantalIJsberen() + dobbelsteen5.aantalIJsberen() + dobbelsteen6.aantalIJsberen() +
    			        dobbelsteen7.aantalIJsberen() + dobbelsteen8.aantalIJsberen() + dobbelsteen9.aantalIJsberen() +
    				    dobbelsteen10.aantalIJsberen();
      				controlerenPinguins =   
           				dobbelsteen1.aantalPinguins() + dobbelsteen2.aantalPinguins() + dobbelsteen3.aantalPinguins() +
       			        dobbelsteen4.aantalPinguins() + dobbelsteen5.aantalPinguins() + dobbelsteen6.aantalPinguins() +
       			        dobbelsteen7.aantalPinguins() + dobbelsteen8.aantalPinguins() + dobbelsteen9.aantalPinguins() +
       			        dobbelsteen10.aantalPinguins();
		        }
				// laat elf dobbelstnenen zien als invoer elf is en tel de wakken,ijsberen en pinguins op
				else if (werpen == 11){
		        	dobbelsteen1.random();
		        	dobbelsteen2.random();
		        	dobbelsteen3.random();
		        	dobbelsteen4.random();
		        	dobbelsteen5.random();
		        	dobbelsteen6.random();
		        	dobbelsteen7.random();
		        	dobbelsteen8.random();
		        	dobbelsteen9.random();
		        	dobbelsteen10.random();
		        	dobbelsteen11.random();
  					controlerenWakken =   
	       				dobbelsteen1.aantalWakken() + dobbelsteen2.aantalWakken() + dobbelsteen3.aantalWakken() + dobbelsteen4.aantalWakken() +
	       				dobbelsteen5.aantalWakken() + dobbelsteen6.aantalWakken() + dobbelsteen7.aantalWakken() + dobbelsteen8.aantalWakken() +
	       				dobbelsteen9.aantalWakken() + dobbelsteen10.aantalWakken() + dobbelsteen11.aantalWakken();
  					controlerenIJsberen =   
  						dobbelsteen1.aantalIJsberen() + dobbelsteen2.aantalIJsberen() + dobbelsteen3.aantalIJsberen() +
  						dobbelsteen4.aantalIJsberen() + dobbelsteen5.aantalIJsberen() + dobbelsteen6.aantalIJsberen() +
  						dobbelsteen7.aantalIJsberen() + dobbelsteen8.aantalIJsberen() + dobbelsteen9.aantalIJsberen() +
  						dobbelsteen10.aantalIJsberen() + dobbelsteen11.aantalIJsberen();
  					controlerenPinguins =   
  						dobbelsteen1.aantalPinguins() + dobbelsteen2.aantalPinguins() + dobbelsteen3.aantalPinguins() +
  						dobbelsteen4.aantalPinguins() + dobbelsteen5.aantalPinguins() + dobbelsteen6.aantalPinguins() +
  						dobbelsteen7.aantalPinguins() + dobbelsteen8.aantalPinguins() + dobbelsteen9.aantalPinguins() +
  						dobbelsteen10.aantalPinguins() + dobbelsteen11.aantalPinguins();
		        }
				// laat twaalf dobbelstnenen zien als invoer twaalf is en tel de wakken,ijsberen en pinguins op
				else if (werpen == 12){
		        	dobbelsteen1.random();
		        	dobbelsteen2.random();
		        	dobbelsteen3.random();
		        	dobbelsteen4.random();
		        	dobbelsteen5.random();
		        	dobbelsteen6.random();
		        	dobbelsteen7.random();
		        	dobbelsteen8.random();
		        	dobbelsteen9.random();
		        	dobbelsteen10.random();
		        	dobbelsteen11.random();
		        	dobbelsteen12.random();
					controlerenWakken =   
			       		dobbelsteen1.aantalWakken() + dobbelsteen2.aantalWakken() + dobbelsteen3.aantalWakken() + dobbelsteen4.aantalWakken() +
			       		dobbelsteen5.aantalWakken() + dobbelsteen6.aantalWakken() + dobbelsteen7.aantalWakken() + dobbelsteen8.aantalWakken() +
			       		dobbelsteen9.aantalWakken() + dobbelsteen10.aantalWakken() + dobbelsteen11.aantalWakken() + dobbelsteen12.aantalWakken();  
					controlerenIJsberen =   
			       		dobbelsteen1.aantalIJsberen() + dobbelsteen2.aantalIJsberen() + dobbelsteen3.aantalIJsberen() +
			       		dobbelsteen4.aantalIJsberen() + dobbelsteen5.aantalIJsberen() + dobbelsteen6.aantalIJsberen() +
			       		dobbelsteen7.aantalIJsberen() + dobbelsteen8.aantalIJsberen() + dobbelsteen9.aantalIJsberen() +
			       		dobbelsteen10.aantalIJsberen() + dobbelsteen11.aantalIJsberen() + dobbelsteen12.aantalIJsberen();  
					controlerenPinguins =   
			       		dobbelsteen1.aantalPinguins() + dobbelsteen2.aantalPinguins() + dobbelsteen3.aantalPinguins() +
			       		dobbelsteen4.aantalPinguins() + dobbelsteen5.aantalPinguins() + dobbelsteen6.aantalPinguins() +
			       		dobbelsteen7.aantalPinguins() + dobbelsteen8.aantalPinguins() + dobbelsteen9.aantalPinguins() +
			       		dobbelsteen10.aantalPinguins() + dobbelsteen11.aantalPinguins() + dobbelsteen12.aantalPinguins();  
		        }
	    }
	}
	/**
	 * 
	 * Klasse controlerenBHandler is de constructie voor het controleren of de uitkomst juist is van 
	 * wat de speler heeft ingevuld en wat er moet gebeuren als de uitkomst juist of onjuist is.
	 * @author Tim Daniels
	 * @see datum 4-3-2018
	 * @see Panel
	 * 
	 */
	class controlerenBHandler implements ActionListener {
		public void actionPerformed( ActionEvent e ) {
			int invoer = Integer.parseInt(aDobbelstenenT.getText());
	        int invoerWakken = Integer.parseInt(wakkenT.getText());
	        int invoerIJsberen = Integer.parseInt(ijsberenT.getText());
	        int invoerPinguins = Integer.parseInt(pinguinsT.getText());
	        // als invoer van het tekstvak aantal dobbelstenen 3, 4, of t'm 12 is 
	        if (invoer == 3 || invoer == 4 || invoer == 5|| invoer == 6|| invoer == 7|| invoer == 8|| 
				invoer == 9|| invoer == 10|| invoer == 11 || invoer == 12) {
	        	tip.randomTips();	
				aDobbelstenenT.setBackground ( tekstVakWit );
				aDobbelstenenT.setFocusable(true);
				wakkenT.setFocusable(false);
				ijsberenT.setFocusable(false);
				pinguinsT.setFocusable(false);
				controlerenB.setEnabled(false);
				repaint();
			}   
	        // als het aantal wakken overeenkomt met het tekstvak wakken en invoer van het aantal dobbelstenen is hoger dan drie
	        if (controlerenWakken == invoerWakken && invoer >= 3 ) {
	        	wakkenT.setBackground( tekstVakGroen );	        	
	        } else {
	        	wakkenT.setBackground( tekstVakRood );	           
	        }  
	        // als het aantal ijsberen overeenkomt met het tekstvak ijsberen en invoer van het aantal dobbelstenen is hoger dan drie
	        if (controlerenIJsberen == invoerIJsberen && invoer >= 3) {
	        	ijsberenT.setBackground( tekstVakGroen );
	        } else {
	        	ijsberenT.setBackground( tekstVakRood );
	        }
	        // als het aantal pinguins overeenkomt met het tekstvak pinguins en invoer van het aantal dobbelstenen is hoger dan drie   
	        if (controlerenPinguins == invoerPinguins && invoer >= 3) {
	        	pinguinsT.setBackground( tekstVakGroen );
	        } else {
	        	pinguinsT.setBackground( tekstVakRood );
	        }
	        // als het aantal wakken,ijsberen en pinguins overeenkomt met het tekstvak wakken, ijsberen en pinguins tel aantal keer goed geworpen
	        if (controlerenWakken == invoerWakken && controlerenIJsberen == invoerIJsberen && controlerenPinguins == invoerPinguins) {
		        	aantalKeerGoed++;
		        	nieuwSpelB.setEnabled(true);
		        	oplossingB.setEnabled(true);
	        } else {
		        	aantalKeerFout++;
	        }
	        // als aantal keer fout geraden is hoger dan 9 laat oplossing knop zichtbaar om te kunnen klikken
		    if (aantalKeerFout > 9) {
		        oplossingB.setEnabled(true);
		    }
		    // houd het aantal keer goed geraden bij
		    String aantalGoed = Integer.toString(aantalKeerGoed);
	 		aKeerGoedT.setText(aantalGoed);	
	 		// houd het aantal keer fout geraden bij
	 		String aantalFout = Integer.toString(aantalKeerFout);
		    aKeerFoutT.setText(aantalFout);   		  		   
		}				
	}
	/**
	 * 
	 * Klasse oplossingBHandler is de korte constructie voor de oplossing van de dobbelstenen.
	 * @author Tim Daniels
	 * @see datum 4-3-2018
	 * @see Panel
	 * 
	 */
	class oplossingBHandler implements ActionListener {
		public void actionPerformed( ActionEvent e ) {
			// laat de oplossing zien van het aantal wakken ijsberen en pinguins
		    String aantalWakken = Integer.toString(controlerenWakken);
		    String aantalIJsberen = Integer.toString(controlerenIJsberen);
		    String aantalPinguins = Integer.toString(controlerenPinguins);
		    wakkenT2.setText (aantalWakken);
		    ijsberenT2.setText (aantalIJsberen);
		    pinguinsT2.setText (aantalPinguins);        
		}
	}
	/**
	 * 
	 * Klasse nieuwSpelHandler is de construcie voor het opnieuw spelen van het spel.
	 * @author Tim Daniels
	 * @see datum 4-3-2018
	 * @see Panel
	 * 
	 */
	class nieuwSpelBHandler implements ActionListener {
		public void actionPerformed( ActionEvent e ) {
			// dit gebeurt er als je op nieuw spel klikt(alles word als het ware gereset)
			// zorgt ervoor dat de dobbelstenen niet meer worden weergegeven na dat je op nieuw spel hebt geklikt de rest spreekt wel voor zich
			werpen = 0;	    
			aantalKeerGegooid = 1;
			aantalKeerFout = 0; 
			aDobbelstenenT.setText("");
			aKeerGegooidT.setText("");
			aKeerGoedT.setText("");
			aKeerFoutT.setText("");	
			wakkenT.setText("");
			ijsberenT.setText(""); 
			pinguinsT.setText("");
			wakkenT2.setText("");
			ijsberenT2.setText(""); 
			pinguinsT2.setText("");		
			wakkenT.setBackground( tekstVakWit );
			ijsberenT.setBackground( tekstVakWit );
			pinguinsT.setBackground( tekstVakWit );
			aDobbelstenenT.setBackground( tekstVakWit );		
			werpenB.setEnabled(true);
			controlerenB.setEnabled(true);
			oplossingB.setEnabled(false);
			nieuwSpelB.setEnabled(false);
			aDobbelstenenT.setFocusable(true);
		}
	}
}

		

	

	
