package drcom;

import org.zkoss.bind.annotation.Command;
//import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.select.annotation.Listen;

import org.zkoss.zul.*;


@SuppressWarnings("serial")
public class MyComposer extends SelectorComposer<Div>{
	@Wire
	Button btnSave;
	@Wire
    Button btnpop;
	@Wire 
	Popup pp;
	@Wire
	Textbox txtplace;
	@Wire
	Listbox lsplace;
	Listitem li;
	@Wire
	Button btnppEmp;
	@Wire
	Popup popemp;
	@Wire
	Button btnccemp;
	@Wire
	Popup popdr;
	@Wire 
	Button btnpDR;
	@Wire
	Button btnexitdrpop;
	
	@Listen("onClick = button#btnpop")	
    public void showPop() {
		pp.open(btnpop,"after_start");		
    }
	
	@Listen("onSelect =Lisitem#li")
	public void hidPop(){
		pp.detach();
	}
	
	@Listen("onClick = button#btnppEmp")
	public void showppEmp(){
		popemp.open(btnppEmp,"end_after");
	}
	
	@Listen("onClick = button#btnccemp")
	public void hidppEmp(){
		popemp.close();
	}
	@Listen("onClick= button#btnpDR")
	public void showppDR(){
		popdr.open(btnpDR,"end_after");
	}
	@Listen("onClick = button#btnexitdrpop")
	public void hideppDR(){
		popdr.close();
	}

	// private String msg; 
	@Wire
	 Include ctr;
	 @Command  //@NotifyChange("msg");
	    public void clr(){
	        ctr.setSrc("");   //add an item
	        //msg = "Added ";    //update message
	    } 


	
}
