package model;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import model.dao.ExampleDAO;
import model.element.motionfull.MainCharacter;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 */
public class ModelFacade implements IModel {
	
	/** The map*/
	private Map map;
	
	/** The player*/
	private IMotionfullElement character;

    /**
     * Instantiates a new model facade.
     * @throws SQLException 
     */
    public ModelFacade(int level) throws SQLException  {
		this.setMap(new Map(level));
       this.setCharacter(new MainCharacter(getMap())); // y5 x7 TODO get rid of the hard code
       this.character.setX(7);
       this.character.setY(5);
    }
    
    /**
     * Gets the map
     * 
     * @return map
     */
	@Override
	public Map getMap() {
		return this.map;
	}
	
	  /**
     * Sets the map
     * 
     * @param map
     * 			the new map
     */
	public void setMap(Map map){
		this.map = map;
	}
	
	/**
     * Gets the player
     * 
     * @return character
     */
	@Override
	public IMotionfullElement getCharacter() {
		return this.character;
	}

	  /**
     * Sets the player
     * 
     * @param character
     * 			the new character
     */
	public void setCharacter(IMotionfullElement character){
		this.character = character;
	}
	
	
	

}
