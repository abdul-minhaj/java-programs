package swt;


import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

	public class SWTAssignment {

				public static void main(String[] args) {
			    Display display = new Display();
			    Shell shell = new Shell(display);
			    shell.setText("Credit Card");
			    shell.setBounds(200, 400, 520, 1000);
			   // shell.setLayout(new FillLayout(SWT.VERTICAL));
			   
				 
				 
			    //show all credit cards label 
			    Label  showAll = new Label(shell, SWT.BORDER );
			     showAll.setBounds(20, 20, 120, 25);	
				 showAll.setText("Show All Credit Cards");
				 
				 
				 
				//show all credit cards label 
				    Label  cardHolder = new Label(shell, SWT.NONE);
				    cardHolder.setBounds(20, 65, 100, 25);
				    cardHolder.setText("Card Holder *");
				    
				// credit card Text box 
				    Text cardHolderText = new Text(shell, SWT.BORDER| SWT.WRAP);
				    cardHolderText.setBounds(20, 90, 400, 25);
				    cardHolderText.setText("");
			   
			    
			    // credit or debit card label
			    	Label  creditOrDebitCard = new Label(shell, SWT.NONE);
				    creditOrDebitCard.setBounds(20, 140, 120, 25);	
				    creditOrDebitCard.setText("Credit Or Debit Card * ");
			
			    // credit or debit card Text
			    	Text  creditOrDebitCardText = new Text(shell, SWT.BORDER);
			    	creditOrDebitCardText.setBounds(20, 165, 200, 25);	
			    	creditOrDebitCardText.setText("");   
			    
			    
				// Expiration Date label
				    Label  expirationDate = new Label(shell, SWT.None);
				    expirationDate.setBounds(20, 215, 100, 25);	
				    expirationDate.setText("Expiration Date *");
				    
				    
				// drop down for date selection
				    Combo year = new Combo(shell,SWT.DROP_DOWN | SWT.READ_ONLY);
				    for(int i=2000; i<2030; i++) {
				    year.add(""+i);}
				    year.select(17);
				    year.setBounds(110, 240, 80, 250);
				    
				    
				// drop down for month selection
				    Combo month = new Combo(shell,SWT.DROP_DOWN | SWT.READ_ONLY);
				    month.setItems(new String[] {"January", "February", "March", "April", "May", "June",
				                                  "July", "August", "September", "October", "November", "December"
				                                  });
				    month.select(5);
				    month.setBounds(20, 240, 80, 250);
				    
				      
				    
				 // Security code for label
				    Label  securityCode = new Label(shell, SWT.NONE);
				    securityCode.setBounds(335, 215, 100, 25);	
				    securityCode.setText("Security code * ");
				
				// credit or debit card Text
				    Text  securityCodeText = new Text(shell, SWT.BORDER);
				    securityCodeText.setBounds(335, 240, 80, 25);	
				    securityCodeText.setText("");
				    
				    
				// Address 1
				    Label  address = new Label(shell, SWT.NONE);
				    address.setBounds(20,290 , 80, 25);	
				    address.setText("Address * :");
				    
				//Address Text  
				    Text  addressText = new Text(shell, SWT.BORDER | SWT.WRAP);
				    addressText.setBounds(100, 285, 315, 25);	
				    addressText.setText("");
				    
				 // Address 2
				    Label  address2 = new Label(shell, SWT.NONE);
				    address2.setBounds(20,330 , 80, 25);	
				    address2.setText("Address2 :");
				    
				// Address Text  
				    Text  address2Text = new Text(shell, SWT.BORDER | SWT.WRAP);
				    address2Text.setBounds(100, 325, 315, 25);	
				    address2Text.setText("");
				    //.....................
				    
				 // zipCode
				    Label zipCode = new Label(shell, SWT.NONE);
				    zipCode.setBounds(20,370 , 80, 25);	
				    zipCode.setText("Zip Code * :");
				    
				// Zip Code Text  
				    Text  zipCodeText = new Text(shell, SWT.BORDER | SWT.WRAP);
				    zipCodeText.setBounds(100, 365, 315, 25);	
				    zipCodeText.setText("");
				    
				// City
				    Label  city = new Label(shell, SWT.NONE);
				    city.setBounds(20,410 , 80, 25);	
				    city.setText("City :");
				    
				// City Text  
				    Text  cityText = new Text(shell, SWT.BORDER | SWT.WRAP);
				    cityText.setBounds(100, 405, 315, 25);	
				    cityText.setText("");
				      
				    
				 // State
				    Label  state = new Label(shell, SWT.NONE);
				    state.setBounds(20,450 , 80, 25);	
				    state.setText("State :");
				    
				// State Text  
				    Text  stateText = new Text(shell, SWT.BORDER | SWT.WRAP);
				    stateText.setBounds(100, 445, 315, 25);	
				    stateText.setText(""); 
				    
				// Set as default check box 
				    Button setAsDefault = new Button(shell,SWT.CHECK);
				    setAsDefault.setBounds(20, 485, 100, 25);	
				    setAsDefault.setText("Set As Default");
				    
				 // Save
				    Button save = new Button(shell,SWT.PUSH);
				    save.setBounds(20, 525, 50, 20);
				    save.setText("Save");
				    
				 // Cancel
				    Button cancel = new Button(shell,SWT.PUSH);
				    cancel.setBounds(80, 525, 50, 20);
				    cancel.setText(" Cancel");  
				    
				 
			
		
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
				
				
			