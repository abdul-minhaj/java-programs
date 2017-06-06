package swt;


import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

	public class SWTAssignment {
		   private static int counter = 0;
		   private static int counter1 = 0;

				public static void main(String[] args) {
				Display display = Display.getDefault();
			    Shell shell = new Shell(display);
			    shell.setText("Credit Card");
			   // shell.setBounds(200, 400, 520, 1000);
			   // shell.setLayout(new FillLayout(SWT.VERTICAL));
			    
			  //creating group 1
				Group g = new Group(shell, SWT.BORDER);
				g.setBounds(0, 0, 500, 560);
				 
			    //show all credit cards label 
			    	Label  showAll = new Label(g, SWT.BORDER );
			    	showAll.setBounds(20, 20, 120, 25);	
			    	showAll.setText("Show All Credit Cards");
				 
				//show all credit cards label 
				    Label  cardHolder = new Label(g, SWT.NONE);
				    cardHolder.setBounds(20, 65, 100, 25);
				    cardHolder.setText("Card Holder *");
				    
				// credit card Text box 
				    final Text cardHolderText = new Text(g, SWT.BORDER);
				    cardHolderText.setBounds(20, 90, 400, 25);
				    cardHolderText.setText("");
			   
			    
			    // credit or debit card label
			    	Label  creditOrDebitCard = new Label(g, SWT.NONE);
				    creditOrDebitCard.setBounds(20, 140, 120, 25);	
				    creditOrDebitCard.setText("Credit Or Debit Card * ");
				    
			    // credit or debit card Text
			    	final Text  creditOrDebitCardText = new Text(g, SWT.BORDER);
			    	creditOrDebitCardText.setBounds(20, 165, 200, 25);	
			    	creditOrDebitCardText.setTextLimit(16);
			    	
			    	creditOrDebitCardText.addListener(SWT.Verify, new Listener() {
					      public void handleEvent(Event e) {
					          String string = e.text;
					          char[] chars = new char[string.length()];// no of words
					          //public void getChars(int srcBeginIndex, int srcEndIndex, char[] destination, int dstBeginIndex) 
					          string.getChars(0, chars.length, chars, 0);
					          for (int i = 0; i < chars.length; i++) {
					            if (!('0' <= chars[i] && chars[i] <= '9')) {
					              e.doit = false;
					              return;
					            }
					          }
					        }
					      });   
			    
			    
				// Expiration Date label
				    Label  expirationDate = new Label(g, SWT.None);
				    expirationDate.setBounds(20, 215, 100, 25);	
				    expirationDate.setText("Expiration Date *");
				    
				    
				// drop down for date selection
				    Combo year = new Combo(g,SWT.DROP_DOWN | SWT.READ_ONLY);
				    for(int i=2000; i<2030; i++) {
				    year.add(""+i);}
				    year.select(17);
				    year.setBounds(110, 240, 80, 250);
				    
				    
				// drop down for month selection
				    Combo month = new Combo(g,SWT.DROP_DOWN | SWT.READ_ONLY);
				    month.setItems(new String[] {"January", "February", "March", "April", "May", "June",
				                                  "July", "August", "September", "October", "November", "December"
				                                  });
				    month.select(5);
				    month.setBounds(20, 240, 80, 250);
				    
				      
				    
				 // Security code for label
				    Label  securityCode = new Label(g, SWT.NONE);
				    securityCode.setBounds(335, 215, 100, 25);	
				    securityCode.setText("Security code * ");
				
				// Security code for text
				    final Text  securityCodeText = new Text(g, SWT.BORDER);
				    securityCodeText.setBounds(335, 240, 80, 25);	
				    securityCodeText.setText("");
				    
				    securityCodeText.setTextLimit(4);
			    	
				    securityCodeText.addListener(SWT.Verify, new Listener() {
					      public void handleEvent(Event e) {
					          String string = e.text;
					          char[] chars = new char[string.length()];// no of words
					          //public void getChars(int srcBeginIndex, int srcEndIndex, char[] destination, int dstBeginIndex) 
					          string.getChars(0, chars.length, chars, 0);
					          for (int i = 0; i < chars.length; i++) {
					            if (!('0' <= chars[i] && chars[i] <= '9')) {
					              e.doit = false;
					              return;
					            }
					          }
					          
					        }
					      }); 
				    
				    
				// Address 1
				    Label  address = new Label(g, SWT.NONE);
				    address.setBounds(20,290 , 80, 25);	
				    address.setText("Address * :");
				    
				//Address Text  
				    final Text  addressText = new Text(g, SWT.BORDER | SWT.WRAP);
				    addressText.setBounds(100, 285, 315, 25);	
				    addressText.setText("");
				    
				 // Address 2
				    Label  address2 = new Label(g, SWT.NONE);
				    address2.setBounds(20,330 , 80, 25);	
				    address2.setText("Address2 :");
				    
				// Address Text  
				    final Text  address2Text = new Text(g, SWT.BORDER | SWT.WRAP);
				    address2Text.setBounds(100, 325, 315, 25);	
				    address2Text.setText("");
				    //.....................
				    
				 // zipCode
				    Label zipCode = new Label(g, SWT.NONE);
				    zipCode.setBounds(20,370 , 80, 25);	
				    zipCode.setText("Zip Code * :");
				    
				// Zip Code Text  
				    final Text  zipCodeText = new Text(g, SWT.BORDER | SWT.WRAP);
				    zipCodeText.setBounds(100, 365, 315, 25);	
				    zipCodeText.setText("");
				    
				// City
				    Label  city = new Label(g, SWT.NONE);
				    city.setBounds(20,410 , 80, 25);	
				    city.setText("City :");
				    
				// City Text  
				    final Text  cityText = new Text(g, SWT.BORDER | SWT.WRAP);
				    cityText.setBounds(100, 405, 315, 25);	
				    cityText.setText("");
				      
				    
				 // State
				    Label  state = new Label(g, SWT.NONE);
				    state.setBounds(20,450 , 80, 25);	
				    state.setText("State :");
				    
				// State Text  
				    final Text  stateText = new Text(g, SWT.BORDER | SWT.WRAP);
				    stateText.setBounds(100, 445, 315, 25);	
				    stateText.setText(""); 
				    
				// Set as default check box 
				    Button setAsDefault = new Button(g,SWT.CHECK);
				    setAsDefault.setBounds(20, 485, 100, 25);	
				    setAsDefault.setText("Set As Default");
				    
				 // Save
				    Button save = new Button(g,SWT.PUSH);
				    save.setBounds(20, 525, 50, 20);
				    save.setText("Save");
				    			    
				    
				    
				 // Cancel
				    Button cancel = new Button(g,SWT.PUSH);
				    cancel.setBounds(80, 525, 50, 20);
				    cancel.setText(" Cancel"); 
				    cancel.addSelectionListener(new SelectionAdapter()
				    {
				      public void widgetSelected(SelectionEvent e)
				      {
				       
				       cardHolderText.setText("");
				       creditOrDebitCardText.setText("");
				       securityCodeText.setText("");
				       addressText.setText("");
				       address2Text.setText("");
				       zipCodeText.setText("");
				       cityText.setText("");
				       stateText.setText("");

				       }
				    });
				    
				    
				    
				    
				    // enter key 
				    
				    /* Save them in an arraylist */
			        final ArrayList<Text> textFields = new ArrayList<Text>();
			        textFields.add(cardHolderText);
			        textFields.add(creditOrDebitCardText);
			        textFields.add(securityCodeText);
			        textFields.add(addressText);
			        textFields.add(address2Text);
			        textFields.add(zipCodeText);
			        textFields.add(cityText);
			        textFields.add(stateText);
			    

			        /* save their position as well (not optimal, you can think of an easier method) */
			        final HashMap<Object, Integer> textFieldsMapping = new HashMap<Object, Integer>();
			        textFieldsMapping.put(cardHolderText, 0);
			        textFieldsMapping.put(creditOrDebitCardText, 1);
			        textFieldsMapping.put(securityCodeText, 2);
			        textFieldsMapping.put(addressText, 3);
			        textFieldsMapping.put(address2Text, 4);
			        textFieldsMapping.put(zipCodeText, 5);
			        textFieldsMapping.put(cityText, 6);
			        textFieldsMapping.put(stateText, 7);
			        
			        /* Define keylistener which takes care of using . as tab */
			        KeyListener keyListener = new KeyListener() {

			            @Override
			            public void keyReleased(KeyEvent e) {
			            }

			            @Override
			            public void keyPressed(KeyEvent e) {
			                /* if 'enter' pressed */
			                if(e.keyCode == SWT.CR)
			                	
			                {
			                	/* ignore this action */
			                    e.doit = false;

			                    /* get next text field */
			                    Text next = textFields.get(counter);

			                    /* force focus on this text field */
			                    next.setFocus();
			                    next.forceFocus();
			                }
			                else if (e.keyCode == SWT.ESC)
			                {
			                	 /* ignore this action */
			                    e.doit = false;

			                    /* get next text field */
			                    Text next = textFields.get(counter1);

			                    /* force focus on this text field */
			                    next.setFocus();
			                    next.forceFocus();
			                }
			            }
			        };
			        
			        /* Define focuslistener which sets current position */
			        FocusListener focusListener = new FocusListener() {

			            @Override
			            public void focusLost(FocusEvent e) {
			            }

			            @Override
			            public void focusGained(FocusEvent e) {
			                /* get current text field */
			                Text current = (Text)e.getSource();

			                /* get current position */
			                int currentPosition = textFieldsMapping.get(current);

			                /* set counter to next text field */
			                counter = (currentPosition + 1) % textFields.size();
			                counter1 = (currentPosition - 1) % textFields.size();
			            }
			        };

			        /* add keylistener to text fields */
			        cardHolderText.addKeyListener(keyListener);
			        creditOrDebitCardText.addKeyListener(keyListener);
			        securityCodeText.addKeyListener(keyListener);
			        addressText.addKeyListener(keyListener);
			        address2Text.addKeyListener(keyListener);
			        zipCodeText.addKeyListener(keyListener);
			        cityText.addKeyListener(keyListener);
			        stateText.addKeyListener(keyListener);
			        

			        /* add focuslistener to text fields */
			        cardHolderText.addFocusListener(focusListener);
			        creditOrDebitCardText.addFocusListener(focusListener);
			        securityCodeText.addFocusListener(focusListener);
			        addressText.addFocusListener(focusListener);
			        address2Text.addFocusListener(focusListener);
			        zipCodeText.addFocusListener(focusListener);
			        cityText.addFocusListener(focusListener);
			        stateText.addFocusListener(focusListener);
		
					shell.pack();
				    shell.open();
				    // Set up the event loop.
				    while (!shell.isDisposed()) {
				      if (!display.readAndDispatch()) {
				        // If no more entries in the event queue
				    	  
				        display.sleep();
				      }
				    }
				    display.dispose();
				  }

	}

				    

				
				
			