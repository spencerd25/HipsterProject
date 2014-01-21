package controller;

import javax.swing.JOptionPane;

import model.Hipster;
import view.HipsterFrame;

public class HipsterController
{	
		private HipsterFrame appFrame;
		private Hipster selfHipster;
		private Hipster [] classHipsters;
		private int hipsterCount;
		
	public HipsterController()
		{
			setSelfHipster(new Hipster());
			classHipsters = new Hipster [50];
			hipsterCount = 0;
		}
	public Hipster[] getClassHipsters()
	{
		return classHipsters;
	}
	/**
	 * 
	 * @return
	 */
	public Hipster getSelfHipster()
	{
		return selfHipster;
	}
	/**
	 * sets the current hipster as its self.
	 * @param selfHipster
	 */ 
	public void setSelfHipster(Hipster selfHipster)
	{
		this.selfHipster = selfHipster;
	}
	/**
	 * starts the class or game.
	 */
	public void start()
		{
			appFrame = new HipsterFrame(this);
		}
	/**
	 *  gets a specific hipster that you want from the class hipsters.
	 * @param position
	 * @return
	 */
	public Hipster getSpecifiedHipster(int position)
	{
		Hipster currentHipster = null;
		
		if(position < classHipsters.length && position >= 0)
		{
			currentHipster = classHipsters[position];
		}
		
		return currentHipster;
	}
	
	/**
	 * this will get a random hipster object from the array of class hipsters.
	 */
	public Hipster getRandomHipster()
	{
		Hipster currentHipster = null;
		int randomIndex = 0;
		double random = Math.random();
		randomIndex = (int) (random * classHipsters.length);
		currentHipster = classHipsters[randomIndex];
		
		return currentHipster;
	}
	/**
	 * creates and adds a hipster to the array of class Hipsters from the specified values.
	 * @param books the books that the current hipster has.
	 * @param name the name of the current hipster.
	 * @param type the type of the current hipster.
	 * @param phrase The current phrase of the current hipster.
	 */
	public void addHipster(String [] books, String name, String type, String phrase)
	{
		if(hipsterCount < classHipsters.length)
		{
		Hipster tempHipster = new Hipster(name, type, phrase, books);
		classHipsters[hipsterCount] = tempHipster;
		hipsterCount++;
		}
		else
		{
			JOptionPane.showMessageDialog(appFrame, "The class is full you are too mainstream to be added");
		}
	}

}
