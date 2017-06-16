package model;

import java.sql.SQLException;
import java.util.List;
import java.util.Observable;

public interface IMap {
	//List<IElement> elements;

	int getHeight();
	
	int getWidth();
	
	List<IElement> getAllElements() throws SQLException;
	 
	IElement getElementByPosition(int x,int y);

    IElement getElementByID(int ID);
    
    IElement getElementByName(String name) throws SQLException;
    
    void setMobileHasChanged();
    
    Observable getObservable();
    
}
