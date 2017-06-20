package model;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import model.dao.ExampleDAO;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ModelFacade implements IModel {
	
	private IMap map;
	
	private IMotionfullElement character;

    /**
     * Instantiates a new model facade.
     */
    public ModelFacade(int level) {
       this.setMap(new Map(level));
       this.setCharacter(new Character(map));
    }
    
    
	@Override
	public IMap getMap() {
		return this.map;
	}
	
	public void setMap(IMap map){
		this.map = map;
	}

	@Override
	public IMotionfullElement getCharacter() {
		return this.character;
	}

	public void setCharacter(IMotionfullElement character){
		this.character = character;
	}
	
	
	//to be deleted
	
	
	
	  /*
     * (non-Javadoc)
     * @see model.IModel#getExampleById(int)
     */
    @Override
    public Example getExampleById(final int id) throws SQLException {
        return ExampleDAO.getExampleById(id);
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getExampleByName(java.lang.String)
     */
    @Override
    public Example getExampleByName(final String name) throws SQLException {
        return ExampleDAO.getExampleByName(name);
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getAllExamples()
     */
    @Override
    public List<Example> getAllExamples() throws SQLException {
        return ExampleDAO.getAllExamples();
    }

}
