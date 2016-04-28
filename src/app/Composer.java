package app;

// import org.zkoss.zk.ui.select.SelectorComposer;
//import org.zkoss.bind.annotation.Command;
import org.zkoss.zk.ui.select.annotation.Wire;
//import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zul.*;

// @SuppressWarnings("serial")
public class Composer {
	
	public Include ctr;
	@Wire
	Listbox lsdo;
	/*
	public void vselectDO(){
	//	String vdodocno;
		try{
			Listitem sli = new Listitem();
			sli=lsdo.getSelectedItem();
	//		Listcell lc0= (Listcell) sli.getChildren().get(0);
		//	vdodocno=lc0.getLabel();
			//application.setAttribute("dodocno", vdodocno);
			//Executions.createComponents("",null,null);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	*/
}
