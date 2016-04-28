package drconf;
//import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zul.*;
@SuppressWarnings("serial")
public class Composer extends SelectorComposer<Window>{
	@Wire
	Button btnPopemp;
	@Wire
	Button btnClosepp;
	@Wire
	Popup ppemppy;
	
	@Listen("onClick = button#btnPopemp")	
    public void showPop() {
		ppemppy.open(btnPopemp,"after_start");		
    }
	@Listen("onClick = button#btnClosepp")
	public void closeEPpop(){
		ppemppy.close();
	}
}
